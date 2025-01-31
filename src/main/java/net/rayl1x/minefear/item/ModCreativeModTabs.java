package net.rayl1x.minefear.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.rayl1x.minefear.MineFear;
import net.rayl1x.minefear.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MineFear.MODID);

    //BLOCKS TAB

    public static final RegistryObject<CreativeModeTab> MINEFEAR_TAB_BLOCKS = CREATIVE_MODE_TABS.register("minefear_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.TITANIUM_BLOCK.get()))
                    .title(Component.translatable("creativetab.minefear_blocks_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModBlocks.TITANIUM_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_TITANIUM_ORE.get());
                        output.accept(ModBlocks.TITANIUM_BLOCK.get());

                        output.accept(ModBlocks.TIN_ORE.get());
                        output.accept(ModBlocks.TIN_BLOCK.get());

                        output.accept(ModBlocks.WEAPON_WORKBENCH.get());
                        output.accept(ModBlocks.ANCIENT_TABLE_OF_KNOWLEDGE.get());

                    })
                    .build());

    //FOOD TAB

    public static final RegistryObject<CreativeModeTab> MINEFEAR_FOOD_TAB = CREATIVE_MODE_TABS.register("minefear_food_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CANNED_BEEF_RAW.get()))
                .title(Component.translatable("creativetab.minefear_food_tab"))
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(ModItems.CANNED_BEEF_RAW.get());
                    output.accept(ModItems.CANNED_BEEF_COOKED.get());
                    output.accept(ModItems.CANNED_MUTTON_RAW.get());
                    output.accept(ModItems.CANNED_MUTTON_COOKED.get());
                    output.accept(ModItems.CANNED_CHICKEN_RAW.get());
                    output.accept(ModItems.CANNED_CHICKEN_COOKED.get());
                    output.accept(ModItems.CANNED_PORKCHOP_RAW.get());
                    output.accept(ModItems.CANNED_PORKCHOP_COOKED.get());
                    output.accept(ModItems.CANNED_RABBIT_RAW.get());
                    output.accept(ModItems.CANNED_RABBIT_COOKED.get());

                })
                .build());

    //INGREDIENTS TAB

    public static final RegistryObject<CreativeModeTab> MINEFEAR_INGREDIENTS_TAB = CREATIVE_MODE_TABS.register("minefear_ingredients_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TITANIUM_INGOT.get( )))
                .title(Component.translatable("creativetab.minefear_ingredients_tab"))
                .displayItems((itemDisplayParameters, output) -> {

                    output.accept(ModItems.TITANIUM_INGOT.get());
                    output.accept(ModItems.RAW_TITANIUM.get());
                    output.accept(ModItems.STEEL_INGOT.get());

                    output.accept(ModItems.TIN_INGOT.get());
                    output.accept(ModItems.TIN_NUGGET.get());
                    output.accept(ModItems.RAW_TIN.get());
                    output.accept(ModItems.TIN_CAN.get());
                    output.accept(ModItems.TIN_PLATE.get());

                })
                .build());

    //WEAPONS TAB
    public static final RegistryObject<CreativeModeTab> MINEFEAR_WEAPONS_TAB = CREATIVE_MODE_TABS.register("minefear_weapons_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TITANIUM_SWORD.get( )))
                    .title(Component.translatable("creativetab.minefear_weapons_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.KNIGHTS_SWORD.get());
                        output.accept(ModItems.TITANIUM_SWORD.get());
                        output.accept(ModItems.TIN_SWORD.get());

                    })
                    .build());


    //TOOLS TAB

    public static final RegistryObject<CreativeModeTab> MINEFEAR_TOOLS_TAB = CREATIVE_MODE_TABS.register("minefear_tools_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CHAINSAW.get( )))
                    .title(Component.translatable("creativetab.minefear_tools_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.CHAINSAW.get());

                        output.accept(ModItems.TITANIUM_AXE.get());
                        output.accept(ModItems.TITANIUM_HOE.get());
                        output.accept(ModItems.TITANIUM_SHOVEL.get());
                        output.accept(ModItems.TITANIUM_PICKAXE.get());
                        output.accept(ModItems.TITANIUM_SWORD.get());

                        output.accept(ModItems.TIN_AXE.get());
                        output.accept(ModItems.TIN_HOE.get());
                        output.accept(ModItems.TIN_SHOVEL.get());
                        output.accept(ModItems.TIN_PICKAXE.get());
                        output.accept(ModItems.TIN_SWORD.get());

                    })
                    .build());

    //ARMOR TAB

    public static final RegistryObject<CreativeModeTab> MINEFEAR_ARMOR_TAB = CREATIVE_MODE_TABS.register("minefear_armor_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TITANIUM_CHESTPLATE.get( )))
                    .title(Component.translatable("creativetab.minefear_armor_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.TITANIUM_HELMET.get());
                        output.accept(ModItems.TITANIUM_CHESTPLATE.get());
                        output.accept(ModItems.TITANIUM_LEGGINGS.get());
                        output.accept(ModItems.TITANIUM_BOOTS.get());

                        output.accept(ModItems.TIN_HELMET.get());
                        output.accept(ModItems.TIN_CHESTPLATE.get());
                        output.accept(ModItems.TIN_LEGGINGS.get());
                        output.accept(ModItems.TIN_BOOTS.get());
                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
