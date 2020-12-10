package com.contInf.ringsOfInfinity.util;

import com.contInf.ringsOfInfinity.RingsOfInfinity;
import com.contInf.ringsOfInfinity.client.renderer.WardingBeaconTileEntityRenderer;
import com.contInf.ringsOfInfinity.gui.AlloyForgeScreen;
import com.contInf.ringsOfInfinity.gui.WardingBeaconScreen;
import com.contInf.ringsOfInfinity.init.BlockTileEntityTypes;
import com.contInf.ringsOfInfinity.init.ContInfContainerTypes;

import net.minecraft.client.gui.ScreenManager;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = RingsOfInfinity.modID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
		ScreenManager.registerFactory(ContInfContainerTypes.ALLOY_FORGE.get(), AlloyForgeScreen::new);
		
		ScreenManager.registerFactory(ContInfContainerTypes.WARDING_BEACON.get(), WardingBeaconScreen::new);
		
		
		
		
		
		ClientRegistry.bindTileEntityRenderer(
				BlockTileEntityTypes.WARDING_BEACON.get(), WardingBeaconTileEntityRenderer::new);

	}
}