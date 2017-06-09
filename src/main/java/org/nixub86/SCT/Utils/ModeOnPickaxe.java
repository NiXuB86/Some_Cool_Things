package org.nixub86.SCT.Utils;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ModeOnPickaxe extends ItemPickaxe{

	public ModeOnPickaxe(ToolMaterial material) {
		super(material.EMERALD);
		
	}

	private Set set;
	
	private static final Set Difoult = Sets.newHashSet(new Block[] {Blocks.cobblestone, Blocks.double_stone_slab, Blocks.stone_slab, Blocks.stone, Blocks.sandstone, Blocks.mossy_cobblestone, 
    		Blocks.iron_ore, Blocks.iron_block, Blocks.coal_ore, Blocks.gold_block, Blocks.gold_ore, Blocks.diamond_ore, 
    		Blocks.diamond_block, Blocks.ice, Blocks.netherrack, Blocks.lapis_ore, Blocks.lapis_block, Blocks.redstone_ore, 
    		Blocks.lit_redstone_ore, Blocks.rail, Blocks.detector_rail, Blocks.golden_rail, 
    		Blocks.activator_rail});

	private static final Set Pickaxe = Sets.newHashSet(new Block[] {Blocks.cobblestone, Blocks.double_stone_slab, Blocks.stone_slab, Blocks.stone, Blocks.sandstone, Blocks.mossy_cobblestone, 
    		Blocks.iron_ore, Blocks.iron_block, Blocks.coal_ore, Blocks.gold_block, Blocks.gold_ore, Blocks.diamond_ore, 
    		Blocks.diamond_block, Blocks.ice, Blocks.netherrack, Blocks.lapis_ore, Blocks.lapis_block, Blocks.redstone_ore, 
    		Blocks.lit_redstone_ore, Blocks.rail, Blocks.detector_rail, Blocks.golden_rail, 
    		Blocks.activator_rail});
	
	private static final Set Shovel = Sets.newHashSet(new Block[] {Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, 
		    Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, 
		    Blocks.soul_sand, Blocks.mycelium});
	
	public static Set getDifoult(){
		return Difoult;
	}
	
	public static Set setPickaxeMode(){
		return Pickaxe;
	}
	
	public Set setShovelMode(){
		return Shovel;
	}
	
	@Override
	   public boolean func_150897_b(Block block) 
	   {
		if(Pickaxe instanceof Set)
	       return Pickaxe.contains(block) ? true : super.func_150897_b(block);
		else if(Shovel instanceof Set)
			return Shovel.contains(block) ? true : super.func_150897_b(block);
		return true;
	   }
	   
	   @Override
	   public float func_150893_a(ItemStack stack, Block block) 
	   {
		   if(Pickaxe instanceof Set)
		       return Pickaxe.contains(block) ? this.efficiencyOnProperMaterial : super.func_150893_a(stack, block);
		   else if(Shovel instanceof Set)
			   return  Shovel.contains(block) ? this.efficiencyOnProperMaterial : super.func_150893_a(stack, block);
		   return 1;
	   }
}
