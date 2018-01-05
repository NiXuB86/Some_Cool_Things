package org.nixub86.SCT.CommandReportAndLike;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

public class MessageReport implements IMessage{

    private int Report;
	
	public MessageReport() {}
	
	public MessageReport(int report) 
	{
		this.Report = report;
	}
	
	@Override
	public void fromBytes(ByteBuf buf) 
	{
		buf.writeInt(Report);
	}

	@Override
	public void toBytes(ByteBuf buf) 
	{
		this.Report = buf.readInt();
	}

	   public static class Handler extends MessageHandler.Client<PacketSyncMana> {
	        @Override
	        public IMessage handleClientMessage(final EntityPlayer player, final PacketSyncMana msg, MessageContext ctx) {
	           
	        	
	        	
	        	
	        	
	        	
	        	ClientUtils.addScheduledTask(new Runnable() {
	                @Override
	                public void run() {
	                    PlayerData.get(player).setMana(msg.mana);
	                }
	            });
	            return null;
	        }
	    }
	}
