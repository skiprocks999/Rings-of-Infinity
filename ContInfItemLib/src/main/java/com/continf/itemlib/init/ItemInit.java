package com.continf.itemlib.init;

import com.continf.enums.ArmorMaterials;
import com.continf.enums.ItemTiers;
import com.continf.itemlib.ContInfItemLib;
import com.continf.itemlib.ContInfItemLib.ContInfItemLibItemGroup;
import com.continf.itemlib.ContInfItemLib.ContInfToolsLibItemGroup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	// Items DeferredRegister
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS,
			ContInfItemLib.modID);

	/* OVERWORLD ITEMS */

	/**************************
	 * SWORDS
	**************************/

	// Ruby
	public static final RegistryObject<Item> ruby_sword = ITEMS.register("ruby_sword",
			() -> new SwordItem(ItemTiers.RUBY, 7, 5.0F, 
								new Item.Properties().maxStackSize(1).group(ContInfToolsLibItemGroup.itemGroupInstance)));

	// Ferroallide
	public static final RegistryObject<Item> ferroallide_sword = ITEMS.register("ferroallide_sword",
			() -> new SwordItem(ItemTiers.FERROALLIDE, 7, 5.0F, 
								new Item.Properties().maxStackSize(1).group(ContInfToolsLibItemGroup.itemGroupInstance)));


	/**************************
	 * ARMOR 
	**************************/

	// Ruby 
	public static final RegistryObject<Item> ruby_helmet = ITEMS.register("ruby_helmet",
			() -> new ArmorItem(ArmorMaterials.RUBY, 
								EquipmentSlotType.HEAD, 
								new Item.Properties().maxStackSize(1).group(ContInfToolsLibItemGroup.itemGroupInstance)));

	public static final RegistryObject<Item> ruby_chestplate = ITEMS.register("ruby_chestplate",
			() -> new ArmorItem(ArmorMaterials.RUBY, 
								EquipmentSlotType.CHEST, 
								new Item.Properties().maxStackSize(1).group(ContInfToolsLibItemGroup.itemGroupInstance)));

	public static final RegistryObject<Item> ruby_leggings = ITEMS.register("ruby_leggings",
			() -> new ArmorItem(ArmorMaterials.RUBY, 
								EquipmentSlotType.LEGS, 
								new Item.Properties().maxStackSize(1).group(ContInfToolsLibItemGroup.itemGroupInstance)));

	public static final RegistryObject<Item> ruby_boots = ITEMS.register("ruby_boots",
			() -> new ArmorItem(ArmorMaterials.RUBY, 
								EquipmentSlotType.FEET, 
								new Item.Properties().maxStackSize(1).group(ContInfToolsLibItemGroup.itemGroupInstance)));

	// Ferroallide
	public static final RegistryObject<Item> ferroallide_helmet = ITEMS.register("ferroallide_helmet",
			() -> new ArmorItem(ArmorMaterials.FERROALLIDE, 
								EquipmentSlotType.HEAD, 
								new Item.Properties().maxStackSize(1).group(ContInfToolsLibItemGroup.itemGroupInstance)));

	public static final RegistryObject<Item> ferroallide_chestplate = ITEMS.register("ferroallide_chestplate",
			() -> new ArmorItem(ArmorMaterials.FERROALLIDE,
								EquipmentSlotType.CHEST, 
								new Item.Properties().maxStackSize(1).group(ContInfToolsLibItemGroup.itemGroupInstance)));

	public static final RegistryObject<Item> ferroallide_leggings = ITEMS.register("ferroallide_leggings",
			() -> new ArmorItem(ArmorMaterials.FERROALLIDE,
								EquipmentSlotType.LEGS, 
								new Item.Properties().maxStackSize(1).group(ContInfToolsLibItemGroup.itemGroupInstance)));

	public static final RegistryObject<Item> ferroallide_boots = ITEMS.register("ferroallide_boots",
			() -> new ArmorItem(ArmorMaterials.FERROALLIDE,
								EquipmentSlotType.FEET, 
								new Item.Properties().maxStackSize(1).group(ContInfToolsLibItemGroup.itemGroupInstance)));

	// Slime
	public static final RegistryObject<Item> slime_boots = ITEMS.register("slime_boots",
			() -> new ArmorItem(ArmorMaterials.FERROALLIDE,
								EquipmentSlotType.FEET, 
								new Item.Properties().maxStackSize(1).group(ContInfToolsLibItemGroup.itemGroupInstance)));
	
	/**************************
	 * TOOLS 
	**************************/

	// Ruby 
	public static final RegistryObject<Item> ruby_pickaxe = ITEMS.register("ruby_pickaxe",
			() -> new PickaxeItem(new Item.Properties().maxStackSize(1).group(ContInfToolsLibItemGroup.itemGroupInstance)));

	public static final RegistryObject<Item> ruby_axe = ITEMS.register("ruby_axe",
			() -> new AxeItem(new Item.Properties().maxStackSize(1).group(ContInfToolsLibItemGroup.itemGroupInstance)));

	public static final RegistryObject<Item> ruby_shovel = ITEMS.register("ruby_shovel",
			() -> new ShovelItem(new Item.Properties().maxStackSize(1).group(ContInfToolsLibItemGroup.itemGroupInstance)));

	public static final RegistryObject<Item> ruby_hoe = ITEMS.register("ruby_hoe",
			() -> new HoeItem(new Item.Properties().maxStackSize(1).group(ContInfToolsLibItemGroup.itemGroupInstance)));

	// Ferroallide
	public static final RegistryObject<Item> ferroallide_pickaxe = ITEMS.register("ferroallide_pickaxe",
			() -> new PickaxeItem(new Item.Properties().maxStackSize(1).group(ContInfToolsLibItemGroup.itemGroupInstance)));

	public static final RegistryObject<Item> ferroallide_axe = ITEMS.register("ferroallide_axe",
			() -> new AxeItem(new Item.Properties().maxStackSize(1).group(ContInfToolsLibItemGroup.itemGroupInstance)));

	public static final RegistryObject<Item> ferroallide_shovel = ITEMS.register("ferroallide_shovel",
			() -> new ShovelItem(new Item.Properties().maxStackSize(1).group(ContInfToolsLibItemGroup.itemGroupInstance)));

	public static final RegistryObject<Item> ferroallide_hoe = ITEMS.register("ferroallide_hoe",
			() -> new HoeItem(new Item.Properties().maxStackSize(1).group(ContInfToolsLibItemGroup.itemGroupInstance)));

	// Blast
	public static final RegistryObject<Item> blast_pickaxe = ITEMS.register("blast_pickaxe",
			() -> new PickaxeItem(new Item.Properties().maxStackSize(1).group(ContInfToolsLibItemGroup.itemGroupInstance)));
		
	public static final RegistryObject<Item> blast_axe = ITEMS.register("blast_axe",
			() -> new AxeItem(new Item.Properties().maxStackSize(1).group(ContInfToolsLibItemGroup.itemGroupInstance)));

	 
	/**************************
	 * MISC 
	**************************/

	// Amulets
	public static final RegistryObject<Item> the_amulet_of_scultari = ITEMS.register("the_amulet_of_scultari",
			() -> new Item(new Item.Properties().maxStackSize(1).group(ContInfToolsLibItemGroup.itemGroupInstance)));

	public static final RegistryObject<Item> amulet_of_vulcanus = ITEMS.register("amulet_of_vulcanus",
			() -> new Item(new Item.Properties().maxStackSize(1).group(ContInfToolsLibItemGroup.itemGroupInstance)));

	// Rods
	public static final RegistryObject<Item> rod_of_divination = ITEMS.register("rod_of_divination",
			() -> new Item(new Item.Properties().maxStackSize(1).group(ContInfToolsLibItemGroup.itemGroupInstance)));




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
