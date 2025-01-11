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

    public static final RegistryObject<CreativeModeTab> MINEFEAR_TAB_BLOCKS = CREATIVE_MODE_TABS.register("minefear_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.TITAN_BLOCK.get()))
                    .title(Component.translatable("creativetab.minefear_blocks_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModBlocks.TITAN_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_TITAN_ORE.get());
                        output.accept(ModBlocks.TITAN_BLOCK.get());

                        output.accept(ModBlocks.TIN_ORE.get());
                        output.accept(ModBlocks.TIN_BLOCK.get());

                        output.accept(ModBlocks.WEAPON_WORKBENCH.get());
                    })
                    .build());

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

    public static final RegistryObject<CreativeModeTab> MINEFEAR_INGREDIENTS_TAB = CREATIVE_MODE_TABS.register("minefear_ingredients_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TITAN_INGOT.get( )))
                .title(Component.translatable("creativetab.minefear_ingredients_tab"))
                .displayItems((itemDisplayParameters, output) -> {

                    output.accept(ModItems.TITAN_INGOT.get());
                    output.accept(ModItems.RAW_TITAN.get());
                    output.accept(ModItems.STEEL_INGOT.get());

                    output.accept(ModItems.TIN_INGOT.get());
                    output.accept(ModItems.TIN_NUGGET.get());
                    output.accept(ModItems.RAW_TIN.get());
                    output.accept(ModItems.TIN_CAN.get());
                    output.accept(ModItems.TIN_PLATE.get());

                })
                .build());

    public static final RegistryObject<CreativeModeTab> MINEFEAR_GUN_TAB = CREATIVE_MODE_TABS.register("minefear_gun_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CHAINSAW.get( )))
                    .title(Component.translatable("creativetab.minefear_gun_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.CHAINSAW.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
