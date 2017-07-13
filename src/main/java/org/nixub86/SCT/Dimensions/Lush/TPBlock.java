package org.nixub86.SCT.Dimensions.Lush;

import org.nixub86.SCT.Items.ItemsSCT;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

public class TPBlock extends Block {
	
	public TPBlock(Material material) {
		super(material.rock);
		
		this.setBlockName("TPBlock");
		this.setCreativeTab(ItemsSCT.SCTTab);
		this.setBlockTextureName("");
		this.setHardness(5f);
		this.setResistance(10F);
		this.setHarvestLevel("pickaxe", 2);
		
	}
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
		if(player.riddenByEntity == null && player instanceof EntityPlayerMP){
			EntityPlayerMP thePlayer = (EntityPlayerMP) player;
			
			MinecraftServer server = MinecraftServer.getServer();
			if(player instanceof EntityPlayerMP){
				if(thePlayer.dimension != DimensionRegistry.LushId){
					thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, DimensionRegistry.LushId, new TP(server.worldServerForDimension(DimensionRegistry.LushId)));
				}else{
					thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 0, new TP(server.worldServerForDimension(0)));
				}
				
			}
			
		}
		return true;
	}
	
}
