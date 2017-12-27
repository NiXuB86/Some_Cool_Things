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
		
		Karma -= 2;
		System.out.println(Karma);
		
		if(sender instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer) sender;
			
			if(Karma > 10){
				player.addChatMessage(new ChatComponentTranslation("10"));
			}
		
			if(Karma < 0){
				player.addChatMessage(new ChatComponentTranslation("Киньте этому дауну побольше репортов, пожалуйста" + ": " + Karma));
			}
		}
	}
	
	@Override
	public boolean canCommandSenderUseCommand(ICommandSender p_71519_1_) {
		return true;
	}
}
