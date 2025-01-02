package net.rayl1x.minefear.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rayl1x.minefear.MineFear;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MineFear.MODID);

    public static final RegistryObject<Item> TITAN_INGOT = ITEMS.register("titan_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_TITAN = ITEMS.register("raw_titan",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
