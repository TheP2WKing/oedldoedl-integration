package net.thep2wking.oedldoedlintegration.config;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.thep2wking.oedldoedlcore.util.ModReferences;
import net.thep2wking.oedldoedlintegration.OedldoedlIntegration;
import net.thep2wking.oedldoedlintegration.config.categories.Content;
import net.thep2wking.oedldoedlintegration.config.categories.Properties;
import net.thep2wking.oedldoedlintegration.config.categories.Recipes;

@Config(modid = OedldoedlIntegration.MODID, name = ModReferences.BASE_MODID + "/"
        + OedldoedlIntegration.MODID, category = OedldoedlIntegration.MODID)
public class IntegrationConfig {
    @Config.Name("content")
    public static final Content CONTENT = new Content();

    @Config.Name("properties")
    public static final Properties PROPERTIES = new Properties();

    @Config.Name("recipes")
    public static final Recipes RECIPES = new Recipes();
    
    @Mod.EventBusSubscriber
    public static class ConfigHolder {
        @SubscribeEvent
        public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(OedldoedlIntegration.MODID)) {
                ConfigManager.sync(OedldoedlIntegration.MODID, Config.Type.INSTANCE);
            }
        }
    }
}