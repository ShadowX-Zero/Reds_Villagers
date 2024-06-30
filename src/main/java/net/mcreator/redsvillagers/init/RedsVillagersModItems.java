
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.redsvillagers.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.redsvillagers.item.CockItem;
import net.mcreator.redsvillagers.RedsVillagersMod;

public class RedsVillagersModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RedsVillagersMod.MODID);
	public static final RegistryObject<Item> CREAM = REGISTRY.register("cream", () -> new CockItem());
	// Start of user code block custom items
	// End of user code block custom items
}
