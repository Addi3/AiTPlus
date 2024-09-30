
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.addie.aitplus.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.addie.aitplus.block.TrenzalorianStoneWallBlock;
import net.addie.aitplus.block.TrenzalorianStoneStairsBlock;
import net.addie.aitplus.block.TrenzalorianStoneSlabBlock;
import net.addie.aitplus.block.TrenzalorianStoneBlock;
import net.addie.aitplus.AitplusMod;

public class AitplusModBlocks {
	public static Block TRENZALORIAN_STONE;
	public static Block TRENZALORIAN_STONE_STAIRS;
	public static Block TRENZALORIAN_STONE_SLAB;
	public static Block TRENZALORIAN_STONE_WALL;

	public static void load() {
		TRENZALORIAN_STONE = register("trenzalorian_stone", new TrenzalorianStoneBlock());
		TRENZALORIAN_STONE_STAIRS = register("trenzalorian_stone_stairs", new TrenzalorianStoneStairsBlock());
		TRENZALORIAN_STONE_SLAB = register("trenzalorian_stone_slab", new TrenzalorianStoneSlabBlock());
		TRENZALORIAN_STONE_WALL = register("trenzalorian_stone_wall", new TrenzalorianStoneWallBlock());
	}

	public static void clientLoad() {
		TrenzalorianStoneBlock.clientInit();
		TrenzalorianStoneStairsBlock.clientInit();
		TrenzalorianStoneSlabBlock.clientInit();
		TrenzalorianStoneWallBlock.clientInit();
	}

	private static Block register(String registryName, Block block) {
		return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(AitplusMod.MODID, registryName), block);
	}
}
