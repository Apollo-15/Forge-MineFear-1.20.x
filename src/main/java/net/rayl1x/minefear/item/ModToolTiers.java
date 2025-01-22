package net.rayl1x.minefear.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
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

    public static final Tier KNIGHTS_SWORD = TierSortingRegistry.registerTier(
            new ForgeTier(6, 2700, 5.0f, 4.0f, 17,
                    ModTags.Blocks.NEEDS_KNIGHTS_SWORD, () -> Ingredient.of(ModItems.KNIGHTS_SWORD.get())),
            new ResourceLocation(MineFear.MODID, "knights_sword"), List.of(Tiers.NETHERITE), List.of()
    );

    public static final Tier TITANIUM_TOOLS = TierSortingRegistry.registerTier(
            new ForgeTier(3, 972, 8.0F, 3.0F, 10,
                    BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.TITANIUM_INGOT.get())),
            new ResourceLocation(MineFear.MODID, "titanium_ingot"), List.of(Tiers.DIAMOND), List.of()
    );

    public static final Tier TIN_TOOLS = TierSortingRegistry.registerTier(
            new ForgeTier(2, 187, 6.0F, 2.0F, 14,
                    BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.TIN_INGOT.get())),
            new ResourceLocation(MineFear.MODID, "tin_ingot"), List.of(Tiers.IRON), List.of()
    );
}
