package com.jeff.rrlb.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;

import static com.jeff.rrlb.RemoveResourceLoadingBar.LOGGER;

public class RemoveResourceLoadingBarClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
        boolean bl = FabricLoader.getInstance().isModLoaded("rrls");
        LOGGER.info("Remove Reloading Screen active: " + bl);
        if (!bl) {
            LOGGER.warn("Remove Reloading Screen is not present!");
        }
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
	}
}