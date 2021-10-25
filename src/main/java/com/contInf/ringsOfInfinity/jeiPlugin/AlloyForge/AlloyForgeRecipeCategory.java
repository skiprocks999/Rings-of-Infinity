package com.contInf.ringsOfInfinity.jeiPlugin.AlloyForge;

import com.contInf.ringsOfInfinity.RingsOfInfinity;
import com.contInf.ringsOfInfinity.init.BlockInit;
import com.contInf.ringsOfInfinity.init.ItemInit;
import com.contInf.ringsOfInfinity.recipes.alloyForge.AlloyForgeRecipe;
import com.contInf.ringsOfInfinity.recipes.alloyForge.IAlloyForgeRecipe;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.blaze3d.matrix.MatrixStack;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.drawable.IDrawableAnimated;
import mezz.jei.api.gui.drawable.IDrawableStatic;
import mezz.jei.api.gui.ingredient.IGuiItemStackGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
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
	
	protected final IDrawableStatic staticFlame;
	protected final IDrawableAnimated animatedFlame;
	
	private final LoadingCache<Integer, IDrawableAnimated> cachedArrows;
	
	
	private static final String GUI_TEXTURE_STRING = "textures/gui/jei/alloy_forge_jei.png";
	
	private static final ResourceLocation GUI_TEXTURE =
			new ResourceLocation(RingsOfInfinity.modID,GUI_TEXTURE_STRING);
	
	public static final ResourceLocation UID = new ResourceLocation(RingsOfInfinity.modID,IAlloyForgeRecipe.GROUP);
	
	
	public AlloyForgeRecipeCategory(IGuiHelper guiHelper) {
		icon = guiHelper.createDrawableIngredient(new ItemStack(BlockInit.alloy_forge.get()));
		background = guiHelper.createDrawable(GUI_TEXTURE,0,0,131,57);
		
		staticFlame = guiHelper.createDrawable(GUI_TEXTURE, 133, 0, 13, 14);
		animatedFlame = 
				guiHelper.createAnimatedDrawable(staticFlame, 300, IDrawableAnimated.StartDirection.TOP, true);
		this.cachedArrows = CacheBuilder.newBuilder()
				.maximumSize(25)
				.build(new CacheLoader<Integer, IDrawableAnimated>() 
				{
					@Override
					public IDrawableAnimated load(Integer cookTime) {
						return guiHelper.drawableBuilder(GUI_TEXTURE, 133, 15, 37, 55)
							.buildAnimated(cookTime, IDrawableAnimated.StartDirection.LEFT, false);
					}
				});
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
		
		guiItemStacks.init(TOP_SLOT, true, 39, 1);
		guiItemStacks.init(BOTTOM_SLOT, true, 39, 39);
		guiItemStacks.init(FUEL_SLOT, true, 1, 39);
		
		guiItemStacks.init(OUTPUT_SLOT, false, 109, 20);
		
		guiItemStacks.set(ingredients);
		
	}
	
	protected IDrawableAnimated getArrow(AlloyForgeRecipe recipe) 
	{
		int smeltTime = 200;

		return this.cachedArrows.getUnchecked(smeltTime);
	}
	
	protected void drawSmeltTime(AlloyForgeRecipe recipe, MatrixStack matrixStack, int y) 
	{
		int smeltTime = 200;
		if (smeltTime > 0) 
		{
			int smeltTimeSeconds = smeltTime / 20;
			TranslationTextComponent timeString = new TranslationTextComponent("gui.jei.category.alloy_forging.time.seconds", smeltTimeSeconds);
			Minecraft minecraft = Minecraft.getInstance();
			FontRenderer fontRenderer = minecraft.fontRenderer;
			int stringWidth = fontRenderer.getStringPropertyWidth(timeString);
			fontRenderer.func_243248_b(matrixStack, timeString, background.getWidth() - stringWidth, y, 0xFF808080);
		}
	}
	
	@Override
	public void draw(AlloyForgeRecipe recipe, MatrixStack matrixStack, double mouseX, double mouseY) 
	{
		animatedFlame.draw(matrixStack, 3, 23);

		IDrawableAnimated arrow = getArrow(recipe);
		arrow.draw(matrixStack, 60, 0);

		drawSmeltTime(recipe, matrixStack, 48);
	}

}
