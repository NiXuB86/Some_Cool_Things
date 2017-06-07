package org.nixub86.SCT.Items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ItemsSCT extends Item{
	
	public static CreativeTabs SCTTab = new CreativeTabs("Some Cool Things"){
		public Item getTabIconItem() {
			//return ItemsSCP.;
			return Items.apple;
		}
	};
	
	public static ItemPickaxe Kirka;
	
	//Use this if you need to do something in preInit stage of minecraft
	public static final void preInit() {
		
	}
	
	//Please use this function for add items, do not create crutch
	public static final void Init() {
		//itemRegistry.addObject(423, "Pickaxe", new Kirka(Item.ToolMaterial.EMERALD));
		
		Kirka = new Kirka();
		GameRegistry.registerItem(Kirka, "Kirka");
		
	}
}
