package com.contInf.BlockLib.init;

import com.contInf.BlockLib.ContInfBlockLib;
import com.contInf.BlockLib.recipes.AlloyForgeRecipe;
import com.contInf.BlockLib.recipes.AlloyForgeSerializer;
import com.contInf.BlockLib.recipes.IAlloyForgeRecipe;

import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RecipeSerializerInit {
	
	public static final DeferredRegister<IRecipeSerializer<?>> RECIPE_SERIALIZER = 
			new DeferredRegister<>(ForgeRegistries.RECIPE_SERIALIZERS,ContInfBlockLib.modID);
	
	
	public static final IRecipeSerializer<AlloyForgeRecipe> ALLOY_FORGE_RECIPE_SERIALIZER =
			new AlloyForgeSerializer();
	
	public static final IRecipeType<IAlloyForgeRecipe> ALLOY_FORGE_TYPE = 
			registerType(IAlloyForgeRecipe.RECIPE_TYPE_ID);
	
	
	
	
	public static final RegistryObject<IRecipeSerializer<?>> ALLOY_FORGE_SERIALIZER = 
			RECIPE_SERIALIZER.register("alloy_forge", () -> ALLOY_FORGE_RECIPE_SERIALIZER);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	private static <T extends IRecipeType<?>> T registerType(ResourceLocation recipeTypeId) {
		return (T) Registry.register(Registry.RECIPE_TYPE, recipeTypeId, new RecipeType<>());
	}
	
	
	
	
	
	
	private static class RecipeType<T extends IRecipe<?>> implements IRecipeType<T>{
		@Override
		public String toString() {
			return Registry.RECIPE_TYPE.getKey(this).toString();
		}
	}

}
