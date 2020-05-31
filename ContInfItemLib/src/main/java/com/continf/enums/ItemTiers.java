package com.continf.enums;

import java.util.function.Supplier;

import com.continf.itemlib.init.ItemInit;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum ItemTiers implements IItemTier {
	
	// int harvestLevel, int maxUses, float efficiency, float attackDamage, int
	// enchantability, Supplier<Ingredient> repairMaterial
	RUBY(4, 1500, 15.0F, 7.0F, 250, () -> {
		return Ingredient.fromItems(ItemInit.ruby.get());
    }),
    FERROALLIDE(4, 1500, 15.0F, 7.0F, 250, () -> {
		return Ingredient.fromItems(ItemInit.ferroallide_steel_ingot.get());
	}),
	BLAST(4, 1500, 15.0F, 7.0F, 250, () -> {
		return Ingredient.fromItems(ItemInit.ruby.get());
	});

	

	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantability;
	private final LazyValue<Ingredient> repairMaterial;

	private ItemTiers(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability,
			Supplier<Ingredient> repairMaterial) {
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairMaterial = new LazyValue<>(repairMaterial);
	}

	@Override
	public int getMaxUses() {
		return this.maxUses;
	}

	@Override
	public float getEfficiency() {
		return this.efficiency;
	}

	@Override
	public float getAttackDamage() {
		return this.attackDamage;
	}

	@Override
	public int getHarvestLevel() {
		return this.harvestLevel;
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return this.repairMaterial.getValue();
	}
}