package net.rayl1x.minefear.item;

import net.minecraft.resources.ResourceLocation;
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
}
