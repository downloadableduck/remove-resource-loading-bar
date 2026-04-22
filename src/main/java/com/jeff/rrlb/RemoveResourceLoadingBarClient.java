package com.jeff.rrlb;

import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import net.neoforged.neoforge.common.NeoForge;

import static com.jeff.rrlb.RemoveResourceLoadingBar.LOGGER;

// This class will not load on dedicated servers. Accessing client side code from here is safe.
@Mod(value = RemoveResourceLoadingBar.MODID, dist = Dist.CLIENT)
// You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
@EventBusSubscriber(modid = RemoveResourceLoadingBar.MODID, value = Dist.CLIENT)
public class RemoveResourceLoadingBarClient {
    public RemoveResourceLoadingBarClient(ModContainer container) {
        // Allows NeoForge to create a config screen for this mod's configs.
        // The config screen is accessed by going to the Mods screen > clicking on your mod > clicking on config.
        // Do not forget to add translations for your config options to the en_us.json file.
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        boolean bl = ModList.get().isLoaded("rrls");
        LOGGER.info("Remove Reloading Screen active: " + bl);
        if (!bl) {
            LOGGER.warn("Remove Reloading Screen is not present!");
        }
        // Some client setup code
        RemoveResourceLoadingBar.LOGGER.info("HELLO FROM CLIENT SETUP");
        RemoveResourceLoadingBar.LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
    }
}
