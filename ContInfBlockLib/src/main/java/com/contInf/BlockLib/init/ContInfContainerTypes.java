/* Skip999
 * 10/29/20
 * purpose: Houses container types for ContInfBlockLib
 */

package com.contInf.BlockLib.init;

import com.contInf.BlockLib.ContInfBlockLib;
import com.contInf.BlockLib.container.AlloyForgeContainer;

import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContInfContainerTypes {
	
	//Deferred Register
	public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = 
			new DeferredRegister<>(ForgeRegistries.CONTAINERS, ContInfBlockLib.modID);
	
	
	/* Container Types*/
	
	//Alloy Forge
	public static final RegistryObject<ContainerType<AlloyForgeContainer>> ALLOY_FORGE = 
			CONTAINER_TYPES.register("alloy_forge", () -> IForgeContainerType.create(AlloyForgeContainer::new));

}
