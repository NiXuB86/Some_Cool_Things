package org.nixub86.SCT.Blocks;

import org.nixub86.SCT.SCT;
import org.nixub86.SCT.Items.ItemsSCT;
import org.nixub86.SCT.TriniumWorkbench.GuiHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockXyita extends Block {

	public BlockXyita(Material material) {
		super(material.rock);
		
		this.setCreativeTab(ItemsSCT.SCTTab);
		this.setBlockName("BlockXXXXXX");
		
	}
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9)
    {
	 if(world.isRemote)
		  player.openGui(SCT.instance, GuiHandler.idXyita, world, x, y, z);
	
	  return true;
    
    }

}
