package net.thep2wking.oedldoedlintegration.api.item;

import net.minecraft.block.Block;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcore.util.ModRarities;
import net.thep2wking.oedldoedlintegration.OedldoedlIntegration;

public class ModItemBlockColoredOreBase extends ModItemBlockColoredResourceBase {
	public static final String GENERIC_NAME = "tile." + OedldoedlIntegration.MODID + ".ore_colorable";

	public ModItemBlockColoredOreBase(Block block, String hexColor) {
		super(block, hexColor, ModRarities.WHITE, false, 0, 0);
	}

	public String getNameWithOutType() {
		String raw = block.getUnlocalizedName().replace("_ore", "");
		return raw.substring((raw.lastIndexOf(".") + 1));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public String getItemStackDisplayName(ItemStack stack) {
		return getNameWithOutType().substring(0, 1).toUpperCase() + getNameWithOutType().substring(1) + " "
				+ I18n.format(GENERIC_NAME + ".name");
	}
}