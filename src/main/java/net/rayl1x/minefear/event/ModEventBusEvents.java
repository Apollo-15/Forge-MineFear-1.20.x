package net.rayl1x.minefear.event;


import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.rayl1x.minefear.MineFear;
import net.rayl1x.minefear.entity.ModEntities;
import net.rayl1x.minefear.entity.custom.KnightEntity;

@Mod.EventBusSubscriber(modid = MineFear.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.KNIGHT.get(), KnightEntity.createAttributes().build());
    }
}
