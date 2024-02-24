package net.thep2wking.oedldoedlintegration.util.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.thep2wking.oedldoedlintegration.OedldoedlIntegration;
import net.thep2wking.oedldoedlintegration.api.ModIntegrationRegistryHelper;

public class ClientProxy extends CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
	}

	public void init(FMLInitializationEvent event) {
		super.init(event);
		ModIntegrationRegistryHelper.registerItemColors(OedldoedlIntegration.MODID);
		ModIntegrationRegistryHelper.registerBlockColors(OedldoedlIntegration.MODID);
	}

	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
}