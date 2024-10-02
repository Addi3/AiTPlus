
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.addie.aitplus.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

import net.addie.aitplus.entity.FlutterwingEntity;
import net.addie.aitplus.AitplusMod;

public class AitplusModEntities {
	public static EntityType<FlutterwingEntity> FLUTTERWING;

	public static void load() {
		FLUTTERWING = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(AitplusMod.MODID, "flutterwing"),
				FabricEntityTypeBuilder.create(MobCategory.CREATURE, FlutterwingEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		FlutterwingEntity.init();
		FabricDefaultAttributeRegistry.register(FLUTTERWING, FlutterwingEntity.createAttributes());
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1).trackedUpdateRate(64).build();
	}
}
