package com.boombangcrash.crashtopia.proxy;

import com.boombangcrash.crashtopia.blocks.BlockRegistry;
import com.boombangcrash.crashtopia.items.ItemRegistry;
import com.boombangcrash.crashtopia.events.EventHandler;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e)
	{
		BlockRegistry.registerBlocks();
		ItemRegistry.registerItems();	
	}
	
	public void init(FMLInitializationEvent e)
	{
		MinecraftForge.EVENT_BUS.register(new EventHandler());	
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		
	}
}
