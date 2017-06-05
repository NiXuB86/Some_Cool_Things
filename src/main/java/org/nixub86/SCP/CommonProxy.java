package org.nixub86.SCP;

import org.nixub86.SCP.Items.ItemsSCP;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent e) {
		ItemsSCP.init();
	}
	
	public void init(FMLInitializationEvent e) {
		RecipesSCP.init();
		
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		
	}
}