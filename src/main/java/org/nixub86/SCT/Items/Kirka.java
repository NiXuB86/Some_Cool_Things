package org.nixub86.SCT.Items;

import org.nixub86.SCT.SCT;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Kirka extends ItemPickaxe{

	private boolean Mod5x5;
	
	protected Kirka() {
		super(ToolMaterial.EMERALD);
		
		this.setCreativeTab(ItemsSCT.SCTTab);
		this.setNoRepair();
		this.setUnlocalizedName("Kirka");
		this.setTextureName("sct:Kirka");
	}
	
	public void onCreated(ItemStack itemstack, World world, EntityPlayer player)
	{}

	@Override
	   public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float px, float py, float pz) {
		world.func_147480_a(x , y , z , true);
		world.func_147480_a(x+3 , y , z , true);
		world.func_147480_a(x , y+3, z , true);
		world.func_147480_a(x , y , z+3 , true);
		/*world.func_147480_a(x+2 , y , z , true);
		world.func_147480_a(x , y+2 , z , true);
		world.func_147480_a(x , y , z+2 , true);*/
		return true;
	}
}    

