package org.nixub86.SCT.Utils.Network;

import java.io.IOException;

import org.nixub86.SCT.SCT;
import org.nixub86.SCT.CommandReportAndLike.PlayerReport_Like;
import org.nixub86.SCT.Utils.Network.AbstractMessage.AbstractClientMessage;

import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;

public class SyncPlayerPropsMessage extends AbstractClientMessage<SyncPlayerPropsMessage>
{
	
	private NBTTagCompound data;

	public SyncPlayerPropsMessage() {}

	public SyncPlayerPropsMessage(EntityPlayer player) {
		
		data = new NBTTagCompound();
		PlayerReport_Like.get(player).saveNBTData(data);
	}

	@Override
	protected void read(PacketBuffer buffer) throws IOException {
		data = buffer.readNBTTagCompoundFromBuffer();
	}

	@Override
	protected void write(PacketBuffer buffer) throws IOException {
		buffer.writeNBTTagCompoundToBuffer(data);
	}

	@Override
	public void process(EntityPlayer player, Side side) {
		SCT.logger.info("Synchronizing extended properties data on CLIENT");
		PlayerReport_Like.get(player).loadNBTData(data);
	}
}