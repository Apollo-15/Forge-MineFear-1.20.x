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
import java.util.Random;

@Mod.EventBusSubscriber(modid = MineFear.MODID)
public class ModEvents {

    @SubscribeEvent
    public static void addCustomTrade(VillagerTradesEvent event) {

        // ARMORER

        if(event.getType() == VillagerProfession.ARMORER) {
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
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(ModItems.TIN_BOOTS.get(), 1),
                    5, 10, 0.05f));

            // Level 4 - Titanium armor

            trades.get(4).add((entity, randomSource) -> {
                int titanium_helmet_cost = 30 + randomSource.nextInt(11);
                return new MerchantOffer(
                        new ItemStack(Items.EMERALD, titanium_helmet_cost),
                        new ItemStack(ModItems.TITANIUM_HELMET.get(), 1),
                        3, 8, 0.02f);
            });

            trades.get(4).add((entity, randomSource) -> {
                int titanium_chestplate_cost = 42 + randomSource.nextInt(10);
                return new MerchantOffer(
                        new ItemStack(Items.EMERALD, titanium_chestplate_cost),
                        new ItemStack(ModItems.TITANIUM_CHESTPLATE.get(), 1),
                        3, 8, 0.02f);
            });

            trades.get(4).add((entity, randomSource) -> {
                int titanium_leggings_cost = 37 + randomSource.nextInt(10);
                return new MerchantOffer(
                        new ItemStack(Items.EMERALD, titanium_leggings_cost),
                        new ItemStack(ModItems.TITANIUM_LEGGINGS.get(), 1),
                        3, 8, 0.02f);
            });

            trades.get(4).add((entity, randomSource) -> {
                int titanium_boots_cost = 26 + randomSource.nextInt(10);
                return new MerchantOffer(
                        new ItemStack(Items.EMERALD, titanium_boots_cost),
                        new ItemStack(ModItems.TITANIUM_BOOTS.get(), 1),
                        3, 8, 0.02f);
            });
        }

        //TOOLSMITH

        if(event.getType() == VillagerProfession.TOOLSMITH) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // Level 1: Tin tools

            // Tin Axe

            trades.get(1).add((entity, randomSource) -> {
                int tin_axe_cost = 4 + randomSource.nextInt(11);
                return new MerchantOffer(
                    new ItemStack(Items.EMERALD, tin_axe_cost),
                    new ItemStack(ModItems.TIN_AXE.get(), 1),
                    5, 10, 0.05f);
            });

            // Tin shovel

            trades.get(1).add((entity, randomSource) -> {
                int tin_shovel_cost = 5 + randomSource.nextInt(11);
                return new MerchantOffer(
                        new ItemStack(Items.EMERALD, tin_shovel_cost),
                        new ItemStack(ModItems.TIN_SHOVEL.get(), 1),
                        5, 10, 0.05f);
            });

            // Tin pickaxe

            trades.get(1).add((entity, randomSource) -> {
                int tin_pickaxe_cost = 5 + randomSource.nextInt(11);
                return new MerchantOffer(
                        new ItemStack(Items.EMERALD, tin_pickaxe_cost),
                        new ItemStack(ModItems.TIN_PICKAXE.get(), 1),
                        5, 10, 0.05f);
            });

            // Tin Hoe

            trades.get(1).add((entity, randomSource) -> {
                int tin_hoe_cost = 3 + randomSource.nextInt(10);
                return new MerchantOffer(
                        new ItemStack(Items.EMERALD, tin_hoe_cost),
                        new ItemStack(ModItems.TIN_HOE.get(), 1),
                        5, 10, 0.05f);
            });
        }

        //WEAPONSMITH

        if(event.getType() == VillagerProfession.WEAPONSMITH) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
        }
    }
}
