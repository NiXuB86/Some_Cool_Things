package org.nixub86.SCT.Blocks;

import java.util.Random;

import org.nixub86.SCT.Items.ItemsSCT;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class LushStone extends Block {

	public LushStone(Material material) {
		super(material.rock);
		
		this.setCreativeTab(ItemsSCT.SCTTab);
		this.setBlockName("LushStone");
		this.setBlockTextureName("LushStone");

	}
	
	 public int quantityDropped(Random p_149745_1_)
	    {
	        return 1;
	    }

	    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	    {
	        return Item.getItemFromBlock(ItemsSCT.byl);
	    }
}
