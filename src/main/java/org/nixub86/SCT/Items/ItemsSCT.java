package org.nixub86.SCT.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ItemsSCT {
	
	public static CreativeTabs SCTTab = new CreativeTabs("Some Cool Things"){
		public Item getTabIconItem() {
			//return ItemsSCP.;
			return Items.apple;
		}
	};
	
	public static final void preInit() {
		
	}
	
	public static final void Init() {
		
	}
}
