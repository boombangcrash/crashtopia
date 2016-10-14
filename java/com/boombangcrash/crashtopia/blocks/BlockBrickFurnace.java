package com.boombangcrash.crashtopia.blocks;

import javax.annotation.Nullable;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;


public class BlockBrickFurnace extends BlockContainer
{
	public static final PropertyDirection FACING = BlockHorizontal.FACING;
	
	public BlockBrickFurnace()
	{
		super(Material.IRON);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);		
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		// TODO Auto-generated method stub
		return null;
	}

}
