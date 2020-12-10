package com.contInf.ringsOfInfinity.tileentity.tileUtils;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CustomFuelType {
	
	private String itemName;
	private int burnTime;
	
	public CustomFuelType(Item item, int burnTime) {
		this.burnTime = burnTime;
		this.itemName = item.toString();
	}
	
	public String getItemName() {
		return this.itemName;
	}
	
	public int getBurnTime() {
		return this.burnTime;
	}
	
	public boolean equals(ItemStack item) {
		String itemName = item.toString();
		int spaceLoc = itemName.indexOf(' ');
		itemName = itemName.substring(spaceLoc + 1);
		if(this.getItemName().equals(itemName)) {
			return true;
		}
		return false;
	}
}
