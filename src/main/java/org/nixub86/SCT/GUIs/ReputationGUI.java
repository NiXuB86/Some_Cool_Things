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

@SideOnly(Side.CLIENT)
public class ReputationGUI extends Gui {
	
	private Minecraft mc;

	public ReputationGUI(Minecraft mc) {
		super();
		this.mc = mc;
	}

		@SubscribeEvent(priority=EventPriority.NORMAL)
		public void onRenderExperienceBar(RenderGameOverlayEvent.Post event) {
			if (event.type != ElementType.EXPERIENCE) {
				return;
			}

			PlayerReport_Like props = PlayerReport_Like.get(this.mc.thePlayer);
			if (props == null || props.getReport() >= 0) {
				return;
			}

			int xPos = 2;
			int yPos = 2;
		
		
			drawTexturedModalRect(xPos, yPos, 0, 0, 56, 9);
			
			int Rep = (int)(((float) props.getMaxReport() / props.getLike()));
			
			drawTexturedModalRect(xPos + 3, yPos + 3, 0, 9, Rep, 3);
			
			String s = "Mana " + props.getReport() + "/" + props.getMaxReport();
			
			this.mc.fontRenderer.drawString(s, xPos + 1, yPos, 0);
			this.mc.fontRenderer.drawString(s, xPos - 1, yPos, 0);
			this.mc.fontRenderer.drawString(s, xPos, yPos + 1, 0);
			this.mc.fontRenderer.drawString(s, xPos, yPos - 1, 0);
			this.mc.fontRenderer.drawString(s, xPos, yPos, 8453920);
			
			yPos += 10;
			
			System.out.println("GFASFSAFAW");
			
		}
	}