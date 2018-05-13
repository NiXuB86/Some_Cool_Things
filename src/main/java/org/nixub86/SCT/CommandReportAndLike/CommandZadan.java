package org.nixub86.SCT.CommandReportAndLike;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.stats.StatList;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class CommandZadan extends Command{
	
	ArrayList<String> zadaniya;
	ArrayList<String> mob;
	
	private int colvo;
	private int ybito;
	private int randZad;
	private int randMob;
	
	private boolean chek;
	
	@Override
	public int compareTo(Object arg0) 
	{
		return 0;
	}

	@Override
	public String getCommandName() 
	{
		return nameCommandZadanie;
	}

	@Override
	public String getCommandUsage(ICommandSender p_71518_1_) 
	{
		return "/zadanie";
	}

	@Override
	public List getCommandAliases() {
		
		return this.ListCommand;
	}

	@Override
	public void processCommand(ICommandSender sender, String[] p_71515_2_) {
		
		
		EntityPlayerMP entityplayermp = getPlayer(sender, p_71515_2_[0]);
		String s = entityplayermp.getCommandSenderName();
		
		PlayerReport_Like pro = PlayerReport_Like.get(entityplayermp);
		
		
		zadaniya = new ArrayList<String>();
		mob = new ArrayList<String>();
		
		zadaniya.add("Убить"); //0
		
		
		mob.add("Зомби"); //0
		mob.add("Пауков"); //1
		mob.add("Скелетов"); //2
		
		//if(chek)
		//{
			//chek = false;
			
			colvo = (int) (Math.random() * 20 + 1);
			//randZad = (int) (Math.random() + 1);
			randMob = 0+ (int) (Math.random() * 3);
		
			pro.setZadanie(zadaniya.get(0), colvo , mob.get(randMob));	
			entityplayermp.addChatMessage(new ChatComponentTranslation(pro.drawZadanie()));
		
			
		//}
		
		//if(!chek) 
		//{
		//	entityplayermp.addChatMessage(new ChatComponentTranslation("Выполните предыдуще задание: " + pro.drawZadanie()));
		//}
		
		
		
	}
	
	public List addTabCompletionOptions(ICommandSender p_71516_1_, String[] p_71516_2_)
    {
        return (List) (p_71516_2_.length == 1 ? CommandBase.getListOfStringsMatchingLastWord(p_71516_2_, this.getPlayers()) : (p_71516_2_.length == 2));
    }

    private String[] getPlayers()
    {
        return MinecraftServer.getServer().getAllUsernames();
    }
	
	@Override
	public boolean canCommandSenderUseCommand(ICommandSender p_71519_1_) {
		return true;
	}
}
