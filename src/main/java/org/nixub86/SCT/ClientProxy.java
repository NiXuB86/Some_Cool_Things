package org.nixub86.SCT;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import org.nixub86.SCT.Cripy.EntityKellog;
import org.nixub86.SCT.Cripy.RenderKellog;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ClientProxy extends CommonProxy {

	int ModEntityID;
	
	public void registerRenderers()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityKellog.class, new RenderKellog(new ModelBiped(), 0));
	}
	
	public void registerEntities()
	{
		ModEntityID = EntityRegistry.findGlobalUniqueEntityId();

		EntityRegistry.registerModEntity(EntityKellog.class, "Mega Crip!!!!!! AAAAAAAAAA SYKA VSEM PISDA", ModEntityID++, SCT.instance, 80, 1, false);
	}
	
	@Override
	public void preInit(FMLPreInitializationEvent e) 
	{
		super.preInit(e);
	}

	@Override
	public void init(FMLInitializationEvent e) {
		// TODO Auto-generated method stub
		super.init(e);
	}

	@Override
	public void postInit(FMLPostInitializationEvent e) {
		// TODO Auto-generated method stub
		super.postInit(e);
	}
	
}