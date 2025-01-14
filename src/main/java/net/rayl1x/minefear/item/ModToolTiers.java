package net.rayl1x.minefear.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.rayl1x.minefear.MineFear;
import net.rayl1x.minefear.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier CHAINSAW = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2500, 20f, 5f, 25,
                    ModTags.Blocks.NEEDS_CHAINSAW, () -> Ingredient.of(ModItems.CHAINSAW.get())),
            new ResourceLocation(MineFear.MODID, "chainsaw"), List.of(Tiers.NETHERITE), List.of()
    );

    public static final Tier TITAN_TOOLS = TierSortingRegistry.registerTier(
            new ForgeTier(3, 972, 8.0F, 3.0F, 10,
                    BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.TITAN_INGOT.get())),
            new ResourceLocation(MineFear.MODID, "titan_ingot"), List.of(Tiers.DIAMOND), List.of()
    );
}
