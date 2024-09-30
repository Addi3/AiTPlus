/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.addie.aitplus.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.addie.aitplus.item.TakeMeToTrenzalorItem;
import net.addie.aitplus.item.TakeMeToGallifreyItem;
import net.addie.aitplus.item.CreativeTabItemItem;
import net.addie.aitplus.AitplusMod;

public class AitplusModItems {
	public static Item TRENZALORIAN_STONE;
	public static Item TRENZALORIAN_STONE_STAIRS;
	public static Item TRENZALORIAN_STONE_SLAB;
	public static Item TRENZALORIAN_STONE_WALL;
	public static Item ARKYTIOR;
	public static Item FLOWER_OF_REMEBERANCE;
	public static Item IRIDESCENT_VELVET_RED_MADEVINIA_ARIDOSA;
	public static Item MOONLIGHT_BLOOM;
	public static Item RED_PETALED_ORCHID;
	public static Item SCHLENK_BLOSSOMS;
	public static Item TAKE_ME_TO_GALLIFREY;
	public static Item TAKE_ME_TO_TRENZALOR;
	public static Item CREATIVE_TAB_ITEM;
	public static Item CADONWOOD;
	public static Item CADONWOOD_PLANKS;
	public static Item CADONWOOD_STAIRS;
	public static Item CADONWOOD_SLAB;
	public static Item CADONWOOD_FENCE;
	public static Item CADONWOOD_FENCE_GATE;
	public static Item CADONWOOD_TRAPDOOR;
	public static Item CADONWOOD_DOOR;
	public static Item CADON_LOG;

	public static void load() {
		TRENZALORIAN_STONE = register("trenzalorian_stone", new BlockItem(AitplusModBlocks.TRENZALORIAN_STONE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(TRENZALORIAN_STONE));
		TRENZALORIAN_STONE_STAIRS = register("trenzalorian_stone_stairs", new BlockItem(AitplusModBlocks.TRENZALORIAN_STONE_STAIRS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(TRENZALORIAN_STONE_STAIRS));
		TRENZALORIAN_STONE_SLAB = register("trenzalorian_stone_slab", new BlockItem(AitplusModBlocks.TRENZALORIAN_STONE_SLAB, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(TRENZALORIAN_STONE_SLAB));
		TRENZALORIAN_STONE_WALL = register("trenzalorian_stone_wall", new BlockItem(AitplusModBlocks.TRENZALORIAN_STONE_WALL, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(TRENZALORIAN_STONE_WALL));
		ARKYTIOR = register("arkytior", new BlockItem(AitplusModBlocks.ARKYTIOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(ARKYTIOR));
		FLOWER_OF_REMEBERANCE = register("flower_of_remeberance", new BlockItem(AitplusModBlocks.FLOWER_OF_REMEBERANCE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(FLOWER_OF_REMEBERANCE));
		IRIDESCENT_VELVET_RED_MADEVINIA_ARIDOSA = register("iridescent_velvet_red_madevinia_aridosa", new BlockItem(AitplusModBlocks.IRIDESCENT_VELVET_RED_MADEVINIA_ARIDOSA, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(IRIDESCENT_VELVET_RED_MADEVINIA_ARIDOSA));
		MOONLIGHT_BLOOM = register("moonlight_bloom", new BlockItem(AitplusModBlocks.MOONLIGHT_BLOOM, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(MOONLIGHT_BLOOM));
		RED_PETALED_ORCHID = register("red_petaled_orchid", new BlockItem(AitplusModBlocks.RED_PETALED_ORCHID, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(RED_PETALED_ORCHID));
		SCHLENK_BLOSSOMS = register("schlenk_blossoms", new BlockItem(AitplusModBlocks.SCHLENK_BLOSSOMS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(SCHLENK_BLOSSOMS));
		TAKE_ME_TO_GALLIFREY = register("take_me_to_gallifrey", new TakeMeToGallifreyItem());
		TAKE_ME_TO_TRENZALOR = register("take_me_to_trenzalor", new TakeMeToTrenzalorItem());
		CREATIVE_TAB_ITEM = register("creative_tab_item", new CreativeTabItemItem());
		CADONWOOD = register("cadonwood", new BlockItem(AitplusModBlocks.CADONWOOD, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CADONWOOD));
		CADONWOOD_PLANKS = register("cadonwood_planks", new BlockItem(AitplusModBlocks.CADONWOOD_PLANKS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CADONWOOD_PLANKS));
		CADONWOOD_STAIRS = register("cadonwood_stairs", new BlockItem(AitplusModBlocks.CADONWOOD_STAIRS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CADONWOOD_STAIRS));
		CADONWOOD_SLAB = register("cadonwood_slab", new BlockItem(AitplusModBlocks.CADONWOOD_SLAB, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CADONWOOD_SLAB));
		CADONWOOD_FENCE = register("cadonwood_fence", new BlockItem(AitplusModBlocks.CADONWOOD_FENCE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CADONWOOD_FENCE));
		CADONWOOD_FENCE_GATE = register("cadonwood_fence_gate", new BlockItem(AitplusModBlocks.CADONWOOD_FENCE_GATE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CADONWOOD_FENCE_GATE));
		CADONWOOD_TRAPDOOR = register("cadonwood_trapdoor", new BlockItem(AitplusModBlocks.CADONWOOD_TRAPDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CADONWOOD_TRAPDOOR));
		CADONWOOD_DOOR = register("cadonwood_door", new BlockItem(AitplusModBlocks.CADONWOOD_DOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CADONWOOD_DOOR));
		CADON_LOG = register("cadon_log", new BlockItem(AitplusModBlocks.CADON_LOG, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CADON_LOG));
	}

	public static void clientLoad() {
	}

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(AitplusMod.MODID, registryName), item);
	}

	private static void registerBlockingProperty(Item item) {
		ItemProperties.register(item, new ResourceLocation("blocking"), (ClampedItemPropertyFunction) ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
	}
}
