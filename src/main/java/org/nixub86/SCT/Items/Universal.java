package org.nixub86.SCT.Items;

import java.util.Set;

import org.nixub86.SCT.Utils.Utils;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import scala.swing.event.Key;

public class Universal extends ItemPickaxe {

	public static boolean plavka;
	
	protected Universal(ToolMaterial material) {
		super(material.EMERALD);
		
		this.setCreativeTab(ItemsSCT.SCTTab);
		this.setNoRepair();
		this.setTextureName("sct:Universal");
		this.setUnlocalizedName("Universal");
		
		plavka = false;
		
	}
	
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float px, float py, float pz) {
		if(plavka=false){
			plavka = true;
		}
		if(plavka=true){
			plavka = false;
		}
		
		
		return true;
	}
}
