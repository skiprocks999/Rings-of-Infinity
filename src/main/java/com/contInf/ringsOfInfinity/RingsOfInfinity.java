/* skip999
 * 5/11/2020
 * Purpose: This library will contain all blocks for the ContainedInfinity
 * 			library. This is our first mod so bugs are to be expected. Currently,
 * 			ContainedInfinity consists of skip999 and ContainedShadow
 */
package com.contInf.ringsOfInfinity;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.contInf.ringsOfInfinity.init.BlockInit;
import com.contInf.ringsOfInfinity.init.BlockTileEntityTypes;
import com.contInf.ringsOfInfinity.init.ContInfContainerTypes;
import com.contInf.ringsOfInfinity.init.ItemInit;
import com.contInf.ringsOfInfinity.init.RecipeSerializerInit;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.NonNullList;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

//tags forge to tell this is a mod
@Mod("ringsofinfinity")
/**
 * Summary: This mod is a practical joke that went to far.
 * 
 * This is our first mod. The idea is in my opinion a rather interesting one.
 * Many mods tend to merely add more content. However, they don't really work
 * with the theme of vanilla. The goal here is to change that. Instead of just
 * simply adding more blocks and dimensions, we seek to expand the existing ones
 * in a way that fits with the theme of the default game.
 * 
 * With a shit ton of luck, we may just pull it off.
 * 
 * @author skip999
 * @author ContainedShadow
 *
 */
@Mod.EventBusSubscriber(modid = "ringsofinfinity", bus = Mod.EventBusSubscriber.Bus.MOD)
public class RingsOfInfinity {
	
	//Instance of the mod for external use
	public static RingsOfInfinity instance;
	//Mod ID 
	public static final String modID = "ringsofinfinity";
	//Will print messages to log file
	private static final Logger logger = LogManager.getLogger(modID);
	
	/**
	 * Constructor: Initializes mod with forge files
	 */
	public RingsOfInfinity() {
		
		//Has loader listen for code within setups
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(this::setup);
		modEventBus.addListener(this::clientRegistries);
		
		//Initilizes blocks
		BlockInit.BLOCKS.register(modEventBus);
		ItemInit.ITEMS.register(modEventBus);
		RecipeSerializerInit.RECIPE_SERIALIZER.register(modEventBus);
		BlockTileEntityTypes.TILE_ENTITY_TYPES.register(modEventBus);
		ContInfContainerTypes.CONTAINER_TYPES.register(modEventBus);
		
		//Creates an instance of the mod
		instance = this;
		
		//registers event bus
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	
	/**
	 * Creates BlockItems for blocks
	 * @param event
	 */
	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
				
		final IForgeRegistry<Item> registry = event.getRegistry();
		
		List<BlockItem> blockItems = new ArrayList<BlockItem>();
		
		BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block ->   {
			final Item.Properties properties = 
					new Item.Properties().group(ROFBlockItemGroup.itemGroupInstance);
			final BlockItem blockItem = new BlockItem(block,properties);
			blockItem.setRegistryName(block.getRegistryName());
			blockItems.add(blockItem);
			registry.register(blockItem);
		});
		
		logger.debug("Registered BlockItems");
	}
	
	/**
	 * runs code that will be viewed by all players
	 * @param event
	 */
	private void setup(final FMLCommonSetupEvent event) {
		
		logger.info("setup method registered.");
		
	}
	
	
	/**
	 * runs code that will be viewed by only client player
	 * @param event
	 */
	private void clientRegistries(final FMLClientSetupEvent event) {
		
		logger.info("clintRegistries method registered.");
	
	}
	
	
	/**
	 * Code to run as server starting
	 * @param event
	 */
	@SubscribeEvent
	public void asServerStarting(FMLServerStartingEvent event) {
		
		logger.info("asServerStarting method registered.");
		
	}
	
	/**
	 * ItemGroup for ContainedInfinityBlockLibrart
	 * @author skip999
	 *
	 */
	public static class ROFBlockItemGroup extends ItemGroup{

		//Instance of ItemGroup
		public static final ROFBlockItemGroup itemGroupInstance = 
				new ROFBlockItemGroup("ROFBlockItemGroupTab");
				
				
		private ROFBlockItemGroup(String label) {
			super(label);
		}

		/**
		 * Uses marble as icon
		 */
		@Override
		public ItemStack createIcon() {
			return new ItemStack(BlockInit.marble.get());
		}
		
		//Orders Creative Tab
		@Override
	    public void fill(NonNullList<ItemStack> itemStacks){
			
			//Converts registryobject entries into an array of objects
			Object[] listOfBlocks = 
					BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).toArray();
			List<Item> items= new ArrayList<Item>();
			//adds and casts entries in array to a list of items
			for(int i = 0; i < listOfBlocks.length;i++) {
				items.add(((Block)(listOfBlocks[i])).asItem());
			}
	        itemStacks.clear();
	        
	        for (Item item : items)
	        {
	            if(item.getCreativeTabs().contains(itemGroupInstance))
	            {
	                itemStacks.add(new ItemStack(item));
	            }
	        }
	    }
		
	}
	
	 //Item Group for ContInfItemLib
    public static class ROFItemGroup extends ItemGroup {

    	public static final ROFItemGroup itemGroupInstance = 
    			new ROFItemGroup(ItemGroup.GROUPS.length, "ROFItemGroupTab");
    	
		public ROFItemGroup(int index, String label) {
			super(index, label);
		}

		@Override
		public ItemStack createIcon() {
			return new ItemStack(ItemInit.ruby.get());
		}
		
		//Orders Creative Tab
		@Override
	    public void fill(NonNullList<ItemStack> itemStacks){
			
			//Converts registryobject entries into an array of objects
			Object[] listOfItems = ItemInit.ITEMS.getEntries().stream().map(RegistryObject::get).toArray();
			List<Item> items= new ArrayList<Item>();
			//adds and casts entries in array to a list of items
			for(int i = 0; i < listOfItems.length;i++) {
				items.add((Item)listOfItems[i]);
			}
	        itemStacks.clear();
	        
	        for (Item item : items)
	        {
	            if(item.getCreativeTabs().contains(itemGroupInstance))
	            {
	                itemStacks.add(new ItemStack(item));
	            }
	        }
	    }
    }

    // Tools group for ContInfItemLib
    public static class ROFToolsGroup extends ItemGroup {

    	public static final ROFToolsGroup toolsGroupInstance = 
    			new ROFToolsGroup((ItemGroup.GROUPS.length) , "ROFToolsGroupTab");
    	
		public ROFToolsGroup(int index,String label) {
			super(index,label);
		}

		@Override
		public ItemStack createIcon() {
            // TODO Change icon to unique icon for tools tab
			return new ItemStack(ItemInit.ruby_sword.get());
		}
		
		//Orders Creative Tab
		@Override
	    public void fill(NonNullList<ItemStack> itemStacks){
			
			//Converts registryobject entries into an array of objects
			Object[] listOfItems = ItemInit.ITEMS.getEntries().stream().map(RegistryObject::get).toArray();
			List<Item> items= new ArrayList<Item>();
			//adds and casts entries in array to a list of items
			for(int i = 0; i < listOfItems.length;i++) {
				items.add((Item)listOfItems[i]);
			}
	        itemStacks.clear();
	        
	        for (Item item : items)
	        {
	            if(item.getCreativeTabs().contains(toolsGroupInstance))
	            {
	                itemStacks.add(new ItemStack(item));
	            }
	        }
	    }
       
    }
	
}
