package net.thep2wking.oedldoedlintegration.config.categories;

import net.minecraftforge.common.config.Config;

public class Properties {
	@Config.Name("Thermal Expansion Named Dusts")
	public boolean THERMAL_EXPANSION_NAMED_DUSTS = true;

	@Config.Name("colors")
    public final Colors COLORS = new Colors();

	public static class Colors {
		@Config.Name("Uranium")
		public int URANIUM = 0x2d9c0c;

		@Config.Name("Titanium")
		public int TITANIUM = 0xc3c5db;
	}
}