/* skip999
 * 5/13/2020
 * purpose: initialize blocks
 */
package com.contInf.BlockLib.init;

import com.contInf.BlockLib.ContInfBlockLib;

import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	//Blocks DeferredRegister
	public static final DeferredRegister<Block> BLOCKS = 
			new DeferredRegister<>(ForgeRegistries.BLOCKS , ContInfBlockLib.modID);
	
	/*OVERWORLD BLOCKS*/
	
	//OVERWORLD BUILDING BLOCKS
	
	//MARBLE:
	//marble
	public static final RegistryObject<Block> marble = 
			BLOCKS.register("marble", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//marble bricks
	public static final RegistryObject<Block> marble_bricks = 
			BLOCKS.register("marble_bricks", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//polished marble
	public static final RegistryObject<Block> polished_marble = 
			BLOCKS.register("polished_marble", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));	
	//polished marble bricks
	public static final RegistryObject<Block> polished_marble_bricks = 
			BLOCKS.register("polished_marble_bricks", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));	
	//marble stairs
	public static final RegistryObject<Block> marble_stairs = 
			BLOCKS.register("marble_stairs", () -> new StairsBlock(
				() -> BlockInit.marble.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//marble brick stairs
	public static final RegistryObject<Block> marble_brick_stairs = 
			BLOCKS.register("marble_brick_stairs", () -> new StairsBlock(
				() -> BlockInit.marble_bricks.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//polished marble stairs
	public static final RegistryObject<Block> polished_marble_stairs = 
			BLOCKS.register("polished_marble_stairs", () -> new StairsBlock(
				() -> BlockInit.polished_marble.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//polished marble brick stairs
	public static final RegistryObject<Block> polished_marble_brick_stairs = 
			BLOCKS.register("polished_marble_brick_stairs", () -> new StairsBlock(
				() -> BlockInit.polished_marble_bricks.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//marble slab
	public static final RegistryObject<Block> marble_slab = 
			BLOCKS.register("marble_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//marble brick slab
	public static final RegistryObject<Block> marble_brick_slab = 
			BLOCKS.register("marble_brick_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished marble slab
	public static final RegistryObject<Block> polished_marble_slab = 
			BLOCKS.register("polished_marble_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished marble brick slab
	public static final RegistryObject<Block> polished_marble_brick_slab = 
			BLOCKS.register("polished_marble_brick_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//marble wall
	public static final RegistryObject<Block> marble_wall = 
			BLOCKS.register("marble_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//marble brick wall
	public static final RegistryObject<Block> marble_brick_wall = 
			BLOCKS.register("marble_brick_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished marble wall
	public static final RegistryObject<Block> polished_marble_wall = 
			BLOCKS.register("polished_marble_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished marble brick wall
	public static final RegistryObject<Block> polished_marble_brick_wall = 
			BLOCKS.register("polished_marble_brick_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	
	//GNEISS
	//gneiss
	public static final RegistryObject<Block> gneiss = 
			BLOCKS.register("gneiss", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//gneiss bricks
	public static final RegistryObject<Block> gneiss_bricks = 
			BLOCKS.register("gneiss_bricks", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));	
	//polished gneiss
	public static final RegistryObject<Block> polished_gneiss = 
			BLOCKS.register("polished_gneiss", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));	
	//polished gneiss bricks
	public static final RegistryObject<Block> polished_gneiss_bricks = 
			BLOCKS.register("polished_gneiss_bricks", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));	
	//gneiss stairs
	public static final RegistryObject<Block> gneiss_stairs = 
			BLOCKS.register("gneiss_stairs", () -> new StairsBlock(
				() -> BlockInit.gneiss.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));	
	//gneiss brick stairs
	public static final RegistryObject<Block> gneiss_brick_stairs = 
			BLOCKS.register("gneiss_brick_stairs", () -> new StairsBlock(
				() -> BlockInit.gneiss_bricks.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));	
	//polished gneiss stairs
	public static final RegistryObject<Block> polished_gneiss_stairs = 
			BLOCKS.register("polished_gneiss_stairs", () -> new StairsBlock(
				() -> BlockInit.polished_gneiss.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//polished gneiss brick stairs
	public static final RegistryObject<Block> polished_gneiss_brick_stairs = 
			BLOCKS.register("polished_gneiss_brick_stairs", () -> new StairsBlock(
				() -> BlockInit.polished_gneiss_bricks.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//gneiss slab
	public static final RegistryObject<Block> gneiss_slab = 
			BLOCKS.register("gneiss_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//gneiss brick slab
	public static final RegistryObject<Block> gneiss_brick_slab = 
			BLOCKS.register("gneiss_brick_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished gneiss slab
	public static final RegistryObject<Block> polished_gneiss_slab = 
			BLOCKS.register("polished_gneiss_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished gneiss brick slab
	public static final RegistryObject<Block> polished_gneiss_brick_slab = 
			BLOCKS.register("polished_gneiss_brick_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//gneiss wall
	public static final RegistryObject<Block> gneiss_wall = 
			BLOCKS.register("gneiss_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//gneiss brick wall
	public static final RegistryObject<Block> gneiss_brick_wall = 
			BLOCKS.register("gneiss_brick_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished gneiss wall
	public static final RegistryObject<Block> polished_gneiss_wall = 
			BLOCKS.register("polished_gneiss_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished gneiss brick wall
	public static final RegistryObject<Block> polished_gneiss_brick_wall = 
			BLOCKS.register("polished_gneiss_brick_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	
	//BRECCIA
	//breccia
	public static final RegistryObject<Block> breccia = 
			BLOCKS.register("breccia", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//breccia bricks
	public static final RegistryObject<Block> breccia_bricks = 
			BLOCKS.register("breccia_bricks", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));	
	//polished breccia
	public static final RegistryObject<Block> polished_breccia = 
			BLOCKS.register("polished_breccia", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));	
	//polished breccia bricks
	public static final RegistryObject<Block> polished_breccia_bricks = 
			BLOCKS.register("polished_breccia_bricks", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));	
	//breccia stairs
	public static final RegistryObject<Block> breccia_stairs = 
			BLOCKS.register("breccia_stairs", () -> new StairsBlock(
				() -> BlockInit.breccia.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));	
	//breccia brick stairs
	public static final RegistryObject<Block> breccia_brick_stairs = 
			BLOCKS.register("breccia_brick_stairs", () -> new StairsBlock(
				() -> BlockInit.breccia_bricks.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//polished breccia stairs
	public static final RegistryObject<Block> polished_breccia_stairs = 
			BLOCKS.register("polished_breccia_stairs", () -> new StairsBlock(
				() -> BlockInit.polished_breccia.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//polished breccia brick stairs
	public static final RegistryObject<Block> polished_breccia_brick_stairs = 
			BLOCKS.register("polished_breccia_brick_stairs", () -> new StairsBlock(
				() -> BlockInit.polished_breccia_bricks.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//breccia slab
	public static final RegistryObject<Block> breccia_slab = 
			BLOCKS.register("breccia_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//breccia brick slab
	public static final RegistryObject<Block> breccia_brick_slab = 
			BLOCKS.register("breccia_brick_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished breccia slab
	public static final RegistryObject<Block> polished_breccia_slab = 
			BLOCKS.register("polished_breccia_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished breccia brick slab
	public static final RegistryObject<Block> polished_breccia_brick_slab = 
			BLOCKS.register("polished_breccia_brick_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//breccia wall
	public static final RegistryObject<Block> breccia_wall = 
			BLOCKS.register("breccia_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//breccia brick wall
	public static final RegistryObject<Block> breccia_brick_wall = 
			BLOCKS.register("breccia_brick_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished breccia wall
	public static final RegistryObject<Block> polished_breccia_wall = 
			BLOCKS.register("polished_breccia_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished marble brick wall
	public static final RegistryObject<Block> polished_breccia_brick_wall = 
			BLOCKS.register("polished_breccia_brick_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );

	//SILTSTONE
	//siltstone
	public static final RegistryObject<Block> siltstone = 
			BLOCKS.register("siltstone", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//siltstone bricks
	public static final RegistryObject<Block> siltstone_bricks = 
			BLOCKS.register("siltstone_bricks", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//polished siltstone
	public static final RegistryObject<Block> polished_siltstone = 
			BLOCKS.register("polished_siltstone", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//polished siltstone bricks
	public static final RegistryObject<Block> polished_siltstone_bricks = 
			BLOCKS.register("polished_siltstone_bricks", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//siltstone stairs
	public static final RegistryObject<Block> siltstone_stairs = 
			BLOCKS.register("siltstone_stairs", () -> new StairsBlock(
				() -> BlockInit.siltstone.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//siltstone brick stairs
	public static final RegistryObject<Block> siltstone_brick_stairs = 
			BLOCKS.register("siltstone_brick_stairs", () -> new StairsBlock(
				() -> BlockInit.siltstone_bricks.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//polished siltstone stairs
	public static final RegistryObject<Block> polished_siltstone_stairs = 
			BLOCKS.register("polished_siltstone_stairs", () -> new StairsBlock(
				() -> BlockInit.polished_siltstone.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//polished siltstone brick stairs
	public static final RegistryObject<Block> polished_siltstone_brick_stairs = 
			BLOCKS.register("polished_siltstone_brick_stairs", () -> new StairsBlock(
				() -> BlockInit.polished_siltstone_bricks.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//siltstone slab
	public static final RegistryObject<Block> siltstone_slab = 
			BLOCKS.register("siltstone_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//siltstone brick slab
	public static final RegistryObject<Block> siltstone_brick_slab = 
			BLOCKS.register("siltstone_brick_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished siltstone slab
	public static final RegistryObject<Block> polished_siltstone_slab = 
			BLOCKS.register("polished_siltstone_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished siltstone brick slab
	public static final RegistryObject<Block> polished_siltstone_brick_slab = 
			BLOCKS.register("polished_siltstone_brick_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );	
	//siltstone wall
	public static final RegistryObject<Block> siltstone_wall = 
			BLOCKS.register("siltstone_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//siltstone brick wall
	public static final RegistryObject<Block> siltstone_brick_wall = 
			BLOCKS.register("siltstone_brick_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished siltstone wall
	public static final RegistryObject<Block> polished_siltstone_wall = 
			BLOCKS.register("polished_siltstone_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished siltstone brick wall
	public static final RegistryObject<Block> polished_siltstone_brick_wall = 
			BLOCKS.register("polished_siltstone_brick_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	
			
	//Overworld ores
	
	//rose gold ore
	public static final RegistryObject<Block> rose_gold_ore = 
			BLOCKS.register("rose_gold_ore", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//carbon infused iron ore
	public static final RegistryObject<Block> carbon_infused_iron_ore = 
			BLOCKS.register("carbon_infused_iron_ore", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//lignite coal ore
	public static final RegistryObject<Block> lignite_coal_ore = 
			BLOCKS.register("lignite_coal_ore", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//sapphire ore
	public static final RegistryObject<Block> sapphire_ore = 
			BLOCKS.register("sapphire_ore", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//bauxite ore
	public static final RegistryObject<Block> bauxite_ore = 
			BLOCKS.register("bauxite_ore", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//ruby ore
	public static final RegistryObject<Block> ruby_ore = 
			BLOCKS.register("ruby_ore", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//sulphur ore
	public static final RegistryObject<Block> sulphur_ore = 
			BLOCKS.register("sulphur_ore", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
		
	//Overworld functional blocks
	
	//alloy forge
	public static final RegistryObject<Block> alloy_forge = 
			BLOCKS.register("alloy_forge", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//warding beacon
	public static final RegistryObject<Block> warding_beacon = 
			BLOCKS.register("warding_beacon", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));





}
