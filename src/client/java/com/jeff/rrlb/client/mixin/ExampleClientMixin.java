package com.jeff.rrlb.client.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.LoadingOverlay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LoadingOverlay.class)
public class ExampleClientMixin {
	@Inject(at = @At("HEAD"), method = "extractProgressBar", cancellable = true)
	private void init(CallbackInfo info) {
        info.cancel();
	}
}