/* skip999
 * 6/7/2020
 * purpose:encapsulate functionality of Demonic Warding Beacon
 */
package com.contInf.ringsOfInfinity.objects.blocks;

import java.util.Random;

import com.contInf.ringsOfInfinity.init.BlockTileEntityTypes;
import com.contInf.ringsOfInfinity.tileentity.DemonicWardingBeaconTileEntity;
import com.contInf.ringsOfInfinity.util.TileEntityItemHandler;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IBeaconBeamColorProvider;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.network.NetworkHooks;

public class DemonicWardingBeacon extends Block implements IBeaconBeamColorProvider{

	/* Fields */

	public static final BooleanProperty LIT = BooleanProperty.create("lit");

	
	/* Constructors */
	
	
	public DemonicWardingBeacon(Properties properties) {
		super(properties);
		this.setDefaultState(this.stateContainer.getBaseState()
					.with(LIT,false)
		);
	}
	
	
	/* Functional Methods */
	
	
	//Confirms object is a tile entity
	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}
	
	
	//Creates an instance of AlloyForge tile entity
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return BlockTileEntityTypes.DEMONIC_WARDING_BEACON.get().create();
	}
	
	
	//Creates a container instance
	@Override
	public void fillStateContainer(Builder<Block,BlockState> builder) {
		super.fillStateContainer(builder);
		builder.add(LIT);
	}
	
	//Gets light value
	@Override
	public int getLightValue(BlockState state, IBlockReader world, BlockPos pos) {
		return state.get(LIT) ? super.getLightValue(state,world,pos) : 0;
	}
	
	
	//Determines if the block has been given a custom name for naming GUI
	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack) {
		super.onBlockPlacedBy(worldIn, pos, state, placer, stack);
		if(stack.hasDisplayName()) {
			TileEntity tile = worldIn.getTileEntity(pos);
			if(tile instanceof DemonicWardingBeaconTileEntity) {
				((DemonicWardingBeaconTileEntity)tile).setCustomName(stack.getDisplayName());
			}
		}
	}

	
	//Ensures block can output to comparator 
	@Override
	public boolean hasComparatorInputOverride(BlockState state) {
		return true;
	}
	
	
	//Calculates redstone signal for comparator 
	@Override
	public int getComparatorInputOverride(BlockState blockState, World worldIn, BlockPos pos) {
		return Container.calcRedstone(worldIn.getTileEntity(pos));
	}
	
	
	//Renders particles for lit animation 
	@Override
	@OnlyIn(Dist.CLIENT)
	public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
		if (stateIn.get(LIT)) {
			//if(this.)
		}
	}

	
	//Notifies server and client that furnace has been activated 
	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
			Hand handIn, BlockRayTraceResult hit) {
		if (worldIn != null && !worldIn.isRemote) {
			TileEntity tile = worldIn.getTileEntity(pos);
			if (tile instanceof DemonicWardingBeaconTileEntity) {
				NetworkHooks.openGui((ServerPlayerEntity) player, (INamedContainerProvider) tile, pos);
				return ActionResultType.SUCCESS;
			}
		}
		return ActionResultType.SUCCESS;
	}
	
	
	//Determines state of furnace when dropped
	@Override
	public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
		TileEntity tile = worldIn.getTileEntity(pos);
		if (tile instanceof DemonicWardingBeaconTileEntity && state.getBlock() != newState.getBlock()) {
			DemonicWardingBeaconTileEntity demonicWardingBeacon = (DemonicWardingBeaconTileEntity) tile;
			((TileEntityItemHandler) demonicWardingBeacon.getInventory()).toNonNullList().forEach(item -> {
				ItemEntity itemEntity = new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), item);
				worldIn.addEntity(itemEntity);
			});
		}

		if (state.hasTileEntity() && state.getBlock() != newState.getBlock()) {
			worldIn.removeTileEntity(pos);
		}
	}


	@Override
	public DyeColor getColor() {
		return DyeColor.WHITE;
	}

}
