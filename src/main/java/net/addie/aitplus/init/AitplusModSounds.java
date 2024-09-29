
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.addie.aitplus.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class AitplusModSounds {
	public static SoundEvent GALLIFREY_AMBIANCE = SoundEvent.createVariableRangeEvent(new ResourceLocation("aitplus", "gallifrey_ambiance"));
	public static SoundEvent GALLIFREY_AMBIANCE2 = SoundEvent.createVariableRangeEvent(new ResourceLocation("aitplus", "gallifrey_ambiance2"));
	public static SoundEvent TRENZALOR_AMBIANCE = SoundEvent.createVariableRangeEvent(new ResourceLocation("aitplus", "trenzalor_ambiance"));
	public static SoundEvent TRENZALOR_AMBIANCE2 = SoundEvent.createVariableRangeEvent(new ResourceLocation("aitplus", "trenzalor_ambiance2"));

	public static void load() {
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("aitplus", "gallifrey_ambiance"), GALLIFREY_AMBIANCE);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("aitplus", "gallifrey_ambiance2"), GALLIFREY_AMBIANCE2);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("aitplus", "trenzalor_ambiance"), TRENZALOR_AMBIANCE);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("aitplus", "trenzalor_ambiance2"), TRENZALOR_AMBIANCE2);
	}
}
