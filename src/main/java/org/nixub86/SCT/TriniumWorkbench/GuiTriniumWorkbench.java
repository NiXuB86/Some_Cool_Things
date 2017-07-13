package org.nixub86.SCT.TriniumWorkbench;

import org.lwjgl.opengl.GL11;
import org.nixub86.SCT.SCT;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class GuiTriniumWorkbench extends GuiContainer
{
	private static final ResourceLocation TextureWorkbench = new ResourceLocation("sct:textures/gui/GuiTriniumWorkbench.png");
	 
    public GuiTriniumWorkbench(InventoryPlayer inventory, World world, int par3, int par4, int par5)
    {
        super(new ContainerTriniumWorkbench(inventory, world, par3, par4, par5));
    }
 
    protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, this.ySize - 94, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		 GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	        this.mc.getTextureManager().bindTexture(TextureWorkbench);
	        int k = (this.width - this.xSize) / 2;
	        int l = (this.height - this.ySize) / 2;
	        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
	        int i1;
	}

}

