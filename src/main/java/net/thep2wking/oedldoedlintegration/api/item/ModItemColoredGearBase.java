package net.thep2wking.oedldoedlintegration.api.item;

import net.minecraft.client.resources.I18n;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcore.util.ModRarities;
import net.thep2wking.oedldoedlintegration.OedldoedlIntegration;

public class ModItemColoredGearBase extends ModItemColoredResourceBase {
	public static final String GENERIC_NAME = "item." + OedldoedlIntegration.MODID + ".gear_colorable";

	public ModItemColoredGearBase(String modid, String name, CreativeTabs tab, int color) {
		super(modid, name + "_gear", tab, color, ModRarities.WHITE, false, 0, 0);
	}

	public String getNameWithOutType() {
		String raw = name.replace("_gear", "");
		return raw.substring(1);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public String getItemStackDisplayName(ItemStack stack) {
		return name.substring(0, 1).toUpperCase() + getNameWithOutType() + " " + I18n.format(GENERIC_NAME + ".name");
	}
}