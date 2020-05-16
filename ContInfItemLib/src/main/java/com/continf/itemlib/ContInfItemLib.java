/* skip999
 * 5/14/2020
 * purpose: item library for ContainedInfinity
 */
package com.continf.itemlib;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.continf.itemlib.init.ItemInit;


/**
 * This is the item librart for ContainedInfinity
 * Currently, the items implemented are:
 * 
 * Oveworld
 * >
 * >
 * >
 * >
 * >
 * >
 * >
 * >
 * 
 * Nether
 * 
 * 
 * @author skip999
 *
 */
@Mod("continfitemlib")
public class ContInfItemLib
{
	
	public static ContInfItemLib instance;
	
	public static final String modID = "continfitemlib";
	
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public ContInfItemLib() {
        
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);

        
        
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("HELLO FROM PREINIT");
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        LOGGER.info("Got game settings {}");
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        LOGGER.info("HELLO from server starting");
    }

    //Item Group for ContInfItemLib
    public static class ContInfItemLibItemGroup extends ItemGroup {

    	public static final ContInfItemLibItemGroup itemGroupInstance = 
    			new ContInfItemLibItemGroup(ItemGroup.GROUPS.length, "ContInfItemLibItemGroupTab");
    	
		public ContInfItemLibItemGroup(int index, String label) {
			super(index, label);
		}

		@Override
		public ItemStack createIcon() {
			return new ItemStack(ItemInit.ruby);
		}
       
    }
}
