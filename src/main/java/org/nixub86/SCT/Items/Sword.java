package org.nixub86.SCT.Items;

import net.minecraft.item.ItemSword;

public class Sword extends ItemSword {

	public Sword(ToolMaterial material) {
		super(material.EMERALD);
		
		this.setCreativeTab(ItemsSCT.SCTTab);
		this.setTextureName("sword");
		this.setUnlocalizedName("Sword");	

	}
	
	

}
