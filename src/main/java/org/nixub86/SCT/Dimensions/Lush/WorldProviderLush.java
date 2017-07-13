package org.nixub86.SCT.Dimensions.Lush;

import org.nixub86.SCT.Dimensions.Lush.Biom.BiomeRegistry;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.material.Material;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.event.world.BlockEvent;

public class WorldProviderLush extends WorldProvider{

	public void registerWorldChunkManager()
	{
		this.worldChunkMgr = new WorldChunkManagerHell(BiomeRegistry.BiomInLush, 1.2F);
		this.dimensionId = DimensionRegistry.LushId;
	}
	
	public IChunkProvider createChunkGeneration()
	{
		return new ChunkProvaiderLush(this.worldObj, this.dimensionId, this.hasNoSky);
	}
	
	@Override
	public String getDimensionName() {
		
		return "Lush";
	}
}
