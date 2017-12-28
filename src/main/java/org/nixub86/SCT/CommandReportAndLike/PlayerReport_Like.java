package org.nixub86.SCT.CommandReportAndLike;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class PlayerReport_Like extends Command implements IExtendedEntityProperties {

	public final static String TagReport = "TegReport";
	
	public static void reg(EntityPlayer player)
	{
		player.registerExtendedProperties("SystemReport", new PlayerReport_Like());
	}
	
	public static PlayerReport_Like get(EntityPlayer player) 
	{
		return (PlayerReport_Like)player.getExtendedProperties("SystemReport");
	}

	
	@Override
	public void saveNBTData(NBTTagCompound compound) 
	{
		NBTTagCompound tag = new NBTTagCompound();
		
		compound.setInteger("rep", Report);
		tag.setTag(TagReport, compound);
		
	}

	@Override
	public void loadNBTData(NBTTagCompound compound) 
	{
		NBTTagCompound nbt_tag = (NBTTagCompound)compound.getTag(TagReport);
		
		Report = nbt_tag.getInteger("rep");
	}

	@Override
	public void init(Entity entity, World world) 
	{
		Report = 0;
		Like = 0;
	}
	
	public static Integer getReport()
	{
		return Report;
	}

}
