package org.nixub86.SCT.Items;

import org.nixub86.SCT.RecipesSCT;
import org.nixub86.SCT.SCT;
import org.nixub86.SCT.Armor.Armor;
import org.nixub86.SCT.Blocks.BlockXyita;
import org.nixub86.SCT.Blocks.Bylishnik;
import org.nixub86.SCT.Blocks.Doski;
import org.nixub86.SCT.Blocks.Generaciya;
import org.nixub86.SCT.Blocks.Ryda;
import org.nixub86.SCT.Blocks.TriniumBlock;
import org.nixub86.SCT.Blocks.LushStone;
import org.nixub86.SCT.Blocks.TriniumWorkbench;
import org.nixub86.SCT.Cripy.Kellog;
import org.nixub86.SCT.Dimensions.Lush.BlockTP;
import org.nixub86.SCT.Dimensions.Lush.DimensionRegistry;
import org.nixub86.SCT.Dimensions.Lush.TP;
import org.nixub86.SCT.Dimensions.Lush.TPBlock;
import org.nixub86.SCT.Dimensions.Lush.WorldProviderLush;
import org.nixub86.SCT.Dimensions.Lush.Biom.BiomeRegistry;
import org.nixub86.SCT.Cripy.NormCrip;
import org.nixub86.SCT.Cripy.OpasniyCrip;
import org.nixub86.SCT.Gases.GasesSCT;
import org.nixub86.SCT.TriniumWorkbench.GuiHandler;
import org.nixub86.SCT.Utils.SaplingEvent;
import org.nixub86.SCT.Utils.Utils;
import org.nixub86.SCT.tree.Leaves;
import org.nixub86.SCT.tree.WorldGenTree;
import org.nixub86.SCT.tree.saplingBlock;
import org.nixub86.SCT.tree.stvolBlock;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFire;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockSapling;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
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
	public static ItemSword Sword;
	public static ItemSword SharpSword;
	
	public static Item triniumdust;
	public static Item triniumingot;
	
	public static Item Podarok;
	
	public static ItemArmor armorhelmet;
	public static ItemArmor armorplate;
	public static ItemArmor armorpants;
	public static ItemArmor armorboots;
	
	
	public static ItemFood Food;
	
	public static Block Ryda;
	public static Block TriniumWorkbench;
	public static Block doski;
	public static Block blockXyita;
	public static Block TriniumBlock;
	
	public static Block BlockTP;
	public static Block LushStone;
	public static Block byl;
	public static Block TPBlock;
	
	public static Block stvol;
	public static BlockLeaves leaves;
	public static BlockSapling sapl;
	
	public static Generaciya generaciya = new Generaciya();
	public static WorldGenTree GenTree = new WorldGenTree(false);
	
	//Use this if you need to do something in preInit stage of minecraft
	public static final void preInit() {}
	
	//Please use this function for add items, do not create crutch
	public static final void Init() 
	{
		armorhelmet = new Armor(0, 0);
		armorplate = new Armor(0, 1);
		armorpants = new Armor(0, 2);
		armorboots = new Armor(0, 3);
		
		GameRegistry.registerItem(armorhelmet, "armorhelmet");
		GameRegistry.registerItem(armorplate, "armorplate");
		GameRegistry.registerItem(armorpants, "armorpants");
		GameRegistry.registerItem(armorboots, "armorboots");
		
		triniumdust = new Item().setCreativeTab(ItemsSCT.SCTTab).setTextureName("triniumdust").setUnlocalizedName("Trinium dust");
		GameRegistry.registerItem(triniumdust, "triniumdust");
		
		triniumingot = new Item().setCreativeTab(ItemsSCT.SCTTab).setTextureName("triniumingot").setUnlocalizedName("Trinium Ingot");
		GameRegistry.registerItem(triniumingot, "triniumingot");
		
		Podarok = new Podarok();
		GameRegistry.registerItem(Podarok, "Podarok");
		
		Food = new Food(15,7, false);
		GameRegistry.registerItem(Food, "Food");
		
		
		leaves = new Leaves();
		GameRegistry.registerBlock(leaves, "leaves");
		
		sapl = new saplingBlock();
		GameRegistry.registerBlock(sapl, "sapl");
		
		stvol = new stvolBlock(null);
		GameRegistry.registerBlock(stvol, "stvol");
		
		
		doski = new Doski(null);
		GameRegistry.registerBlock(doski, "doski");
		
		byl = new Bylishnik(null);
		GameRegistry.registerBlock(byl, "Bylishnik");
		
		
		blockXyita = new BlockXyita(null);
		GameRegistry.registerBlock(blockXyita, "BlockXyita");
		
		LushStone = new LushStone(null);
		GameRegistry.registerBlock(LushStone, "LushStone");
		
		BlockTP = new BlockTP();
		GameRegistry.registerBlock(BlockTP, "BlockTP");
		
		TPBlock = new TPBlock(null);
		GameRegistry.registerBlock(TPBlock, "TPBlock");
		
		TriniumWorkbench = new TriniumWorkbench(null);
		GameRegistry.registerBlock(TriniumWorkbench, "Workbench");
		
		Ryda = new Ryda(null);
		GameRegistry.registerBlock(Ryda, "Ryda");
		
		TriniumBlock = new TriniumBlock(null);
		GameRegistry.registerBlock(TriniumBlock, "TriniumBlock");
		
		
		SharpSword = new SharpSword(null);
		GameRegistry.registerItem(SharpSword, "Sharp Sword");
		
		Sword = new Sword(null);
		GameRegistry.registerItem(Sword, "Sword");
		
		Kirka = new Kirka();
		GameRegistry.registerItem(Kirka, "Kirka");
		
		Kirka_Lopata = new Kirka_Lopata(null);
		GameRegistry.registerItem(Kirka_Lopata, "Kirka & Lopata");
		
		Universal = new Universal(null);
		GameRegistry.registerItem(Universal, "Universal Tolls");
		
		GameRegistry.registerWorldGenerator(generaciya, 0);
		GameRegistry.registerWorldGenerator(GenTree, 0);
		
		
		Utils.registerEvents();
		
		MinecraftForge.EVENT_BUS.register(new Utils());
		
		NetworkRegistry.INSTANCE.registerGuiHandler(SCT.instance, new GuiHandler());
		
		Kellog.mainRegistry();
		NormCrip.mainRegistry();
		OpasniyCrip.mainRegistry();
		DimensionRegistry.mainRegistry();
		BiomeRegistry.mainRegsitry();
	}
}
