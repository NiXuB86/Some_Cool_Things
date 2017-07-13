package org.nixub86.SCT;

import org.nixub86.SCT.Blocks.BlocksSCT;
import org.nixub86.SCT.Gases.GasesSCT;
import org.nixub86.SCT.Items.ItemsSCT;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

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
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		
	}
}