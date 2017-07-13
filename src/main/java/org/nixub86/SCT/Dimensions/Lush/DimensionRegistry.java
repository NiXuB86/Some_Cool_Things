package org.nixub86.SCT.Dimensions.Lush;

import net.minecraftforge.common.DimensionManager;

public class DimensionRegistry {
	
	public static final int LushId = 8;
	
	public static void mainRegistry()
	{
		registerDimension();
	}
	
	public static void registerDimension()
	{
		DimensionManager.registerProviderType(LushId, WorldProviderLush.class, false);
		DimensionManager.registerDimension(LushId, LushId);
		
	}
}
