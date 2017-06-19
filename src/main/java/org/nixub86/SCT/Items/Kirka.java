package org.nixub86.SCT.Items;

import org.nixub86.SCT.SCT;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Kirka extends ItemPickaxe{

	private boolean Mod5x5;
	
	protected Kirka() {
		super(SCT.Trinium);
		
		this.setCreativeTab(ItemsSCT.SCTTab);
		this.setNoRepair();
		this.setUnlocalizedName("Kirka");
		this.setTextureName("sct:Kirka");
	}
	
	public void onCreated(ItemStack itemstack, World world, EntityPlayer player)
	{}

	   @Override
	   public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float px, float py, float pz) {
	        for (int ix = -1; ix < 2; ix++) {
	            for (int iy = -1; iy < 2; iy++) {
	                for (int iz = -1; iz < 2; iz++) {
	                    world.func_147480_a(x+ix, y+iy, z+iz, true);
	                }
	            }
	        }
	        return true;
	 }
} 

