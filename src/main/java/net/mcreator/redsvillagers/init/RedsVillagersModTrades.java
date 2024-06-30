
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.redsvillagers.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class RedsVillagersModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == RedsVillagersModVillagerProfessions.BETTER_FLETCHER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.STICK, 16),

					new ItemStack(Items.EMERALD, 2), 200, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.BOW),

					new ItemStack(Blocks.EMERALD_BLOCK), 5, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(Items.STRING, 4), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.ARROW, 8),

					new ItemStack(Items.EMERALD), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4),

					new ItemStack(RedsVillagersModItems.HASTE.get()), 10, 5, 0.05f));
		}
	}
}
