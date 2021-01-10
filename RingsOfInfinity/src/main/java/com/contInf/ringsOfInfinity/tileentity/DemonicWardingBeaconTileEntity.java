package com.contInf.ringsOfInfinity.tileentity;

import java.util.List;

import javax.annotation.Nullable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.contInf.ringsOfInfinity.RingsOfInfinity;
import com.contInf.ringsOfInfinity.container.DemonicWardingBeaconContainer;
import com.contInf.ringsOfInfinity.init.BlockTileEntityTypes;
import com.contInf.ringsOfInfinity.init.ItemInit;
import com.contInf.ringsOfInfinity.objects.blocks.DemonicWardingBeacon;
import com.contInf.ringsOfInfinity.tileentity.tileUtils.BeamSegment;
import com.contInf.ringsOfInfinity.tileentity.tileUtils.CustomFuelType;
import com.contInf.ringsOfInfinity.util.TileEntityItemHandler;
import com.google.common.collect.Lists;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraft.util.IIntArray;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandlerModifiable;

public class DemonicWardingBeaconTileEntity extends TileEntity implements ITickableTileEntity, INamedContainerProvider{
	
	/* Fields */
	
	
	private ITextComponent customName;
	
	private TileEntityItemHandler inventory; 
	
	public int currentBurnTime;
	public int itemBurnTime;
	
	private int ticksSinceLastBeamCheck = 0;
	
	private BlockPos lastBlockChecked = null;
	
	private static final Logger logger = LogManager.getLogger(RingsOfInfinity.modID);
	
	private List<BeamSegment> oldBeamSegments = Lists.newArrayList();
	private List<BeamSegment> newBeamSegments = Lists.newArrayList(); //?
	
	
	private static final CustomFuelType[] validFuels = 
		{new CustomFuelType(ItemInit.sapphire.get(),200), //set to 25000
		 new CustomFuelType(ItemInit.black_jade.get(), 50000)};
	
	
	protected final IIntArray demonicWardingBeaconData = new IIntArray() {
		
	      public int get(int index) {
	         switch(index) {
	         case 0:          return DemonicWardingBeaconTileEntity.this.currentBurnTime;
	         case 1:          return DemonicWardingBeaconTileEntity.this.itemBurnTime;
	         case 2:          return DemonicWardingBeaconTileEntity.this.ticksSinceLastBeamCheck;
	         default:         return 0;
	         }
	      }

	      public void set(int index, int value) {
	         switch(index) {
	         case 0:          DemonicWardingBeaconTileEntity.this.currentBurnTime = value;
	                          break;
	         case 1:          DemonicWardingBeaconTileEntity.this.itemBurnTime = value;
	         				  break;
	         case 2:          DemonicWardingBeaconTileEntity.this.ticksSinceLastBeamCheck = value;
	         }

	      }

	      public int size() {
	         return 3;
	      }
	   };
	
	
	
	/* Constructors */
	
	
	//Creates a new instance of an AlloyForge entity
	public DemonicWardingBeaconTileEntity(TileEntityType<?> tileEntityTypeIn) {
		super(tileEntityTypeIn);
		
		this.inventory = new TileEntityItemHandler(1);
	}

	
	//Creates instance for existing AlloyForge entity
	public DemonicWardingBeaconTileEntity() {
		this(BlockTileEntityTypes.DEMONIC_WARDING_BEACON.get());
	}

	
	/* Functional Methods */
	
	
	//Creates a GUI for the AlloyForge
	@Override
	public Container createMenu(
			final int windowID, final PlayerInventory playerInv, final PlayerEntity playerIn) {
		return new DemonicWardingBeaconContainer(windowID, playerInv, this);
	}

	
	/* WHAT THE BLOCK DOES*/
	@Override
	public void tick() {
		
		boolean currentState = isLit();
		boolean startedBurning = false;
		
		if(isLit()) {
			this.currentBurnTime--;
		}
		
		if(this.world != null && !this.world.isRemote) {
			
			ItemStack fuelSlot = this.inventory.getStackInSlot(0);
			
			if(isLit() || !fuelSlot.isEmpty()) {
				
				if(!isLit()) {
					
					this.currentBurnTime = getBurnTime(fuelSlot);
					this.itemBurnTime = this.currentBurnTime;
					
					if(this.isLit()) {
						
						startedBurning = true;
						this.inventory.decrStackSize(0,1);
						
					}
				}
				
				if(isLit()) {
					
					this.ticksSinceLastBeamCheck++;
					if(ticksSinceLastBeamCheck == 10) {
						
						int beaconXCoord = this.pos.getX();
						int beaconYCoord = this.pos.getY();
						int beaconZCoord = this.pos.getZ();
						
						newBeamSegments = Lists.newArrayList();
						
						this.lastBlockChecked = new BlockPos(beaconXCoord,beaconYCoord + 1,beaconZCoord);
						
						BeamSegment newBeamSegment = null;
						
						for(int i = lastBlockChecked.getY(); i < this.world.getHeight(); i ++) {
							
							//BlockState currentBlockState = this.world.getBlockState(lastBlockChecked);
							//Block currentBlock = currentBlockState.getBlock();
							//logger.debug("Current Block Height: " + lastBlockChecked.getY());
							
							float[] blockBeamColorMultipliers = new float[] {0.0f};
									//urrentBlockState.getBeaconColorMultiplier(world, lastBlockChecked, getPos());
							
							//logger.debug("color multipliers: " + Arrays.toString(blockBeamColorMultipliers));
							
							if(blockBeamColorMultipliers!= null) {
								
								newBeamSegment = new BeamSegment(blockBeamColorMultipliers,lastBlockChecked.getY());
								this.newBeamSegments.add(newBeamSegment);
								
							}/*else {
								
								if(newBeamSegment == null || currentBlockState.getOpacity(this.world, lastBlockChecked) >= 15
										&& currentBlock != Blocks.BEDROCK) {
									this.newBeamSegments.clear();
									break;
								}
								
							}
							*/
							this.lastBlockChecked = this.lastBlockChecked.up();
						}
						
						this.oldBeamSegments = this.newBeamSegments;
						
						this.ticksSinceLastBeamCheck = 0;
					}
				}
			}
			if(currentState != this.isLit()) {
				
				startedBurning = true;
				
				this.world.setBlockState(this.getPos(), 
						this.getBlockState().with(DemonicWardingBeacon.LIT, Boolean.valueOf(this.isLit())));
				
			}
			
		}
		
		if(startedBurning) {
			
			this.markDirty();
			
			this.world.notifyBlockUpdate(this.getPos(), 
					this.getBlockState(), this.getBlockState(), Constants.BlockFlags.BLOCK_UPDATE);
		
		}
		
	}
	
