/* Skip999
 * 10/28/20
 * purpose: house all tile entity types for ContInfBlockLib
 */

package com.contInf.BlockLib.init;

import com.contInf.BlockLib.ContInfBlockLib;
import com.contInf.BlockLib.tileentity.AlloyForgeTileEntity;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockTileEntityTypes {
	
	//Deferred Register
	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = 
			new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES,ContInfBlockLib.modID);
	
	/* Tile Entity Types */
	
	//Alloy Forge Tile Entity
	public static final RegistryObject<TileEntityType<AlloyForgeTileEntity>> ALLOY_FORGE = 
			TILE_ENTITY_TYPES.register("alloy_forge", () -> TileEntityType.Builder.create
					(AlloyForgeTileEntity::new, BlockInit.alloy_forge.get()).build(null));

}
