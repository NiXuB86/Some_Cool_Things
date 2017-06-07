package org.nixub86.SCT.Items;

import org.nixub86.SCT.SCT;

import net.minecraft.item.ItemPickaxe;

public class Kirka extends ItemPickaxe{

	protected Kirka(ToolMaterial material) {
		super(material.EMERALD);
		
		this.setCreativeTab(ItemsSCT.SCTTab);
		this.setNoRepair();
		this.setUnlocalizedName("Kirka");
		this.setTextureName(SCT.MODID+":kirka");
	}

}
