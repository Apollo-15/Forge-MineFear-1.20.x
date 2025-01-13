package net.rayl1x.minefear.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rayl1x.minefear.MineFear;
import net.rayl1x.minefear.item.custom.FuelItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MineFear.MODID);

    public static final RegistryObject<Item> TITAN_INGOT = ITEMS.register("titan_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_TITAN = ITEMS.register("raw_titan",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIN_PLATE = ITEMS.register("tin_plate",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIN_CAN = ITEMS.register("tin_can",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CANNED_BEEF_RAW = ITEMS.register("canned_beef_raw",
            () -> new Item(new Item.Properties().food(ModFoods.CANNED_BEEF_RAW)));

    public static final RegistryObject<Item> CANNED_BEEF_COOKED = ITEMS.register("canned_beef_cooked",
            () -> new Item(new Item.Properties().food(ModFoods.CANNED_BEEF_COOKED)));

    public static final RegistryObject<Item> CANNED_MUTTON_RAW = ITEMS.register("canned_mutton_raw",
            () -> new Item(new Item.Properties().food(ModFoods.CANNED_MUTTON_RAW)));

    public static final RegistryObject<Item> CANNED_MUTTON_COOKED = ITEMS.register("canned_mutton_cooked",
            () -> new Item(new Item.Properties().food(ModFoods.CANNED_MUTTON_COOKED)));

    public static final RegistryObject<Item> CANNED_CHICKEN_RAW = ITEMS.register("canned_chicken_raw",
            () -> new Item(new Item.Properties().food(ModFoods.CANNED_CHICKEN_RAW)));

    public static final RegistryObject<Item> CANNED_CHICKEN_COOKED = ITEMS.register("canned_chicken_cooked",
            () -> new Item(new Item.Properties().food(ModFoods.CANNED_CHICKEN_COOKED)));

    public static final RegistryObject<Item> CANNED_PORKCHOP_RAW = ITEMS.register("canned_porkchop_raw",
            () -> new Item(new Item.Properties().food(ModFoods.CANNED_PORKCHOP_RAW)));

    public static final RegistryObject<Item> CANNED_PORKCHOP_COOKED = ITEMS.register("canned_porkchop_cooked",
            () -> new Item(new Item.Properties().food(ModFoods.CANNED_PORKCHOP_COOKED)));

    public static final RegistryObject<Item> CANNED_RABBIT_RAW = ITEMS.register("canned_rabbit_raw",
            () -> new Item(new Item.Properties().food(ModFoods.CANNED_RABBIT_RAW)));

    public static final RegistryObject<Item> CANNED_RABBIT_COOKED = ITEMS.register("canned_rabbit_cooked",
            () -> new Item(new Item.Properties().food(ModFoods.CANNED_RABBIT_COOKED)));

    public static final RegistryObject<Item> CHAINSAW = ITEMS.register("chainsaw",
            () -> new AxeItem(ModToolTiers.CHAINSAW, 1, 0, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> TITAN_AXE = ITEMS.register("titan_axe",
            () -> new AxeItem(ModToolTiers.TITAN, 4, 0, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> TITAN_PICKAXE = ITEMS.register("titan_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TITAN, 1, 0, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> TITAN_HOE = ITEMS.register("titan_hoe",
            () -> new HoeItem(ModToolTiers.TITAN, 0, 0, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> TITAN_SHOVEL = ITEMS.register("titan_shovel",
            () -> new ShovelItem(ModToolTiers.TITAN, 6, 0, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> TITAN_SWORD = ITEMS.register("titan_sword",
            () -> new SwordItem(ModToolTiers.TITAN, 7, 1, new Item.Properties().stacksTo(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
