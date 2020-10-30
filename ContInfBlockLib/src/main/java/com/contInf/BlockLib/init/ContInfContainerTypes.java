package com.contInf.BlockLib.init;

import com.contInf.BlockLib.ContInfBlockLib;
import com.contInf.BlockLib.container.AlloyForgeContainer;

import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContInfContainerTypes {
	
	public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = 
			new DeferredRegister<>(ForgeRegistries.CONTAINERS, ContInfBlockLib.modID);
	
	
	
	public static final RegistryObject<ContainerType<AlloyForgeContainer>> ALLOY_FORGE = 
			CONTAINER_TYPES.register("alloy_forge", () -> IForgeContainerType.create(AlloyForgeContainer::new));

}
