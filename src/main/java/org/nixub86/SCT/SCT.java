package org.nixub86.SCT;

import net.minecraft.client.Minecraft;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

import org.nixub86.SCT.CommandReportAndLike.CommandLike;
import org.nixub86.SCT.CommandReportAndLike.CommandReport;
import org.nixub86.SCT.CommandReportAndLike.Info;
import org.nixub86.SCT.CommandReportAndLike.MessageReport;
import org.nixub86.SCT.GUIs.ReputationGUI;
import org.nixub86.SCT.Items.ItemsSCT;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

@Mod (modid = SCT.MODID, name = SCT.MODNAME, version = SCT.VERSION)
public class SCT {
	public static final String MODID = "SCT";
    public static final String MODNAME = "Some Cool Things";
    public static final String VERSION = "0.1.2";
	
	@Instance("SCT")
	public static SCT instance;
	
	@SidedProxy(clientSide = "org.nixub86.SCT.ClientProxy", serverSide = "org.nixub86.SCT.CommonProxy")
	public static CommonProxy proxy;
	
	
	public static SimpleNetworkWrapper network;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{
		proxy.preInit(e);
		
		network = NetworkRegistry.INSTANCE.newSimpleChannel(SCT.MODID);
		network.registerMessage(MessageReport.Handler.class, MessageReport.class, 0, Side.CLIENT);
		
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
	    proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
	    proxy.postInit(e);
	}
	
	@EventHandler
	public void postInit(FMLServerStartingEvent e) 
	{
		e.registerServerCommand(new CommandReport());
		e.registerServerCommand(new CommandLike());
		e.registerServerCommand(new Info());
		
	
	}
	
	
	public static ToolMaterial SharpenedTrinium = EnumHelper.addToolMaterial("SharpenedTrinium", 4, 3000, 16.0F, 10.0F, 20);
	public static ToolMaterial Trinium = EnumHelper.addToolMaterial("Trinium", 3, 5000, 10.0F, 4.0F, 8);
}
