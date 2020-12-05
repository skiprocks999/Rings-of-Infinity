/* skip999
 * 6/3/2020
 * purpose: encapsulate Amulet of Scultari functionality 
 */
package com.contInf.ringsOfInfinity.objects.items;

import net.minecraft.item.ItemStack;
import net.minecraft.item.SimpleFoiledItem;

public class AmOfScul extends SimpleFoiledItem{

	public AmOfScul(Properties properties) {
		super(properties);
	}
	
	
	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {

		ItemStack item = itemstack.copy();
		item.setDamage(item.getDamage() +  1);
		item.setCount(1);
		return item;


	}

	@Override

	 public boolean hasContainerItem(ItemStack stack)
	    {
	        return stack.getDamage()<127;
	    }
	
	
}
