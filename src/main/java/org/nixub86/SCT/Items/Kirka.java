package org.nixub86.SCT.Items;

import org.nixub86.SCT.SCT;

import net.minecraft.item.ItemPickaxe;

public class Kirka extends ItemPickaxe{

	protected Kirka() {
		super(ToolMaterial.EMERALD);
		
		this.setCreativeTab(ItemsSCT.SCTTab);
		this.setNoRepair();
		this.setUnlocalizedName("Kirka");
		this.setTextureName("sct:Kirka");
	}
}
