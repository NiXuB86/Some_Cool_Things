package org.nixub86.SCT.Cripy.Entity;

import org.nixub86.SCT.Items.ItemsSCT;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIControlledByPlayer;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityMush extends EntityAnimal {

	public EntityMush(World world)
    {
		 super( world);
	        this.setSize(0.9F, 1.3F);
	        this.getNavigator().setAvoidsWater(true);
	        this.tasks.addTask(0, new EntityAISwimming(this));
	        this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
	        this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
	        this.tasks.addTask(3, new EntityAITempt(this, 1.25D, Items.wheat, false));
	        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
	        this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
	        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
	        this.tasks.addTask(7, new EntityAILookIdle(this));
    }

	public EntityMush createChild(EntityAgeable Ea)
    {
        return new EntityMush(this.worldObj);
    }
	
	public boolean isAIEnabled()
    {
        return true;
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
    }
    
    protected int getExperiencePoints(EntityPlayer entityPlayer)
    {
        if (this.isChild())
        {
            this.experienceValue = (int)((float)this.experienceValue * 100F);
        }

        return super.getExperiencePoints(entityPlayer);
    }
    
    protected Item getDropItem()
    {
        return ItemsSCT.Food;
    }

}
