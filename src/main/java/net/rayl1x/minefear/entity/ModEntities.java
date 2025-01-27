package net.rayl1x.minefear.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rayl1x.minefear.MineFear;
import net.rayl1x.minefear.entity.custom.KnightEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MineFear.MODID);

    public static final RegistryObject<EntityType<KnightEntity>> KNIGHT =
            ENTITY_TYPES.register("knight",
                    () -> EntityType.Builder.of(KnightEntity::new, MobCategory.CREATURE)
                    .sized(0.9f, 3f).build("knight"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
