package com.contInf.ringsOfInfinity.tileentity;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.contInf.ringsOfInfinity.RingsOfInfinity;
import com.contInf.ringsOfInfinity.container.HellfireFurnaceContainer;
import com.contInf.ringsOfInfinity.init.BlockTileEntityTypes;
import com.contInf.ringsOfInfinity.init.ItemInit;
import com.contInf.ringsOfInfinity.objects.blocks.HellfireFurnace;
import com.contInf.ringsOfInfinity.tileentity.tileUtils.CustomFuelType;
import com.contInf.ringsOfInfinity.util.TileEntityItemHandler;

import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.AbstractCookingRecipe;
import net.minecraft.item.crafting.FurnaceRecipe;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraft.util.IIntArray;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.wrapper.RecipeWrapper;

public class HellfireFurnaceTileEntity extends TileEntity 
				implements ITickableTileEntity, INamedContainerProvider{

	/* Fields */
	
	
	private ITextComponent customName;
	
	private TileEntityItemHandler inventory; 
	
	private static final int SPEED_MODIFIER = 8;
	
	private String currentFuel = "";
	
	public int maxSmeltTime;
	public int currentSmeltTime;
	public int currentBurnTime;
	public int itemBurnTime;
	
	private static final Logger logger = LogManager.getLogger(RingsOfInfinity.modID);
	
	private IRecipeType<?> furnaceRecipeType = 
			Registry.RECIPE_TYPE.getOrDefault(IRecipeSerializer.SMELTING.getRegistryName());
	
	private static final CustomFuelType[] validFuels =
		{new CustomFuelType(ItemInit.lignite_coal.get(),1600),
		 new CustomFuelType(ItemInit.black_jade.get(),10000)};
	
	protected final IIntArray hellfireFurnaceData = new IIntArray() {
		
	      public int get(int index) {
	         switch(index) {
	         case 0:          return HellfireFurnaceTileEntity.this.currentSmeltTime;
	         case 1:          return HellfireFurnaceTileEntity.this.currentBurnTime;
	         case 2:          return HellfireFurnaceTileEntity.this.itemBurnTime;
	         case 3:		  return HellfireFurnaceTileEntity.this.maxSmeltTime;
	         default:         return 0;
	         }
	      }

	      public void set(int index, int value) {
	         switch(index) {
	         case 0:          HellfireFurnaceTileEntity.this.currentSmeltTime = value;
	                          break;
	         case 1:          HellfireFurnaceTileEntity.this.currentBurnTime = value;
	         				  break;
	         case 2:          HellfireFurnaceTileEntity.this.itemBurnTime = value;
	         				  break;
	         case 3:          HellfireFurnaceTileEntity.this.maxSmeltTime = value;
	         }

	      }

	      public int size() {
	         return 4;
	      }
	   };
	
	
	
	
	
	
	/* Constructors */
	
	
	//Creates a new instance of an AlloyForge entity
	public HellfireFurnaceTileEntity(TileEntityType<?> tileEntityTypeIn) {
		super(tileEntityTypeIn); 
		this.inventory = new TileEntityItemHandler(3);
	}

	
	//Creates instance for existing AlloyForge entity
	public HellfireFurnaceTileEntity() {
		this(BlockTileEntityTypes.HELLFIRE_FURNACE.get());
	}

	
	/* Functional Methods */
	
	
	//Creates a GUI for the AlloyForge
	@Override
	public Container createMenu(
			final int windowID, final PlayerInventory playerInv, final PlayerEntity playerIn) {
		return new HellfireFurnaceContainer(windowID, playerInv, this);
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
			
			ItemStack fuelSlot = this.inventory.getStackInSlot(2);
			ItemStack ingredient = this.inventory.getStackInSlot(0);
			
			if(isLit()||(!ingredient.isEmpty() && !fuelSlot.isEmpty())) {

				IRecipe<?> validRecipe = this.getRecipe(ingredient);
				
				if(!isLit() && validRecipe != null&& 
						(this.inventory.getStackInSlot(1).getCount() < 63)) {
					
					this.currentBurnTime = this.getBurnTime(fuelSlot);
					this.itemBurnTime = this.currentBurnTime;
					
					if(this.isLit()) {
						
						startedBurning = true;
						
						if(this.isLit()) {
							
							startedBurning = true;
							this.inventory.decrStackSize(2,1);
							
						}
						
					}
					
				}
			
			
				if(this.isLit() && validRecipe!= null) {
					
					this.currentSmeltTime ++;
					this.maxSmeltTime = this.getMaxSmeltTime();
					
					if(this.currentSmeltTime == maxSmeltTime) {
						
						this.currentSmeltTime = 0;
						//this.maxSmeltTime = 0;
						
						ItemStack output = this.getRecipe(ingredient).getRecipeOutput();
						this.inventory.insertItem(1, output.copy(),false);
						this.inventory.decrStackSize(0,1);
						
						startedBurning = true;
						
					}
					
				}else {
					
					this.currentSmeltTime = 0;
					
				}
				
			}else if(!this.isLit() && this.currentSmeltTime > 0) {
				
				this.currentSmeltTime = MathHelper.clamp(this.currentSmeltTime - 2, 0, maxSmeltTime);
			
			}
			
			if(currentState != this.isLit()) {
				
				startedBurning = true;
				
				this.world.setBlockState(this.getPos(), 
						this.getBlockState().with(HellfireFurnace.LIT, Boolean.valueOf(this.isLit())));
				
			}
		}
		
		
		if(startedBurning) {
			
			this.markDirty();
			
			this.world.notifyBlockUpdate(this.getPos(), 
					this.getBlockState(), this.getBlockState(), Constants.BlockFlags.BLOCK_UPDATE);
		
		}
		
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
		
		compound.putInt("CurrentSmeltTime", this.currentSmeltTime);
		compound.putInt("CurrentBurnTime", this.currentBurnTime);
		compound.putInt("ItemBurnTime",this.itemBurnTime);
		compound.putInt("MaxSmeltTime", this.maxSmeltTime);
		
		compound.putString("CurrentFuel", this.currentFuel);
		
		return compound;
	}
	
	
	//Retrieves the current name
	@Override
	public void read(BlockState state, CompoundNBT compound) {
		super.read(state,compound);
		if(compound.contains("CustomName",Constants.NBT.TAG_STRING)) {
			this.customName = ITextComponent.Serializer.getComponentFromJson(compound.getString("CustomName"));
		}
		
		NonNullList<ItemStack> inv = NonNullList.withSize(this.inventory.getSlots(), ItemStack.EMPTY);
		ItemStackHelper.loadAllItems(compound, inv);
		this.inventory.setNonNullList(inv);
		
		this.currentSmeltTime = compound.getInt("CurrentSmeltTime");
		this.currentBurnTime = compound.getInt("CurrentBurnTime");
		this.itemBurnTime = compound.getInt("ItemBurnTime");
		this.maxSmeltTime = compound.getInt("MaxSmeltTime");
		
		this.currentFuel = compound.getString("CurrentFuel");
	}
	
	
	/* CUSTOM NAME */
	
	public void setCustomName(ITextComponent name) {
		this.customName = name;
	}
	
	public ITextComponent getName() {
		return this.customName != null ? this.customName : this.getDefaultName();
	}
	
	private ITextComponent getDefaultName() {
		return new TranslationTextComponent("container" + RingsOfInfinity.modID + ".hellfire_furnace");
	}
	
	@Nullable
	public ITextComponent getCustomName() {
		return this.customName;
	}
	
	
	/* Looks for Recipe based on inputs */
	private FurnaceRecipe getRecipe(ItemStack stack) {
		
		if(stack == null) {
			return null;
		}
		
		Set<IRecipe<?>> recipes = findRecipesbyType(furnaceRecipeType, this.world);
		for(IRecipe<?> IRecipes: recipes) {
			FurnaceRecipe recipe = (FurnaceRecipe) IRecipes;
			if(recipe.matches(new RecipeWrapper(this.inventory), this.world)) {
				return recipe;
			}
		}
		
		return null;
	}

	
	//Returns all recipes for AlloyForge
	public static Set<IRecipe<?>> findRecipesbyType(IRecipeType<?> typeIn, World world) {
		return world != null ? 
				world.getRecipeManager().getRecipes().
					stream().filter(recipe -> recipe.getType() == typeIn).collect(Collectors.toSet())
				:Collections.emptySet();
	}
	
	
	//Determines recipe for client-side
	@SuppressWarnings("resource")
	@OnlyIn(Dist.CLIENT)
	public static Set<IRecipe<?>> findRecipesbyType(IRecipeType<?> typeIn) {
		ClientWorld world = Minecraft.getInstance().world;
		return world != null ? 
				world.getRecipeManager().getRecipes().
					stream().filter(recipe -> recipe.getType() == typeIn).collect(Collectors.toSet())
				:Collections.emptySet();
	}
	
	
	//Determines inputs for particular recipe
	public static Set<ItemStack> getAllRecipeInputs(IRecipeType<?> typeIn, World world){
		Set<ItemStack> inputs = new HashSet<ItemStack>();
		Set<IRecipe<?>> recipes = findRecipesbyType(typeIn, world);
		
		for(IRecipe<?> recipe:recipes) {
			NonNullList<Ingredient> ingredients = recipe.getIngredients();
			
			ingredients.forEach(ingredient -> {
				for(ItemStack stack: ingredient.getMatchingStacks()) {
					inputs.add(stack);
				}
				
			}
			);
		}
		return inputs;
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
		
		String itemName = fuel.toString();
		currentFuel = itemName.substring(itemName.indexOf(' ') + 1);
		
		logger.debug("Current Fuel " + currentFuel);
		
		int itemBurnTime = ForgeHooks.getBurnTime(fuel);
		if(itemBurnTime < 1) {
			for(CustomFuelType customFuel:validFuels) {
				if(customFuel.equals(fuel)) {
					itemBurnTime = customFuel.getBurnTime();
				}
			}
		}
		return itemBurnTime;
	}
	
	public int getMaxSmeltTime() {
	    
		@SuppressWarnings("unchecked")
		int defaultSmeltTime = this.world.getRecipeManager().
				getRecipe((IRecipeType<AbstractCookingRecipe>)this.furnaceRecipeType, 
						new RecipeWrapper(this.inventory), this.world)
				.map(AbstractCookingRecipe::getCookTime).orElse(200);
		
		switch(currentFuel) {
		
			case("black_jade")  :	return defaultSmeltTime / defaultSmeltTime;
			default             :	return defaultSmeltTime / SPEED_MODIFIER;
		}
		
	}
	
	public int getItemBurnTime() {
		return this.itemBurnTime;
	}
	


}
