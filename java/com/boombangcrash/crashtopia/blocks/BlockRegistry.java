package com.boombangcrash.crashtopia.blocks;

import com.boombangcrash.crashtopia.Reference;
import com.boombangcrash.crashtopia.tile.TileBrickFurnace;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockRegistry 
{
	public static Block blockBase;
	public static Block blockMud;
	public static Block blockBakedMud;
	public static Block blockBrickFurnace;
	
	public static void registerBlocks()
	{		
		registerBlock(blockBase = new BlockBase(Material.ROCK, "base_block", 1.0f, 1.0f), "base_block");
		registerBlock(blockMud = new BlockMud(Material.GROUND, "mud_block", 1.0f, 1.0f), "mud_block");
		registerBlock(blockBakedMud = new BlockBakedMud(Material.GROUND, "bakedmud_block", 1.0f, 1.0f), "bakedmud_block");
		registerBlock(blockBrickFurnace = new BlockBrickFurnace(), "brickfurnace");
	}
	
	public static void registerTitleEntity()
	{
		GameRegistry.registerTileEntity(TileBrickFurnace.class, Reference.MODID + ":brickfurnace");
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
