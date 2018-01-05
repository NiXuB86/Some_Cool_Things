package org.nixub86.SCT.GUIs;

import org.nixub86.SCT.CommandReportAndLike.Command;
import org.nixub86.SCT.CommandReportAndLike.Info;
import org.nixub86.SCT.CommandReportAndLike.PlayerReport_Like;

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

@SideOnly(Side.CLIENT)
public class ReputationGUI extends Gui {
	
	//int Reputation = Command.Like - Command.Report;
	
	private Minecraft mc;
	public int rep;
	
	EntityPlayer player;
	EntityPlayerMP playerMP;
	
	String text = "Reputation: ";
	String color = "FFFFFF";
	//@SideOnly(Side.SERVER)
	public int reput(EntityPlayer player) {
		int reputation;
		PlayerReport_Like pro = PlayerReport_Like.get(player);
		reputation = pro.getLike() - pro.getReport();
		
		return reputation;
	}
	
	public ReputationGUI(Minecraft mc)
	{
		this.mc = mc;
		EntityPlayer player = (EntityPlayer)mc.thePlayer;
		ScaledResolution scaled = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
		int width = scaled.getScaledWidth();
		int height = scaled.getScaledHeight();
		
		//player =  MinecraftServer.getServer().getConfigurationManager().func_152612_a(mc.thePlayer.getDisplayName());
		//player = ;
		if  (player instanceof EntityPlayerMP)
		{
			//player = ;
			EntityPlayerMP playerMP = (EntityPlayerMP)player;
		} else
		{
			playerMP =  MinecraftServer.getServer().getConfigurationManager().func_152612_a(mc.thePlayer.getDisplayName());
		}
		
		//text = "Репутация у " + mc.thePlayer.getDisplayName() +": ";
		
		//System.out.println("Reputation: " + rep);
		rep =  reput(playerMP);
		text = text + rep;
		
		if (rep >= 5)
		{
			color = "5DE100";
		}
		if (rep <= -5)
		{
			color = "FF0000";
		}
		
		
		drawCenteredString(mc.fontRenderer, text, 36, 4, Integer.parseInt(color, 16));
	}
}
