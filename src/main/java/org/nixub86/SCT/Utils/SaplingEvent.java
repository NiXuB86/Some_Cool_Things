package org.nixub86.SCT.Utils;

import org.nixub86.SCT.Blocks.BlocksSCT;
import org.nixub86.SCT.trees.Gesh.GeshSaplingBlock;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class SaplingEvent {
	
	@SubscribeEvent
	public void SapplingUse(BonemealEvent event) 
	{
		if(event.world.getBlock(event.x, event.y, event.z) == BlocksSCT.GeshSapling) 
		{
			((GeshSaplingBlock)BlocksSCT.GeshSapling).func_149878_d(event.world, event.x, event.y, event.z, event.world.rand);
		}
	}
}
