package org.nixub86.SCT.Dimension.Biom;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class BiomeRegistry {
	
	public static void mainRegsitry()
	{
		initializeBiome();
		registerBiome();
	}
	
	public static BiomeGenBase BiomVMire;
	
	public static void initializeBiome()
	{
		BiomVMire = new BiomOnMir(137).setBiomeName("BiomOnMir").setTemperatureRainfall(1.2F, 0.9F);
	}
	
	public static void registerBiome()
	{
		BiomeDictionary.registerBiomeType(BiomVMire, Type.FOREST);
		BiomeManager.addSpawnBiome(BiomVMire);
		
	}

}
