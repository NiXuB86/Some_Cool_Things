package org.nixub86.SCT;

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
		GameRegistry.addSmelting(ItemsSCT.triniumdust, new ItemStack(ItemsSCT.triniumingot, 2), 1F);
		
		GameRegistry.addRecipe(new ItemStack(ItemsSCT.TriniumWorkbench, 1), 
		        new Object[]{ "IAI", "AIA", "IAI",
		        ('A'), ItemsSCT.doski, ('I'), ItemsSCT.triniumingot});
		
		GameRegistry.addRecipe(new ItemStack(ItemsSCT.TriniumBlock, 1), 
	    	    new Object[]{ "111", "111", "111",
	    	    ('1'), ItemsSCT.triniumingot});
		
		GameRegistry.addRecipe(new ItemStack(ItemsSCT.BlockTP, 1), 
	    	    new Object[]{ "121", "*1*", "121",
	    	    ('1'), ItemsSCT.TriniumBlock, ('2'), Blocks.glass, ('*'), Items.glowstone_dust});
		
		
	}
}
