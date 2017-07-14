package org.nixub86.SCT.Blocks;

import org.nixub86.SCT.Dimensions.Lush.BlockTP;
import org.nixub86.SCT.Dimensions.Lush.TPBlock;
import org.nixub86.SCT.trees.Gesh.GeshLeaves;
import org.nixub86.SCT.trees.Gesh.GeshSaplingBlock;
import org.nixub86.SCT.trees.Gesh.GeshWoodBlock;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockSapling;

public class BlocksSCT {
	public static Block TriniumOre;
	public static Block TriniumWorkbench;
	public static Block GeshPlanks;
	public static Block blockXyita;
	public static Block TriniumBlock;
	
	public static Block BlockTP;
	public static Block LushStone;
	public static Block LushCobblestone;
	public static Block TPBlock;
	
	public static Block GeshWood;
	public static BlockLeaves GeshLeaves;
	public static BlockSapling GeshSapling;
	
	public static Block SuperTNT;
	
	public static final void Init() {
		
		SuperTNT = new SuperTNT();
		GameRegistry.registerBlock(SuperTNT, "SuperTNT");
		
		GeshLeaves = new GeshLeaves();
		GameRegistry.registerBlock(GeshLeaves, "GeshLeaves");
		
		GeshSapling = new GeshSaplingBlock();
		GameRegistry.registerBlock(GeshSapling, "GeshSapling");
		
		GeshWood = new GeshWoodBlock(null);
		GameRegistry.registerBlock(GeshWood, "GeshWood");
		
		
		GeshPlanks = new GeshPlanks(null);
		GameRegistry.registerBlock(GeshPlanks, "GeshPlanks");
		
		LushCobblestone = new LushCobblestone(null);
		GameRegistry.registerBlock(LushCobblestone, "LushCobblestone");
		
		
		blockXyita = new BlockXyita(null);
		GameRegistry.registerBlock(blockXyita, "BlockXyita");
		
		LushStone = new LushStone(null);
		GameRegistry.registerBlock(LushStone, "LushStone");
		
		BlockTP = new BlockTP();
		GameRegistry.registerBlock(BlockTP, "BlockTP");
		
		TPBlock = new TPBlock(null);
		GameRegistry.registerBlock(TPBlock, "TPBlock");
		
		TriniumWorkbench = new TriniumWorkbench(null);
		GameRegistry.registerBlock(TriniumWorkbench, "TriniumWorkbench");
		
		TriniumOre = new TriniumOre(null);
		GameRegistry.registerBlock(TriniumOre, "TriniumOre");
		
		TriniumBlock = new TriniumBlock(null);
		GameRegistry.registerBlock(TriniumBlock, "TriniumBlock");
	}
}
