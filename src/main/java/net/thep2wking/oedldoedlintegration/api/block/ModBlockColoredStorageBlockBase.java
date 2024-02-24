package net.thep2wking.oedldoedlintegration.api.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;

public class ModBlockColoredStorageBlockBase extends ModBlockColoredResourceBase {
	public ModBlockColoredStorageBlockBase(String modid, String name, CreativeTabs tab, int color) {
		super(modid, name + "_block", tab, color, Material.IRON, SoundType.METAL, MapColor.WHITE_STAINED_HARDENED_CLAY,
				1, ModToolTypes.PICKAXE, 5.0f, 5.0f, 0);
	}
}