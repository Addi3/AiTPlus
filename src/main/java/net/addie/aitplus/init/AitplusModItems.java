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

import net.addie.aitplus.item.TakeMeToGallifreyItem;
import net.addie.aitplus.item.CreativeTabItemItem;
import net.addie.aitplus.AitplusMod;

public class AitplusModItems {
	public static Item TAKE_ME_TO_GALLIFREY;
	public static Item CREATIVE_TAB_ITEM;
	public static Item MADEVINIA_ARIDOSA;
	public static Item SCHLENK_BLOSSOM;
	public static Item ULANDA_FLOWER;

	public static void load() {
		TAKE_ME_TO_GALLIFREY = register("take_me_to_gallifrey", new TakeMeToGallifreyItem());
		CREATIVE_TAB_ITEM = register("creative_tab_item", new CreativeTabItemItem());
		MADEVINIA_ARIDOSA = register("madevinia_aridosa", new BlockItem(AitplusModBlocks.MADEVINIA_ARIDOSA, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(MADEVINIA_ARIDOSA));
		SCHLENK_BLOSSOM = register("schlenk_blossom", new BlockItem(AitplusModBlocks.SCHLENK_BLOSSOM, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(SCHLENK_BLOSSOM));
		ULANDA_FLOWER = register("ulanda_flower", new BlockItem(AitplusModBlocks.ULANDA_FLOWER, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(ULANDA_FLOWER));
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
