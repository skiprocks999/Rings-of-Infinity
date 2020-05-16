package com.continf.itemlib.init;

import com.continf.itemlib.ContInfItemLib;
import com.continf.itemlib.ContInfItemLib.ContInfItemLibItemGroup;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(ContInfItemLib.modID)
@Mod.EventBusSubscriber(modid = ContInfItemLib.modID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemInit {
	
	//Overworld Gems
	public static final Item lignite_coal = null;
	public static final Item sapphire = null;
	public static final Item ruby = null;
	public static final Item sulphur = null;
	
	//Overworld Ingots
	public static final Item rose_gold_ingot = null;
	public static final Item blister_steel_ingot = null;
	public static final Item aluminum_ingot = null;
	public static final Item ferroallide_steel_ingot = null;
	
	//Overworld Misc.
	public static final Item cocain = null;
	
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		
		/*OVERWORLD ITEMS*/
		
		
		//Overworld Gems
		//Defines lignite coal Item properties
		event.getRegistry().register(new Item(new Item.Properties().maxStackSize(64)
			.group(ContInfItemLibItemGroup.itemGroupInstance)).setRegistryName("lignite_coal")
		);
		//Defines sapphire Item properties
		event.getRegistry().register(new Item(new Item.Properties().maxStackSize(64)
			.group(ContInfItemLibItemGroup.itemGroupInstance)).setRegistryName("sapphire")
		);
		//Defines ruby Item properties
		event.getRegistry().register(new Item(new Item.Properties().maxStackSize(64)
			.group(ContInfItemLibItemGroup.itemGroupInstance)).setRegistryName("ruby")
		);
		//Defines sulphur Item properties
		event.getRegistry().register(new Item(new Item.Properties().maxStackSize(64)
			.group(ContInfItemLibItemGroup.itemGroupInstance)).setRegistryName("sulphur")
		);
		
		//Overworld Ingots
		//Defines rose gold ingot Item properties
		event.getRegistry().register(new Item(new Item.Properties().maxStackSize(64)
			.group(ContInfItemLibItemGroup.itemGroupInstance)).setRegistryName("rose_gold_ingot")
		);
		//Defines blister steel ingot Item properties
		event.getRegistry().register(new Item(new Item.Properties().maxStackSize(64)
			.group(ContInfItemLibItemGroup.itemGroupInstance)).setRegistryName("blister_steel_ingot")
		);
		//Defines aluminum ingot Item properties
		event.getRegistry().register(new Item(new Item.Properties().maxStackSize(64)
			.group(ContInfItemLibItemGroup.itemGroupInstance)).setRegistryName("aluminum_ingot")
		);
		//Defines aluminum ingot Item properties
		event.getRegistry().register(new Item(new Item.Properties().maxStackSize(64)
			.group(ContInfItemLibItemGroup.itemGroupInstance)).setRegistryName("ferroallide_steel_ingot")
		);
		
		
		//Overworld Misc.
		//Defines aluminum ingot Item properties
		event.getRegistry().register(new Item(new Item.Properties().maxStackSize(64)
			.group(ContInfItemLibItemGroup.itemGroupInstance)).setRegistryName("cocain")
		);
		
	}
	

}
