package org.nixub86.SCT.CommandReportAndLike;

import org.nixub86.SCT.network.PacketDispatcher;
import org.nixub86.SCT.network.SyncPlayerPropsMessage;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class PlayerReport_Like extends Command implements IExtendedEntityProperties {

	public final static String TagReport = "TegReport";
	
	private final EntityPlayer player;
	private int currentReport, maxReport;
	
	private int currentLike, maxLike;
	
	private String zadanie = null;
	private String ZadMob = null;
	private int ZadCol = 0; 
	
	
	
	public PlayerReport_Like(EntityPlayer player)
	{
		this.player = player;
		this.currentReport = 0;
		this.maxReport = 10;
		
		this.currentLike = 0;
		this.maxLike = 20;
	
		this.zadanie = null;
		this.ZadMob = null;
		this.ZadCol = 0;
	}
	
	public static void reg(EntityPlayer player)
	{
		player.registerExtendedProperties(TagReport, new PlayerReport_Like(player));
	}
	
	public static PlayerReport_Like get(EntityPlayer player) 
	{
		return (PlayerReport_Like)player.getExtendedProperties(TagReport);
	}
	
	@Override
	public void saveNBTData(NBTTagCompound compound) 
	{
		NBTTagCompound tag = new NBTTagCompound();
		
		tag.setInteger("CurrentReport", currentReport);
		tag.setInteger("MaxReport", maxReport);
		
		tag.setInteger("CurrentLike", currentLike);
		tag.setInteger("MaxLike", maxLike);
		
		tag.setString("zadanie", zadanie);
		tag.setString("ZadMob", ZadMob);
		tag.setInteger("ZadCol", ZadCol);
		
		compound.setTag(TagReport, tag);
		
	}

	@Override
	public void loadNBTData(NBTTagCompound compound) 
	{
		NBTTagCompound nbt_tag = (NBTTagCompound)compound.getTag(TagReport);
		

		this.currentReport = nbt_tag.getInteger("CurrentReport");
		this.maxReport = nbt_tag.getInteger("MaxReport");

		this.currentLike = nbt_tag.getInteger("CurrentLike");
		this.maxLike = nbt_tag.getInteger("MaxLike");
		
		this.zadanie = nbt_tag.getString("zadanie");
		this.ZadMob = nbt_tag.getString("ZadMob");
		this.ZadCol = nbt_tag.getInteger("ZadCol");

		
		System.out.println("NBT: " + this.currentReport + "/" + this.maxReport);
		System.out.println("NBT: " + this.currentLike + "/" + this.maxLike);
	}
	
	public void setZadanie(String zadanie1,int col ,String mob) 
	{
		zadanie = zadanie1;
		ZadCol = col;
		ZadMob = mob;
		
	}
	
	public String drawZadanie() 
	{
		String allZad;
		allZad = zadanie + " " + ZadCol + " " + ZadMob;
		
		return allZad;
	}
	
	public void replenishReport()
	{
		this.currentReport = 0;
	}
	
	@Override
	public void init(Entity entity, World world) 
	{
		
	}
	
	public Integer getMaxReport()
	{
		return this.maxReport;
	}
	
	public Integer getReport()
	{
		return this.currentReport;
		
	}
	
	public Integer addReport(int report)
	{
		return currentReport += report;
	}
	
	public void resetReport()
	{
		this.currentReport = 0;
		this.maxReport = 10;
	}
	
	public Integer getMaxLike()
	{
		return this.maxLike;
	}
	
	public Integer getLike()
	{
		return this.currentLike;
	}
	
	public Integer addLike(int like)
	{
		return this.currentLike += like;
		
	}
	
	public void resetLike()
	{
		this.currentLike = 0;
		this.maxLike = 20;
	}
	
	public void resetAll()
	{
		this.currentLike = 0;
		this.maxLike = 20;
		
		this.currentReport = 0;
		this.maxReport = 10;
	}

}
