package net.thep2wking.oedldoedlintegration.init;

import net.minecraft.block.Block;
import net.thep2wking.oedldoedlintegration.OedldoedlIntegration;
import net.thep2wking.oedldoedlintegration.api.block.ModBlockColoredOreBase;
import net.thep2wking.oedldoedlintegration.api.block.ModBlockColoredStorageBlockBase;
import net.thep2wking.oedldoedlintegration.config.IntegrationConfig;

public class ModBlocks {
	public static final Block URANIUM_ORE = new ModBlockColoredOreBase(OedldoedlIntegration.MODID, "uranium", OedldoedlIntegration.TAB, IntegrationConfig.PROPERTIES.COLORS.URANIUM);
	public static final Block TITANIUM_ORE = new ModBlockColoredOreBase(OedldoedlIntegration.MODID, "titanium", OedldoedlIntegration.TAB, IntegrationConfig.PROPERTIES.COLORS.TITANIUM);

	public static final Block URANIUM = new ModBlockColoredStorageBlockBase(OedldoedlIntegration.MODID, "uranium", OedldoedlIntegration.TAB, IntegrationConfig.PROPERTIES.COLORS.URANIUM);
	public static final Block TITANIUM = new ModBlockColoredStorageBlockBase(OedldoedlIntegration.MODID, "titanium", OedldoedlIntegration.TAB, IntegrationConfig.PROPERTIES.COLORS.TITANIUM);
}