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

    public static final RegistryObject<Item>STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
