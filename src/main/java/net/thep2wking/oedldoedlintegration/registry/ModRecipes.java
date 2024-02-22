package net.thep2wking.oedldoedlintegration.registry;

import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlintegration.OedldoedlIntegration;
import net.thep2wking.oedldoedlintegration.config.IntegrationConfig;

public class ModRecipes {
	public static void registerOreDict() {
		if (IntegrationConfig.RECIPES.DEFAULT_OREDICT) {
			ModLogger.registeredOreDictLogger(OedldoedlIntegration.MODID);
		}
	}

	public static void registerRecipes() {
		if (IntegrationConfig.RECIPES.DEFAULT_RECIPES) {
			ModLogger.registeredRecipesLogger(OedldoedlIntegration.MODID);
		}
	}
}