package net.addie.aitplus.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.addie.aitplus.init.AitplusModBlocks;

public class LEDRoundelGrayRedstoneOnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), AitplusModBlocks.LED_ROUNDEL_BLUE.defaultBlockState(), 3);
	}
}
