
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.addie.aitplus.init;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import net.addie.aitplus.client.model.Modelfly;
import net.addie.aitplus.client.model.Modelflutterwing;

@Environment(EnvType.CLIENT)
public class AitplusModModels {
	public static void load() {
		EntityModelLayerRegistry.registerModelLayer(Modelfly.LAYER_LOCATION, Modelfly::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelflutterwing.LAYER_LOCATION, Modelflutterwing::createBodyLayer);
	}
}
