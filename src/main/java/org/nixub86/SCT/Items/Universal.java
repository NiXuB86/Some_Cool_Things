package org.nixub86.SCT.Items;

import java.util.Set;

import org.nixub86.SCT.Utils.Utils;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import scala.swing.event.Key;

public class Universal extends ItemPickaxe {

	public static boolean plavka;
	
	protected Universal(ToolMaterial material) {
		super(material.EMERALD);
		
		this.setCreativeTab(ItemsSCT.SCTTab);
		this.setNoRepair();
		this.setTextureName("sct:Universal");
		this.setUnlocalizedName("Universal");
		
		plavka = true;
		
	}
}
