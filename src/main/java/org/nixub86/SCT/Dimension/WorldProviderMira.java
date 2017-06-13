package org.nixub86.SCT.Dimension;

import org.nixub86.SCT.Dimension.Biom.BiomeRegistry;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderMira extends WorldProvider{

	public void registerWorldChunkManager()
	{
		this.worldChunkMgr = new WorldChunkManagerHell(BiomeRegistry.BiomVMire, 1.2F);
		this.dimensionId = DimensionRegistry.dimensionId;
	}
	
	public IChunkProvider createChunkGeneration(){
		return null;
	}
	
	@Override
	public String getDimensionName() {
		
		return "Mir";
	}

}
