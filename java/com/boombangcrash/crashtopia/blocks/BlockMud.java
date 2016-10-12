package com.boombangcrash.crashtopia.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockMud extends Block 
{
	public BlockMud(Material material, String unlocalizedName, float hardness, float resistance)
	{
		super(material.GROUND);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setHardness(hardness);
		this.setResistance(resistance);
	}	
}
