package net.rayl1x.minefear.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraftforge.registries.RegistryObject;
import net.rayl1x.minefear.block.ModBlocks;
import net.rayl1x.minefear.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.TITAN_BLOCK.get());
        this.dropSelf(ModBlocks.TIN_BLOCK.get());

        this.dropSelf(ModBlocks.WEAPON_WORKBENCH.get());

        this.add(ModBlocks.TITAN_ORE.get(),
                block -> createSimpleOreDrop(ModBlocks.TITAN_ORE.get(), ModItems.RAW_TITAN.get()));

        this.add(ModBlocks.DEEPSLATE_TITAN_ORE.get(),
                block -> createSimpleOreDrop(ModBlocks.TITAN_ORE.get(), ModItems.RAW_TITAN.get()));

        this.add(ModBlocks.TIN_ORE.get(),
                block -> createSimpleOreDrop(ModBlocks.TIN_ORE.get(), ModItems.RAW_TIN.get()));

    }

    protected LootTable.Builder createSimpleOreDrop(Block pBlock, Item pItem) {
        return createSilkTouchDispatchTable(pBlock,
                (LootPoolEntryContainer.Builder)
                        this.applyExplosionDecay(pBlock, LootItem.lootTableItem(pItem)
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
