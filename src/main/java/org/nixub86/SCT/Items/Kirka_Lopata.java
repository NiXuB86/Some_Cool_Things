package org.nixub86.SCT.Items;

import java.util.Set;

import org.lwjgl.input.Keyboard;

import com.google.common.collect.Sets;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import scala.swing.event.Key;
//import net.minecraft.client.settings.KeyBinding;

public class Kirka_Lopata extends ItemPickaxe {

    private static final Set ChtoBydetLomat = Sets.newHashSet(new Block[] {Blocks.cobblestone, Blocks.double_stone_slab, Blocks.stone_slab, Blocks.stone, Blocks.sandstone, Blocks.mossy_cobblestone, 
    		Blocks.iron_ore, Blocks.iron_block, Blocks.coal_ore, Blocks.gold_block, Blocks.gold_ore, Blocks.diamond_ore, 
    		Blocks.diamond_block, Blocks.ice, Blocks.netherrack, Blocks.lapis_ore, Blocks.lapis_block, Blocks.redstone_ore, 
    		Blocks.lit_redstone_ore, Blocks.rail, Blocks.detector_rail, Blocks.golden_rail, 
    		Blocks.activator_rail, Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, 
		    Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, 
		    Blocks.soul_sand, Blocks.mycelium});

    
    
	protected Kirka_Lopata(ToolMaterial material) {
		super(material.EMERALD);
		
		this.setCreativeTab(ItemsSCT.SCTTab);
		this.setNoRepair();
		this.setTextureName("sct:Kirka_Lopata");
		this.setUnlocalizedName("Kirka & Lopata");
		
	}
		
	/*@SubscribeEvent
	public void onKeyDown(InputEvent.KeyInputEvent event) 
	{
		
	}*/
	
	   @Override
	   public boolean func_150897_b(Block block) 
	   {
	       return ChtoBydetLomat.contains(block) ? true : super.func_150897_b(block);
	   }
	   

	   @Override
	   public float func_150893_a(ItemStack stack, Block block) 
	   {
	     return ChtoBydetLomat.contains(block) ? this.efficiencyOnProperMaterial : super.func_150893_a(stack, block);
	   }
}
