
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.addie.aitplus.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.addie.aitplus.block.UlandaFlowerBlock;
import net.addie.aitplus.block.SchlenkBlossomBlock;
import net.addie.aitplus.block.MadeviniaAridosaBlock;
import net.addie.aitplus.AitplusMod;

public class AitplusModBlocks {
	public static Block MADEVINIA_ARIDOSA;
	public static Block SCHLENK_BLOSSOM;
	public static Block ULANDA_FLOWER;

	public static void load() {
		MADEVINIA_ARIDOSA = register("madevinia_aridosa", new MadeviniaAridosaBlock());
		SCHLENK_BLOSSOM = register("schlenk_blossom", new SchlenkBlossomBlock());
		ULANDA_FLOWER = register("ulanda_flower", new UlandaFlowerBlock());
	}

	public static void clientLoad() {
		MadeviniaAridosaBlock.clientInit();
		SchlenkBlossomBlock.clientInit();
		UlandaFlowerBlock.clientInit();
	}

	private static Block register(String registryName, Block block) {
		return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(AitplusMod.MODID, registryName), block);
	}
}
