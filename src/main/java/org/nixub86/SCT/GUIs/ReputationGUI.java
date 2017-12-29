package org.nixub86.SCT.GUIs;

import org.nixub86.SCT.CommandReportAndLike.Command;
import org.nixub86.SCT.CommandReportAndLike.Info;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;

public class ReputationGUI extends Gui {
	
	//int Reputation = Command.Like - Command.Report;
	
	String text = "Reputation: "+ Info.rep;
	String color = "FFFFFF";
	
	public ReputationGUI(Minecraft mc)
	{
		ScaledResolution scaled = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
		int width = scaled.getScaledWidth();
		int height = scaled.getScaledHeight();
		
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
