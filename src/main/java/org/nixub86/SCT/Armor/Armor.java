package org.nixub86.SCT.Armor;

import org.nixub86.SCT.Items.ItemsSCT;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class Armor extends ItemArmor {

    private String texturePath = "sct:textures/model/armor/";
	
	public Armor(int id, int type) 
	{
		super(ArmorMaterial.DIAMOND, id, type);
        this.setCreativeTab(ItemsSCT.SCTTab);
        this.setMaxStackSize(1);
        this.setTextureName();
		
        if(armorType == 0)
        	this.setUnlocalizedName("helmet");
        if(armorType == 1)
        	this.setUnlocalizedName("plate");
        if(armorType == 2)
        	this.setUnlocalizedName("pants");
        if(armorType == 3)
        	this.setUnlocalizedName("boots");
        
	}
		
	public void setTextureName ()
    {
		if(armorType == 0||armorType == 1||armorType == 3){
			this.texturePath += "armor" + 1 + ".png";
		}
		else {
			this.texturePath += "armor" + 2 + ".png";
		}
    }
	
	 @Override
     public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type)
	 {
             return this.texturePath;
     }
	
}
