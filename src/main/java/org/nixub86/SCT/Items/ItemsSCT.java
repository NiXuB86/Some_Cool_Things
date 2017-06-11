package org.nixub86.SCT.Items;

import org.nixub86.SCT.SCT;
import org.nixub86.SCT.Blocks.Generaciya;
import org.nixub86.SCT.Blocks.Ryda;
import org.nixub86.SCT.Blocks.Workbench;
import org.nixub86.SCT.Gases.GasesSCT;
import org.nixub86.SCT.Utils.GuiHandler;
import org.nixub86.SCT.Utils.Utils;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.MinecraftForge;

public class ItemsSCT extends Item{
	
	public static CreativeTabs SCTTab = new CreativeTabs("Some Cool Things"){
		public Item getTabIconItem() {
			//return ItemsSCP.;
			return Items.apple;
		}
	};
	
	public static ItemPickaxe Kirka;
	public static ItemPickaxe Kirka_Lopata;
	public static ItemPickaxe Universal;
	
	public static Block Ryda;
	public static Block Workbench;
	
	public static Generaciya generaciya = new Generaciya();
	
	//Use this if you need to do something in preInit stage of minecraft
	public static final void preInit() {
		
	}
	
	//Please use this function for add items, do not create crutch
	public static final void Init() {
		
		Workbench = new Workbench(null);
		GameRegistry.registerBlock(Workbench, "Workbench");
		
		Ryda = new Ryda(null);
		GameRegistry.registerBlock(Ryda, "Ryda");
		
		Kirka = new Kirka();
		GameRegistry.registerItem(Kirka, "Kirka");
		
		Kirka_Lopata = new Kirka_Lopata(null);
		GameRegistry.registerItem(Kirka_Lopata, "Kirka & Lopata");
		
		Universal = new Universal(null);
		GameRegistry.registerItem(Universal, "Universal Tolls");
		
		GameRegistry.registerWorldGenerator(generaciya, 0);
		
		
		MinecraftForge.EVENT_BUS.register(new Utils());	
		
		NetworkRegistry.INSTANCE.registerGuiHandler(SCT.instance, new GuiHandler());
	}
}
