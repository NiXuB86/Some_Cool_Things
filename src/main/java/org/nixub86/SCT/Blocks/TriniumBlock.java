package org.nixub86.SCT.Blocks;

import org.nixub86.SCT.Items.ItemsSCT;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TriniumBlock extends Block {

	public TriniumBlock(Material material) {
		super(material.iron);
		
		this.setBlockName("Trinium Block");
		this.setBlockTextureName("sct:triniumblock");
		this.setCreativeTab(ItemsSCT.SCTTab);
		this.setHardness(10f);
		this.setHarvestLevel("pickaxe", 3);
	}

}
