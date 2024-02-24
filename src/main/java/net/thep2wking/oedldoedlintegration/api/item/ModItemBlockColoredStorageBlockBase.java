package net.thep2wking.oedldoedlintegration.api.item;

import net.minecraft.block.Block;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcore.util.ModRarities;
import net.thep2wking.oedldoedlintegration.OedldoedlIntegration;

public class ModItemBlockColoredStorageBlockBase extends ModItemBlockColoredResourceBase {
	public static final String GENERIC_NAME = "tile." + OedldoedlIntegration.MODID + ".storage_block_colorable";

	public ModItemBlockColoredStorageBlockBase(Block block, int color) {
		super(block, color, ModRarities.WHITE, false, 0, 0);
	}

	public String getNameWithOutType() {
		String raw = block.getUnlocalizedName().replace("_block", "");
		return raw.substring((raw.lastIndexOf(".") + 1));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public String getItemStackDisplayName(ItemStack stack) {
		return I18n.format(GENERIC_NAME + ".name") + " " + getNameWithOutType().substring(0, 1).toUpperCase()
				+ getNameWithOutType().substring(1);
	}
}