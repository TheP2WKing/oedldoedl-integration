package net.thep2wking.oedldoedlintegration.api.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;

public class ModBlockColoredOreBase extends ModBlockColoredResourceBase {
	public ModBlockColoredOreBase(String modid, String name, CreativeTabs tab, String hexColor) {
		super(modid, name + "_ore", tab, hexColor, Material.ROCK, SoundType.STONE, MapColor.STONE, 0,
				ModToolTypes.PICKAXE, 3.0f, 3.0f, 0);
	}

	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT_MIPPED;
	}
}