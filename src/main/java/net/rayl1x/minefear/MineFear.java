package net.rayl1x.minefear;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.rayl1x.minefear.block.ModBlocks;
import net.rayl1x.minefear.entity.ModEntities;
import net.rayl1x.minefear.entity.client.KnightRenderer;
import net.rayl1x.minefear.item.ModCreativeModTabs;
import net.rayl1x.minefear.item.ModItems;
import net.rayl1x.minefear.villiger.ModVillagers;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MineFear.MODID)
public class MineFear {
    public static final String MODID = "minefear";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MineFear() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModVillagers.register(modEventBus);

        ModEntities.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
//        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
//            event.accept(ModItems.TITAN_INGOT);
//            event.accept(ModItems.RAW_TITAN);
//        }
//        if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
//            event.accept(ModBlocks.DEEPSLATE_TITAN_ORE);
//            event.accept(ModBlocks.TITAN_ORE);
//        }
//        if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
//            event.accept(ModBlocks.TITAN_BLOCK);
//        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntities.KNIGHT.get(), KnightRenderer::new);
        }
    }
}
