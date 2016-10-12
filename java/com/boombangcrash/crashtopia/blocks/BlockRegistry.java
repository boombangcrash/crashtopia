package com.boombangcrash.crashtopia.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockRegistry 
{
	public static Block blockBase;
	public static Block blockMud;
	
	public static void registerBlocks()
	{		
		registerBlock(blockBase = new BlockBase(Material.ROCK, "base_block", 1.0f, 1.0f), "base_block");
		registerBlock(blockMud = new BlockMud(Material.GROUND, "mud_block", 1.0f, 1.0f), "mud_block");
	}
	
	public static void registerBlock(Block block, String blockName)
	{
		block.setRegistryName(blockName);
		GameRegistry.register(block);
		
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(blockName);
		
		GameRegistry.register(itemBlock);

	}

}
