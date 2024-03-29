package com.github.BigRick.BigTree.core;

import com.github.BigRick.BigTree.config.ConfigurationHandler;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "BigTree", name = "Big Tree Generation Mod", version = "0.0.1")
public class BigTree
{
	@Instance("BigTree")
	public static BigTree instance;

	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		/*
		 * Initialize the configuration
		 */
		ConfigurationHandler.initConfig(event.getSuggestedConfigurationFile());
	}

	@Init
	void load(FMLInitializationEvent event)
	{
		//event.
	}

	@PostInit
	public void postInit(FMLPostInitializationEvent event)
	{

	}
}
