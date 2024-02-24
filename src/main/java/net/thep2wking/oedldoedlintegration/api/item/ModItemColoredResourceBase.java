package net.thep2wking.oedldoedlintegration.api.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcore.api.item.ModItemBase;

public class ModItemColoredResourceBase extends ModItemBase {
	public final String hexColor;

	public ModItemColoredResourceBase(String modid, String name, CreativeTabs tab, String hexColor, EnumRarity rarity,
			boolean hasEffect, int tooltipLines, int annotationLines) {
		super(modid, name, tab, rarity, hasEffect, tooltipLines, annotationLines);
		this.hexColor = hexColor;
	}

	@SideOnly(Side.CLIENT)
	public void registerColorRender() {
		Minecraft.getMinecraft().getItemColors().registerItemColorHandler(new IItemColor() {
			@Override
			public int colorMultiplier(ItemStack stack, int tintIndex) {
				if (isValidHexColor(hexColor)) {
					return hexToInt(hexColor);
				} else {
					return 0xffffff;
				}
			}
		}, this);
	}

	public int hexToInt(String hexColor) {
		return Integer.parseInt(hexColor.substring(1), 16);
	}

	public boolean isValidHexColor(String hexColor) {
		String hexPattern = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";
		return hexColor.matches(hexPattern);
	}
}