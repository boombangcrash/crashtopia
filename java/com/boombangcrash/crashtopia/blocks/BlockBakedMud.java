package com.boombangcrash.crashtopia.blocks;

import java.util.Random;

import com.boombangcrash.crashtopia.items.ItemRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockBakedMud extends Block 
{
	public BlockBakedMud(Material material, String unlocalizedName, float hardness, float resistance)
	{
		super(material.GROUND);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setHardness(hardness);
		this.setResistance(resistance);
	}
}
