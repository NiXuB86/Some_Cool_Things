package org.nixub86.SCT.Blocks;

import java.util.Random;

import org.nixub86.SCT.Items.ItemsSCT;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class TriniumBlock extends Block {

	public TriniumBlock(Material material) {
		super(material.iron);
		
		this.setBlockName("Trinium Block");
		this.setBlockTextureName("sct:trinium_block");
		this.setCreativeTab(ItemsSCT.SCTTab);
		this.setHardness(10f);
		this.setResistance(50F);
		this.setHarvestLevel("pickaxe", 3);
	}
	
	public Item getItemDropped(int par1, Random random, int par3) {
		return Item.getItemFromBlock(BlocksSCT.TriniumBlock);
	}
}
