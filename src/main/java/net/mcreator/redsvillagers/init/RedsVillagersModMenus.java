
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.redsvillagers.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.redsvillagers.world.inventory.ArrowSmithGUIMenu;
import net.mcreator.redsvillagers.RedsVillagersMod;

public class RedsVillagersModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, RedsVillagersMod.MODID);
	public static final RegistryObject<MenuType<ArrowSmithGUIMenu>> ARROW_SMITH_GUI = REGISTRY.register("arrow_smith_gui", () -> IForgeMenuType.create(ArrowSmithGUIMenu::new));
}
