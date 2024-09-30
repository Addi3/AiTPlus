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
	public static Item TAKE_ME_TO_TRENZALOR;
	public static Item TAKE_ME_TO_GALLIFREY;
	public static Item CREATIVE_TAB_ITEM;

	public static void load() {
		TRENZALORIAN_STONE = register("trenzalorian_stone", new BlockItem(AitplusModBlocks.TRENZALORIAN_STONE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(TRENZALORIAN_STONE));
		TRENZALORIAN_STONE_STAIRS = register("trenzalorian_stone_stairs", new BlockItem(AitplusModBlocks.TRENZALORIAN_STONE_STAIRS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(TRENZALORIAN_STONE_STAIRS));
		TRENZALORIAN_STONE_SLAB = register("trenzalorian_stone_slab", new BlockItem(AitplusModBlocks.TRENZALORIAN_STONE_SLAB, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(TRENZALORIAN_STONE_SLAB));
		TRENZALORIAN_STONE_WALL = register("trenzalorian_stone_wall", new BlockItem(AitplusModBlocks.TRENZALORIAN_STONE_WALL, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(TRENZALORIAN_STONE_WALL));
		TAKE_ME_TO_TRENZALOR = register("take_me_to_trenzalor", new TakeMeToTrenzalorItem());
		TAKE_ME_TO_GALLIFREY = register("take_me_to_gallifrey", new TakeMeToGallifreyItem());
		CREATIVE_TAB_ITEM = register("creative_tab_item", new CreativeTabItemItem());
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
