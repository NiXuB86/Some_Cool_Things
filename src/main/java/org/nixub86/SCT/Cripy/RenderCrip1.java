package org.nixub86.SCT.Cripy;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderCrip1 extends RenderLiving
{
	public RenderCrip1(ModelBase model, float shadowsize) 
	{
		super(model, shadowsize);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return new ResourceLocation("sct:entity/crip1.png");
	}

}
