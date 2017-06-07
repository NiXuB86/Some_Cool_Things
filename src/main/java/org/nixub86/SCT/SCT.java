package org.nixub86.SCT;

import org.nixub86.SCT.Items.ItemsSCT;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod (modid = SCT.MODID, name = SCT.MODNAME, version = SCT.VERSION)
public class SCT {
	public static final String MODID = "SCT";
    public static final String MODNAME = "Some Cool Things";
    public static final String VERSION = "0.1.2";
	
	@Instance("SCT")
	public static SCT instance;
	
	@SidedProxy(clientSide = "org.nixub86.SCT.ClientProxy", serverSide = "org.nixub86.SCT.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{
		proxy.preInit(e);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
	    proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
	    proxy.postInit(e);
	}
}
