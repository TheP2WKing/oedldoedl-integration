package net.thep2wking.oedldoedlintegration.init;

import net.minecraft.item.Item;
import net.thep2wking.oedldoedlintegration.OedldoedlIntegration;
import net.thep2wking.oedldoedlintegration.api.item.ModItemBlockColoredStorageBlockBase;
import net.thep2wking.oedldoedlintegration.api.item.ModItemColoredCoinBase;
import net.thep2wking.oedldoedlintegration.api.item.ModItemColoredDustBase;
import net.thep2wking.oedldoedlintegration.api.item.ModItemColoredGearBase;
import net.thep2wking.oedldoedlintegration.api.item.ModItemColoredIngotBase;
import net.thep2wking.oedldoedlintegration.api.item.ModItemColoredNuggetBase;
import net.thep2wking.oedldoedlintegration.api.item.ModItemColoredPlateBase;
import net.thep2wking.oedldoedlintegration.config.IntegrationConfig;

public class ModItems {
	public static final Item URANIUM_BLOCK = new ModItemBlockColoredStorageBlockBase(ModBlocks.URANIUM, IntegrationConfig.PROPERTIES.COLORS.URANIUM);
	public static final Item TITANIUM_BLOCK = new ModItemBlockColoredStorageBlockBase(ModBlocks.TITANIUM, IntegrationConfig.PROPERTIES.COLORS.TITANIUM);

	public static final Item URANIUM_INGOT = new ModItemColoredIngotBase(OedldoedlIntegration.MODID, "uranium", OedldoedlIntegration.TAB, IntegrationConfig.PROPERTIES.COLORS.URANIUM);
	public static final Item URANIUM_NUGGET = new ModItemColoredNuggetBase(OedldoedlIntegration.MODID, "uranium", OedldoedlIntegration.TAB, IntegrationConfig.PROPERTIES.COLORS.URANIUM);
	public static final Item URANIUM_DUST = new ModItemColoredDustBase(OedldoedlIntegration.MODID, "uranium", OedldoedlIntegration.TAB, IntegrationConfig.PROPERTIES.COLORS.URANIUM);
	public static final Item URANIUM_PLATE = new ModItemColoredPlateBase(OedldoedlIntegration.MODID, "uranium", OedldoedlIntegration.TAB, IntegrationConfig.PROPERTIES.COLORS.URANIUM);
	public static final Item URANIUM_GEAR = new ModItemColoredGearBase(OedldoedlIntegration.MODID, "uranium", OedldoedlIntegration.TAB, IntegrationConfig.PROPERTIES.COLORS.URANIUM);
	public static final Item URANIUM_COIN = new ModItemColoredCoinBase(OedldoedlIntegration.MODID, "uranium", OedldoedlIntegration.TAB, IntegrationConfig.PROPERTIES.COLORS.URANIUM);


	public static final Item TITANIUM_INGOT = new ModItemColoredIngotBase(OedldoedlIntegration.MODID, "titanium", OedldoedlIntegration.TAB, IntegrationConfig.PROPERTIES.COLORS.TITANIUM);
	public static final Item TITANIUM_NUGGET = new ModItemColoredNuggetBase(OedldoedlIntegration.MODID, "titanium", OedldoedlIntegration.TAB, IntegrationConfig.PROPERTIES.COLORS.TITANIUM);
	public static final Item TITANIUM_DUST = new ModItemColoredDustBase(OedldoedlIntegration.MODID, "titanium", OedldoedlIntegration.TAB, IntegrationConfig.PROPERTIES.COLORS.TITANIUM);
	public static final Item TITANIUM_PLATE = new ModItemColoredPlateBase(OedldoedlIntegration.MODID, "titanium", OedldoedlIntegration.TAB, IntegrationConfig.PROPERTIES.COLORS.TITANIUM);
	public static final Item TITANIUM_GEAR = new ModItemColoredGearBase(OedldoedlIntegration.MODID, "titanium", OedldoedlIntegration.TAB, IntegrationConfig.PROPERTIES.COLORS.TITANIUM);
	public static final Item TITANIUM_COIN = new ModItemColoredCoinBase(OedldoedlIntegration.MODID, "titanium", OedldoedlIntegration.TAB, IntegrationConfig.PROPERTIES.COLORS.TITANIUM);
}