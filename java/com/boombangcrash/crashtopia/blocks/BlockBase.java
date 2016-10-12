package com.boombangcrash.crashtopia.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockBase extends Block 
{
	public BlockBase(Material material, String unlocalizedName, float hardness, float resistance)
	{
		super(material.ROCK);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setHardness(hardness);
		this.setResistance(resistance);
	}
	
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn)
	{
		System.out.println(blockIn);
		System.out.println(blockIn.isEqualTo(blockIn, Block.getBlockFromName("water")));
		if(blockIn.isEqualTo(blockIn, Block.getBlockFromName("water")) == true)
		{
			
		}

		
		//worldIn.setBlockState(pos, Blocks.LIT_REDSTONE_LAMP.getDefaultState(), 2);
	}
    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
    {
    }
    public void onBlockClicked(World worldIn, BlockPos pos, EntityPlayer playerIn)
    {
    	System.out.println("HERE3");
    	
    }
}
