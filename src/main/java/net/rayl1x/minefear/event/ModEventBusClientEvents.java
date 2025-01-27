package net.rayl1x.minefear.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.rayl1x.minefear.MineFear;
import net.rayl1x.minefear.entity.client.KnightModel;
import net.rayl1x.minefear.entity.client.ModModelLayers;

@Mod.EventBusSubscriber(modid = MineFear.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.KNIGHT_LAYER, KnightModel::createBodyLayer);
    }
}
