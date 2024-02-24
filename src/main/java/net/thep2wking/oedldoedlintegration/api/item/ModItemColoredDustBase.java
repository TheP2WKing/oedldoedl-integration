package net.thep2wking.oedldoedlintegration.api.item;

import net.minecraft.client.resources.I18n;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcore.util.ModRarities;
import net.thep2wking.oedldoedlintegration.OedldoedlIntegration;
import net.thep2wking.oedldoedlintegration.config.IntegrationConfig;

public class ModItemColoredDustBase extends ModItemColoredResourceBase {
	public static final String GENERIC_NAME = "item." + OedldoedlIntegration.MODID + ".dust_colorable";
	public static final String THERMAL_NAME = "item." + OedldoedlIntegration.MODID + ".pulverized_colorable";

	public ModItemColoredDustBase(String modid, String name, CreativeTabs tab, String hexColor) {
		super(modid, name + "_dust", tab, hexColor, ModRarities.WHITE, false, 0, 0);
	}

	public String getNameWithOutType() {
		String raw = name.replace("_dust", "");
		return raw.substring(1);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public String getItemStackDisplayName(ItemStack stack) {
		if (IntegrationConfig.PROPERTIES.THERMAL_EXPANSION_NAMED_DUSTS) {
			return I18n.format(THERMAL_NAME + ".name") + " " + name.substring(0, 1).toUpperCase()
					+ getNameWithOutType();
		} else {
			return name.substring(0, 1).toUpperCase() + getNameWithOutType() + " "
					+ I18n.format(GENERIC_NAME + ".name");
		}
	}
}