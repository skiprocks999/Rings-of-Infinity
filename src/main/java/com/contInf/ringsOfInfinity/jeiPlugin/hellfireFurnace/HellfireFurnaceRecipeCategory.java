package com.contInf.ringsOfInfinity.jeiPlugin.hellfireFurnace;

import com.contInf.ringsOfInfinity.RingsOfInfinity;
import com.contInf.ringsOfInfinity.init.BlockInit;
import com.contInf.ringsOfInfinity.init.ItemInit;
import com.contInf.ringsOfInfinity.tileentity.HellfireFurnaceTileEntity;
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
import net.minecraft.item.crafting.FurnaceRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TranslationTextComponent;

public class HellfireFurnaceRecipeCategory implements IRecipeCategory<FurnaceRecipe>{
	
	public static final int INPUT_SLOT = 0;
	public static final int OUTPUT_SLOT = 1;
	public static final int FUEL_SLOT = 2;
	
	private final IDrawable background;
	private final IDrawable icon;
	
	protected final IDrawableStatic staticFlame;
	protected final IDrawableAnimated animatedFlame;
	
	private final LoadingCache<Integer, IDrawableAnimated> cachedArrows;
	
	
	private static final String GUI_TEXTURE_STRING = "textures/gui/jei/hellfire_furnace_jei.png";
	
	private static final ResourceLocation GUI_TEXTURE =
			new ResourceLocation(RingsOfInfinity.modID,GUI_TEXTURE_STRING);
	
	public static final ResourceLocation UID = new ResourceLocation(RingsOfInfinity.modID,"hellfire_smelting");
	
	
	public HellfireFurnaceRecipeCategory(IGuiHelper guiHelper) {
		icon = guiHelper.createDrawableIngredient(new ItemStack(BlockInit.hellfire_furnace.get()));
		background = guiHelper.createDrawable(GUI_TEXTURE,0,0,83,55);
		
		staticFlame = guiHelper.createDrawable(GUI_TEXTURE, 84, 0, 18, 15);
		animatedFlame = 
				guiHelper.createAnimatedDrawable(staticFlame, 300, IDrawableAnimated.StartDirection.TOP, true);
		this.cachedArrows = CacheBuilder.newBuilder()
				.maximumSize(25)
				.build(new CacheLoader<Integer, IDrawableAnimated>() 
				{
					@Override
					public IDrawableAnimated load(Integer cookTime) {
						return guiHelper.drawableBuilder(GUI_TEXTURE, 84, 16, 25, 18)
							.buildAnimated(cookTime, IDrawableAnimated.StartDirection.LEFT, false);
					}
				});
	}
	
	@Override
	public ResourceLocation getUid() {
		return UID;
	}
	
	@Override
	public Class<? extends FurnaceRecipe> getRecipeClass() {
		return FurnaceRecipe.class;
	}
	
	@Override
	public String getTitle() {
		return new TranslationTextComponent("gui.jei.category.hellfire_smelting").getString();
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
	public void setIngredients(FurnaceRecipe recipe, IIngredients ingredients) {
		NonNullList<Ingredient> inputs = NonNullList.create();
		inputs.addAll(recipe.getIngredients());
		inputs.add(Ingredient.fromItems(Items.COAL,Blocks.COAL_BLOCK,ItemInit.lignite_coal.get(),ItemInit.black_jade.get()));
		ingredients.setInputIngredients(inputs);
		ingredients.setOutput(VanillaTypes.ITEM, recipe.getRecipeOutput());
	}
	
	@Override
	public void setRecipe(IRecipeLayout recipeLayout, FurnaceRecipe recipe, IIngredients ingredients) {
		
		IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();
		
		guiItemStacks.init(INPUT_SLOT, true, 2, 2);
		guiItemStacks.init(FUEL_SLOT, true, 2, 38);
		
		guiItemStacks.init(OUTPUT_SLOT, false, 61, 19);
		
		guiItemStacks.set(ingredients);
		
	}
	
	protected IDrawableAnimated getArrow(FurnaceRecipe recipe) 
	{
		int smeltTime = 200;
	
		return this.cachedArrows.getUnchecked(smeltTime);
	}
	
	protected void drawSmeltTime(FurnaceRecipe recipe, MatrixStack matrixStack, int y) 
	{
		int smeltTime = 200;
		if (smeltTime > 0) 
		{
			int smeltTimeSeconds = smeltTime / 20;
			TranslationTextComponent timeString = new TranslationTextComponent("gui.jei.category.hellfire_furnace.time.seconds", smeltTimeSeconds);
			Minecraft minecraft = Minecraft.getInstance();
			FontRenderer fontRenderer = minecraft.fontRenderer;
			int stringWidth = fontRenderer.getStringPropertyWidth(timeString);
			fontRenderer.func_243248_b(matrixStack, timeString, background.getWidth() - stringWidth, y, 0xFF808080);
		}
	}
	
	@Override
	public void draw(FurnaceRecipe recipe, MatrixStack matrixStack, double mouseX, double mouseY) 
	{
		animatedFlame.draw(matrixStack, 1, 20);
	
		IDrawableAnimated arrow = getArrow(recipe);
		arrow.draw(matrixStack, 21, 18);
	
		drawSmeltTime(recipe, matrixStack, 48);
	}

}
