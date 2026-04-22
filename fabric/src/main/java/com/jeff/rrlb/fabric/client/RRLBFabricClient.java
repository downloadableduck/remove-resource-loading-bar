package com.jeff.rrlb.fabric.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;

import static com.jeff.rrlb.RRLBCommon.LOGGER;

public final class RRLBFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        boolean isRRLSPresent = FabricLoader.getInstance().isModLoaded("rrls");
        LOGGER.info("Remove Reloading Screen active: " + isRRLSPresent);
        if (!isRRLSPresent) {
            LOGGER.warn("Remove Reloading Screen is not present!");
        }
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
    }
}
