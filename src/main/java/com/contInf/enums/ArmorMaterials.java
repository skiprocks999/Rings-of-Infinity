package com.contInf.enums;

import java.util.function.Supplier;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.contInf.ringsOfInfinity.RingsOfInfinity;
import com.contInf.ringsOfInfinity.init.ItemInit;

public enum ArmorMaterials implements IArmorMaterial {

    RUBY(RingsOfInfinity.modID + ":ruby", 5, new int[] { 4, 7, 9, 4 }, 420, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.2F, () -> {
		return Ingredient.fromItems(ItemInit.ruby.get());
    }),
    FERROALLIDE(RingsOfInfinity.modID + ":ferroallide", 5, new int[] { 3, 6, 8, 3 }, 420, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2F, () -> {
		return Ingredient.fromItems(ItemInit.ferroallide_steel_ingot.get());
    }),
    SLIME(RingsOfInfinity.modID + ":slime", 5, new int[] { 7, 9, 11, 7 }, 420, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 6.9F, () -> {
		return Ingredient.fromItems(ItemInit.ruby.get());
	});

    // Variables
    private static final int[] MAX_DAMAGE_ARRAY = new int[] { 16, 16, 16, 16 };
	private final String name;
	private final int maxDamageFactor;
	private final int[] damageReductionAmountArray;
	private final int enchantability;
	private final SoundEvent soundEvent;
	private final float toughness;
	private final LazyValue<Ingredient> repairMaterial;

    // Constructor
    private ArmorMaterials(String name, int maxDamageFactor, int[] damageReductionAmountArray, 
                         int enchantability, SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    // Methods
	@Override
	public int getDurability(final EquipmentSlotType slotIn) {
		return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
	}

	@Override
	public int getDamageReductionAmount(final EquipmentSlotType slotIn) {
		return this.damageReductionAmountArray[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public SoundEvent getSoundEvent() {
		return this.soundEvent;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return this.repairMaterial.getValue();
	}

    @OnlyIn(Dist.CLIENT)
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		// TODO Auto-generated method stub
		return 0;
	}

}  