/* Skip999
 * 10/28/20
 * Purpose: houses form of AlloyForge recipe
 */

package com.contInf.ringsOfInfinity.recipes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.contInf.ringsOfInfinity.RingsOfInfinity;
import com.contInf.ringsOfInfinity.init.RecipeSerializerInit;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.items.wrapper.RecipeWrapper;

public class AlloyForgeRecipe implements IAlloyForgeRecipe{

	
	/* Fields */
	private Logger logger = LogManager.getLogger(RingsOfInfinity.modID);
	private final ResourceLocation id;
	private Ingredient input1;
	private Ingredient input2;
	private Ingredient[] inputArray;
	private final ItemStack output;
	
	
	/* Constructor */
	
	
	public AlloyForgeRecipe(ResourceLocation id, Ingredient input1, Ingredient input2, ItemStack output) {
		this.id = id;
		this.input1 = input1;
		this.input2 = input2;
		this.output = output;
		this.inputArray = new Ingredient[2];
		this.inputArray[0] = this.input1;
		this.inputArray[1] = this.input2;
	}
	
	
	/* Functional Methods */
	
	
	//Determines if inputs match recipe type
	@Override
	public boolean matches(RecipeWrapper inv, World worldIn) {
		if(this.input1.test(inv.getStackInSlot(0))) {
			if(this.input2.test(inv.getStackInSlot(1))) {
				return true;
			}
		}
		if(this.input1.test(inv.getStackInSlot(1))) {
			if(this.input2.test(inv.getStackInSlot(0))) {
				return true;
			}
		}
		return false;
	}

	
	@Override
	public ItemStack getCraftingResult(RecipeWrapper inv) {
		return this.output;
	}

	@Override
	public ItemStack getRecipeOutput() {
		//logger.debug("Getting recipe output");
		return this.output;
	}

	@Override
	public ResourceLocation getId() {
		return this.id;
	}

	@Override
	public IRecipeSerializer<?> getSerializer() {
		return RecipeSerializerInit.ALLOY_FORGE_SERIALIZER.get();
	}

	@Override
	public Ingredient[] getInput() {
		return inputArray;
	}
	
	@Override
	public NonNullList<Ingredient> getIngredients(){
		return NonNullList.from(null,input1,input2);
	}

}
