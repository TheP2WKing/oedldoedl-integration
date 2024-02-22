package net.thep2wking.oedldoedlintegration;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcore.OedldoedlCore;
import net.thep2wking.oedldoedlcore.config.CoreConfig;
import net.thep2wking.oedldoedlcore.init.ModItems;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlcore.util.ModReferences;
import net.thep2wking.oedldoedlintegration.registry.ModRecipes;
import net.thep2wking.oedldoedlintegration.util.proxy.CommonProxy;

@Mod(modid = OedldoedlIntegration.MODID, name = OedldoedlIntegration.NAME, version = OedldoedlIntegration.VERSION, dependencies = OedldoedlIntegration.DEPENDENCIES)
public class OedldoedlIntegration {
    public static final String MODID = "oedldoedlintegration";
    public static final String PREFIX = MODID + ":";
    public static final String MC_VERSION = "1.12.2";
    public static final String NAME = "Oedldoedl Integration";
    public static final String VERSION = MC_VERSION + "-" + "4.0.0";
    public static final String DEPENDENCIES = "required-after:forge@[14.23.5.2847,);required-after:oedldoedlcore@[1.12.2-4.0.0,);required-after:oedldoedlresources@[1.12.2-4.0.0,);required-after:oedldoedlgear@[1.12.2-4.0.0,);required-after:oedldoedlcuriosity@[1.12.2-4.0.0,);required-after:oedldoedlconstruct@[1.12.2-4.0.0,);required-after:oedldoedlexplosives@[1.12.2-4.0.0,);required-after:oedldoedltechnology@[1.12.2-4.0.0,);required-after:oedldoedlmusic@[1.12.2-4.0.0,);";
    public static final String CLIENT_PROXY_CLASS = "net.thep2wking.oedldoedlintegration.util.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "net.thep2wking.oedldoedlintegration.util.proxy.ServerProxy";

    @Instance
    public static OedldoedlIntegration INSTANCE;

    @SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = SERVER_PROXY_CLASS)
    public static CommonProxy PROXY;

	public static final CreativeTabs TAB = new CreativeTabs(OedldoedlIntegration.MODID + ".name") {
		@Override
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.INTEGRATION_ICON, 1, 0);
		}

		@Override
		@SideOnly(Side.CLIENT)
		public ResourceLocation getBackgroundImage() {
			return ModReferences.CREATIVE_TAB_DARK;
		}
	};
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModLogger.preInitLogger(MODID);
        PROXY.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModLogger.initLogger(MODID);
        ModRecipes.registerOreDict();
        ModRecipes.registerRecipes();
        PROXY.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        ModLogger.postInitLogger(MODID);
        PROXY.postInit(event);
    }

    @Mod.EventHandler
    public void loadComplete(FMLLoadCompleteEvent event) {
        ModLogger.loadCompleteLogger(MODID, VERSION);
    }

    @Mod.EventBusSubscriber
    public static class ModJoinMessage {
        @SubscribeEvent
        public static void addJoinMessage(PlayerLoggedInEvent event) {
            if (CoreConfig.LOGGING.JOIN_MESSAGES) {
                event.player.sendMessage(ModReferences.defaultJoinMessage(NAME, OedldoedlCore.MODID, VERSION));
            }
        }
    }
}