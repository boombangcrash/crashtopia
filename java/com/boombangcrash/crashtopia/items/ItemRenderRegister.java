package com.boombangcrash.crashtopia.items;

import com.boombangcrash.crashtopia.Reference;
import com.boombangcrash.crashtopia.blocks.BlockRegistry;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister 
{
	public static void registerItemRenderer()
	{
		regItem(BlockRegistry.blockBase);
		regItem(BlockRegistry.blockMud);	
		regItem(BlockRegistry.blockBakedMud);
		regItem(BlockRegistry.blockBrickFurnace);
		
		regItem(ItemRegistry.itemBasePickaxe);
		regItem(ItemRegistry.itemMudBall);
		regItem(ItemRegistry.itemMudBrick);
	}
	
	public static void regItem(Block block)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MODID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	
	}
	public static void regItem(Item item)
	{
		String resName = item.getRegistryName().toString();
		ModelResourceLocation res = new ModelResourceLocation(resName, "inventory");
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, res);	
	}
}
