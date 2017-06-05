package org.nixub86.SCT.Gases;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import glenn.gasesframework.api.Combustibility;
import glenn.gasesframework.api.gastype.GasType;

public class GasTypeNeurotoxin extends GasType{
	/** Creates this gas type. */
	public GasTypeNeurotoxin(boolean isIndustrial, int gasIndex, String name, int color, int opacity, int density, Combustibility combustibility)
	{
		super(isIndustrial, gasIndex, name, color, opacity, density, combustibility);
	}

	/** Fires on breathed. Poisons the entity. */
	@Override
	public void onBreathed(EntityLivingBase entity)
	{
		entity.addPotionEffect(new PotionEffect(Potion.poison.id, 300, 0));
	}
}
