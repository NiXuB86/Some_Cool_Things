package org.nixub86.SCT;

import org.nixub86.SCT.Items.ItemsSCT;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent e) {
		ItemsSCT.init();
	}
	
	public void init(FMLInitializationEvent e) {
		RecipesSCT.init();
		
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		
	}
}