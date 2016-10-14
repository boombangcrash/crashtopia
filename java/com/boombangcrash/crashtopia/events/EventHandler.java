package com.boombangcrash.crashtopia.events;

import com.boombangcrash.crashtopia.blocks.BlockRegistry;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent.NeighborNotifyEvent;
import net.minecraftforge.event.world.ChunkEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;

public class EventHandler {
	
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void onChunkLoaded(ChunkEvent.Load event)
	{
	}
	
	@SubscribeEvent
	public void onNeighborNotify(NeighborNotifyEvent event)
	{
	}
}