	@OnlyIn(Dist.CLIENT)
	public List<BeamSegment> getBeamSegments(){
		return oldBeamSegments;
	}
	
	@OnlyIn(Dist.CLIENT)
	public double getMaxRenderDistanceSquared() {
		return 65536.0D;
	}
	
	//Retrieves current name of block for GUI
	@Override
	public ITextComponent getDisplayName() {
		return this.getName();
	}
	
	
	//Sets custom name for block
	@Override
	public CompoundNBT write(CompoundNBT compound) {
		super.write(compound);
		if(this.customName != null) {
			compound.putString("CustomName", ITextComponent.Serializer.toJson(this.customName));
		}
		
		ItemStackHelper.saveAllItems(compound, this.inventory.toNonNullList());
		
		compound.putInt("CurrentBurnTime", this.currentBurnTime);
		compound.putInt("ItemBurnTime", this.itemBurnTime);
		compound.putInt("TicksSinceLastBeamCheck",this.ticksSinceLastBeamCheck);
		
		return compound;
	}
	
	
	//Retrieves the current name
	@Override
	public void read(BlockState state, CompoundNBT compound) {
		super.read(state, compound);
		if(compound.contains("CustomName",Constants.NBT.TAG_STRING)) {
			this.customName = ITextComponent.Serializer.getComponentFromJson(compound.getString("CustomName"));
		}
		
		NonNullList<ItemStack> inv = NonNullList.withSize(this.inventory.getSlots(), ItemStack.EMPTY);
		ItemStackHelper.loadAllItems(compound, inv);
		this.inventory.setNonNullList(inv);
		
		this.currentBurnTime = compound.getInt("CurrentBurnTime");
		this.itemBurnTime = compound.getInt("ItemBurnTime");
		this.ticksSinceLastBeamCheck = compound.getInt("TicksSinceLastBeamCheck");
	}
	
	
	/* CUSTOM NAME */
	
	public void setCustomName(ITextComponent name) {
		this.customName = name;
	}
	
	public ITextComponent getName() {
		return this.customName != null ? this.customName : this.getDefaultName();
	}
	
	private ITextComponent getDefaultName() {
		return new TranslationTextComponent("container" + RingsOfInfinity.modID + ".demonic_warding_beacon");
	}
	
	@Nullable
	public ITextComponent getCustomName() {
		return this.customName;
	}
	
	
	//Retireves Inventory for GUI
	public final IItemHandlerModifiable getInventory() {
		return this.inventory;
	}
	
	
	/* Tick Synchronization */
	
	
	@Nullable
	@Override
	public SUpdateTileEntityPacket getUpdatePacket() {
		CompoundNBT nbt = new CompoundNBT();
		this.write(nbt);
		return new SUpdateTileEntityPacket(this.pos, 0, nbt);
	}

	@Override
	public void onDataPacket(NetworkManager net, SUpdateTileEntityPacket pkt) {
		this.read(this.getBlockState(),pkt.getNbtCompound());
	}

	@Override
	public CompoundNBT getUpdateTag() {
		CompoundNBT nbt = new CompoundNBT();
		this.write(nbt);
		return nbt;
	}

	@Override
	public void handleUpdateTag(BlockState state, CompoundNBT nbt) {
		this.read(state, nbt);
	}
	
	@Override
	public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
		return CapabilityItemHandler.ITEM_HANDLER_CAPABILITY.orEmpty(cap, LazyOptional.of(() -> this.inventory));
	}
	
	private boolean isLit() {
		return currentBurnTime > 0;
	}
	
	
	private int getBurnTime(ItemStack fuel) {
		
		int itemBurnTime = 0;
		if(itemBurnTime < 1) {
			for(CustomFuelType customFuel:validFuels) {
				if(customFuel.equals(fuel)) {
					itemBurnTime = customFuel.getBurnTime();
				}
			}
		}
		return itemBurnTime;
		
	}
	
	public int getItemBurnTime() {
		return this.itemBurnTime;
	}
}
