package org.nixub86.SCT.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ItemsSCT extends Item{
	
	public static CreativeTabs SCTTab = new CreativeTabs("Some Cool Things"){
		public Item getTabIconItem() {
			//return ItemsSCP.;
			return Items.apple;
		}
	};
	
	//Use this if you need to do something in preInit stage of minecraft
	public static final void preInit() {
		
	}
	
	//Please use this function for add items, do not create crutch
	public static final void Init() {
		itemRegistry.addObject(423, "Pickaxe", new Kirka(Item.ToolMaterial.EMERALD));
	}
}
