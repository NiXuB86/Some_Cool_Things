package org.nixub86.SCT.CommandReportAndLike;

import org.nixub86.SCT.SCT;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class EventReport {

	public static class Player {

		@SubscribeEvent
		public void addPlayerConstructingReport(EntityEvent.EntityConstructing event) {
			if (event.entity instanceof EntityPlayer)
				if (PlayerReport_Like.get((EntityPlayer)event.entity) == null)
					PlayerReport_Like.reg((EntityPlayer)event.entity);
		}
	}
	
	@SubscribeEvent
	public void joinPlayer(EntityJoinWorldEvent event) {
		if (!event.entity.worldObj.isRemote && event.entity instanceof EntityPlayerMP)
			if (PlayerReport_Like.get((EntityPlayer)event.entity) != null) {
				
				int Report = PlayerReport_Like.get((EntityPlayer)event.entity).getReport();
				SCT.network.sendTo(new MessageReport(Report), (EntityPlayerMP)event.entity);
			}
	}
}
