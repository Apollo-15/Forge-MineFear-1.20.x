package net.rayl1x.minefear.villiger;

import com.google.common.collect.ImmutableSet;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rayl1x.minefear.MineFear;
import net.rayl1x.minefear.block.ModBlocks;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, MineFear.MODID);

    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, MineFear.MODID);

    public static final RegistryObject<PoiType> ANCIENT_TABLE_OF_KNOWLEDGE_POI = POI_TYPES.register("ancient_table_of_knowledge_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.ANCIENT_TABLE_OF_KNOWLEDGE.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> KEEPER_OF_KNOWLEDGE =
            VILLAGER_PROFESSIONS.register("keeper_of_knowledge",
                    () -> new VillagerProfession("keeper_of_knowledge",
                            holder -> holder.get() == ANCIENT_TABLE_OF_KNOWLEDGE_POI.get(),
                            holder -> holder.get() == ANCIENT_TABLE_OF_KNOWLEDGE_POI.get(),
                            ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_LIBRARIAN));


    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}
