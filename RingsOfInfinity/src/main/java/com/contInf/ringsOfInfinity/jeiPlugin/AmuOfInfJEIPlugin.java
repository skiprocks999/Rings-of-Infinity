package com.contInf.ringsOfInfinity.jeiPlugin;

import javax.annotation.Nonnull;

import com.contInf.ringsOfInfinity.RingsOfInfinity;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.recipe.IRecipeManager;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.runtime.IJeiRuntime;
import net.minecraft.client.Minecraft;
import net.minecraft.item.crafting.RecipeManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class AmuOfInfJEIPlugin implements IModPlugin {

	private static final ResourceLocation ID = new ResourceLocation(RingsOfInfinity.modID,"jei_plugin");
	
	public void registerCategories(IRecipeCategoryRegistration registry) {
		registry.addRecipeCategories(
				new AlloyForgeRecipeCategoty(registry.getJeiHelpers().getGuiHelper()));
	}
	
	public void registerRecipes(@Nonnull IRecipeRegistration registry) {
		World world = Minecraft.getInstance().world;
		registry.addRecipes(
				AmOfInfRecipeTypes.getRecipes(world,AmOfInfRecipeTypes.ALLOY_FORGE).values(), 
				AlloyForgeRecipeCatagory.ID);
	}
	
	//For hiding recipes I believe
	public void onRuntimeAvailable(IJeiRuntime jeiRuntime) {
		//IRecipeManager recipeRegistry = jeiRuntime.getRecipeManager();
		//@SuppressWarnings("resource")
		//RecipeManager recipeManager = Minecraft.getInstance().world.getRecipeManager();
		
	}
	
	@Override
	public ResourceLocation getPluginUid() {
		return ID;
	}

}
