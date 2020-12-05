package com.contInf.ringsOfInfinity.container.SlotItemHandlers;

import javax.annotation.Nonnull;

import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class AlloyForgeOutputSlotHandler extends SlotItemHandler {

	public AlloyForgeOutputSlotHandler(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
		super(itemHandler, index, xPosition, yPosition);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	@Nonnull
	public boolean isItemValid(ItemStack stack) {
		return false;
	}

}
