/* skip999
 * 5/13/2020
 * purpose: initialize blocks
 */
package com.contInf.BlockLib.init;

import com.contInf.BlockLib.ContInfBlockLib;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
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
	
	//Overworld base building blocks
	
	//marble
	public static final RegistryObject<Block> marble = 
			BLOCKS.register("marble", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//gneiss
	public static final RegistryObject<Block> gneiss = 
			BLOCKS.register("gneiss", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//breccia
	public static final RegistryObject<Block> breccia = 
			BLOCKS.register("breccia", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//siltstone
	public static final RegistryObject<Block> siltstone = 
			BLOCKS.register("siltstone", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	
	//Overworld crafted building blocks
	
	//marble bricks
	public static final RegistryObject<Block> marble_bricks = 
			BLOCKS.register("marble_bricks", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//gneiss bricks
	public static final RegistryObject<Block> gneiss_bricks = 
			BLOCKS.register("gneiss_bricks", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//breccia bricks
	public static final RegistryObject<Block> breccia_bricks = 
			BLOCKS.register("breccia_bricks", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//siltstone bricks
	public static final RegistryObject<Block> siltstone_bricks = 
			BLOCKS.register("siltstone_bricks", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//polished marble
	public static final RegistryObject<Block> polished_marble = 
			BLOCKS.register("polished_marble", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//polished gneiss
	public static final RegistryObject<Block> polished_gneiss = 
			BLOCKS.register("polished_gneiss", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//polished breccia
	public static final RegistryObject<Block> polished_breccia = 
			BLOCKS.register("polished_breccia", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//polished siltstone
	public static final RegistryObject<Block> polished_siltstone = 
			BLOCKS.register("polished_siltstone", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//polished marble bricks
	public static final RegistryObject<Block> polished_marble_bricks = 
			BLOCKS.register("polished_marble_bricks", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//polished gneiss bricks
	public static final RegistryObject<Block> polished_gneiss_bricks = 
			BLOCKS.register("polished_gneiss_bricks", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//polished breccia bricks
	public static final RegistryObject<Block> polished_breccia_bricks = 
			BLOCKS.register("polished_breccia_bricks", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
	//polished siltstone bricks
	public static final RegistryObject<Block> polished_siltstone_bricks = 
			BLOCKS.register("polished_siltstone_bricks", () -> new Block(Block.Properties.create(Material.IRON).
			hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE)));
		
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
	
	//Overworld Walls
	
	public static final WallBlock marble_wall = null;
	
	
}
