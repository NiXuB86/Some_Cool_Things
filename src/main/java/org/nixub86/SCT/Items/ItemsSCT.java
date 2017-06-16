package org.nixub86.SCT.Items;

import org.nixub86.SCT.RecipesSCT;
import org.nixub86.SCT.SCT;
import org.nixub86.SCT.Blocks.Doski;
import org.nixub86.SCT.Blocks.Generaciya;
import org.nixub86.SCT.Blocks.Ryda;
import org.nixub86.SCT.Blocks.Workbench;
import org.nixub86.SCT.Dimension.BlockTP;
import org.nixub86.SCT.Dimension.DimensionRegistry;
import org.nixub86.SCT.Dimension.TP;
import org.nixub86.SCT.Dimension.WorldProviderMira;
import org.nixub86.SCT.Dimension.Biom.BiomeRegistry;
import org.nixub86.SCT.Gases.GasesSCT;
import org.nixub86.SCT.Utils.SaplingEvent;
import org.nixub86.SCT.Utils.Utils;
import org.nixub86.SCT.Worckbench.GuiHandler;
import org.nixub86.SCT.tree.Leaves;
import org.nixub86.SCT.tree.WorldGenTree;
import org.nixub86.SCT.tree.saplingBlock;
import org.nixub86.SCT.tree.stvolBlock;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockSapling;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.DimensionManager;
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
	public static Block doski;
	
	public static Block Tp;
	public static Block BlockTP;
	
	public static Block stvol;
	public static BlockLeaves leaves;
	public static BlockSapling sapl;
	
	public static Generaciya generaciya = new Generaciya();
	public static WorldGenTree GenTree = new WorldGenTree(false);
	
	//Use this if you need to do something in preInit stage of minecraft
	public static final void preInit() {
		
	}
	
	//Please use this function for add items, do not create crutch
	public static final void Init() 
	{
		leaves = new Leaves();
		GameRegistry.registerBlock(leaves, "leaves");
		
		sapl = new saplingBlock();
		GameRegistry.registerBlock(sapl, "sapl");
		
		stvol = new stvolBlock(null);
		GameRegistry.registerBlock(stvol, "stvol");
		
		
		doski = new Doski(null);
		GameRegistry.registerBlock(doski, "doski");
		
		
		
		BlockTP = new BlockTP();
		GameRegistry.registerBlock(BlockTP, "BlockTP");
		
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
		GameRegistry.registerWorldGenerator(GenTree, 0);
		
		
		GameRegistry.addRecipe(new ItemStack(Workbench, 1), 
        new Object[]{ "AA", "AA",
        ('A'), doski});
		
		
		Utils.registerEvents();
		
		MinecraftForge.EVENT_BUS.register(new Utils());
		
		NetworkRegistry.INSTANCE.registerGuiHandler(SCT.instance, new GuiHandler());
		
		
		DimensionRegistry.mainRegistry();
		BiomeRegistry.mainRegsitry();
		RecipesSCT.Init();
	}
}
