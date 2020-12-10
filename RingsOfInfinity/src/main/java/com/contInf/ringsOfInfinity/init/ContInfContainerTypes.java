/* Skip999
 * 10/29/20
 * purpose: Houses container types for ContInfBlockLib
 */

package com.contInf.ringsOfInfinity.init;

import com.contInf.ringsOfInfinity.RingsOfInfinity;
import com.contInf.ringsOfInfinity.container.AlloyForgeContainer;
import com.contInf.ringsOfInfinity.container.WardingBeaconContainer;

import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContInfContainerTypes {
	
	//Deferred Register
	public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = 
			new DeferredRegister<>(ForgeRegistries.CONTAINERS, RingsOfInfinity.modID);
	
	
	/* Container Types*/
	
	//Alloy Forge
	public static final RegistryObject<ContainerType<AlloyForgeContainer>> ALLOY_FORGE = 
			CONTAINER_TYPES.register("alloy_forge", () -> IForgeContainerType.create(AlloyForgeContainer::new));

	public static final RegistryObject<ContainerType<WardingBeaconContainer>> WARDING_BEACON = 
			CONTAINER_TYPES.register("warding_beacon", () -> IForgeContainerType.create(WardingBeaconContainer::new));

}
