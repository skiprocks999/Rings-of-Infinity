/* skip999
 * 5/13/2020
 * purpose: initialize blocks
 */
package com.contInf.BlockLib.init;

import com.contInf.BlockLib.ContInfBlockLib;
import com.contInf.BlockLib.objects.blocks.AlloyForge;
import com.contInf.BlockLib.objects.blocks.DemonicAlloyForge;
import com.contInf.BlockLib.objects.blocks.DemonicWardingBeacon;
import com.contInf.BlockLib.objects.blocks.HellfireFurnace;
import com.contInf.BlockLib.objects.blocks.WardingBeacon;

import net.minecraft.block.Block;
import net.minecraft.block.RotatedPillarBlock;
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
		
	//Overworld Ingot Blocks
	
	//blister steel ingot block
	public static final RegistryObject<Block> block_of_blister_steel = 
			BLOCKS.register("block_of_blister_steel", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.METAL)));
	//rose gold ingot block
	public static final RegistryObject<Block> block_of_rose_gold = 
			BLOCKS.register("block_of_rose_gold", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.METAL)));
	//aluminum ingot block
	public static final RegistryObject<Block> block_of_aluminum = 
			BLOCKS.register("block_of_aluminum", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.METAL)));
	//ferroallide steel ingot block
	public static final RegistryObject<Block> block_of_ferroallide_steel = 
			BLOCKS.register("block_of_ferroallide_steel", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.METAL)));
	
	//Overworld Gem Blocks
	
	//ruby block
	public static final RegistryObject<Block> block_of_ruby = 
			BLOCKS.register("block_of_ruby", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.METAL)));
	//sapphire block
	public static final RegistryObject<Block> block_of_sapphire = 
			BLOCKS.register("block_of_sapphire", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.METAL)));
	//lignite coal block
	public static final RegistryObject<Block> block_of_lignite_coal = 
			BLOCKS.register("block_of_lignite_coal", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.METAL)));
	//sulphur block
	public static final RegistryObject<Block> block_of_sulphur = 
			BLOCKS.register("block_of_sulphur", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.METAL)));
	
	//Overworld functional blocks
	
	//alloy forge
	public static final RegistryObject<Block> alloy_forge = 
			BLOCKS.register("alloy_forge", () -> new AlloyForge(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//warding beacon
	public static final RegistryObject<Block> warding_beacon = 
			BLOCKS.register("warding_beacon", () -> new WardingBeacon(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).lightValue(15).sound(SoundType.STONE)));


	/*NETHER BLOCKS*/
	
	//NETHER BUILDING BLOCKS
	
	//BASALT
	//basalt
	public static final RegistryObject<Block> basalt = 
			BLOCKS.register("basalt", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//basalt Bricks
	public static final RegistryObject<Block> basalt_bricks = 
			BLOCKS.register("basalt_bricks", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//polished Basalt
	public static final RegistryObject<Block> polished_basalt = 
			BLOCKS.register("polished_basalt", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//polished Basalt Bricks
	public static final RegistryObject<Block> polished_basalt_bricks = 
			BLOCKS.register("polished_basalt_bricks", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//basalt stairs
	public static final RegistryObject<Block> basalt_stairs = 
			BLOCKS.register("basalt_stairs", () -> new StairsBlock(
				() -> BlockInit.basalt.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//basalt brick stairs
	public static final RegistryObject<Block> basalt_brick_stairs = 
			BLOCKS.register("basalt_brick_stairs", () -> new StairsBlock(
				() -> BlockInit.basalt_bricks.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//polished basalt stairs
	public static final RegistryObject<Block> polished_basalt_stairs = 
			BLOCKS.register("polished_basalt_stairs", () -> new StairsBlock(
				() -> BlockInit.polished_basalt.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//polished basalt brick stairs
	public static final RegistryObject<Block> polished_basalt_brick_stairs = 
			BLOCKS.register("polished_basalt_brick_stairs", () -> new StairsBlock(
				() -> BlockInit.polished_basalt_bricks.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//basalt slab
	public static final RegistryObject<Block> basalt_slab = 
			BLOCKS.register("basalt_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//basalt brick slab
	public static final RegistryObject<Block> basalt_brick_slab = 
			BLOCKS.register("basalt_brick_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished basalt slab
	public static final RegistryObject<Block> polished_basalt_slab = 
			BLOCKS.register("polished_basalt_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished basalt brick slab
	public static final RegistryObject<Block> polished_basalt_brick_slab = 
			BLOCKS.register("polished_basalt_brick_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//basalt wall
	public static final RegistryObject<Block> basalt_wall = 
			BLOCKS.register("basalt_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//basalt brick wall
	public static final RegistryObject<Block> basalt_brick_wall = 
			BLOCKS.register("basalt_brick_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished basalt wall
	public static final RegistryObject<Block> polished_basalt_wall = 
			BLOCKS.register("polished_basalt_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished basalt brick wall
	public static final RegistryObject<Block> polished_basalt_brick_wall = 
			BLOCKS.register("polished_basalt_brick_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );	
	
	//SCORIA
	//scoria
	public static final RegistryObject<Block> scoria = 
			BLOCKS.register("scoria", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//scoria Bricks
	public static final RegistryObject<Block> scoria_bricks = 
			BLOCKS.register("scoria_bricks", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//polished scoria
	public static final RegistryObject<Block> polished_scoria = 
			BLOCKS.register("polished_scoria", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//polished scoria Bricks
	public static final RegistryObject<Block> polished_scoria_bricks = 
			BLOCKS.register("polished_scoria_bricks", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//scoria stairs
	public static final RegistryObject<Block> scoria_stairs = 
			BLOCKS.register("scoria_stairs", () -> new StairsBlock(
				() -> BlockInit.scoria.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//scoria brick stairs
	public static final RegistryObject<Block> scoria_brick_stairs = 
			BLOCKS.register("scoria_brick_stairs", () -> new StairsBlock(
				() -> BlockInit.scoria_bricks.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//polished scoria stairs
	public static final RegistryObject<Block> polished_scoria_stairs = 
			BLOCKS.register("polished_scoria_stairs", () -> new StairsBlock(
				() -> BlockInit.polished_scoria.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//polished scoria brick stairs
	public static final RegistryObject<Block> polished_scoria_brick_stairs = 
			BLOCKS.register("polished_scoria_brick_stairs", () -> new StairsBlock(
				() -> BlockInit.polished_scoria_bricks.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//scoria slab
	public static final RegistryObject<Block> scoria_slab = 
			BLOCKS.register("scoria_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//scoria brick slab
	public static final RegistryObject<Block> scoria_brick_slab = 
			BLOCKS.register("scoria_brick_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//scoria basalt slab
	public static final RegistryObject<Block> polished_scoria_slab = 
			BLOCKS.register("polished_scoria_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished scoria brick slab
	public static final RegistryObject<Block> polished_scoria_brick_slab = 
			BLOCKS.register("polished_scoria_brick_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//scoria wall
	public static final RegistryObject<Block> scoria_wall = 
			BLOCKS.register("scoria_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//scoria brick wall
	public static final RegistryObject<Block> scoria_brick_wall = 
			BLOCKS.register("scoria_brick_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished scoria wall
	public static final RegistryObject<Block> polished_scoria_wall = 
			BLOCKS.register("polished_scoria_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished scoria brick wall
	public static final RegistryObject<Block> polished_scoria_brick_wall = 
			BLOCKS.register("polished_scoria_brick_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );	
	
	//DIABASE
	//diabase
	public static final RegistryObject<Block> diabase = 
			BLOCKS.register("diabase", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//diabase Bricks
	public static final RegistryObject<Block> diabase_bricks = 
			BLOCKS.register("diabase_bricks", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//polished diabase
	public static final RegistryObject<Block> polished_diabase = 
			BLOCKS.register("polished_diabase", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//polished diabase Bricks
	public static final RegistryObject<Block> polished_diabase_bricks = 
			BLOCKS.register("polished_diabase_bricks", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//diabase stairs
	public static final RegistryObject<Block> diabase_stairs = 
			BLOCKS.register("diabase_stairs", () -> new StairsBlock(
				() -> BlockInit.diabase.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//diabase brick stairs
	public static final RegistryObject<Block> diabase_brick_stairs = 
			BLOCKS.register("diabase_brick_stairs", () -> new StairsBlock(
				() -> BlockInit.diabase_bricks.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//polished diabase stairs
	public static final RegistryObject<Block> polished_diabase_stairs = 
			BLOCKS.register("polished_diabase_stairs", () -> new StairsBlock(
				() -> BlockInit.polished_diabase.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//polished diabase brick stairs
	public static final RegistryObject<Block> polished_diabase_brick_stairs = 
			BLOCKS.register("polished_diabase_brick_stairs", () -> new StairsBlock(
				() -> BlockInit.polished_diabase_bricks.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//diabase slab
	public static final RegistryObject<Block> diabase_slab = 
			BLOCKS.register("diabase_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//diabase brick slab
	public static final RegistryObject<Block> diabase_brick_slab = 
			BLOCKS.register("diabase_brick_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished diabase slab
	public static final RegistryObject<Block> polished_diabase_slab = 
			BLOCKS.register("polished_diabase_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished diabase brick slab
	public static final RegistryObject<Block> polished_diabase_brick_slab = 
			BLOCKS.register("polished_diabase_brick_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//diabase wall
	public static final RegistryObject<Block> diabase_wall = 
			BLOCKS.register("diabase_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//diabase brick wall
	public static final RegistryObject<Block> diabase_brick_wall = 
			BLOCKS.register("diabase_brick_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished diabase wall
	public static final RegistryObject<Block> polished_diabase_wall = 
			BLOCKS.register("polished_diabase_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished diabase brick wall
	public static final RegistryObject<Block> polished_diabase_brick_wall = 
			BLOCKS.register("polished_diabase_brick_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );	
	
	//CHLORITE
	//chlorite
	public static final RegistryObject<Block> chlorite = 
			BLOCKS.register("chlorite", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//chlorite Bricks
	public static final RegistryObject<Block> chlorite_bricks = 
			BLOCKS.register("chlorite_bricks", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//polished chlorite
	public static final RegistryObject<Block> polished_chlorite = 
			BLOCKS.register("polished_chlorite", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//polished chlorite Bricks
	public static final RegistryObject<Block> polished_chlorite_bricks = 
			BLOCKS.register("polished_chlorite_bricks", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//chlorite stairs
	public static final RegistryObject<Block> chlorite_stairs = 
			BLOCKS.register("chlorite_stairs", () -> new StairsBlock(
				() -> BlockInit.chlorite.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//chlorite brick stairs
	public static final RegistryObject<Block> chlorite_brick_stairs = 
			BLOCKS.register("chlorite_brick_stairs", () -> new StairsBlock(
				() -> BlockInit.chlorite_bricks.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//polished chlorite stairs
	public static final RegistryObject<Block> polished_chlorite_stairs = 
			BLOCKS.register("polished_chlorite_stairs", () -> new StairsBlock(
				() -> BlockInit.polished_chlorite.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//polished chlorite brick stairs
	public static final RegistryObject<Block> polished_chlorite_brick_stairs = 
			BLOCKS.register("polished_chlorite_brick_stairs", () -> new StairsBlock(
				() -> BlockInit.polished_chlorite_bricks.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//chlorite slab
	public static final RegistryObject<Block> chlorite_slab = 
			BLOCKS.register("chlorite_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//chlorite brick slab
	public static final RegistryObject<Block> chlorite_brick_slab = 
			BLOCKS.register("chlorite_brick_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished chlorite slab
	public static final RegistryObject<Block> polished_chlorite_slab = 
			BLOCKS.register("polished_chlorite_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished chlorite brick slab
	public static final RegistryObject<Block> polished_chlorite_brick_slab = 
			BLOCKS.register("polished_chlorite_brick_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//chlorite wall
	public static final RegistryObject<Block> chlorite_wall = 
			BLOCKS.register("chlorite_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//chlorite brick wall
	public static final RegistryObject<Block> chlorite_brick_wall = 
			BLOCKS.register("chlorite_brick_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished chlorite wall
	public static final RegistryObject<Block> polished_chlorite_wall = 
			BLOCKS.register("polished_chlorite_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//polished chlorite brick wall
	public static final RegistryObject<Block> polished_chlorite_brick_wall = 
			BLOCKS.register("polished_chlorite_brick_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );	
	
	//ROSE QUARTZ
	//block of rose quartz
	public static final RegistryObject<Block> block_of_rose_quartz = 
			BLOCKS.register("block_of_rose_quartz", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//smooth rose quartz
	public static final RegistryObject<Block> smooth_rose_quartz = 
			BLOCKS.register("smooth_rose_quartz", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//chiseled rose quartz
	public static final RegistryObject<Block> chiseled_rose_quartz = 
			BLOCKS.register("chiseled_rose_quartz", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//rose quartz pillar
	public static final RegistryObject<Block> rose_quartz_pillar = 
			BLOCKS.register("rose_quartz_pillar", () -> new RotatedPillarBlock(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//rose quartz stairs
	public static final RegistryObject<Block> rose_quartz_stairs = 
			BLOCKS.register("rose_quartz_stairs", () -> new StairsBlock(
				() -> BlockInit.block_of_rose_quartz.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//smooth rose quartz stairs
	public static final RegistryObject<Block> smooth_rose_quartz_stairs = 
			BLOCKS.register("smooth_rose_quartz_stairs", () -> new StairsBlock(
				() -> BlockInit.block_of_rose_quartz.get().getDefaultState(),
				Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
				.sound(SoundType.STONE)));
	//rose quartz slab
	public static final RegistryObject<Block> rose_quartz_slab = 
			BLOCKS.register("rose_quartz_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//smooth rose quartz slab
	public static final RegistryObject<Block> smooth_rose_quartz_slab = 
			BLOCKS.register("smooth_rose_quartz_slab", () -> new SlabBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//rose quartz wall
	public static final RegistryObject<Block> rose_quartz_wall = 
			BLOCKS.register("rose_quartz_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );
	//smooth rose quartz wall
	public static final RegistryObject<Block> smooth_rose_quartz_wall = 
			BLOCKS.register("smooth_rose_quartz_wall", () -> new WallBlock(
					Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
					.sound(SoundType.STONE)) );

	//COBRA STONE
	//cobra stone
	public static final RegistryObject<Block> cobra_stone = 
			BLOCKS.register("cobra_stone", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.GLASS).lightValue(15)));
	//cobra stone lamp
	public static final RegistryObject<Block> cobra_stone_lamp = 
			BLOCKS.register("cobra_stone_lamp", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.GLASS).lightValue(15)));
	
	//NETHER ORES
	
	//rose quartz ore
	public static final RegistryObject<Block> rose_quartz_ore = 
			BLOCKS.register("rose_quartz_ore", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//black jade ore
	public static final RegistryObject<Block> black_jade_ore = 
			BLOCKS.register("black_jade_ore", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//cobalt ore
	public static final RegistryObject<Block> cobalt_ore = 
			BLOCKS.register("cobalt_ore", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//nickel ore
	public static final RegistryObject<Block> nickel_ore = 
			BLOCKS.register("nickel_ore", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	
	//NETHER RESOURCE BLOCKS
	
	//block of black jade
	public static final RegistryObject<Block> block_of_black_jade = 
			BLOCKS.register("block_of_black_jade", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.METAL)));
	//block of cobalt
	public static final RegistryObject<Block> block_of_cobalt = 
			BLOCKS.register("block_of_cobalt", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.METAL)));
	//block of nickel
	public static final RegistryObject<Block> block_of_nickel = 
			BLOCKS.register("block_of_nickel", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.METAL)));
	//block of demon steel
	public static final RegistryObject<Block> block_of_demon_steel = 
			BLOCKS.register("block_of_demon_steel", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.METAL)));

	//NETHER FUNCTIONAL BLOCKS
	
	//demonic alloy forge
	public static final RegistryObject<Block> demonic_alloy_forge = 
			BLOCKS.register("demonic_alloy_forge", () -> new DemonicAlloyForge(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//demonic warding beacon
	public static final RegistryObject<Block> demonic_warding_beacon = 
			BLOCKS.register("demonic_warding_beacon", () -> new DemonicWardingBeacon(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).lightValue(15).sound(SoundType.STONE)));
	//hellfire furnace
	public static final RegistryObject<Block> hellfire_furnace = 
			BLOCKS.register("hellfire_furnace", () -> new HellfireFurnace(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	
	
	/*END BLOCKS*/
	
	//END ORES
	
	//pink topaz ore
	public static final RegistryObject<Block> pink_topaz_ore = 
			BLOCKS.register("pink_topaz_ore", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//purpurite ore
	public static final RegistryObject<Block> purpurite_ore = 
			BLOCKS.register("purpurite_ore", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	
	//END GEM BLOCKS
	
	//block of pink topaz
	public static final RegistryObject<Block> block_of_pink_topaz = 
			BLOCKS.register("block_of_pink_topaz", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	
	//block of purpurite
	public static final RegistryObject<Block> block_of_purpurite = 
			BLOCKS.register("block_of_purpurite", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	
	
	
	
}
