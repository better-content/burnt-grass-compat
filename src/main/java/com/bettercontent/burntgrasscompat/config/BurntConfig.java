package com.bettercontent.burntgrasscompat.config;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModList;
public final class BurntConfig {
 public static final ForgeConfigSpec SPEC; private static final ForgeConfigSpec.BooleanValue ENABLED;
 static { var b=new ForgeConfigSpec.Builder(); b.push("burnt"); ENABLED=b.define("moddedGrassReplacements",true); b.pop(); SPEC=b.build(); }
 private BurntConfig() {} public static boolean burntModdedGrassReplacements(){ return ModList.get().isLoaded("burnt") && (!SPEC.isLoaded() || ENABLED.get()); }
}
