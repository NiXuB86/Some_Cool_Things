package org.nixub86.SCT.Worckbench;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler{

	public static final int id = 0;
	
	 @Override
	    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	        if (ID == id)
	            return new ContainerWorckbench(player.inventory, world, x, y, z);

	        return null;
	    }

	    @Override
	    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	        if (ID == id)
	            return new GuiWorckbench(player.inventory, world, x, y, z);

	        return null;
	    }

}
