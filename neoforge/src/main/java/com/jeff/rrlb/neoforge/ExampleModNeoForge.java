package com.jeff.rrlb.neoforge;

import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;

import com.jeff.rrlb.RRLBCommon;

import static com.jeff.rrlb.RRLBCommon.LOGGER;

@Mod(RRLBCommon.MOD_ID)
public final class ExampleModNeoForge {
    public ExampleModNeoForge() {
        boolean isRRLSPresent = ModList.get().isLoaded("rrls");
        LOGGER.info("Remove Reloading Screen active: " + isRRLSPresent);
        if (!isRRLSPresent) {
            LOGGER.warn("Remove Reloading Screen is not present!");
        }
        // Run our common setup.
        RRLBCommon.init();
    }
}
