
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.addie.aitplus.init;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import net.addie.aitplus.client.model.Modelold_dalek;
import net.addie.aitplus.client.model.Modelnew_dalek;
import net.addie.aitplus.client.model.Modellazer;
import net.addie.aitplus.client.model.Modelfly;
import net.addie.aitplus.client.model.Modelflutterwing;
import net.addie.aitplus.client.model.Modelflubble;
import net.addie.aitplus.client.model.Modeldavaros_chair;
import net.addie.aitplus.client.model.Modeldavaros;

@Environment(EnvType.CLIENT)
public class AitplusModModels {
	public static void load() {
		EntityModelLayerRegistry.registerModelLayer(Modeldavaros.LAYER_LOCATION, Modeldavaros::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modellazer.LAYER_LOCATION, Modellazer::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelfly.LAYER_LOCATION, Modelfly::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelflutterwing.LAYER_LOCATION, Modelflutterwing::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelnew_dalek.LAYER_LOCATION, Modelnew_dalek::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelflubble.LAYER_LOCATION, Modelflubble::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelold_dalek.LAYER_LOCATION, Modelold_dalek::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modeldavaros_chair.LAYER_LOCATION, Modeldavaros_chair::createBodyLayer);
	}
}
