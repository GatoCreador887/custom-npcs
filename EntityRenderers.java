package com.curseforge.customnpcs.core.client.entity.rendering;

import java.util.ArrayList;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class EntityRenderers {
	
	public static ArrayList<Render> renderers;
	
	public static void initializeRenderList() {
		
		for (EntityEntry entityentry : ForgeRegistries.ENTITIES) {
			
			Render entityRenderer = Minecraft.getMinecraft().getRenderManager().getEntityClassRenderObject(entityentry.getEntityClass());
			
			if (entityRenderer != null) {
				
				renderers.add(entityRenderer);
				
			}
			
		}
		
	}
	
}
