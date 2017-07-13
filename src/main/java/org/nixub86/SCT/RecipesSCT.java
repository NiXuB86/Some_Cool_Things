package org.nixub86.SCT;

import org.nixub86.SCT.Blocks.BlocksSCT;
import org.nixub86.SCT.Items.ItemsSCT;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import org.nixub86.SCT.Items.ItemsSCT;

public class RecipesSCT {
	
	public static final void Init() 
	{
		GameRegistry.addSmelting(ItemsSCT.triniumdust, new ItemStack(ItemsSCT.triniumingot, 1), 1F);
		GameRegistry.addSmelting(BlocksSCT.TriniumOre, new ItemStack(ItemsSCT.triniumingot, 1), 1F);
		
		GameRegistry.addRecipe(new ItemStack(BlocksSCT.TriniumWorkbench, 1), 
		        new Object[]{ "IAI", "AIA", "IAI",
		        ('A'), BlocksSCT.GeshPlanks, ('I'), ItemsSCT.triniumingot});
		
		GameRegistry.addRecipe(new ItemStack(BlocksSCT.TriniumBlock, 1), 
	    	    new Object[]{ "111", "111", "111",
	    	    ('1'), ItemsSCT.triniumingot});
		
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksSCT.GeshPlanks, 4), new Object[] {BlocksSCT.GeshWood});
		
		/*GameRegistry.addRecipe(new ItemStack(ItemsSCT.BlockTP, 1), 
	    	    new Object[]{ "121", "*1*", "121",
	    	    ('1'), ItemsSCT.TriniumBlock, ('2'), Blocks.glass, ('*'), Items.glowstone_dust});
		*/
		
	}
}
