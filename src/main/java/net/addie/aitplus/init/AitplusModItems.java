/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.addie.aitplus.init;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.addie.aitplus.item.YellowJellyBabiesItem;
import net.addie.aitplus.item.TheMightyJellyBabiesItem;
import net.addie.aitplus.item.TakeMeToTrenzalorItem;
import net.addie.aitplus.item.TakeMeToGallifreyItem;
import net.addie.aitplus.item.RedJellyBabiesItem;
import net.addie.aitplus.item.PurpleJellyBabiesItem;
import net.addie.aitplus.item.PinkJellyBabiesItem;
import net.addie.aitplus.item.OrangeJellyBabiesItem;
import net.addie.aitplus.item.MagentaJellyBabiesItem;
import net.addie.aitplus.item.LimejellyBabiesItem;
import net.addie.aitplus.item.LightBlueJellyBabiesItem;
import net.addie.aitplus.item.GreenJellyBabiesItem;
import net.addie.aitplus.item.FishFingersItem;
import net.addie.aitplus.item.FishFingersAndCustardItem;
import net.addie.aitplus.item.CyanJellyBabiesItem;
import net.addie.aitplus.item.CustardItem;
import net.addie.aitplus.item.CreativeTabItemItem;
import net.addie.aitplus.item.BlueJellyBabiesItem;
import net.addie.aitplus.item.BlackJellyBabiesItem;
import net.addie.aitplus.AitplusMod;

