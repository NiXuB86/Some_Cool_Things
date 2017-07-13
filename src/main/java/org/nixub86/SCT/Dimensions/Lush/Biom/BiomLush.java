package org.nixub86.SCT.Dimensions.Lush.Biom;

import java.util.Random;
import org.nixub86.SCT.Dimensions.Lush.WorldProviderLush;
import org.nixub86.SCT.Cripy.Entity.EntityKellog;
import org.nixub86.SCT.Cripy.Entity.EntityMush;
import org.nixub86.SCT.Cripy.Entity.EntityMuth;
import org.nixub86.SCT.Items.ItemsSCT;
import org.nixub86.SCT.trees.Gesh.WorldGenGeshTree;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.world.BlockEvent;

public class BiomLush extends BiomeGenBase
{
	private WorldGenerator WorldTree;
	
	public BiomLush(int id) {
		super(id);
		
		this.setDisableRain();
		
		
		this.spawnableMonsterList.clear();
		this.spawnableMonsterList.add(new SpawnListEntry(EntityKellog.class, 30, 1, 3));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityMuth.class, 25, 2, 4));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityMush.class, 50, 2, 4));
		
		
		this.theBiomeDecorator.treesPerChunk = 5;
		this.theBiomeDecorator.grassPerChunk = 2;
		
		this.WorldTree = new WorldGenGeshTree(false);
		//this.theBiomeDecorator.bigMushroomsPerChunk = 2;
		
		
		this.topBlock = Blocks.grass;
		this.fillerBlock = Blocks.dirt;
	}
	/*
	public WorldGenerator getRandomWorldGenForGrass(Random random)
	{
        return random.nextInt(2) == 0 ? new WorldGenTallGrass(ItemsSCT.byl, 1) : new WorldGenTallGrass(ItemsSCT.byl, 2);
    }*/
	
	public WorldGenAbstractTree func_150567_a(Random random)
    {
		return (WorldGenAbstractTree)(random.nextInt(5) == 0 ? this.worldGeneratorSwamp : (random.nextInt(10) == 0 ? this.WorldTree : this.worldGeneratorTrees));
    }	
}
