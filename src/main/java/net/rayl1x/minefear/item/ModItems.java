package net.rayl1x.minefear.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rayl1x.minefear.MineFear;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MineFear.MODID);

    //INGREDIENTS ITEMS

    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
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

    //FOOD

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

    //TOOLS

    public static final RegistryObject<Item> CHAINSAW = ITEMS.register("chainsaw",
            () -> new AxeItem(ModToolTiers.CHAINSAW, 1, 0, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> TITANIUM_AXE = ITEMS.register("titanium_axe",
            () -> new AxeItem(ModToolTiers.TITANIUM_TOOLS, 6f, -3.0f, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TITANIUM_TOOLS, 2, -2.8f, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> TITANIUM_HOE = ITEMS.register("titanium_hoe",
            () -> new HoeItem(ModToolTiers.TITANIUM_TOOLS, -2, 0, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel",
            () -> new ShovelItem(ModToolTiers.TITANIUM_TOOLS, 2.5f, -3, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword",
            () -> new SwordItem(ModToolTiers.TITANIUM_TOOLS, 4, -2.4f, new Item.Properties().stacksTo(1)));

    //ARMOR

    public static final RegistryObject<Item> TITANIUM_HELMET = ITEMS.register("titanium_helmet",
            () -> new ArmorItem(ModArmorMaterials.TITANIUM_INGOT, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> TITANIUM_CHESTPLATE = ITEMS.register("titanium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.TITANIUM_INGOT, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> TITANIUM_LEGGINGS = ITEMS.register("titanium_leggings",
            () -> new ArmorItem(ModArmorMaterials.TITANIUM_INGOT, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> TITANIUM_BOOTS = ITEMS.register("titanium_boots",
            () -> new ArmorItem(ModArmorMaterials.TITANIUM_INGOT, ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
