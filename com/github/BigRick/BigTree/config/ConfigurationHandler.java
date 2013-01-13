package com.github.BigRick.BigTree.config;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;

public class ConfigurationHandler
{
	public static Configuration config;

	public static void initConfig(File configFile)
	{
		config = new Configuration(configFile);
		
		try
		{
			config.load();
			
			
			
			config.save();
		} catch (Exception e)
		{
			FMLLog.log(Level.SEVERE, e, "Oil Craft" + " has had a problem loading its configuration");
		}
	}
}
