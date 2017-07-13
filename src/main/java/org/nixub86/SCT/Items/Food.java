package org.nixub86.SCT.Items;

import net.minecraft.item.ItemFood;

public class Food extends ItemFood {

	public Food(int golod, double d, boolean ifWolfFood) {
		super(golod, (float) d, ifWolfFood);
		
		//this.setTextureName("FoodTexture");
		this.setCreativeTab(ItemsSCT.SCTTab);
		this.setUnlocalizedName("Food");
		
	}

}
