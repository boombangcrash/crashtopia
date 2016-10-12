package com.boombangcrash.crashtopia.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemBasePickaxe extends ItemPickaxe
{
	public ItemBasePickaxe(String unlocalizedName, ToolMaterial material)
	{
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.TOOLS);
	}

}
