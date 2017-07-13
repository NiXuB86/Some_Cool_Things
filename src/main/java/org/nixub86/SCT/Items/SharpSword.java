package org.nixub86.SCT.Items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import org.nixub86.SCT.SCT;
import org.nixub86.SCT.Cripy.Entity.EntityKellog;


public class SharpSword extends ItemSword {
private World world;
	
	
	public SharpSword(ToolMaterial material) {
		super(SCT.SharpenedTrinium);
		
		
		this.setCreativeTab(ItemsSCT.SCTTab);
		this.setTextureName("SharpSword");
		this.setUnlocalizedName("SharpSword");
		
	}
	
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase entity, EntityLivingBase player)
	{		
		if(stack.getItem() == ItemsSCT.SharpSword)
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
