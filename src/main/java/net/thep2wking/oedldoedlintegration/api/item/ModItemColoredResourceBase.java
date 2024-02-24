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
	public final int color;

	public ModItemColoredResourceBase(String modid, String name, CreativeTabs tab, int color, EnumRarity rarity,
			boolean hasEffect, int tooltipLines, int annotationLines) {
		super(modid, name, tab, rarity, hasEffect, tooltipLines, annotationLines);
		this.color = color;
	}

	@SideOnly(Side.CLIENT)
	public void registerColorRender() {
		Minecraft.getMinecraft().getItemColors().registerItemColorHandler(new IItemColor() {
			@Override
			public int colorMultiplier(ItemStack stack, int tintIndex) {
				return color;
			}
		}, this);
	}
}