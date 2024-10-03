
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
	public static SoundEvent TRENZALOR_AMBIANCE = SoundEvent.createVariableRangeEvent(new ResourceLocation("aitplus", "trenzalor_ambiance"));
	public static SoundEvent TRENZALOR_AMBIANCE2 = SoundEvent.createVariableRangeEvent(new ResourceLocation("aitplus", "trenzalor_ambiance2"));
	public static SoundEvent FLUTTERWING_FLUTTERING = SoundEvent.createVariableRangeEvent(new ResourceLocation("aitplus", "flutterwing_fluttering"));
	public static SoundEvent FLUBBLE_HURT = SoundEvent.createVariableRangeEvent(new ResourceLocation("aitplus", "flubble_hurt"));
	public static SoundEvent FLUBBLE_AMBIENT = SoundEvent.createVariableRangeEvent(new ResourceLocation("aitplus", "flubble_ambient"));
	public static SoundEvent FLUBBLE_STEP = SoundEvent.createVariableRangeEvent(new ResourceLocation("aitplus", "flubble_step"));
	public static SoundEvent FLUBBLE_DEATH = SoundEvent.createVariableRangeEvent(new ResourceLocation("aitplus", "flubble_death"));
	public static SoundEvent FLUTTERWING_DEATH = SoundEvent.createVariableRangeEvent(new ResourceLocation("aitplus", "flutterwing_death"));
	public static SoundEvent FLUTTERWING_HURT = SoundEvent.createVariableRangeEvent(new ResourceLocation("aitplus", "flutterwing_hurt"));
	public static SoundEvent FLY_DEATH = SoundEvent.createVariableRangeEvent(new ResourceLocation("aitplus", "fly_death"));
	public static SoundEvent FLY_HURT = SoundEvent.createVariableRangeEvent(new ResourceLocation("aitplus", "fly_hurt"));
	public static SoundEvent FLY_LOOP = SoundEvent.createVariableRangeEvent(new ResourceLocation("aitplus", "fly_loop"));

	public static void load() {
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("aitplus", "gallifrey_ambiance"), GALLIFREY_AMBIANCE);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("aitplus", "trenzalor_ambiance"), TRENZALOR_AMBIANCE);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("aitplus", "trenzalor_ambiance2"), TRENZALOR_AMBIANCE2);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("aitplus", "flutterwing_fluttering"), FLUTTERWING_FLUTTERING);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("aitplus", "flubble_hurt"), FLUBBLE_HURT);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("aitplus", "flubble_ambient"), FLUBBLE_AMBIENT);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("aitplus", "flubble_step"), FLUBBLE_STEP);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("aitplus", "flubble_death"), FLUBBLE_DEATH);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("aitplus", "flutterwing_death"), FLUTTERWING_DEATH);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("aitplus", "flutterwing_hurt"), FLUTTERWING_HURT);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("aitplus", "fly_death"), FLY_DEATH);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("aitplus", "fly_hurt"), FLY_HURT);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("aitplus", "fly_loop"), FLY_LOOP);
	}
}
