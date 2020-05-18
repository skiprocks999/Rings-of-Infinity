package com.continf.itemlib.init;

import com.continf.itemlib.ContInfItemLib;
import com.continf.itemlib.ContInfItemLib.ContInfItemLibItemGroup;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ItemInit {
	
	//Items DeferredRegister
	public static final DeferredRegister<Item> ITEMS = 
			new DeferredRegister<>(ForgeRegistries.ITEMS , ContInfItemLib.modID);
	
	/*OVERWORLD ITEMS*/
	
	//Overworld Gems
	
	//Lignite Coal
	public static final RegistryObject<Item> lignite_coal = 
		ITEMS.register("lignite_coal", () -> new Item(new Item.Properties().maxStackSize(64)
		.group(ContInfItemLibItemGroup.itemGroupInstance)));
	//Sapphire
	public static final RegistryObject<Item> sapphire = 
		ITEMS.register("sapphire", () -> new Item(new Item.Properties().maxStackSize(64)
		.group(ContInfItemLibItemGroup.itemGroupInstance)));
	//Ruby
	public static final RegistryObject<Item> ruby = 
		ITEMS.register("ruby", () -> new Item(new Item.Properties().maxStackSize(64)
		.group(ContInfItemLibItemGroup.itemGroupInstance)));
	//Sulphur
	public static final RegistryObject<Item> sulphur = 
		ITEMS.register("sulphur", () -> new Item(new Item.Properties().maxStackSize(64)
		.group(ContInfItemLibItemGroup.itemGroupInstance)));
	
	//Overworld Ingots
	
	//Rose Gold Ingot
	public static final RegistryObject<Item> rose_gold_ingot = 
		ITEMS.register("rose_gold_ingot", () -> new Item(new Item.Properties().maxStackSize(64)
		.group(ContInfItemLibItemGroup.itemGroupInstance)));
	//Blister Steel Ingot
	public static final RegistryObject<Item> blister_steel_ingot = 
		ITEMS.register("blister_steel_ingot", () -> new Item(new Item.Properties().maxStackSize(64)
		.group(ContInfItemLibItemGroup.itemGroupInstance)));
	//Aluminum Ingot
	public static final RegistryObject<Item> aluminum_ingot = 
		ITEMS.register("aluminum_ingot", () -> new Item(new Item.Properties().maxStackSize(64)
		.group(ContInfItemLibItemGroup.itemGroupInstance)));
	//Ferroallide Steel Ingot
	public static final RegistryObject<Item> ferroallide_steel_ingot = 
		ITEMS.register("ferroallide_steel_ingot", () -> new Item(new Item.Properties().maxStackSize(64)
		.group(ContInfItemLibItemGroup.itemGroupInstance)));
	
	//Overworld Misc.
	
	//Cocain
	public static final RegistryObject<Item> cocain = 
		ITEMS.register("cocain", () -> new Item(new Item.Properties().maxStackSize(64)
		.group(ContInfItemLibItemGroup.itemGroupInstance)));
	
	
}