public class AitplusModItems {
	public static Item TRENZALORIAN_STONE;
	public static Item TRENZALORIAN_STONE_STAIRS;
	public static Item TRENZALORIAN_STONE_SLAB;
	public static Item TRENZALORIAN_STONE_WALL;
	public static Item CADONWOOD;
	public static Item CADON_LOG;
	public static Item STRIPPED_CADONWOOD;
	public static Item STRIPPED_CADON_LOG;
	public static Item CADONWOOD_PLANKS;
	public static Item CADONWOOD_STAIRS;
	public static Item CADONWOOD_SLAB;
	public static Item CADONWOOD_FENCE;
	public static Item CADONWOOD_FENCE_GATE;
	public static Item CADONWOOD_DOOR;
	public static Item CADONWOOD_TRAPDOOR;
	public static Item CANDONWOOD_BUTTON;
	public static Item CANDONWOOD_PRESSURE_PLATE;
	public static Item CANDONWOOD_LEAVES;
	public static Item ARKYTIOR;
	public static Item FLOWER_OF_REMEBERANCE;
	public static Item IRIDESCENT_VELVET_RED_MADEVINIA_ARIDOSA;
	public static Item MOONLIGHT_BLOOM;
	public static Item RED_PETALED_ORCHID;
	public static Item SCHLENK_BLOSSOMS;
	public static Item YELLOW_JELLY_BABIES;
	public static Item RED_JELLY_BABIES;
	public static Item PURPLE_JELLY_BABIES;
	public static Item PINK_JELLY_BABIES;
	public static Item ORANGE_JELLY_BABIES;
	public static Item MAGENTA_JELLY_BABIES;
	public static Item LIMEJELLY_BABIES;
	public static Item LIGHT_BLUE_JELLY_BABIES;
	public static Item GREEN_JELLY_BABIES;
	public static Item CYAN_JELLY_BABIES;
	public static Item BLUE_JELLY_BABIES;
	public static Item BLACK_JELLY_BABIES;
	public static Item THE_MIGHTY_JELLY_BABIES;
	public static Item FISH_FINGERS;
	public static Item CUSTARD;
	public static Item FISH_FINGERS_AND_CUSTARD;
	public static Item FLUTTERWING_SPAWN_EGG;
	public static Item FLY_SPAWN_EGG;
	public static Item FLUBBLE_SPAWN_EGG;
	public static Item TAKE_ME_TO_GALLIFREY;
	public static Item TAKE_ME_TO_TRENZALOR;
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
		CADONWOOD = register("cadonwood", new BlockItem(AitplusModBlocks.CADONWOOD, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CADONWOOD));
		CADON_LOG = register("cadon_log", new BlockItem(AitplusModBlocks.CADON_LOG, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CADON_LOG));
		STRIPPED_CADONWOOD = register("stripped_cadonwood", new BlockItem(AitplusModBlocks.STRIPPED_CADONWOOD, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(STRIPPED_CADONWOOD));
		STRIPPED_CADON_LOG = register("stripped_cadon_log", new BlockItem(AitplusModBlocks.STRIPPED_CADON_LOG, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(STRIPPED_CADON_LOG));
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
		CADONWOOD_DOOR = register("cadonwood_door", new BlockItem(AitplusModBlocks.CADONWOOD_DOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CADONWOOD_DOOR));
		CADONWOOD_TRAPDOOR = register("cadonwood_trapdoor", new BlockItem(AitplusModBlocks.CADONWOOD_TRAPDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CADONWOOD_TRAPDOOR));
		CANDONWOOD_BUTTON = register("candonwood_button", new BlockItem(AitplusModBlocks.CANDONWOOD_BUTTON, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CANDONWOOD_BUTTON));
		CANDONWOOD_PRESSURE_PLATE = register("candonwood_pressure_plate", new BlockItem(AitplusModBlocks.CANDONWOOD_PRESSURE_PLATE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CANDONWOOD_PRESSURE_PLATE));
		CANDONWOOD_LEAVES = register("candonwood_leaves", new BlockItem(AitplusModBlocks.CANDONWOOD_LEAVES, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CANDONWOOD_LEAVES));
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
		YELLOW_JELLY_BABIES = register("yellow_jelly_babies", new YellowJellyBabiesItem());
		RED_JELLY_BABIES = register("red_jelly_babies", new RedJellyBabiesItem());
		PURPLE_JELLY_BABIES = register("purple_jelly_babies", new PurpleJellyBabiesItem());
		PINK_JELLY_BABIES = register("pink_jelly_babies", new PinkJellyBabiesItem());
		ORANGE_JELLY_BABIES = register("orange_jelly_babies", new OrangeJellyBabiesItem());
		MAGENTA_JELLY_BABIES = register("magenta_jelly_babies", new MagentaJellyBabiesItem());
		LIMEJELLY_BABIES = register("limejelly_babies", new LimejellyBabiesItem());
		LIGHT_BLUE_JELLY_BABIES = register("light_blue_jelly_babies", new LightBlueJellyBabiesItem());
		GREEN_JELLY_BABIES = register("green_jelly_babies", new GreenJellyBabiesItem());
		CYAN_JELLY_BABIES = register("cyan_jelly_babies", new CyanJellyBabiesItem());
		BLUE_JELLY_BABIES = register("blue_jelly_babies", new BlueJellyBabiesItem());
		BLACK_JELLY_BABIES = register("black_jelly_babies", new BlackJellyBabiesItem());
		THE_MIGHTY_JELLY_BABIES = register("the_mighty_jelly_babies", new TheMightyJellyBabiesItem());
		FISH_FINGERS = register("fish_fingers", new FishFingersItem());
		CUSTARD = register("custard", new CustardItem());
		FISH_FINGERS_AND_CUSTARD = register("fish_fingers_and_custard", new FishFingersAndCustardItem());
		FLUTTERWING_SPAWN_EGG = register("flutterwing_spawn_egg", new SpawnEggItem(AitplusModEntities.FLUTTERWING, -16764007, -15987700, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(FLUTTERWING_SPAWN_EGG));
		FLY_SPAWN_EGG = register("fly_spawn_egg", new SpawnEggItem(AitplusModEntities.FLY, -16448251, -9435899, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(FLY_SPAWN_EGG));
		FLUBBLE_SPAWN_EGG = register("flubble_spawn_egg", new SpawnEggItem(AitplusModEntities.FLUBBLE, -9268588, -7876402, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(FLUBBLE_SPAWN_EGG));
		TAKE_ME_TO_GALLIFREY = register("take_me_to_gallifrey", new TakeMeToGallifreyItem());
		TAKE_ME_TO_TRENZALOR = register("take_me_to_trenzalor", new TakeMeToTrenzalorItem());
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
