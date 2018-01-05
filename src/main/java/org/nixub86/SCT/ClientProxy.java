package org.nixub86.SCT;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

import org.nixub86.SCT.Cripy.Entity.EntityCripFlyR;
import org.nixub86.SCT.Cripy.Entity.EntityKellog;
import org.nixub86.SCT.Cripy.Entity.EntityMush;
import org.nixub86.SCT.Cripy.Entity.EntityMuth;
import org.nixub86.SCT.Cripy.Entity.SuperCreeperEntity;
import org.nixub86.SCT.Cripy.Render.RenderFlyR;
import org.nixub86.SCT.Cripy.Render.RenderKellog;
import org.nixub86.SCT.Cripy.Render.RenderMush;
import org.nixub86.SCT.Cripy.Render.RenderSuperCreeper;
import org.nixub86.SCT.GUIs.RenderGuiHandler;
import org.nixub86.SCT.GUIs.ReputationGUI;
import org.nixub86.SCT.Utils.Utils;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ClientProxy extends CommonProxy {

	int ModEntityID;
	
	private final Minecraft mc = Minecraft.getMinecraft();
	
	public void registerRenderers()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityKellog.class, new RenderKellog(new ModelBiped(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityMush.class, new RenderMush(new ModelBiped(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityMuth.class, new RenderMush(new ModelBiped(), 0));
		RenderingRegistry.registerEntityRenderingHandler(SuperCreeperEntity.class, new RenderSuperCreeper(new ModelBiped(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityCripFlyR.class, new RenderFlyR(new ModelBiped(), 0));
	}
	
	public void registerEntities()
	{
		ModEntityID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerModEntity(EntityKellog.class, "Kellog", ModEntityID++, SCT.instance, 80, 1, false);
		EntityRegistry.registerModEntity(EntityMush.class, "Norm Crip", ModEntityID++, SCT.instance, 80, 1, false);
		EntityRegistry.registerModEntity(EntityMuth.class, "OpasniyCrip", ModEntityID++, SCT.instance, 80, 1, false);
		EntityRegistry.registerModEntity(SuperCreeperEntity.class, "OpasniyCrip", ModEntityID++, SCT.instance, 80, 1, false);
		EntityRegistry.registerModEntity(EntityCripFlyR.class, "OpasniyCrip", ModEntityID++, SCT.instance, 80, 1, false);

	}
	
	@Override
	public void preInit(FMLPreInitializationEvent e) 
	{
		super.preInit(e);
		
		//MinecraftForge.EVENT_BUS.register(new ReputationGUI(mc));
		
		//Utils.registerEvents();
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