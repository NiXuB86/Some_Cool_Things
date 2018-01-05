package org.nixub86.SCT.CommandReportAndLike;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.PlayerNotFoundException;
import net.minecraft.command.PlayerSelector;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

public class CommandReport extends Command{
    
	
	@Override
	public int compareTo(Object arg0) {
		return 0;
	}

	@Override
	public String getCommandName() {
		return nameCommandReport;
	}

	@Override
	public String getCommandUsage(ICommandSender p_71518_1_) {
		
		return "/rep";
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
		
		
		if(pro.getReport() >= 0)
		{
			pro.addReport(1);
			System.out.println("<0");
			
			entityplayermp.addChatMessage(new ChatComponentTranslation("Игроку"  + " " + s + " " + pro.getReport() + " " + "кинули репорт"));
			//entityplayermp.addChatMessage(new ChatComponentTranslation("У игрока" + " " + s + " "  + " " + pro.getReport() + " " + "репортов"));
		}
		
		 if(pro.getReport() >= pro.getMaxReport())
		{
			entityplayermp.addChatMessage(new ChatComponentTranslation(pro.getReport() + "репортов"));

			pro.resetAll();
			
			entityplayermp.setHealth(0);
			
			System.out.println("[[eqwqeqwesadsad");
			
		}
		
		
		/*if(s == null)
		{
			entityplayermp.addChatMessage(new ChatComponentTranslation(":ы " + report));
			
		}else
		{
			report += 1;
			System.out.println(report);
			entityplayermp.addChatMessage(new ChatComponentTranslation(": " + report));
			
			System.out.println(PlayerReport_Like.getReport() + "sadasdsdasd");
		
		}*/
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
