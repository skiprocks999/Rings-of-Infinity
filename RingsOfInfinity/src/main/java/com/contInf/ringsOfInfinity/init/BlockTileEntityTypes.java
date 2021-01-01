/* Skip999
 * 10/28/20
 * purpose: house all tile entity types for ContInfBlockLib
 */

package com.contInf.ringsOfInfinity.init;

import com.contInf.ringsOfInfinity.RingsOfInfinity;
import com.contInf.ringsOfInfinity.tileentity.AlloyForgeTileEntity;
import com.contInf.ringsOfInfinity.tileentity.WardingBeaconTileEntity;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockTileEntityTypes {
	
	//Deferred Register
	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = 
			DeferredRegister.create(ForgeRegistries.TILE_ENTITIES,RingsOfInfinity.modID);
	
	/* Tile Entity Types */
	
	//Alloy Forge Tile Entity
	public static final RegistryObject<TileEntityType<AlloyForgeTileEntity>> ALLOY_FORGE = 
			TILE_ENTITY_TYPES.register("alloy_forge", () -> TileEntityType.Builder.create
					(AlloyForgeTileEntity::new, BlockInit.alloy_forge.get()).build(null));
	
	//Alloy Forge Tile Entity
	public static final RegistryObject<TileEntityType<WardingBeaconTileEntity>> WARDING_BEACON = 
			TILE_ENTITY_TYPES.register("warding_beacon", () -> TileEntityType.Builder.create
					(WardingBeaconTileEntity::new, BlockInit.warding_beacon.get()).build(null));

}
