package com.bettercontent.burntgrasscompat;

import com.llamalad7.mixinextras.MixinExtrasBootstrap;
import com.bettercontent.burntgrasscompat.config.BurntConfig;
import com.bettercontent.burntgrasscompat.compat.BurntGrassPalette;
import com.bettercontent.burntgrasscompat.gametest.BurntGrassReplacementGameTests;
import net.minecraftforge.event.RegisterGameTestsEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ModMain.MOD_ID)
public final class ModMain {
    public static final String MOD_ID = "burnt_grass_compat";

    public ModMain() {
        MixinExtrasBootstrap.init();
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, BurntConfig.SPEC);
        BurntGrassPalette.BLOCKS.register(bus);
        BurntGrassPalette.ITEMS.register(bus);
        bus.addListener(this::registerTests);
    }
    private void registerTests(RegisterGameTestsEvent event) {
        event.register(BurntGrassReplacementGameTests.class);
    }
}
