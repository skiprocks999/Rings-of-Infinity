package com.contInf.ringsOfInfinity.container.SlotItemHandlers;

import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.contInf.ringsOfInfinity.RingsOfInfinity;

import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class AlloyForgeInputSlotHandler extends SlotItemHandler {

	private static final Logger logger = LogManager.getLogger(RingsOfInfinity.modID);
	
	public AlloyForgeInputSlotHandler(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
		super(itemHandler, index, xPosition, yPosition);
	}
	
	@Override
	@Nonnull
	public boolean isItemValid(ItemStack stack) {
		String itemName = stack.toString();
		int spaceLoc = itemName.indexOf(' ');
		itemName = itemName.substring(spaceLoc + 1);
		//logger.debug("item name :" + itemName);
		switch(itemName) {
		case "blister_steel_ingot": return true;
		case "aluminum_ingot": return true;
		default: return false;
		}
	}

}
