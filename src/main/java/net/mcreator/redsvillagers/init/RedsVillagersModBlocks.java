
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.redsvillagers.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.redsvillagers.block.ArrowSmithsWorkbenchBlock;
import net.mcreator.redsvillagers.RedsVillagersMod;

public class RedsVillagersModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RedsVillagersMod.MODID);
	public static final RegistryObject<Block> ARROW_SMITHS_WORKBENCH = REGISTRY.register("arrow_smiths_workbench", () -> new ArrowSmithsWorkbenchBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
