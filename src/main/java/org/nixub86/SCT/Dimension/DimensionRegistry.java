package org.nixub86.SCT.Dimension;

import net.minecraftforge.common.DimensionManager;

public class DimensionRegistry {
	
	public static final int dimensionId = 8;
	
	public static void mainRegistry()
	{
		registerDimension();
	}
	
	public static void registerDimension()
	{
		DimensionManager.registerProviderType(dimensionId, WorldProviderMira.class, false);
		DimensionManager.registerDimension(dimensionId, dimensionId);
		
	}
}
