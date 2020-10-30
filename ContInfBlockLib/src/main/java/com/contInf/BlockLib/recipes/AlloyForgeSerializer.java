/* Skip999
 * 10/28/20
 * Purpose: house functionality for interaction with JSON reicpe file
 */

package com.contInf.BlockLib.recipes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.contInf.BlockLib.ContInfBlockLib;
import com.google.gson.JsonObject;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.registries.ForgeRegistryEntry;

public class AlloyForgeSerializer extends ForgeRegistryEntry<IRecipeSerializer<?>>
					implements IRecipeSerializer<AlloyForgeRecipe>{

	/* Fields */
	
	
	private Logger logger = LogManager.getLogger(ContInfBlockLib.modID);
	
	
	/* Functional Methods */
	
	
	//Reads JSON file for recipe inputs and outputs
	@Override
	public AlloyForgeRecipe read(ResourceLocation recipeId, JsonObject json) {
		Ingredient input1 = Ingredient.deserialize(JSONUtils.getJsonObject(json, "input1"));
		Ingredient input2 = Ingredient.deserialize(JSONUtils.getJsonObject(json, "input2"));
		ItemStack output = 
				CraftingHelper.getItemStack(JSONUtils.getJsonObject(json, "output"), true);
		
		logger.debug(output.getItem().toString());
		
		
		return new AlloyForgeRecipe(recipeId,input1, input2, output);
	}

	
	//Reads buffer for recipe inputs and outputs
	@Override
	public AlloyForgeRecipe read(ResourceLocation recipeId, PacketBuffer buffer) {
		Ingredient input1 = Ingredient.read(buffer);
		Ingredient input2 = Ingredient.read(buffer);
		ItemStack output = buffer.readItemStack();
		logger.debug("read method called");
		logger.debug(buffer.readString());
		return new AlloyForgeRecipe(recipeId,input1, input2, output);
	}

	
	//Writes inputs and outputs to buffer
	@Override
	public void write(PacketBuffer buffer, AlloyForgeRecipe recipe) {
		Ingredient input1 = recipe.getIngredients().get(0);
		Ingredient input2 = recipe.getIngredients().get(1);
		input1.write(buffer);
		input2.write(buffer);
		
		buffer.writeItemStack(recipe.getRecipeOutput(),false);
		logger.debug("write method called");
		logger.debug(buffer.readString());
	}

}
