package org.nixub86.SCT.CommandReportAndLike;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
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
		
		Report -= 2;
		System.out.println(Report);
		
		if(sender instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer) sender;
		
			player.addChatMessage(new ChatComponentTranslation(": " + Report));
			
			if(Report < 0){
				player.addChatMessage(new ChatComponentTranslation("Киньте этому дауну побольше репортов, пожалуйста" + ": " + Report));

			}
		}
	}
	
	@Override
	public boolean canCommandSenderUseCommand(ICommandSender p_71519_1_) {
		return true;
	}
}
