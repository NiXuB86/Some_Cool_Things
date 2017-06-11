package org.nixub86.SCT.Worckbench;

import org.nixub86.SCT.Items.ItemsSCT;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.world.World;

public class ContainerWorckbench extends Container{

	public InventoryCrafting craftMatrix = new InventoryCrafting(this, 3, 3);
    public IInventory craftResult = new InventoryCraftResult();
    private World worldObj;
    private int posX;
    private int posY;
    private int posZ;
 
    public ContainerWorckbench(InventoryPlayer inventory, World world, int par3, int par4, int par5)
    {
        this.worldObj = world;
        this.posX = par3;
        this.posY = par4;
        this.posZ = par5;
        this.addSlotToContainer(new SlotCrafting(inventory.player, this.craftMatrix, this.craftResult, 0, 124, 35));
        int l;
        int i1;
 
        for (l = 0; l < 3; ++l)
        {
            for (i1 = 0; i1 < 3; ++i1)
            {
                this.addSlotToContainer(new Slot(this.craftMatrix, i1 + l * 3, 30 + i1 * 18, 17 + l * 18));
            }
        }
 
        for (l = 0; l < 3; ++l)
        {
            for (i1 = 0; i1 < 9; ++i1)
            {
                this.addSlotToContainer(new Slot(inventory, i1 + l * 9 + 9, 8 + i1 * 18, 84 + l * 18));
            }
        }
 
        for (l = 0; l < 9; ++l)
        {
            this.addSlotToContainer(new Slot(inventory, l, 8 + l * 18, 142));
        }
 
        this.onCraftMatrixChanged(this.craftMatrix);
    }
 
    
    public void onCraftMatrixChanged(IInventory inventory)
    {
        this.craftResult.setInventorySlotContents(0, CraftyWorckbench.getInstance().findMatchingRecipe(this.craftMatrix, this.worldObj));
    }
 
    
    public void onContainerClosed(EntityPlayer entity)
    {
        super.onContainerClosed(entity);
 
        if (!this.worldObj.isRemote)
        {
            for (int i = 0; i < 9; ++i)
            {
                ItemStack itemstack = this.craftMatrix.getStackInSlotOnClosing(i);
 
                if (itemstack != null)
                {
                    entity.dropPlayerItemWithRandomChoice(itemstack, false);
                }
            }
        }
    }
 
    public boolean canInteractWith(EntityPlayer entity)
    {
        return this.worldObj.getBlock(this.posX, this.posY, this.posZ) != ItemsSCT.Workbench? false : entity.getDistanceSq((double)this.posX + 0.5D, (double)this.posY + 0.5D, (double)this.posZ + 0.5D) <= 64.0D;
    }
 
    
    public ItemStack transferStackInSlot(EntityPlayer entity, int par2)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(par2);
 
        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();
 
            if (par2 == 0)
            {
                if (!this.mergeItemStack(itemstack1, 10, 46, true))
                {
                    return null;
                }
 
                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (par2 >= 10 && par2 < 37)
            {
                if (!this.mergeItemStack(itemstack1, 37, 46, false))
                {
                    return null;
                }
            }
            else if (par2 >= 37 && par2 < 46)
            {
                if (!this.mergeItemStack(itemstack1, 10, 37, false))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 10, 46, false))
            {
                return null;
            }
 
            if (itemstack1.stackSize == 0)
            {
                slot.putStack((ItemStack)null);
            }
            else
            {
                slot.onSlotChanged();
            }
 
            if (itemstack1.stackSize == itemstack.stackSize)
            {
                return null;
            }
 
            slot.onPickupFromSlot(entity, itemstack1);
        }
 
        return itemstack;
    }
 
    public boolean func_94530_a(ItemStack item, Slot slot)
    {
        return slot.inventory != this.craftResult && super.func_94530_a(item, slot);
    }
}
