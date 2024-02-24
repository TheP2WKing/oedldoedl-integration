package net.thep2wking.oedldoedlintegration.api;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlintegration.OedldoedlIntegration;
import net.thep2wking.oedldoedlintegration.api.block.ModBlockColoredResourceBase;
import net.thep2wking.oedldoedlintegration.api.item.ModItemBlockColoredResourceBase;
import net.thep2wking.oedldoedlintegration.api.item.ModItemBlockColoredStorageBlockBase;
import net.thep2wking.oedldoedlintegration.api.item.ModItemColoredCoinBase;
import net.thep2wking.oedldoedlintegration.api.item.ModItemColoredDustBase;
import net.thep2wking.oedldoedlintegration.api.item.ModItemColoredGearBase;
import net.thep2wking.oedldoedlintegration.api.item.ModItemColoredIngotBase;
import net.thep2wking.oedldoedlintegration.api.item.ModItemColoredNuggetBase;
import net.thep2wking.oedldoedlintegration.api.item.ModItemColoredPlateBase;
import net.thep2wking.oedldoedlintegration.api.item.ModItemColoredResourceBase;

public class ModIntegrationRegistryHelper {
	// register item colors
	@SideOnly(Side.CLIENT)
	public static void registerItemColors(String modId) {
		for (Item item : ForgeRegistries.ITEMS.getValuesCollection()) {
			if (item.getRegistryName().getResourceDomain().equals(modId)
					&& item instanceof ModItemColoredResourceBase) {
				((ModItemColoredResourceBase) item).registerColorRender();
			}
		}
	}

	// // register item colors
	// @SideOnly(Side.CLIENT)
	// public static void registerItemBlockColors(String modId) {
	// for (Item item : ForgeRegistries.ITEMS.getValuesCollection()) {
	// if (item.getRegistryName().getResourceDomain().equals(modId)
	// && item instanceof ModItemBlockColoredResourceBase) {
	// ((ModItemBlockColoredResourceBase) item).registerColorRender();
	// }
	// }
	// }

	// register block colors
	@SideOnly(Side.CLIENT)
	public static void registerBlockColors(String modId) {
		for (Block block : ForgeRegistries.BLOCKS.getValuesCollection()) {
			if (block.getRegistryName().getResourceDomain().equals(modId)
					&& block instanceof ModBlockColoredResourceBase) {
				((ModBlockColoredResourceBase) block).registerColorRender();
			}
		}
		for (Item item : ForgeRegistries.ITEMS.getValuesCollection()) {
			if (item.getRegistryName().getResourceDomain().equals(modId)
					&& item instanceof ModItemBlockColoredResourceBase) {
				((ModItemBlockColoredResourceBase) item).registerColorRender();
			}
		}
	}

	// use different models for different resource types
	@SideOnly(Side.CLIENT)
	public static void registerModels(ModelRegistryEvent event, String modId) {
		ModLogger.registeredModelsLogger(modId);
		for (Item item : ForgeRegistries.ITEMS.getValuesCollection()) {
			if (item.getRegistryName().getResourceDomain().equals(modId) && item instanceof ModItemColoredIngotBase) {
				ModelLoader.setCustomModelResourceLocation(item, 0,
						new ModelResourceLocation(OedldoedlIntegration.MODID + ":ingot_colorable", "normal"));
			} else if (item.getRegistryName().getResourceDomain().equals(modId)
					&& item instanceof ModItemColoredNuggetBase) {
				ModelLoader.setCustomModelResourceLocation(item, 0,
						new ModelResourceLocation(OedldoedlIntegration.MODID + ":nugget_colorable", "normal"));
			} else if (item.getRegistryName().getResourceDomain().equals(modId)
					&& item instanceof ModItemColoredDustBase) {
				ModelLoader.setCustomModelResourceLocation(item, 0,
						new ModelResourceLocation(OedldoedlIntegration.MODID + ":dust_colorable", "normal"));
			} else if (item.getRegistryName().getResourceDomain().equals(modId)
					&& item instanceof ModItemColoredPlateBase) {
				ModelLoader.setCustomModelResourceLocation(item, 0,
						new ModelResourceLocation(OedldoedlIntegration.MODID + ":plate_colorable", "normal"));
			} else if (item.getRegistryName().getResourceDomain().equals(modId)
					&& item instanceof ModItemColoredGearBase) {
				ModelLoader.setCustomModelResourceLocation(item, 0,
						new ModelResourceLocation(OedldoedlIntegration.MODID + ":gear_colorable", "normal"));
			} else if (item.getRegistryName().getResourceDomain().equals(modId)
					&& item instanceof ModItemColoredCoinBase) {
				ModelLoader.setCustomModelResourceLocation(item, 0,
						new ModelResourceLocation(OedldoedlIntegration.MODID + ":coin_colorable", "normal"));
			} else if (item.getRegistryName().getResourceDomain().equals(modId)
					&& item instanceof ModItemBlockColoredStorageBlockBase) {
				ModelLoader.setCustomModelResourceLocation(item, 0,
						new ModelResourceLocation(OedldoedlIntegration.MODID + ":storage_block_colorable", "normal"));
			} else if (item.getRegistryName().getResourceDomain().equals(modId)
					&& !(item instanceof ModItemColoredResourceBase)
					&& !(item instanceof ModItemBlockColoredResourceBase)) {
				ModelLoader.setCustomModelResourceLocation(item, 0,
						new ModelResourceLocation(item.getRegistryName(), "normal"));
			}
		}
		for (Block block : ForgeRegistries.BLOCKS.getValuesCollection()) {
			if (block.getRegistryName().getResourceDomain().equals(modId)
					&& block instanceof ModBlockColoredResourceBase) {
				ModelLoader.setCustomStateMapper(block, new StateMapperBase() {
					@Override
					public ModelResourceLocation getModelResourceLocation(IBlockState state) {
						return new ModelResourceLocation(OedldoedlIntegration.MODID + ":storage_block_colorable",
								"normal");
					}
				});
			}
		}
	}
}
