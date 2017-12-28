package org.nixub86.SCT.CommandReportAndLike;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

public class MessageReport extends Command implements IMessage{

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

	public static class Handler implements IMessageHandler<MessageReport, IMessage> {

		@Override
		public IMessage onMessage(MessageReport packet, MessageContext context) {
	
			int Report = packet.Report;
			EntityPlayer player = Minecraft.getMinecraft().thePlayer;
	
			PlayerReport_Like.get(player).getReport();
			return null;
		}

	}

	
}
