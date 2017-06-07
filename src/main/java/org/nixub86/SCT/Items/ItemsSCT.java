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
	
	public static void RegisterItems(){
		
		itemRegistry.addObject(423, "Pickaxe", new Kirka(Item.ToolMaterial.EMERALD));
	}
	
	public static final void preInit() {
		
	}
	
	public static final void Init() {
		
	}
}
