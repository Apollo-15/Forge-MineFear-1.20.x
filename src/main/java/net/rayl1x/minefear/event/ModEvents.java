package net.rayl1x.minefear.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.rayl1x.minefear.MineFear;
import net.rayl1x.minefear.item.ModItems;

import java.util.List;

@Mod.EventBusSubscriber(modid = MineFear.MODID)
public class ModEvents {

    @SubscribeEvent
    public static void addCustomTrade(VillagerTradesEvent event) {

        if (event.getType() == VillagerProfession.ARMORER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // Level 1 - Tin armor

            trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 3),
                    new ItemStack(ModItems.TIN_HELMET.get(), 1),
                    5, 10, 0.05f));

            trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    new ItemStack(ModItems.TIN_CHESTPLATE.get(), 1),
                    5, 10, 0.05f));

            trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 4),
                    new ItemStack(ModItems.TIN_LEGGINGS.get(), 1),
                    5, 10, 0.05f));

            trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 3),
                    new ItemStack(ModItems.TIN_BOOTS.get(), 1),
                    5, 10, 0.05f));

            // Level 4 - Titanium armor

            trades.get(4).add((entity, randomSource) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 32),
                    new ItemStack(ModItems.TITANIUM_HELMET.get(), 1),
                    3, 8, 0.02f));

            trades.get(4).add((entity, randomSource) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 48),
                    new ItemStack(ModItems.TITANIUM_CHESTPLATE.get(), 1),
                    3, 8, 0.02f));

            trades.get(4).add((entity, randomSource) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 42),
                    new ItemStack(ModItems.TITANIUM_LEGGINGS.get(), 1),
                    3, 8, 0.02f));

            trades.get(4).add((entity, randomSource) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 29),
                    new ItemStack(ModItems.TITANIUM_BOOTS.get(), 1),
                    3, 8, 0.02f));
        }

            // Level 2: Tin tools

        if (event.getType() == VillagerProfession.TOOLSMITH) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();


            trades.get(2).add((pTrader, randomSource) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5 + randomSource.nextInt(11)),
                    new ItemStack(ModItems.TIN_PICKAXE.get(), 1),
                    5, 10, 0.05f));

            // Tin Axe: 4-14 emeralds
            trades.get(2).add((pTrader, randomSource) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 4 + randomSource.nextInt(11)),
                    new ItemStack(ModItems.TIN_AXE.get(), 1),
                    5, 10, 0.05f));

            // Tin Shovel: 5-15 emeralds
            trades.get(2).add((pTrader, randomSource) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5 + randomSource.nextInt(11)),
                    new ItemStack(ModItems.TIN_SHOVEL.get(), 1),
                    5, 10, 0.05f));

            // Tin Hoe: 3-12 emeralds
            trades.get(2).add((pTrader, randomSource) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 3 + randomSource.nextInt(10)),
                    new ItemStack(ModItems.TIN_HOE.get(), 1),
                    5, 10, 0.05f));
        }
    }
}
