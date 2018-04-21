package org.nixub86.SCT.Armor;

import org.nixub86.SCT.Items.ItemsSCT;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.world.World;

public class Jetpack extends ItemArmor{

	public Jetpack(int id, int type) {
		super(ArmorMaterial.DIAMOND, id, type);
        
		
		this.setCreativeTab(ItemsSCT.SCTTab);
	}

	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) 
	{
		boolean fly = Minecraft.getMinecraft().gameSettings.keyBindJump.getIsKeyPressed();
		
        if(fly)
        {
        	player.motionY += 0.0999;
        	
        	itemStack.setItemDamage(10);
        }
        
        //if(player.fallDistance > 10)
        //{
        	//itemStack.setItemDamage(25);
        	
        	if(itemStack.getItemDamage() != itemStack.getMaxDamage()){
        		player.fallDistance = 0;
        	}
      //  }
        
        //if(itemStack.getItemDamage() != itemStack.getMaxDamage())
        //{
        //	player.fallDistance = 0;
        //}
        
        //System.out.println(itemStack.getItemDamage() + "/" + itemStack.getMaxDamage() + "fall: " + player.fallDistance);
        
        super.onArmorTick(world, player, itemStack);
  }
}
