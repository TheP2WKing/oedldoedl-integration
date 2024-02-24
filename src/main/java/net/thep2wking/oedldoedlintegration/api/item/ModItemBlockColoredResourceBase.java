package net.thep2wking.oedldoedlintegration.api.item;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcore.api.item.ModItemBlockBase;

public class ModItemBlockColoredResourceBase extends ModItemBlockBase {
	public final int color;

	public ModItemBlockColoredResourceBase(Block block, int color, EnumRarity rarity, boolean hasEffect,
			int tooltipLines, int annotationLines) {
		super(block, rarity, hasEffect, tooltipLines, annotationLines);
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