package org.nixub86.SCT.Blocks;

import java.util.Random;

import org.nixub86.SCT.SCT;
import org.nixub86.SCT.Items.ItemsSCT;
import org.nixub86.SCT.Worckbench.GuiHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class Workbench extends Block {

	public Workbench(Material material) {
		super(material.rock);
	
	this.setBlockName("Workbench");
	this.setCreativeTab(ItemsSCT.SCTTab);
	this.setBlockTextureName("sct:work");
	this.setHardness(5f);
	this.setResistance(10F);
	this.setHarvestLevel("axe", 0);
	
	
}
	  public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9)
	    {
		  if(!world.isRemote)
			  player.openGui(SCT.instance, GuiHandler.id, world, x, y, z);
		
		  return true;
	    
	    }
	  
		public Item getItemDropped(int par1, Random random, int par3) {
			return Item.getItemFromBlock(ItemsSCT.Workbench);
		}
}