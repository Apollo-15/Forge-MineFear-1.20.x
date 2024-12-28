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

    public static final RegistryObject<CreativeModeTab> MINEFEAR_TAB = CREATIVE_MODE_TABS.register("minefear_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TITAN_INGOT.get()))
                    .title(Component.translatable("creativetab.minefear_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.TITAN_INGOT.get());
                        output.accept(ModItems.RAW_TITAN.get());

                        output.accept(ModBlocks.TITAN_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_TITAN_ORE.get());
                        output.accept(ModBlocks.TITAN_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
