
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.redsvillagers.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.redsvillagers.item.HasteItem;
import net.mcreator.redsvillagers.RedsVillagersMod;

public class RedsVillagersModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RedsVillagersMod.MODID);
	public static final RegistryObject<Item> ARROW_SMITHS_WORKBENCH = block(RedsVillagersModBlocks.ARROW_SMITHS_WORKBENCH);
	public static final RegistryObject<Item> HASTE = REGISTRY.register("haste", () -> new HasteItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
