package org.nixub86.SCT.Items;

import org.nixub86.SCT.SCT;
import org.nixub86.SCT.Cripy.Entity.EntityKellog;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Sword extends ItemSword {
	
	private World world;
	
	
	public Sword(ToolMaterial material) {
		super(SCT.Trinium);
		
		this.setCreativeTab(ItemsSCT.SCTTab);
		this.setTextureName("sword");
		this.setUnlocalizedName("Sword");
	}
	
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase entity, EntityLivingBase player)
	{		
		if(stack.getItem() == ItemsSCT.Sword)
		{
			if(entity instanceof EntityKellog)
			{
				if(player.getActivePotionEffect(Potion.damageBoost) == null)
				{
					player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 20, 3));
				}
			}
		}
		return true;
	}
}
