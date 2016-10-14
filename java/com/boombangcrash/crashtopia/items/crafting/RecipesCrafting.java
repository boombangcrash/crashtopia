package com.boombangcrash.crashtopia.items.crafting;

import com.boombangcrash.crashtopia.blocks.BlockRegistry;
import com.boombangcrash.crashtopia.items.ItemRegistry;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipesCrafting
{
	public static void addRecipes()
	{
		GameRegistry.addSmelting(BlockRegistry.blockMud, new ItemStack(BlockRegistry.blockBakedMud), 1.0F);
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.itemMudBrick), new Object[] {"##", "##", '#', ItemRegistry.itemMudBall});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.blockMud), new Object[] {"##", "##", '#', ItemRegistry.itemMudBrick});
	}

}
