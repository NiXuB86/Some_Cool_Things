package org.nixub86.SCT.Dimensions.Lush.Biom;

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
	
	public static BiomeGenBase BiomInLush;
	
	public static void initializeBiome()
	{
		BiomInLush = new BiomLush(137).setBiomeName("BiomInLush").setTemperatureRainfall(1.2F, 0.9F);
	}
	
	public static void registerBiome()
	{
		BiomeDictionary.registerBiomeType(BiomInLush, Type.FOREST);
		BiomeManager.addSpawnBiome(BiomInLush);
		
	}

}
