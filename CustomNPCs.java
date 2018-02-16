package com.curseforge.customnpcs;

import org.apache.logging.log4j.Logger;

import com.curseforge.customnpcs.core.client.entity.rendering.EntityRenderers;
import com.curseforge.customnpcs.utility.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.ID, name = Reference.NAME, version = Reference.VERSION)
public class CustomNPCs {
	
	private Logger logger;
	
	public void preInit(FMLPreInitializationEvent event) {
		
		logger = event.getModLog();
		
	}
	
	public void init(FMLInitializationEvent event) {
		
		
		
	}
	
	public void postInit(FMLPostInitializationEvent event) {
		
		EntityRenderers.initializeRenderList();
		
	}
	
}
