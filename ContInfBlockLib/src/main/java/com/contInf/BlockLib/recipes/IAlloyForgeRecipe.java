package com.contInf.BlockLib.recipes;

import javax.annotation.Nonnull;

import com.contInf.BlockLib.ContInfBlockLib;

import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.items.wrapper.RecipeWrapper;

public interface IAlloyForgeRecipe extends IRecipe<RecipeWrapper>{
	
	//Defines resource location for recipe type
	ResourceLocation RECIPE_TYPE_ID = new ResourceLocation(ContInfBlockLib.modID,"alloy_forge");
	
	//returns type at location of resource
	@Nonnull
	@Override 
	default IRecipeType<?> getType(){
		return Registry.RECIPE_TYPE.getValue(RECIPE_TYPE_ID).get();
	}
	
	@Override
	default boolean canFit(int width, int height) {
		return false;
	}
	
	Ingredient[] getInput();

}
