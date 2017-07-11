package org.nixub86.SCT.Dimension;

import org.nixub86.SCT.Dimension.Biom.BiomeRegistry;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.event.world.BlockEvent;

public class WorldProviderMira extends WorldProvider{

	public void registerWorldChunkManager()
	{
		this.worldChunkMgr = new WorldChunkManagerHell(BiomeRegistry.BiomVMire, 1.2F);
		this.dimensionId = DimensionRegistry.dimensionId;
	}
	
	public IChunkProvider createChunkGeneration()
	{
		return new ChunkProvaiderOnMir(this.worldObj, this.dimensionId, this.hasNoSky);
	}
	
	@Override
	public String getDimensionName() {
		
		return "Mir";
	}
}
