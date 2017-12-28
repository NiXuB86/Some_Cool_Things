package org.nixub86.SCT.CommandReportAndLike;

import java.util.List;
import java.util.UUID;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentTranslation;

public class CommandLike extends Command
{
	@Override
	public int compareTo(Object arg0) {
		return 0;
	}

	@Override
	public String getCommandName() {
		return nameCommnadLike;
	}

	@Override
	public String getCommandUsage(ICommandSender p_71518_1_) {
		
		return "/like";
	}
	
	@Override
	public List getCommandAliases() {
		
		return this.ListCommand;
	}
	
	@Override
	public void processCommand(ICommandSender sender, String[] p_71515_2_) 
	{
	
		EntityPlayerMP entityplayermp = getPlayer(sender, p_71515_2_[0]);
		
		String s = entityplayermp.getCommandSenderName();
		
		if(s == null)
		{
			entityplayermp.addChatMessage(new ChatComponentTranslation("Ник"));
		}else
		{
			Like += 1;
			System.out.println(Like);
		}
		
		entityplayermp.addChatMessage(new ChatComponentTranslation("Игноку"  + " " + s + " " + "поставили  лайк"));
		entityplayermp.addChatMessage(new ChatComponentTranslation("У игрока" + " " + s + " " + Like + " " + "лайков"));
	}
	
	public List addTabCompletionOptions(ICommandSender p_71516_1_, String[] p_71516_2_)
    {
        return (List) (p_71516_2_.length == 1 ? CommandBase.getListOfStringsMatchingLastWord(p_71516_2_, this.getPlayers()) : (p_71516_2_.length == 2));
    }

    private String[] getPlayers()
    {
        return MinecraftServer.getServer().getAllUsernames();
    }
	
	}
