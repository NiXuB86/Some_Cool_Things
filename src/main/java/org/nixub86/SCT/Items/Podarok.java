package org.nixub86.SCT.Items;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Podarok extends Item {

	private Random random = new Random();
	
	private int i;
	
	public Podarok()
	{
		this.setCreativeTab(ItemsSCT.SCTTab);
		this.setUnlocalizedName("Podarok");
		this.setTextureName("sct:gift");
		
		i = random.nextInt(3);
		
	}
	
	/*public boolean onEntityItemUpdate(EntityItem item, Random random) 
	{
        return false;
    }*/

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
	{
		if (!player.capabilities.isCreativeMode)
		 {
			--itemstack.stackSize;
		 }
		
		Random rand = new Random();
		ItemStack[] itemstack2 = new ItemStack[20];
		itemstack2[0] = new ItemStack(Items.apple);
		itemstack2[1] = new ItemStack(Items.arrow);
		itemstack2[2] = new ItemStack(Items.ender_pearl);
		itemstack2[3] = new ItemStack(Items.blaze_rod);
		itemstack2[4] = new ItemStack(Items.beef);
		itemstack2[5] = new ItemStack(Items.bed);
		itemstack2[6] = new ItemStack(Items.book);
		itemstack2[7] = new ItemStack(Items.bucket);
		itemstack2[8] = new ItemStack(Items.diamond);
		itemstack2[9] = new ItemStack(Items.diamond_pickaxe);
		itemstack2[10] = new ItemStack(Items.diamond_sword);
		
		player.inventory.addItemStackToInventory(itemstack2[rand.nextInt(20)]);
		
		System.out.println(itemstack2);
		
	  return itemstack;
	}
  }