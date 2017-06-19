package org.nixub86.SCT.TriniumWorkbench;

import org.nixub86.SCT.XyitaDlyUpgrate.CotainerXyita;
import org.nixub86.SCT.XyitaDlyUpgrate.GuiXyita;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler{

	public static final int id = 0;
	public static final int idXyita = 1;
	
	 @Override
	    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	        if (ID == id)
	            return new ContainerTriniumWorkbench(player.inventory, world, x, y, z);
	        else
	        	if(ID == idXyita)
	        		return new CotainerXyita(player.inventory, world, x, y, z);
	        
	        return null;
	    }

	    @Override
	    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	        if (ID == id)
	            return new GuiTriniumWorkbench(player.inventory, world, x, y, z);
	        else
	        	if(ID == idXyita)
	        		return new GuiXyita(player.inventory, world, x, y, z);

	        return null;
	    }

}
