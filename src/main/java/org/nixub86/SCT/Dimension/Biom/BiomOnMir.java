package org.nixub86.SCT.Dimension.Biom;

import java.util.Random;

import org.nixub86.SCT.Items.ItemsSCT;
import org.nixub86.SCT.tree.WorldGenTree;

import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomOnMir extends BiomeGenBase{
	
	private WorldGenerator WorldTree;
	private Object worldGeneratorTutorialBigTree;
	
	public BiomOnMir(int id) {
		super(id);
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntitySlime.class, 5, 2, 10));
		
		this.theBiomeDecorator.treesPerChunk = 5;
		this.theBiomeDecorator.grassPerChunk = 2;
		
		this.WorldTree = new WorldGenTree(false);
		//this.theBiomeDecorator.bigMushroomsPerChunk = 2;
		
		
		this.topBlock = Blocks.grass;
		//this.fillerBlock = Blocks.glass;
	}
	
	public WorldGenAbstractTree func_150567_a(Random random)
    {
		return (WorldGenAbstractTree)(random.nextInt(5) == 0 ? this.worldGeneratorSwamp : (random.nextInt(10) == 0 ? this.WorldTree : this.worldGeneratorTrees));
    }
}
