
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.addie.aitplus.init;

import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.RandomPatchFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import net.addie.aitplus.block.UlandaFlowerBlock;
import net.addie.aitplus.block.SchlenkBlossomBlock;
import net.addie.aitplus.block.MadeviniaAridosaBlock;
import net.addie.aitplus.AitplusMod;

import java.util.function.Predicate;

public class AitplusModFeatures {
	public static void load() {
		register("madevinia_aridosa", new RandomPatchFeature(RandomPatchConfiguration.CODEC), MadeviniaAridosaBlock.GENERATE_BIOMES, GenerationStep.Decoration.VEGETAL_DECORATION);
		register("schlenk_blossom", new RandomPatchFeature(RandomPatchConfiguration.CODEC), SchlenkBlossomBlock.GENERATE_BIOMES, GenerationStep.Decoration.VEGETAL_DECORATION);
		register("ulanda_flower", new RandomPatchFeature(RandomPatchConfiguration.CODEC), UlandaFlowerBlock.GENERATE_BIOMES, GenerationStep.Decoration.VEGETAL_DECORATION);
	}

	public static void register(String registryName, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration genStep) {
		Registry.register(BuiltInRegistries.FEATURE, new ResourceLocation(AitplusMod.MODID, registryName), feature);
		BiomeModifications.addFeature(biomes, genStep, ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(AitplusMod.MODID, registryName)));
	}
}
