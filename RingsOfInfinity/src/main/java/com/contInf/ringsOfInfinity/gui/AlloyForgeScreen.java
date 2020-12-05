/* Skip999
 * 10/29/20
 * Purpose: Contain GUI functionality for AlloyForge
 */

package com.contInf.ringsOfInfinity.gui;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.contInf.ringsOfInfinity.RingsOfInfinity;
import com.contInf.ringsOfInfinity.container.AlloyForgeContainer;
import com.mojang.blaze3d.systems.RenderSystem;

import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class AlloyForgeScreen extends ContainerScreen<AlloyForgeContainer>{

	/* Fields */
	private static final ResourceLocation TEXTURE = new ResourceLocation(RingsOfInfinity.modID,
			"textures/gui/alloy_forge.png");
	
	private static final Logger logger = LogManager.getLogger(RingsOfInfinity.modID);
	
	/* Constructors */

	public AlloyForgeScreen(AlloyForgeContainer screenContainer, PlayerInventory inv,
			ITextComponent titleIn) {
		
		super(screenContainer, inv, titleIn);

		this.guiLeft = 0;
		this.guiTop = 0;
		this.xSize = 176;
		this.ySize = 166;
	}

	
	/* Functional Methods */
	
	/*Draws gui image*/
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
		this.minecraft.getTextureManager().bindTexture(TEXTURE);
		AlloyForgeScreen.blit(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize,256,256);
		
		//blit(int x, int y, int textureX,
		//					int textureY, int width, int height, int textureWidth, int textureHeight);
		
		

		//Burn Time
		double burnTimeFraction = this.container.getBurnProgressionScaled();
		//logger.debug("burn time fraciton: " + burnTimeFraction);
		int yOffset = (int)(burnTimeFraction * 14);
		//logger.debug("current y offset: " + yOffset);
		
		this.blit(this.guiLeft + 9, this.guiTop + 39 + yOffset, 176, yOffset, 14, (14 - yOffset));

		
		//Progress Bar
		this.blit(this.guiLeft + 66, this.guiTop + 14, 176, 15, 
				this.container.getSmeltProgressionScaled(), 56);
		
	}

	/*Draws mouse and gui text*/
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		super.drawGuiContainerForegroundLayer(mouseX, mouseY);
		this.font.drawString(this.title.getFormattedText(), 8.0f, 5.0f, 0x404040);
		this.font.drawString(this.playerInventory.getDisplayName().getFormattedText(), 8.0f, 73.0f, 0x404040);
	}

	
	/*Renders gui*/
	@Override
	public void render(int mouseX, int mouseY, float partialTicks) {
		this.renderBackground();
		super.render(mouseX, mouseY, partialTicks);
		this.renderHoveredToolTip(mouseX, mouseY);
	}
}
