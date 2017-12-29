package org.nixub86.SCT.Utils;

import org.nixub86.SCT.CommandReportAndLike.EventReport;
import org.nixub86.SCT.GUIs.RenderGuiHandler;
import org.nixub86.SCT.Items.ItemsSCT;
import org.nixub86.SCT.Items.Universal;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BlockEvent;

public class Utils{

	@SubscribeEvent
	   public void onEvent(BlockEvent.HarvestDropsEvent event) {
		Item breaker = null;
		
		if (event.harvester != null && event.harvester.getCurrentEquippedItem() != null && event.harvester.getCurrentEquippedItem().getItem() != null) {
			breaker = event.harvester.getCurrentEquippedItem().getItem();
		}
		
		if (event.drops != null && event.drops.size() != 0) {
			for (int x = event.drops.size() - 1; x >= 0; x--) {
				if (FurnaceRecipes.smelting().getSmeltingResult(event.drops.get(x)) != null) {
					ItemStack thisItem = FurnaceRecipes.smelting().getSmeltingResult(event.drops.get(x));
				
				if(Universal.plavka){
					if ((breaker == ItemsSCT.Universal) && breaker != null) {
						event.drops.remove(x);
						event.drops.add(thisItem.copy());
					}
				}
			}
		}
	}
  }
	
	public static void registerEvents() 
	{
		 MinecraftForge.EVENT_BUS.register(new SaplingEvent());
		 MinecraftForge.EVENT_BUS.register(new RenderGuiHandler());
		 MinecraftForge.EVENT_BUS.register(new EventReport.Player());
	}
	
}
