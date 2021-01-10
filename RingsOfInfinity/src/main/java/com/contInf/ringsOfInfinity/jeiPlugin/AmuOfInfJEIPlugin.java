package com.contInf.ringsOfInfinity.jeiPlugin;

import java.util.Objects;
import java.util.Set;

import com.contInf.ringsOfInfinity.RingsOfInfinity;
import com.contInf.ringsOfInfinity.init.BlockInit;
import com.contInf.ringsOfInfinity.init.RecipeSerializerInit;
import com.contInf.ringsOfInfinity.jeiPlugin.AlloyForge.AlloyForgeRecipeCategory;
import com.contInf.ringsOfInfinity.recipes.alloyForge.IAlloyForgeRecipe;
import com.google.common.collect.ImmutableSet;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

@JeiPlugin
public class AmuOfInfJEIPlugin implements IModPlugin
{
	
	@Override
	public ResourceLocation getPluginUid() 
	{
		return new ResourceLocation(RingsOfInfinity.modID, "jei_plugin");
	}
	
	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration)
	{
		registration.addRecipeCatalyst(new ItemStack(BlockInit.alloy_forge.get()), AlloyForgeRecipeCategory.UID);
	}
	
	@Override
	public void registerRecipes(IRecipeRegistration registration) 
	{
		// TO DO: move the recipes lists in a separate utility class
		Minecraft mc = Minecraft.getInstance();
		ClientWorld world = Objects.requireNonNull(mc.world);
		
		Set<IAlloyForgeRecipe> alloyForgeRecipes = 
				ImmutableSet.copyOf(world.getRecipeManager().getRecipesForType(RecipeSerializerInit.ALLOY_FORGE_TYPE));
		
		registration.addRecipes(alloyForgeRecipes, AlloyForgeRecipeCategory.UID);
		
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) 
	{
		registration.addRecipeCategories(new AlloyForgeRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		
	}
}
