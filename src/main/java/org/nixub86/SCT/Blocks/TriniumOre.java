package org.nixub86.SCT.Blocks;

import java.util.Random;

import org.nixub86.SCT.Items.ItemsSCT;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class TriniumOre extends Block {

	public TriniumOre(Material material) {
		super(material.rock);
		
		this.setBlockName("TriniumOre");
		this.setCreativeTab(ItemsSCT.SCTTab);
		this.setBlockTextureName("sct:TriniumOre");
		this.setHardness(5f);
		this.setResistance(10F);
		this.setHarvestLevel("pickaxe", 2);
		
	}
		
	public Item getItemDropped(int par1, Random random, int par3) 
	{
		return Item.getItemFromBlock(BlocksSCT.TriniumOre);
	}
}
