/* Skip999
 * 10/28/20
 * purpose: House all custom recipe types for ContInfBlockLib
 */

package com.contInf.ringsOfInfinity.init;

import com.contInf.ringsOfInfinity.RingsOfInfinity;
import com.contInf.ringsOfInfinity.recipes.alloyForge.AlloyForgeRecipe;
import com.contInf.ringsOfInfinity.recipes.alloyForge.AlloyForgeSerializer;
import com.contInf.ringsOfInfinity.recipes.alloyForge.IAlloyForgeRecipe;

import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RecipeSerializerInit {
	
	//Deferred Register
	public static final DeferredRegister<IRecipeSerializer<?>> RECIPE_SERIALIZER = 
			DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS,RingsOfInfinity.modID);
	
	
	/* Recipe Serializer Objects */
	
	//Alloy Forge
	public static final IRecipeSerializer<AlloyForgeRecipe> ALLOY_FORGE_RECIPE_SERIALIZER =
			new AlloyForgeSerializer();
	
	
	/* Forge Type Registration */
	
	//AlloyForge
	public static final IRecipeType<IAlloyForgeRecipe> ALLOY_FORGE_TYPE = 
			registerType(IAlloyForgeRecipe.RECIPE_TYPE_ID);
	
	
	/* Register Serializers */
	
	//Alloy Forge
	public static final RegistryObject<IRecipeSerializer<?>> ALLOY_FORGE_SERIALIZER = 
			RECIPE_SERIALIZER.register("alloy_forge", () -> ALLOY_FORGE_RECIPE_SERIALIZER);
	
	
	
	
	
	
	
	
	
	
	
	
	
	/* Functional Methods*/
	

	@SuppressWarnings("unchecked")
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
