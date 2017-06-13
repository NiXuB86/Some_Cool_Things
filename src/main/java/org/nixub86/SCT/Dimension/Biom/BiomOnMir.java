package org.nixub86.SCT.Dimension.Biom;

import org.nixub86.SCT.Items.ItemsSCT;

import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomOnMir extends BiomeGenBase{

	public BiomOnMir(int p_i1971_1_) {
		super(p_i1971_1_);
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntitySlime.class, 5, 2, 10));
		
		this.theBiomeDecorator.treesPerChunk = 5;
		this.theBiomeDecorator.grassPerChunk = 2;
		this.theBiomeDecorator.bigMushroomsPerChunk = 2;
		
		
		this.topBlock = Blocks.glass;
		this.fillerBlock = Blocks.glass;
		
		
	}

}
