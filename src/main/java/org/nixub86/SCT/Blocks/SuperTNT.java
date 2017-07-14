package org.nixub86.SCT.Blocks;

import java.util.Random;

import org.nixub86.SCT.Items.ItemsSCT;
import org.nixub86.SCT.Utils.EntityTNT;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.util.IIcon;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class SuperTNT extends Block {
	
	
	@SideOnly(Side.CLIENT)
    private IIcon field_150116_a;
    
	@SideOnly(Side.CLIENT)
    private IIcon field_150115_b;
    

    public SuperTNT()
    {
        super(Material.tnt);
        this.setCreativeTab(ItemsSCT.SCTTab);
        this.setBlockName("SuperTNT");
        this.setBlockTextureName("");
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        return side == 0 ? this.field_150115_b : (side == 1 ? this.field_150116_a : this.blockIcon);
    }

    
    public void onBlockAdded(World world, int x, int y, int z)
    {
        super.onBlockAdded(world, x, y, z);

        if (world.isBlockIndirectlyGettingPowered(x, y, z))
        {
            this.onBlockDestroyedByPlayer(world, x, y, z, 1);
            world.setBlockToAir(x, y, z);
        }
    }

   
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block)
    {
        if (world.isBlockIndirectlyGettingPowered(x, y, z))
        {
            this.onBlockDestroyedByPlayer(world, x, y, z, 1);
            world.setBlockToAir(x, y, z);
        }
    }

    
    public int quantityDropped(Random rand)
    {
        return 1;
    }

    
    public void onBlockDestroyedByExplosion(World world, int x, int y, int z, Explosion vzr)
    {
        if (!world.isRemote)
        {
        	EntityTNT entitytnt = new EntityTNT(world, (double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), vzr.getExplosivePlacedBy());
            //entitytnt.fuse = world.rand.nextInt(entitytnt.fuse / 4) + entitytnt.fuse / 8;
            world.spawnEntityInWorld(entitytnt);
        }
    }

    public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int metaData)
    {
        this.func_150114_a(world, x, y, z, metaData, (EntityLivingBase)null);
    }

    public void func_150114_a(World world, int x, int y, int z, int p_150114_5_, EntityLivingBase entity)
    {
        if (!world.isRemote)
        {
            if ((p_150114_5_ & 1) == 1)
            {
            	EntityTNT entitytnt = new EntityTNT(world, (double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), entity);
                world.spawnEntityInWorld(entitytnt);
                world.playSoundAtEntity(entitytnt, "game.tnt.primed", 1.0F, 1.0F);
            }
        }
    }

    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
        if (p_149727_5_.getCurrentEquippedItem() != null && p_149727_5_.getCurrentEquippedItem().getItem() == Items.flint_and_steel)
        {
            this.func_150114_a(p_149727_1_, p_149727_2_, p_149727_3_, p_149727_4_, 1, p_149727_5_);
            p_149727_1_.setBlockToAir(p_149727_2_, p_149727_3_, p_149727_4_);
            p_149727_5_.getCurrentEquippedItem().damageItem(1, p_149727_5_);
            return true;
        }
        else
        {
            return super.onBlockActivated(p_149727_1_, p_149727_2_, p_149727_3_, p_149727_4_, p_149727_5_, p_149727_6_, p_149727_7_, p_149727_8_, p_149727_9_);
        }
    }

    /**
     * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
     */
    public void onEntityCollidedWithBlock(World p_149670_1_, int p_149670_2_, int p_149670_3_, int p_149670_4_, Entity p_149670_5_)
    {
        if (p_149670_5_ instanceof EntityArrow && !p_149670_1_.isRemote)
        {
            EntityArrow entityarrow = (EntityArrow)p_149670_5_;

            if (entityarrow.isBurning())
            {
                this.func_150114_a(p_149670_1_, p_149670_2_, p_149670_3_, p_149670_4_, 1, entityarrow.shootingEntity instanceof EntityLivingBase ? (EntityLivingBase)entityarrow.shootingEntity : null);
                p_149670_1_.setBlockToAir(p_149670_2_, p_149670_3_, p_149670_4_);
            }
        }
    }

    /**
     * Return whether this block can drop from an explosion.
     */
    public boolean canDropFromExplosion(Explosion p_149659_1_)
    {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon(this.getTextureName() + "_side");
        this.field_150116_a = p_149651_1_.registerIcon(this.getTextureName() + "_top");
        this.field_150115_b = p_149651_1_.registerIcon(this.getTextureName() + "_bottom");
    }
}
