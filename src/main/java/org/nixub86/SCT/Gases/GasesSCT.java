package org.nixub86.SCT.Gases;

import org.nixub86.SCT.Items.ItemsSCT;

import glenn.gasesframework.api.Combustibility;
import glenn.gasesframework.api.ExtendedGasEffectsBase.EffectType;
import glenn.gasesframework.api.GFAPI;
import glenn.gasesframework.api.gastype.GasType;

public class GasesSCT {
	public static final GasType gasTypeNeurotoxin = new GasTypeNeurotoxin(true, 8, "Neurotoxin", 0x6F3F2F7F, 3, 4, Combustibility.NONE).setEffectRate(EffectType.BLINDNESS, 1).setEffectRate(EffectType.SUFFOCATION, 2).setEffectRate(EffectType.SLOWNESS, 16).setCreativeTab(ItemsSCT.SCTTab);
	
	public static final void preInit() {
		GFAPI.registry.registerGasType(gasTypeNeurotoxin);
	}
	
	public static final void Init() {
		
	}
}