package net.addie.aitplus.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.addie.aitplus.init.AitplusModBlocks;

public class LEDRoundelRedstoneOnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < 1; index0++) {
			world.setBlock(BlockPos.containing(x, y, z), AitplusModBlocks.LED_ROUNDEL_BLACK.defaultBlockState(), 3);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.amethyst_block.chime")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.amethyst_block.chime")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
	}
}
