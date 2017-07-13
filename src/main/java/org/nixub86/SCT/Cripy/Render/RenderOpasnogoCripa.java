package org.nixub86.SCT.Cripy.Render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderOpasnogoCripa extends RenderLiving{

	public RenderOpasnogoCripa(ModelBase model, float shadowsize) 
	{
		super(model, shadowsize);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return new ResourceLocation("sct:entity/OpasniyCrip.png");
	}

}
