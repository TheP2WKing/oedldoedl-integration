package net.thep2wking.oedldoedlintegration.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlcore.util.ModRegistryHelper;
import net.thep2wking.oedldoedlintegration.OedldoedlIntegration;
import net.thep2wking.oedldoedlintegration.api.ModIntegrationRegistryHelper;
import net.thep2wking.oedldoedlintegration.init.ModBlocks;
import net.thep2wking.oedldoedlintegration.init.ModItems;

@Mod.EventBusSubscriber
public class ModRegistry {
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		ModIntegrationRegistryHelper.registerModels(event, OedldoedlIntegration.MODID);
	}

	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		ModLogger.registeredBlocksLogger(OedldoedlIntegration.MODID);

		ModRegistryHelper.registerBlock(event, ModBlocks.URANIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.TITANIUM);
	}

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		ModLogger.registeredItemsLogger(OedldoedlIntegration.MODID);

		ModRegistryHelper.registerItemBlock(event, ModItems.URANIUM_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.TITANIUM_BLOCK);

		ModRegistryHelper.registerItem(event, ModItems.URANIUM_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.URANIUM_NUGGET);
		ModRegistryHelper.registerItem(event, ModItems.URANIUM_DUST);
		ModRegistryHelper.registerItem(event, ModItems.URANIUM_PLATE);
		ModRegistryHelper.registerItem(event, ModItems.URANIUM_GEAR);
		ModRegistryHelper.registerItem(event, ModItems.URANIUM_COIN);

		ModRegistryHelper.registerItem(event, ModItems.TITANIUM_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.TITANIUM_NUGGET);
		ModRegistryHelper.registerItem(event, ModItems.TITANIUM_DUST);
		ModRegistryHelper.registerItem(event, ModItems.TITANIUM_PLATE);
		ModRegistryHelper.registerItem(event, ModItems.TITANIUM_GEAR);
		ModRegistryHelper.registerItem(event, ModItems.TITANIUM_COIN);
	}
}