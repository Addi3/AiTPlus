
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.addie.aitplus.init;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.biome.FeatureSorter;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.addie.aitplus.mixins.NoiseGeneratorSettingsAccess;
import net.addie.aitplus.AitplusMod;

import java.util.List;
import java.util.ArrayList;

import com.mojang.datafixers.util.Pair;

import com.google.common.base.Suppliers;

public class AitplusModBiomes {
	public static ResourceKey<Biome> GALLIFREY_DRYLANDS = ResourceKey.create(Registries.BIOME, new ResourceLocation(AitplusMod.MODID, "gallifrey_drylands"));
	public static ResourceKey<Biome> GALLIFREY_PLAINS = ResourceKey.create(Registries.BIOME, new ResourceLocation(AitplusMod.MODID, "gallifrey_plains"));
	public static ResourceKey<Biome> GALLIFREY_MOUNTAINS = ResourceKey.create(Registries.BIOME, new ResourceLocation(AitplusMod.MODID, "gallifrey_mountains"));
	public static ResourceKey<Biome> TRENZALORE_WASTES = ResourceKey.create(Registries.BIOME, new ResourceLocation(AitplusMod.MODID, "trenzalore_wastes"));
	public static ResourceKey<Biome> PETRIFIED_JUNGLE = ResourceKey.create(Registries.BIOME, new ResourceLocation(AitplusMod.MODID, "petrified_jungle"));
	public static ResourceKey<Biome> IRRADIATED_SWAMP = ResourceKey.create(Registries.BIOME, new ResourceLocation(AitplusMod.MODID, "irradiated_swamp"));
	public static ResourceKey<Biome> MONDASIAN_SNOWLANDS = ResourceKey.create(Registries.BIOME, new ResourceLocation(AitplusMod.MODID, "mondasian_snowlands"));
	public static ResourceKey<Biome> MONDASIAN_ICE_PEAKS = ResourceKey.create(Registries.BIOME, new ResourceLocation(AitplusMod.MODID, "mondasian_ice_peaks"));

	public static void loadEndBiomes() {
	}

	public static void load(MinecraftServer server) {
		Registry<DimensionType> dimensionTypeRegistry = server.registryAccess().registryOrThrow(Registries.DIMENSION_TYPE);
		Registry<LevelStem> levelStemTypeRegistry = server.registryAccess().registryOrThrow(Registries.LEVEL_STEM);
		Registry<Biome> biomeRegistry = server.registryAccess().registryOrThrow(Registries.BIOME);
		for (LevelStem levelStem : levelStemTypeRegistry.stream().toList()) {
			DimensionType dimensionType = levelStem.type().value();
			if (dimensionType == dimensionTypeRegistry.getOrThrow(BuiltinDimensionTypes.OVERWORLD)) {
				ChunkGenerator chunkGenerator = levelStem.generator();
				// Inject biomes to biome source
				if (chunkGenerator.getBiomeSource() instanceof MultiNoiseBiomeSource noiseSource) {
					List<Pair<Climate.ParameterPoint, Holder<Biome>>> parameters = new ArrayList<>(noiseSource.parameters().values());
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(0.3f, 1f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.point(0.0f),
							Climate.Parameter.span(-1f, 1f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("aitplus", "mondasian_snowlands")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(0.3f, 1f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.point(1.0f),
							Climate.Parameter.span(-1f, 1f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("aitplus", "mondasian_snowlands")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(0.3f, 1f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.point(0.0f),
							Climate.Parameter.span(-1f, 1f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("aitplus", "mondasian_ice_peaks")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(0.3f, 1f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.point(1.0f),
							Climate.Parameter.span(-1f, 1f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("aitplus", "mondasian_ice_peaks")))));
					chunkGenerator.biomeSource = MultiNoiseBiomeSource.createFromList(new Climate.ParameterList<>(parameters));
					chunkGenerator.featuresPerStep = Suppliers
							.memoize(() -> FeatureSorter.buildFeaturesPerStep(List.copyOf(chunkGenerator.biomeSource.possibleBiomes()), biome -> chunkGenerator.generationSettingsGetter.apply(biome).features(), true));
				}

				// Inject surface rules
				if (chunkGenerator instanceof NoiseBasedChunkGenerator noiseGenerator) {
					NoiseGeneratorSettings noiseGeneratorSettings = noiseGenerator.settings.value();
					((NoiseGeneratorSettingsAccess) (Object) noiseGeneratorSettings).addSurfaceRules(SurfaceRules.sequence(AitplusModSurfaceRules.makeOverworldRules(), noiseGeneratorSettings.surfaceRule()));
				}
			}

		}
	}
}
