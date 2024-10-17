
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.addie.aitplus.init;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import net.addie.aitplus.client.renderer.VictorianChairRenderer;
import net.addie.aitplus.client.renderer.TimeWarDalekRenderer;
import net.addie.aitplus.client.renderer.RenegadeDalekRenderer;
import net.addie.aitplus.client.renderer.OfficeChairRenderer;
import net.addie.aitplus.client.renderer.LazerRenderer;
import net.addie.aitplus.client.renderer.ImperialDalekRenderer;
import net.addie.aitplus.client.renderer.FlyRenderer;
import net.addie.aitplus.client.renderer.FlutterwingRenderer;
import net.addie.aitplus.client.renderer.FlubbleRenderer;
import net.addie.aitplus.client.renderer.DavarosRenderer;
import net.addie.aitplus.client.renderer.ClassicDalekRenderer;

@Environment(EnvType.CLIENT)
public class AitplusModEntityRenderers {
	public static void load() {
		EntityRendererRegistry.register(AitplusModEntities.VICTORIAN_CHAIR, VictorianChairRenderer::new);
		EntityRendererRegistry.register(AitplusModEntities.OFFICE_CHAIR, OfficeChairRenderer::new);
		EntityRendererRegistry.register(AitplusModEntities.FLUTTERWING, FlutterwingRenderer::new);
		EntityRendererRegistry.register(AitplusModEntities.FLY, FlyRenderer::new);
		EntityRendererRegistry.register(AitplusModEntities.FLUBBLE, FlubbleRenderer::new);
		EntityRendererRegistry.register(AitplusModEntities.CLASSIC_DALEK, ClassicDalekRenderer::new);
		EntityRendererRegistry.register(AitplusModEntities.TIME_WAR_DALEK, TimeWarDalekRenderer::new);
		EntityRendererRegistry.register(AitplusModEntities.IMPERIAL_DALEK, ImperialDalekRenderer::new);
		EntityRendererRegistry.register(AitplusModEntities.RENEGADE_DALEK, RenegadeDalekRenderer::new);
		EntityRendererRegistry.register(AitplusModEntities.DAVAROS, DavarosRenderer::new);
		EntityRendererRegistry.register(AitplusModEntities.LAZER, LazerRenderer::new);
	}
}
