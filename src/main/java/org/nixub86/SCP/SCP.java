package org.nixub86.SCP;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod (modid = SCP.MODID, name = SCP.MODNAME, version = SCP.VERSION)
public class SCP {
	public static final String MODID = "SCP";
    public static final String MODNAME = "Energized Baubles";
    public static final String VERSION = "0.1.2";
	
	@Instance("scp")
	public static SCP instance;
	
	@SidedProxy(clientSide = "com.NiXuB86.SCP.ClientProxy", serverSide = "com.NiXuB86.SCP.CommonProxy")
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
