package org.nixub86.SCT.GUIs;

import org.nixub86.SCT.CommandReportAndLike.Command;
import org.nixub86.SCT.CommandReportAndLike.Info;
import org.nixub86.SCT.CommandReportAndLike.PlayerReport_Like;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;

public class ReputationGUI extends Gui {
	
	//int Reputation = Command.Like - Command.Report;
	
	
	public int rep;
	
	EntityPlayerMP player;
	
	String text = "Reputation: ";
	String color = "FFFFFF";
	
	public ReputationGUI(Minecraft mc)
	{
		ScaledResolution scaled = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
		int width = scaled.getScaledWidth();
		int height = scaled.getScaledHeight();
		
		player =  MinecraftServer.getServer().getConfigurationManager().func_152612_a(mc.thePlayer.getDisplayName());
		
		PlayerReport_Like pro = PlayerReport_Like.get(player);
		
		rep = pro.getLike() - pro.getReport();
		
		//System.out.println("Reputation: " + rep);
		
		text = text + rep;
		
		if (Info.rep >= 5)
		{
			color = "5DE100";
		}
		if (Info.rep <= -5)
		{
			color = "FF0000";
		}
		
		
		drawCenteredString(mc.fontRenderer, text, 36, 4, Integer.parseInt(color, 16));
	}
}
