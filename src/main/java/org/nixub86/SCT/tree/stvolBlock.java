package org.nixub86.SCT.tree;

import org.nixub86.SCT.Items.ItemsSCT;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class stvolBlock extends Block {

	public stvolBlock(Material p_i45394_1_) {
		super(p_i45394_1_.wood);
		
		this.setCreativeTab(ItemsSCT.SCTTab);
		this.setHardness(2f);
		this.setBlockName("Stvol");
		this.setBlockTextureName("sct:tree");
		this.setHarvestLevel("axe", 0);
	}

}
