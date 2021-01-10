package com.contInf.ringsOfInfinity.jeiPlugin.AlloyForge;

import com.contInf.ringsOfInfinity.RingsOfInfinity;
import com.contInf.ringsOfInfinity.init.BlockInit;
import com.contInf.ringsOfInfinity.init.ItemInit;
import com.contInf.ringsOfInfinity.recipes.alloyForge.AlloyForgeRecipe;
import com.contInf.ringsOfInfinity.recipes.alloyForge.IAlloyForgeRecipe;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IGuiItemStackGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TranslationTextComponent;

public class AlloyForgeRecipeCategory implements IRecipeCategory<AlloyForgeRecipe>{

	public static final int TOP_SLOT = 0;
	public static final int BOTTOM_SLOT = 1;
	public static final int OUTPUT_SLOT = 2;
	public static final int FUEL_SLOT = 3;
	
	private final IDrawable background;
	private final IDrawable icon;
	
	private static final String GUI_TEXTURE_STRING = "textures/gui/jei/alloy_forge_jei.png";
	
	//private final LoadingCache<Integer, IDrawableAnimated> cachedArrows;
	
	private static final ResourceLocation GUI_TEXTURE =
			new ResourceLocation(RingsOfInfinity.modID,GUI_TEXTURE_STRING);
	
	public static final ResourceLocation UID = new ResourceLocation(RingsOfInfinity.modID,IAlloyForgeRecipe.GROUP);
	
	
	public AlloyForgeRecipeCategory(IGuiHelper guiHelper) {
		icon = guiHelper.createDrawableIngredient(new ItemStack(BlockInit.alloy_forge.get()));
		background = guiHelper.createDrawable(GUI_TEXTURE,0,0,106,54);
		
	}
	
	@Override
	public ResourceLocation getUid() {
		return UID;
	}

	@Override
	public Class<? extends AlloyForgeRecipe> getRecipeClass() {
		return AlloyForgeRecipe.class;
	}

	@Override
	public String getTitle() {
		return new TranslationTextComponent("gui.jei.category.alloy_forging").getString();
	}

	@Override
	public IDrawable getBackground() {
		return background;
	}

	@Override
	public IDrawable getIcon() {
		return icon;
	}

	@Override
	public void setIngredients(AlloyForgeRecipe recipe, IIngredients ingredients) {
		NonNullList<Ingredient> inputs = NonNullList.create();
		inputs.addAll(recipe.getIngredients());
		inputs.add(Ingredient.fromItems(Items.COAL,Blocks.COAL_BLOCK,ItemInit.lignite_coal.get()));
		ingredients.setInputIngredients(inputs);
		ingredients.setOutput(VanillaTypes.ITEM, recipe.getRecipeOutput());
	}

	@Override
	public void setRecipe(IRecipeLayout recipeLayout, AlloyForgeRecipe recipe, IIngredients ingredients) {
		
		IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();
		
		guiItemStacks.init(TOP_SLOT, true, 32, 3);
		guiItemStacks.init(BOTTOM_SLOT, true, 32, 33);
		guiItemStacks.init(FUEL_SLOT, true, 2, 33);
		
		guiItemStacks.init(OUTPUT_SLOT, false, 88, 17);
		
		guiItemStacks.set(ingredients);
		
	}

}
