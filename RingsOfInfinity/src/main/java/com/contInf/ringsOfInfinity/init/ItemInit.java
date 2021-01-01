package com.contInf.ringsOfInfinity.init;

import com.contInf.enums.ArmorMaterials;
import com.contInf.enums.ItemTiers;
import com.contInf.ringsOfInfinity.RingsOfInfinity;
import com.contInf.ringsOfInfinity.RingsOfInfinity.ROFItemGroup;
import com.contInf.ringsOfInfinity.RingsOfInfinity.ROFToolsGroup;
import com.contInf.ringsOfInfinity.objects.items.AmOfScul;
import com.contInf.ringsOfInfinity.objects.items.AmOfVulc;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	// Items DeferredRegister
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			RingsOfInfinity.modID);

	/* OVERWORLD ITEMS */

	/**************************
	 * SWORDS
	**************************/

	// Ruby
	public static final RegistryObject<Item> ruby_sword = ITEMS.register("ruby_sword",
			() -> new SwordItem(ItemTiers.RUBY, 9, -2.2F, 
								new Item.Properties().maxStackSize(1).group(ROFToolsGroup.toolsGroupInstance)));

	// Ferroallide
	public static final RegistryObject<Item> ferroallide_sword = ITEMS.register("ferroallide_sword",
			() -> new SwordItem(ItemTiers.FERROALLIDE, 7, -2.4F, 
								new Item.Properties().maxStackSize(1).group(ROFToolsGroup.toolsGroupInstance)));


	/**************************
	 * ARMOR 
	**************************/

	// Ruby 
	public static final RegistryObject<Item> ruby_helmet = ITEMS.register("ruby_helmet",
			() -> new ArmorItem(ArmorMaterials.RUBY, 
								EquipmentSlotType.HEAD, 
								new Item.Properties().maxStackSize(1).group(ROFToolsGroup.toolsGroupInstance)));

	public static final RegistryObject<Item> ruby_chestplate = ITEMS.register("ruby_chestplate",
			() -> new ArmorItem(ArmorMaterials.RUBY, 
								EquipmentSlotType.CHEST, 
								new Item.Properties().maxStackSize(1).group(ROFToolsGroup.toolsGroupInstance)));

	public static final RegistryObject<Item> ruby_leggings = ITEMS.register("ruby_leggings",
			() -> new ArmorItem(ArmorMaterials.RUBY, 
								EquipmentSlotType.LEGS, 
								new Item.Properties().maxStackSize(1).group(ROFToolsGroup.toolsGroupInstance)));

	public static final RegistryObject<Item> ruby_boots = ITEMS.register("ruby_boots",
			() -> new ArmorItem(ArmorMaterials.RUBY, 
								EquipmentSlotType.FEET, 
								new Item.Properties().maxStackSize(1).group(ROFToolsGroup.toolsGroupInstance)));

	// Ferroallide
	public static final RegistryObject<Item> ferroallide_helmet = ITEMS.register("ferroallide_helmet",
			() -> new ArmorItem(ArmorMaterials.FERROALLIDE, 
								EquipmentSlotType.HEAD, 
								new Item.Properties().maxStackSize(1).group(ROFToolsGroup.toolsGroupInstance)));

	public static final RegistryObject<Item> ferroallide_chestplate = ITEMS.register("ferroallide_chestplate",
			() -> new ArmorItem(ArmorMaterials.FERROALLIDE,
								EquipmentSlotType.CHEST, 
								new Item.Properties().maxStackSize(1).group(ROFToolsGroup.toolsGroupInstance)));

	public static final RegistryObject<Item> ferroallide_leggings = ITEMS.register("ferroallide_leggings",
			() -> new ArmorItem(ArmorMaterials.FERROALLIDE,
								EquipmentSlotType.LEGS, 
								new Item.Properties().maxStackSize(1).group(ROFToolsGroup.toolsGroupInstance)));

	public static final RegistryObject<Item> ferroallide_boots = ITEMS.register("ferroallide_boots",
			() -> new ArmorItem(ArmorMaterials.FERROALLIDE,
								EquipmentSlotType.FEET, 
								new Item.Properties().maxStackSize(1).group(ROFToolsGroup.toolsGroupInstance)));

	// Slime
	public static final RegistryObject<Item> slime_boots = ITEMS.register("slime_boots",
			() -> new ArmorItem(ArmorMaterials.SLIME,
								EquipmentSlotType.FEET, 
								new Item.Properties().maxStackSize(1).group(ROFToolsGroup.toolsGroupInstance)));
	
	/**************************
	 * TOOLS 
	**************************/

	// Ruby 
	public static final RegistryObject<Item> ruby_pickaxe = ITEMS.register("ruby_pickaxe",
			() -> new PickaxeItem(ItemTiers.RUBY, 5, -2.0F, 
								  new Item.Properties().maxStackSize(1).group(ROFToolsGroup.toolsGroupInstance)));

	public static final RegistryObject<Item> ruby_axe = ITEMS.register("ruby_axe",
			() -> new AxeItem(ItemTiers.RUBY, 11, -3.0F, 
							  new Item.Properties().maxStackSize(1).group(ROFToolsGroup.toolsGroupInstance)));

	public static final RegistryObject<Item> ruby_shovel = ITEMS.register("ruby_shovel",
			() -> new ShovelItem(ItemTiers.RUBY, 4.5F, -2.0F, 
								 new Item.Properties().maxStackSize(1).group(ROFToolsGroup.toolsGroupInstance)));

	public static final RegistryObject<Item> ruby_hoe = ITEMS.register("ruby_hoe",
			() -> new HoeItem(ItemTiers.RUBY, 0, -2.0F, 
							  new Item.Properties().maxStackSize(1).group(ROFToolsGroup.toolsGroupInstance)));

	// Ferroallide
	public static final RegistryObject<Item> ferroallide_pickaxe = ITEMS.register("ferroallide_pickaxe",
			() -> new PickaxeItem(ItemTiers.FERROALLIDE, 5, -2.2F, 
								  new Item.Properties().maxStackSize(1).group(ROFToolsGroup.toolsGroupInstance)));

	public static final RegistryObject<Item> ferroallide_axe = ITEMS.register("ferroallide_axe",
			() -> new AxeItem(ItemTiers.FERROALLIDE, 9, -2.2F, 
							  new Item.Properties().maxStackSize(1).group(ROFToolsGroup.toolsGroupInstance)));

	public static final RegistryObject<Item> ferroallide_shovel = ITEMS.register("ferroallide_shovel",
			() -> new ShovelItem(ItemTiers.FERROALLIDE, 3.5F, -2.2F, 
			                     new Item.Properties().maxStackSize(1).group(ROFToolsGroup.toolsGroupInstance)));

	public static final RegistryObject<Item> ferroallide_hoe = ITEMS.register("ferroallide_hoe",
			() -> new HoeItem(ItemTiers.FERROALLIDE, 0, -2.2F,
			                  new Item.Properties().maxStackSize(1).group(ROFToolsGroup.toolsGroupInstance)));

	// Blast
	public static final RegistryObject<Item> blast_pickaxe = ITEMS.register("blast_pickaxe",
			() -> new PickaxeItem(ItemTiers.BLAST, 3, 5.0F,
			 					  new Item.Properties().maxStackSize(1).group(ROFToolsGroup.toolsGroupInstance)));
		
	public static final RegistryObject<Item> blast_axe = ITEMS.register("blast_axe",
			() -> new AxeItem(ItemTiers.BLAST, 11, 5.0F, 
							  new Item.Properties().maxStackSize(1).group(ROFToolsGroup.toolsGroupInstance)));

	 
	/**************************
	 * MISC 
	**************************/

	// Amulets
	public static final RegistryObject<Item> amulet_of_scultari = 
			ITEMS.register("amulet_of_scultari",() -> new AmOfScul(new Item.Properties().maxStackSize(1)
					.group(ROFToolsGroup.toolsGroupInstance)));

	public static final RegistryObject<Item> amulet_of_vulcanus = 
			ITEMS.register("amulet_of_vulcanus",() -> new AmOfVulc(new Item.Properties().maxStackSize(1)
					.group(ROFToolsGroup.toolsGroupInstance)));

	// Rods
	public static final RegistryObject<Item> rod_of_divination = ITEMS.register("rod_of_divination",
			() -> new Item(new Item.Properties().maxStackSize(1).group(ROFToolsGroup.toolsGroupInstance)));




	//Overworld Gems
	
	//Lignite Coal
	public static final RegistryObject<Item> lignite_coal = 
		ITEMS.register("lignite_coal", () -> new Item(new Item.Properties().maxStackSize(64)
		.group(ROFItemGroup.itemGroupInstance)));
	//Sapphire
	public static final RegistryObject<Item> sapphire = 
		ITEMS.register("sapphire", () -> new Item(new Item.Properties().maxStackSize(64)
		.group(ROFItemGroup.itemGroupInstance)));
	//Ruby
	public static final RegistryObject<Item> ruby = 
		ITEMS.register("ruby", () -> new Item(new Item.Properties().maxStackSize(64)
		.group(ROFItemGroup.itemGroupInstance)));
	//Sulphur
	public static final RegistryObject<Item> sulphur = 
		ITEMS.register("sulphur", () -> new Item(new Item.Properties().maxStackSize(64)
		.group(ROFItemGroup.itemGroupInstance)));
	
	//Overworld Ingots
	
	//Rose Gold Ingot
	public static final RegistryObject<Item> rose_gold_ingot = 
		ITEMS.register("rose_gold_ingot", () -> new Item(new Item.Properties().maxStackSize(64)
		.group(ROFItemGroup.itemGroupInstance)));
	//Blister Steel Ingot
	public static final RegistryObject<Item> blister_steel_ingot = 
		ITEMS.register("blister_steel_ingot", () -> new Item(new Item.Properties().maxStackSize(64)
		.group(ROFItemGroup.itemGroupInstance)));
	//Aluminum Ingot
	public static final RegistryObject<Item> aluminum_ingot = 
		ITEMS.register("aluminum_ingot", () -> new Item(new Item.Properties().maxStackSize(64)
		.group(ROFItemGroup.itemGroupInstance)));
	//Ferroallide Steel Ingot
	public static final RegistryObject<Item> ferroallide_steel_ingot = 
		ITEMS.register("ferroallide_steel_ingot", () -> new Item(new Item.Properties().maxStackSize(64)
		.group(ROFItemGroup.itemGroupInstance)));
	
	//Overworld Misc.
	
	//Cocain
	public static final RegistryObject<Item> cocain = 
		ITEMS.register("cocain", () -> new Item(new Item.Properties().maxStackSize(64)
				.group(ROFItemGroup.itemGroupInstance)
				.food(new Food.Builder().hunger(1).saturation(1f).setAlwaysEdible().fastToEat()
						//Absorption: 10 hearts for 10 seconds
						.effect(() -> new EffectInstance(Effects.ABSORPTION, 200, 10), 1f)
						//Resistance: Resistance X for 10 seconds
						.effect(() -> new EffectInstance(Effects.RESISTANCE, 200, 10), 1f)
						//Regeneration: Regeneration V for 10 seconds
						.effect(() -> new EffectInstance(Effects.REGENERATION, 200, 4), 1f)
						//Wither: Wither II for 18 seconds
						.effect(() -> new EffectInstance(Effects.WITHER, 380, 2), 1f)
					.build())
				));
	
	/*
	 * NETHER ITEMS
	 */
	
	//Nether Ingots
	
	//Cobalt Ingot
	public static final RegistryObject<Item> cobalt_ingot = 
		ITEMS.register("cobalt_ingot", () -> new Item(new Item.Properties().maxStackSize(64)
		.group(ROFItemGroup.itemGroupInstance)));
	//Nickel Ingot
	public static final RegistryObject<Item> nickel_ingot = 
		ITEMS.register("nickel_ingot", () -> new Item(new Item.Properties().maxStackSize(64)
		.group(ROFItemGroup.itemGroupInstance)));
	//Demon Steel Ingot
	public static final RegistryObject<Item> demon_steel_ingot = 
		ITEMS.register("demon_steel_ingot", () -> new Item(new Item.Properties().maxStackSize(64)
		.group(ROFItemGroup.itemGroupInstance)));
	
	//Nether Gems
	
	//Black Jade
	public static final RegistryObject<Item> black_jade = 
		ITEMS.register("black_jade", () -> new Item(new Item.Properties().maxStackSize(64)
		.group(ROFItemGroup.itemGroupInstance)));
	//Demon Steel Ingot
	public static final RegistryObject<Item> cobra_stone_dust = 
		ITEMS.register("cobra_stone_dust", () -> new Item(new Item.Properties().maxStackSize(64)
		.group(ROFItemGroup.itemGroupInstance)));
	//Rose Quartz
	public static final RegistryObject<Item> rose_quartz = 
			ITEMS.register("rose_quartz", () -> new Item(new Item.Properties().maxStackSize(64)
			.group(ROFItemGroup.itemGroupInstance)));
	
	/*
	 * END ITEMS
	 */
	
	//End Gems
	
	//Pink Topaz
	public static final RegistryObject<Item> pink_topaz = 
			ITEMS.register("pink_topaz", () -> new Item(new Item.Properties().maxStackSize(64)
			.group(ROFItemGroup.itemGroupInstance)));
	//Purpurite
	public static final RegistryObject<Item> purpurite = 
			ITEMS.register("purpurite", () -> new Item(new Item.Properties().maxStackSize(64)
			.group(ROFItemGroup.itemGroupInstance)));
	
	
	
	
	
	
	
	
	
	
	
}
