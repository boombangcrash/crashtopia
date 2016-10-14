package com.boombangcrash.crashtopia.blocks;

import javax.annotation.Nullable;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockBrickFurnace extends BlockContainer
{
	public static final PropertyDirection FACING = BlockHorizontal.FACING;
	private final boolean isBurning;
	private static boolean keepInventory;
	
	public BlockBrickFurnace(boolean isBurning)
	{
		super(Material.ROCK);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		this.isBurning = isBurning;		
		this.setUnlocalizedName("brickfurnace_block");
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setHardness(1.0f);
		this.setResistance(1.0f);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand han, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ)
	{
		if(worldIn.isRemote)
		{
			return true;
		}
		else
		{
            TileEntity tileentity = worldIn.getTileEntity(pos);

            if (tileentity instanceof TileEntityFurnace)
            {
                playerIn.displayGUIChest((TileEntityFurnace)tileentity);
                playerIn.addStat(StatList.FURNACE_INTERACTION);
            }

			return true;
		}
	}
}
