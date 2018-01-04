package org.nixub86.SCT.GUIs;

import org.nixub86.SCT.CommandReportAndLike.Command;
import org.nixub86.SCT.CommandReportAndLike.Info;
import org.nixub86.SCT.CommandReportAndLike.PlayerReport_Like;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;

public class ReputationGUI extends Gui {
	
	//int Reputation = Command.Like - Command.Report;
	
	Minecraft mc;
	
	public int rep;
	
	public int like, report;
	
	String text = "Reputation: ";
	String color = "FFFFFF";
	
	public ReputationGUI(Minecraft mc)
	{
		this.mc = mc;
		
		ScaledResolution scaled = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
		int width = scaled.getScaledWidth();
		int height = scaled.getScaledHeight();
		
		//rep = like - report;
		
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
	
	@SubscribeEvent(priority = EventPriority.NORMAL)
    public void onRenderGui(RenderGameOverlayEvent.Post event)
    {
		if (event.type != ElementType.EXPERIENCE) return;
		
		
		PlayerReport_Like props = PlayerReport_Like.get(this.mc.thePlayer);
		
		
		
    }
	
	
	
	
	
	
}
