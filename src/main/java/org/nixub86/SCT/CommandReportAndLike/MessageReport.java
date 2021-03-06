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

    private static int Report;
    private static int Like;
    private static int Reputation;
	
	public MessageReport() {}
	
	public MessageReport(int report, int like) 
	{
		this.Report = report;
		this.Like = like;

		Reputation = (int)report/like;
		
	}
	
	@Override
	public void fromBytes(ByteBuf buf) 
	{
		buf.writeInt(Report);
		buf.writeInt(Like);
	}

	@Override
	public void toBytes(ByteBuf buf) 
	{
		this.Report = buf.readInt();
		this.Like = buf.readInt();
	}

	//----------------------------------------------------------------------------------
	
	public static class Handler implements IMessageHandler<MessageReport, IMessage> {
		@SideOnly(Side.CLIENT)
        @Override
        public IMessage onMessage(MessageReport packet, MessageContext ctx) 
        {
            int report, like;
            report = packet.Report;
            like = packet.Like;
            
            EntityPlayer player = Minecraft.getMinecraft().thePlayer;
            
            PlayerReport_Like getplayer = PlayerReport_Like.get(player);
            
            getplayer.addLike(like);
            getplayer.addReport(report);
        	
            System.out.println("�����: " + report + "/" + like);
            
        	return null; 
        }
	}
}
