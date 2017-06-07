package org.nixub86.SCT.Items;

import net.minecraft.item.ItemPickaxe;

public class Kirka extends ItemPickaxe{

	protected Kirka(ToolMaterial material) {
		super(material.EMERALD);
		
		this.setCreativeTab(ItemsSCT.SCTTab);
		this.setNoRepair();
		this.setUnlocalizedName("Kirka");
		this.setTextureName("SCT:kirka");
	}

}
