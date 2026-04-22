package com.jeff.rrlb.fabric;

import net.fabricmc.api.ModInitializer;

import com.jeff.rrlb.RRLBCommon;

public final class RRLBFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        RRLBCommon.init();
    }
}
