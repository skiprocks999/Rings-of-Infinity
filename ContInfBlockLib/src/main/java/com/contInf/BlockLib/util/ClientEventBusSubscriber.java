package com.contInf.BlockLib.util;

import com.contInf.BlockLib.ContInfBlockLib;
import com.contInf.BlockLib.gui.AlloyForgeScreen;
import com.contInf.BlockLib.init.ContInfContainerTypes;

import net.minecraft.client.gui.ScreenManager;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ContInfBlockLib.modID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
		ScreenManager.registerFactory(ContInfContainerTypes.ALLOY_FORGE.get(), AlloyForgeScreen::new);

	}
}