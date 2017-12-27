package org.nixub86.SCT.CommandReportAndLike;

import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentTranslation;

public class Info extends Command
{
	@Override
	public String getCommandName() {
		return nameCommnadInfo;
	}

	@Override
	public String getCommandUsage(ICommandSender p_71518_1_) {
		
		return "/information";
	}
	
	@Override
	public void processCommand(ICommandSender sender, String[] p_71515_2_) {
		
		if(sender instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer) sender;
		
			player.addChatMessage(new ChatComponentTranslation("Like: " + Like + " " + "Report: " + Report + " " + "Reputation: " + Repytachiya));
		}
	}
}
