package org.nixub86.SCT.Cripy;

import org.apache.commons.lang3.ArrayUtils;
import org.nixub86.SCT.SCT;
import org.nixub86.SCT.Cripy.Entity.EntityNormCripa;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;

public class NormCrip {

	public static void mainRegistry()
	{
		registerEntity();
	}
	
	public static void registerEntity()
	{
		createEntity(EntityNormCripa.class, "Norm Crip", 0x0010FF, 0xFF00E7);
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor)
	{
		BiomeGenBase[] biomes = new BiomeGenBase[0];
		biomes = ArrayUtils.addAll(biomes, BiomeDictionary.getBiomesForType(Type.BEACH));
		biomes = ArrayUtils.addAll(biomes, BiomeDictionary.getBiomesForType(Type.COLD));
		biomes = ArrayUtils.addAll(biomes, BiomeDictionary.getBiomesForType(Type.CONIFEROUS));
		biomes = ArrayUtils.addAll(biomes, BiomeDictionary.getBiomesForType(Type.DENSE));
		biomes = ArrayUtils.addAll(biomes, BiomeDictionary.getBiomesForType(Type.DRY));
		biomes = ArrayUtils.addAll(biomes, BiomeDictionary.getBiomesForType(Type.FOREST));
		biomes = ArrayUtils.addAll(biomes, BiomeDictionary.getBiomesForType(Type.HILLS));
		biomes = ArrayUtils.addAll(biomes, BiomeDictionary.getBiomesForType(Type.JUNGLE));
		biomes = ArrayUtils.addAll(biomes, BiomeDictionary.getBiomesForType(Type.LUSH));
		biomes = ArrayUtils.addAll(biomes, BiomeDictionary.getBiomesForType(Type.MAGICAL));
		biomes = ArrayUtils.addAll(biomes, BiomeDictionary.getBiomesForType(Type.MESA));
		biomes = ArrayUtils.addAll(biomes, BiomeDictionary.getBiomesForType(Type.MOUNTAIN));
		biomes = ArrayUtils.addAll(biomes, BiomeDictionary.getBiomesForType(Type.MUSHROOM));
		biomes = ArrayUtils.addAll(biomes, BiomeDictionary.getBiomesForType(Type.PLAINS));
		biomes = ArrayUtils.addAll(biomes, BiomeDictionary.getBiomesForType(Type.SANDY));
		biomes = ArrayUtils.addAll(biomes, BiomeDictionary.getBiomesForType(Type.SAVANNA));
		
		
		
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, SCT.instance, 64, 1, true);
		
		EntityRegistry.addSpawn(entityClass, 50, 2, 4, EnumCreatureType.creature, biomes);
		
		createEgg(randomId, solidColor, spotColor);
		
	}
	
	private static void createEgg(int randomId, int solidColor, int spotColor)
	{
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
	}

	
}
