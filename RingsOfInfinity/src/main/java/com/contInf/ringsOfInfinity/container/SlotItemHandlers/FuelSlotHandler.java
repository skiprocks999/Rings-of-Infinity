package com.contInf.ringsOfInfinity.container.SlotItemHandlers;

import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.contInf.ringsOfInfinity.RingsOfInfinity;

import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class FuelSlotHandler extends SlotItemHandler {
	
	private static final Logger logger = LogManager.getLogger(RingsOfInfinity.modID);
	private String[] validFuels = null;

	public FuelSlotHandler(IItemHandler itemHandler, 
			int index, int xPosition, int yPosition, String[] validFuels) {
		super(itemHandler, index, xPosition, yPosition);
		this.validFuels = validFuels;
	}
	
	@Override
	@Nonnull
	public boolean isItemValid(ItemStack stack) {
		String itemName = stack.toString();
		int spaceLoc = itemName.indexOf(' ');
		itemName = itemName.substring(spaceLoc + 1);
		for(String validFuel:validFuels) {
			if(validFuel.equalsIgnoreCase(itemName)) {
				return true;
			}
		}
		return false;
	}

}
