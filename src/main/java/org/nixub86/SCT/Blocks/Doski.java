package org.nixub86.SCT.Blocks;

import java.util.Random;

import org.nixub86.SCT.Items.ItemsSCT;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Doski extends Block {

	public Doski(Material material) {
		super(material.wood);
		
		this.setBlockName("Doski");
		this.setBlockTextureName("sct:doski");
		this.setCreativeTab(ItemsSCT.SCTTab);
		this.setHardness(2f);
		this.setHarvestLevel("axe", 0);
	}
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(this);
    }
	
}
