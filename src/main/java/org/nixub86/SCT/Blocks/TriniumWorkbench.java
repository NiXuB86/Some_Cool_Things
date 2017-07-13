package org.nixub86.SCT.Blocks;

import java.util.Random;

import org.nixub86.SCT.SCT;
import org.nixub86.SCT.Items.ItemsSCT;
import org.nixub86.SCT.TriniumWorkbench.GuiHandler;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class TriniumWorkbench extends Block {
	
	@SideOnly(Side.CLIENT)
    private IIcon field_150035_a;
    @SideOnly(Side.CLIENT)
    private IIcon field_150034_b;
	
	public TriniumWorkbench(Material material) {
		super(material.rock);
	
	this.setBlockName("Trinium Workbench");
	this.setCreativeTab(ItemsSCT.SCTTab);
	this.setHardness(5f);
	this.setResistance(10F);
	this.setHarvestLevel("axe", 0);
	
	}
	
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return p_149691_1_ == 1 ? this.field_150035_a : (p_149691_1_ == 0 ? Blocks.planks.getBlockTextureFromSide(p_149691_1_) : (p_149691_1_ != 2 && p_149691_1_ != 4 ? this.blockIcon : this.field_150034_b));
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon(this.getTextureName() + "_side");
        this.field_150035_a = p_149651_1_.registerIcon(this.getTextureName() + "_top");
        this.field_150034_b = p_149651_1_.registerIcon(this.getTextureName() + "_front");
    }
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
		if(!world.isRemote)
			player.openGui(SCT.instance, GuiHandler.id, world, x, y, z);
		return true;
	}
	  
	public Item getItemDropped(int par1, Random random, int par3) {
		return Item.getItemFromBlock(BlocksSCT.TriniumWorkbench);
	}
}