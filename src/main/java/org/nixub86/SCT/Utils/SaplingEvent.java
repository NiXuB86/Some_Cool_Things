package org.nixub86.SCT.Utils;

import org.nixub86.SCT.Items.ItemsSCT;
import org.nixub86.SCT.tree.saplingBlock;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class SaplingEvent {
	
	@SubscribeEvent
	public void SapplingUse(BonemealEvent event) 
	{
		if(event.world.getBlock(event.x, event.y, event.z) == ItemsSCT.sapl) 
		{
			((saplingBlock)ItemsSCT.sapl).func_149878_d(event.world, event.x, event.y, event.z, event.world.rand);
		}
	}
}
