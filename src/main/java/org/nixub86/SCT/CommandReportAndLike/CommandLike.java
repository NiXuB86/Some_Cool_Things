package org.nixub86.SCT.CommandReportAndLike;

import java.util.List;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
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
		Like += 1;
		System.out.println(Like);
		
		if(sender instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer) sender;
			
			player.addChatMessage(new ChatComponentTranslation("Like: " + Like));
			}
		}
	}
