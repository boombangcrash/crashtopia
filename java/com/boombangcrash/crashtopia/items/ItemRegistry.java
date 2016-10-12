package com.boombangcrash.crashtopia.items;

import com.boombangcrash.crashtopia.items.ItemBasePickaxe;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemRegistry
{
	public static Item itemBasePickaxe;
	
	public static void registerItems()
	{		
		registerItem(itemBasePickaxe = new ItemBasePickaxe("base_pickaxe", ToolMaterial.DIAMOND), "base_pickaxe");
	}
	
	public static void registerItem(Item item, String itemName)
	{
		item.setRegistryName(itemName);
		GameRegistry.register(item);
	}
}
