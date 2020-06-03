package com.continf.itemlib.objects.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class AmOfScul extends Item{

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
