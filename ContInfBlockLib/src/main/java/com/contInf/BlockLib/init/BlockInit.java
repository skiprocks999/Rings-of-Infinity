/* skip999
 * 5/13/2020
 * purpose: initialize blocks
 */
package com.contInf.BlockLib.init;

import com.contInf.BlockLib.ContInfBlockLib;
import com.contInf.BlockLib.ContInfBlockLib.ContInfBlockLibItemGroup;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(ContInfBlockLib.modID)
@Mod.EventBusSubscriber(modid = ContInfBlockLib.modID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockInit {

	//Overworld building blocks
	public static final Block marble = null;
	public static final Block gneiss = null;
	public static final Block breccia = null;
	public static final Block siltstone = null;
		
	//Overworld ores
	public static final Block rose_gold_ore = null;
	public static final Block carbon_infused_iron_ore = null;
	public static final Block lignite_coal_ore = null;
	public static final Block sapphire_ore = null;
	public static final Block bauxite_ore = null;
	public static final Block ruby_ore = null;
	public static final Block sulphur_ore = null;
		
	//Overworld functional blocks
	public static final Block alloy_forge = null;
	public static final Block warding_beacon = null;
	
	
	/**
	 * registers Blocks
	 * @param event
	 */
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
	
		/*OVERWORLD BLOCKS*/
		
		//OVERWORLD BUILDING BLOCKS
		//Defines marble Block characteristics
		event.getRegistry().register(
			new Block(Block.Properties.create(Material.IRON).
				hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE))
				.setRegistryName("marble")
		);
		//Defines gneiss Block characteristics
		event.getRegistry().register(
			new Block(Block.Properties.create(Material.IRON).
				hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE))
				.setRegistryName("gneiss")
		);
		//Defines breccia Block characteristics
		event.getRegistry().register(
			new Block(Block.Properties.create(Material.IRON).
				hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE))
				.setRegistryName("breccia")		
		);
		//Defines siltstone Block characteristics
		event.getRegistry().register(
			new Block(Block.Properties.create(Material.IRON).
				hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE))
				.setRegistryName("siltstone")				
		);
		
		//OVERWORLD ORES
		//Defines rose_gold_ore Block characteristics
		event.getRegistry().register(
			new Block(Block.Properties.create(Material.IRON).
				hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE))
				.setRegistryName("rose_gold_ore")	
		);
		//Defines carbon_infused_iron_ore Block characteristics
		event.getRegistry().register(
			new Block(Block.Properties.create(Material.IRON).
				hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE))
				.setRegistryName("carbon_infused_iron_ore")		
		);
		//Defines lignite_coal_ore Block characteristics
		event.getRegistry().register(
			new Block(Block.Properties.create(Material.IRON).
				hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE))
				.setRegistryName("lignite_coal_ore")														
		);
		//Defines sapphire_ore Block characteristics
		event.getRegistry().register(
			new Block(Block.Properties.create(Material.IRON).
				hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE))
				.setRegistryName("sapphire_ore")								
		);
		//Defines bauxite_ore Block characteristics
		event.getRegistry().register(
			new Block(Block.Properties.create(Material.IRON).
				hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE))
				.setRegistryName("bauxite_ore")							
		);
		//Defines ruby_ore Block characteristics
		event.getRegistry().register(
			new Block(Block.Properties.create(Material.IRON).
				hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE))
				.setRegistryName("ruby_ore")											
		);
		//Defines sulphur_ore Block characteristics
		event.getRegistry().register(
			new Block(Block.Properties.create(Material.IRON).
				hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE))
				.setRegistryName("sulphur_ore")		
		);
		
		//OVERWORLD FUNCTIONAL BLOCKS
		//Defines alloy_forge Block characteristics
		event.getRegistry().register(
			new Block(Block.Properties.create(Material.IRON).
				hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE))
				.setRegistryName("alloy_forge")											
		);
		//Defines warding_beacon block characteristics
		event.getRegistry().register(
			new Block(Block.Properties.create(Material.IRON).
				hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE))
				.setRegistryName("warding_beacon")			
		);
		
		
		
		/*NETHER BLOCKS*/
		
	}
	
	
	/**
	 * registers BlockItems
	 * @param event
	 */
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
		
		/*OVERWORLD BLOCKS*/
		
		//OVERWORLD BUILDING BLOCKS
		//Defines marble BlockItem characteristics
		event.getRegistry().register(new BlockItem(marble, new Item.Properties().maxStackSize(64)
			.group(ContInfBlockLibItemGroup.itemGroupInstance)).setRegistryName("marble")
		);
		//Defines gneiss BlockItem characteristics
		event.getRegistry().register(new BlockItem(gneiss, new Item.Properties().maxStackSize(64)
			.group(ContInfBlockLibItemGroup.itemGroupInstance)).setRegistryName("gneiss")	
		);
		//Defines breccia BlockItem characteristics
		event.getRegistry().register(new BlockItem(breccia, new Item.Properties().maxStackSize(64)
			.group(ContInfBlockLibItemGroup.itemGroupInstance)).setRegistryName("breccia")		
		);
		//Defines siltstone BlockItem characteristics
		event.getRegistry().register(new BlockItem(siltstone, new Item.Properties().maxStackSize(64)
			.group(ContInfBlockLibItemGroup.itemGroupInstance)).setRegistryName("siltstone")				
		);
		
		//OVERWORLD ORES
		//Defines rose_gold_ore BlockItem characteristics
		event.getRegistry().register(new BlockItem(rose_gold_ore, new Item.Properties().maxStackSize(64)
			.group(ContInfBlockLibItemGroup.itemGroupInstance)).setRegistryName("rose_gold_ore")				
		);
		//Defines carbon_infused_iron_ore BlockItem characteristics
		event.getRegistry().register(new BlockItem(carbon_infused_iron_ore, new Item.Properties().maxStackSize(64)
			.group(ContInfBlockLibItemGroup.itemGroupInstance)).setRegistryName("carbon_infused_iron_ore")		
		);
		//Defines lignite_coal_ore BlockItem characteristics
		event.getRegistry().register(new BlockItem(lignite_coal_ore, new Item.Properties().maxStackSize(64)
			.group(ContInfBlockLibItemGroup.itemGroupInstance)).setRegistryName("lignite_coal_ore")		
		);
		//Defines sapphire_ore BlockItem characteristics
		event.getRegistry().register(new BlockItem(sapphire_ore, new Item.Properties().maxStackSize(64)
			.group(ContInfBlockLibItemGroup.itemGroupInstance)).setRegistryName("sapphire_ore")								
		);
		//Defines bauxite_ore BlockItem characteristics
		event.getRegistry().register(new BlockItem(bauxite_ore, new Item.Properties().maxStackSize(64)
			.group(ContInfBlockLibItemGroup.itemGroupInstance)).setRegistryName("bauxite_ore")				
		);
		//Defines ruby_ore BlockItem characteristics
		event.getRegistry().register(new BlockItem(ruby_ore, new Item.Properties().maxStackSize(64)
			.group(ContInfBlockLibItemGroup.itemGroupInstance)).setRegistryName("ruby_ore")		
		);
		//Defines sulphur_ore BlockItem characteristics
		event.getRegistry().register(new BlockItem(sulphur_ore, new Item.Properties().maxStackSize(64)
			.group(ContInfBlockLibItemGroup.itemGroupInstance)).setRegistryName("sulphur_ore")		
		);
		
		//OVERWORLD FUNCTIONAL BLOCKS
		//Defines alloy_forge BlockItem characteristics
		event.getRegistry().register(new BlockItem(alloy_forge, new Item.Properties().maxStackSize(64)
			.group(ContInfBlockLibItemGroup.itemGroupInstance)).setRegistryName("alloy_forge")		
		);
		//Defines warding_beacon BlockItem characteristics
		event.getRegistry().register(new BlockItem(warding_beacon, new Item.Properties().maxStackSize(64)
			.group(ContInfBlockLibItemGroup.itemGroupInstance)).setRegistryName("warding_beacon")	
		);

			
		/*NETHER BLOCKS*/	
	}
}
