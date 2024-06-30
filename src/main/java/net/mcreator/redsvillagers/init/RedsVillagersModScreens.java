
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.redsvillagers.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.redsvillagers.client.gui.ArrowSmithGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RedsVillagersModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(RedsVillagersModMenus.ARROW_SMITH_GUI.get(), ArrowSmithGUIScreen::new);
		});
	}
}
