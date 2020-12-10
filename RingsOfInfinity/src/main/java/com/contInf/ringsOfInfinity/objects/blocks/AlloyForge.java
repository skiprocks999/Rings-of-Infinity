/* skip999
 * 5/22/2020
 * purpose: contain placement and operation methods for alloy forge
 */
package com.contInf.ringsOfInfinity.objects.blocks;

import java.util.Random;

import com.contInf.ringsOfInfinity.init.BlockTileEntityTypes;
import com.contInf.ringsOfInfinity.tileentity.AlloyForgeTileEntity;
import com.contInf.ringsOfInfinity.util.TileEntityItemHandler;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.api.distmarker.Dist;

public class AlloyForge extends Block{
	
	
	/* Fields */
	
	public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
	public static final BooleanProperty LIT = BooleanProperty.create("lit");

	
	/* Constructors */
	
	
	public AlloyForge(Properties properties) {
		super(properties);
		this.setDefaultState(this.stateContainer.getBaseState()
					.with(FACING, Direction.NORTH)
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
		return BlockTileEntityTypes.ALLOY_FORGE.get().create();
	}
	
	
	//Creates a container instance
	@Override
	public void fillStateContainer(Builder<Block,BlockState> builder) {
		super.fillStateContainer(builder);
		builder.add(FACING,LIT);
	}
	
	
	//Method for mirroring block for rotation
	@Override
	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.toRotation(state.get(FACING)));
	}
	
	
	//Method for rotating block
	@Override
	public BlockState rotate(BlockState state, Rotation rot) {
		return state.with(FACING,rot.rotate(state.get(FACING)));
	}
	
	
	//Gets current light value for furnace
	@SuppressWarnings("deprecation")
	@Override
	public int getLightValue(BlockState state) {
		return state.get(LIT) ? super.getLightValue(state) : 0;
	}
	
	
	//Determines state of furnace for placement 
	@Override 
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
	}
	
	
	//Determines if the block has been given a custom name for naming GUI
	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack) {
		super.onBlockPlacedBy(worldIn, pos, state, placer, stack);
		if(stack.hasDisplayName()) {
			TileEntity tile = worldIn.getTileEntity(pos);
			if(tile instanceof AlloyForgeTileEntity) {
				((AlloyForgeTileEntity)tile).setCustomName(stack.getDisplayName());
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
			double d0 = (double) pos.getX() + 0.5D;
			double d1 = (double) pos.getY();
			double d2 = (double) pos.getZ() + 0.5D;
			if (rand.nextDouble() < 0.1D) {
				worldIn.playSound(d0, d1, d2, SoundEvents.BLOCK_FURNACE_FIRE_CRACKLE, SoundCategory.BLOCKS, 1.0F, 1.0F,
						false);
			}

			Direction direction = stateIn.get(FACING);
			Direction.Axis direction$axis = direction.getAxis();
			double d4 = rand.nextDouble() * 0.6D - 0.3D;
			double d5 = direction$axis == Direction.Axis.X ? (double) direction.getXOffset() * 0.52D : d4;
			double d6 = rand.nextDouble() * 6.0D / 16.0D;
			double d7 = direction$axis == Direction.Axis.Z ? (double) direction.getZOffset() * 0.52D : d4;
			worldIn.addParticle(ParticleTypes.SMOKE, d0 + d5, d1 + d6, d2 + d7, 0.0D, 0.0D, 0.0D);
			worldIn.addParticle(ParticleTypes.FLAME, d0 + d5, d1 + d6, d2 + d7, 0.0D, 0.0D, 0.0D);
		}
	}

	
	//Notifies server and client that furnace has been activated 
	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
			Hand handIn, BlockRayTraceResult hit) {
		if (worldIn != null && !worldIn.isRemote) {
			TileEntity tile = worldIn.getTileEntity(pos);
			if (tile instanceof AlloyForgeTileEntity) {
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
		if (tile instanceof AlloyForgeTileEntity && state.getBlock() != newState.getBlock()) {
			AlloyForgeTileEntity alloyFurnace = (AlloyForgeTileEntity) tile;
			((TileEntityItemHandler) alloyFurnace.getInventory()).toNonNullList().forEach(item -> {
				ItemEntity itemEntity = new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), item);
				worldIn.addEntity(itemEntity);
			});
		}

		if (state.hasTileEntity() && state.getBlock() != newState.getBlock()) {
			worldIn.removeTileEntity(pos);
		}
	}
	
}
