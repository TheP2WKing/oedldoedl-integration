package net.thep2wking.oedldoedlintegration.api.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcore.api.block.ModBlockBase;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;

public class ModBlockColoredResourceBase extends ModBlockBase {
	public final String hexColor;

	public ModBlockColoredResourceBase(String modid, String name, CreativeTabs tab, String hexColor, Material material,
			SoundType sound, MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness,
			float resistance, int lightLevel) {
		super(modid, name, tab, material, sound, mapColor, harvestLevel, toolType, hardness, resistance, lightLevel);
		this.hexColor = hexColor;
	}

	@SideOnly(Side.CLIENT)
	public void registerColorRender() {
		Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new IBlockColor() {
			@Override
			public int colorMultiplier(IBlockState state, IBlockAccess worldIn, BlockPos pos, int tintIndex) {
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