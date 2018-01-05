package org.nixub86.SCT.CommandReportAndLike;

import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentTranslation;


public class Info extends Command
{
	//public static int like, report;
	public static int rep;
	
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
		
			EntityPlayerMP entityplayermp = getPlayer(sender, p_71515_2_[0]);
			String s = entityplayermp.getCommandSenderName();
			
			PlayerReport_Like pro = PlayerReport_Like.get(entityplayermp);
			
			rep = pro.getLike() - pro.getReport();
			
			entityplayermp.addChatMessage(new ChatComponentTranslation("У " + s + " " + "репортов " + pro.getReport() + " " + ", лайков " + pro.getLike() + ", Репутация " + rep));

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
