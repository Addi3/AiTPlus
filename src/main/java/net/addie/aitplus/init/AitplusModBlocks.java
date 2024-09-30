
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
import net.addie.aitplus.block.StrippedCadonwoodLogBlock;
import net.addie.aitplus.block.StrippedCadonwoodBlock;
import net.addie.aitplus.block.SchlenkBlossomsBlock;
import net.addie.aitplus.block.RedPetaledOrchidBlock;
import net.addie.aitplus.block.MoonlightBloomBlock;
import net.addie.aitplus.block.IridescentVelvetRedMadeviniaAridosaBlock;
import net.addie.aitplus.block.FlowerOfRemeberanceBlock;
import net.addie.aitplus.block.CadonwoodTrapdoorBlock;
import net.addie.aitplus.block.CadonwoodStairsBlock;
import net.addie.aitplus.block.CadonwoodSlabBlock;
import net.addie.aitplus.block.CadonwoodPlanksBlock;
import net.addie.aitplus.block.CadonwoodFenceGateBlock;
import net.addie.aitplus.block.CadonwoodFenceBlock;
import net.addie.aitplus.block.CadonwoodDoorBlock;
import net.addie.aitplus.block.CadonwoodBlock;
import net.addie.aitplus.block.CadonLogBlock;
import net.addie.aitplus.block.ArkytiorBlock;
import net.addie.aitplus.AitplusMod;

public class AitplusModBlocks {
	public static Block TRENZALORIAN_STONE;
	public static Block TRENZALORIAN_STONE_STAIRS;
	public static Block TRENZALORIAN_STONE_SLAB;
	public static Block TRENZALORIAN_STONE_WALL;
	public static Block ARKYTIOR;
	public static Block FLOWER_OF_REMEBERANCE;
	public static Block IRIDESCENT_VELVET_RED_MADEVINIA_ARIDOSA;
	public static Block MOONLIGHT_BLOOM;
	public static Block RED_PETALED_ORCHID;
	public static Block SCHLENK_BLOSSOMS;
	public static Block CADONWOOD;
	public static Block CADONWOOD_PLANKS;
	public static Block CADONWOOD_STAIRS;
	public static Block CADONWOOD_SLAB;
	public static Block CADONWOOD_FENCE;
	public static Block CADONWOOD_FENCE_GATE;
	public static Block CADONWOOD_TRAPDOOR;
	public static Block CADONWOOD_DOOR;
	public static Block STRIPPED_CADONWOOD;
	public static Block CADON_LOG;
	public static Block STRIPPED_CADONWOOD_LOG;

	public static void load() {
		TRENZALORIAN_STONE = register("trenzalorian_stone", new TrenzalorianStoneBlock());
		TRENZALORIAN_STONE_STAIRS = register("trenzalorian_stone_stairs", new TrenzalorianStoneStairsBlock());
		TRENZALORIAN_STONE_SLAB = register("trenzalorian_stone_slab", new TrenzalorianStoneSlabBlock());
		TRENZALORIAN_STONE_WALL = register("trenzalorian_stone_wall", new TrenzalorianStoneWallBlock());
		ARKYTIOR = register("arkytior", new ArkytiorBlock());
		FLOWER_OF_REMEBERANCE = register("flower_of_remeberance", new FlowerOfRemeberanceBlock());
		IRIDESCENT_VELVET_RED_MADEVINIA_ARIDOSA = register("iridescent_velvet_red_madevinia_aridosa", new IridescentVelvetRedMadeviniaAridosaBlock());
		MOONLIGHT_BLOOM = register("moonlight_bloom", new MoonlightBloomBlock());
		RED_PETALED_ORCHID = register("red_petaled_orchid", new RedPetaledOrchidBlock());
		SCHLENK_BLOSSOMS = register("schlenk_blossoms", new SchlenkBlossomsBlock());
		CADONWOOD = register("cadonwood", new CadonwoodBlock());
		CADONWOOD_PLANKS = register("cadonwood_planks", new CadonwoodPlanksBlock());
		CADONWOOD_STAIRS = register("cadonwood_stairs", new CadonwoodStairsBlock());
		CADONWOOD_SLAB = register("cadonwood_slab", new CadonwoodSlabBlock());
		CADONWOOD_FENCE = register("cadonwood_fence", new CadonwoodFenceBlock());
		CADONWOOD_FENCE_GATE = register("cadonwood_fence_gate", new CadonwoodFenceGateBlock());
		CADONWOOD_TRAPDOOR = register("cadonwood_trapdoor", new CadonwoodTrapdoorBlock());
		CADONWOOD_DOOR = register("cadonwood_door", new CadonwoodDoorBlock());
		STRIPPED_CADONWOOD = register("stripped_cadonwood", new StrippedCadonwoodBlock());
		CADON_LOG = register("cadon_log", new CadonLogBlock());
		STRIPPED_CADONWOOD_LOG = register("stripped_cadonwood_log", new StrippedCadonwoodLogBlock());
	}

	public static void clientLoad() {
		TrenzalorianStoneBlock.clientInit();
		TrenzalorianStoneStairsBlock.clientInit();
		TrenzalorianStoneSlabBlock.clientInit();
		TrenzalorianStoneWallBlock.clientInit();
		ArkytiorBlock.clientInit();
		FlowerOfRemeberanceBlock.clientInit();
		IridescentVelvetRedMadeviniaAridosaBlock.clientInit();
		MoonlightBloomBlock.clientInit();
		RedPetaledOrchidBlock.clientInit();
		SchlenkBlossomsBlock.clientInit();
		CadonwoodBlock.clientInit();
		CadonwoodPlanksBlock.clientInit();
		CadonwoodStairsBlock.clientInit();
		CadonwoodSlabBlock.clientInit();
		CadonwoodFenceBlock.clientInit();
		CadonwoodFenceGateBlock.clientInit();
		CadonwoodTrapdoorBlock.clientInit();
		CadonwoodDoorBlock.clientInit();
		StrippedCadonwoodBlock.clientInit();
		CadonLogBlock.clientInit();
		StrippedCadonwoodLogBlock.clientInit();
	}

	private static Block register(String registryName, Block block) {
		return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(AitplusMod.MODID, registryName), block);
	}
}
