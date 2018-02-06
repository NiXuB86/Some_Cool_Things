package org.nixub86.SCT.GUIs;

import org.nixub86.SCT.CommandReportAndLike.PlayerReport_Like;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;

public class RenderGuiHandler {
	
	@SubscribeEvent
    public void onRenderGui(RenderGameOverlayEvent.Post event)
    {
		if (event.type != ElementType.EXPERIENCE) return;
		//new ReputationGUI(Minecraft.getMinecraft());
    }
}
