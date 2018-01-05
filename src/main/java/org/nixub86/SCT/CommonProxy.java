package org.nixub86.SCT;

import org.nixub86.SCT.Blocks.BlocksSCT;
import org.nixub86.SCT.Gases.GasesSCT;
import org.nixub86.SCT.Items.ItemsSCT;
import org.nixub86.SCT.Utils.Utils;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import net.minecraft.entity.player.EntityPlayer;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent e) {
		ItemsSCT.preInit();
		GasesSCT.preInit();
	}
	
	public void init(FMLInitializationEvent e) {
		ItemsSCT.Init();
		BlocksSCT.Init();
		RecipesSCT.Init();
		GasesSCT.Init();
		Utils.registerEvents();
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		
	}
	
	public EntityPlayer getPlayerEntity(MessageContext ctx) {
		SCT.logger.info("Retrieving player from CommonProxy for message on side " + ctx.side);
		return ctx.getServerHandler().playerEntity;
	}
	
}