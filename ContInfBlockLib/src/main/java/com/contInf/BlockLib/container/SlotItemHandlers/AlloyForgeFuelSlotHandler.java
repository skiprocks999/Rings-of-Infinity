package com.contInf.BlockLib.container.SlotItemHandlers;

import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.contInf.BlockLib.ContInfBlockLib;

import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class AlloyForgeFuelSlotHandler extends SlotItemHandler {
	
	private static final Logger logger = LogManager.getLogger(ContInfBlockLib.modID);

	public AlloyForgeFuelSlotHandler(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
		super(itemHandler, index, xPosition, yPosition);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	@Nonnull
	public boolean isItemValid(ItemStack stack) {
		String itemName = stack.toString();
		int spaceLoc = itemName.indexOf(' ');
		itemName = itemName.substring(spaceLoc + 1);
		//logger.debug("item name :" + itemName);
		switch(itemName) {
		case "coal" : return true;
		case "lignite_coal": return true;
		default: return false;
		}
	}

}
