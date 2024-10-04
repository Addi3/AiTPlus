
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.addie.aitplus.init;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import net.addie.aitplus.client.model.Modeltimewar_dalek;
import net.addie.aitplus.client.model.Modelfly;
import net.addie.aitplus.client.model.Modelflutterwing;
import net.addie.aitplus.client.model.Modelflubble;
import net.addie.aitplus.client.model.Modelclassic_dalek;

@Environment(EnvType.CLIENT)
public class AitplusModModels {
	public static void load() {
		EntityModelLayerRegistry.registerModelLayer(Modelfly.LAYER_LOCATION, Modelfly::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modeltimewar_dalek.LAYER_LOCATION, Modeltimewar_dalek::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelflutterwing.LAYER_LOCATION, Modelflutterwing::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelflubble.LAYER_LOCATION, Modelflubble::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelclassic_dalek.LAYER_LOCATION, Modelclassic_dalek::createBodyLayer);
	}
}
