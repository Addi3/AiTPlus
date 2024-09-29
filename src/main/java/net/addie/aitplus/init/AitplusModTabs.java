
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.addie.aitplus.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.addie.aitplus.AitplusMod;

public class AitplusModTabs {
	public static ResourceKey<CreativeModeTab> TAB_AI_T_PLUS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(AitplusMod.MODID, "ai_t_plus"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_AI_T_PLUS,
				FabricItemGroup.builder().title(Component.translatable("item_group." + AitplusMod.MODID + ".ai_t_plus")).icon(() -> new ItemStack(AitplusModItems.CREATIVE_TAB_ITEM)).build());
	}
}
