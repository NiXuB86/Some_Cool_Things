package org.nixub86.SCT.GUIs;

import org.nixub86.SCT.CommandReportAndLike.Command;
import org.nixub86.SCT.CommandReportAndLike.Info;
import org.nixub86.SCT.CommandReportAndLike.PlayerReport_Like;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.ServerConfigurationManager;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;

public class ReputationGUI extends Gui {
	
	//int Reputation = Command.Like - Command.Report;
	
	private Minecraft mc;
	
	private int reput, report, like;;
	
	
	String text = "Reputation: ";
	String reputColor = "FFFFFF";
	
	@SideOnly(Side.CLIENT)
	public ReputationGUI(Minecraft mc)
	{
		this.mc = mc;
		
		PlayerReport_Like entity = PlayerReport_Like.get(mc.thePlayer);
		
		ScaledResolution scaled = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
		int width = scaled.getScaledWidth();
		int height = scaled.getScaledHeight();
		
		report = entity.getReport();
		like = entity.getLike();
		
		//reput = report-like;
		
		
		System.out.println(reput + "REPUT ON GUI");
		
		if (entity == null || entity.getMaxReport() == 0)
		{
			System.out.println(reput + "REPUT ON GUIERROR");
			return;
		}
		
		/*if  (player instanceof EntityPlayerMP)
		{
			//player = ;
			EntityPlayerMP playerMP = (EntityPlayerMP)player;
		} else
		{
			playerMP =  MinecraftServer.getServer().getConfigurationManager().func_152612_a(mc.thePlayer.getDisplayName());
		}*/
		
		
		
		//System.out.println("Reputation: " + rep);
		
		text = text + Info.rep;
		
		if (Info.rep >= 5)
		{
			reputColor = "5DE100";
		}
		if (Info.rep <= -5)
		{
			reputColor = "FF0000";
		}
		
		
		drawCenteredString(mc.fontRenderer, text, 36, 4, Integer.parseInt(reputColor, 16));
	}
}