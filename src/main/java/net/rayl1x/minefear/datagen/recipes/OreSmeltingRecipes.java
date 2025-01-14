package net.rayl1x.minefear.datagen.recipes;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.rayl1x.minefear.block.ModBlocks;
import net.rayl1x.minefear.datagen.ModRecipeProvider;
import net.rayl1x.minefear.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class OreSmeltingRecipes extends ModRecipeProvider {
    public OreSmeltingRecipes(PackOutput pOutput) {
        super(pOutput);
    }

    private static final List<ItemLike> TITAN_SMELTABLE = List.of(
            ModBlocks.TITANIUM_ORE.get(),
            ModBlocks.DEEPSLATE_TITANIUM_ORE.get(),
            ModItems.RAW_TITANIUM.get()
    );

    private static final List<ItemLike> TIN_SMELTABLE = List.of(
            ModBlocks.TIN_ORE.get(),
            ModItems.RAW_TIN.get()
    );

    private static final List<ItemLike> ITEM_SMELTABLE = List.of(
            Items.IRON_INGOT
    );

    public static void addOreSmeltingRecipes(Consumer<FinishedRecipe> consumer) {
        oreSmelting(consumer, TITAN_SMELTABLE, RecipeCategory.MISC, ModItems.TITANIUM_INGOT.get(),
                0.9f, 230, "titanium");
        oreSmelting(consumer, TIN_SMELTABLE, RecipeCategory.MISC, ModItems.TIN_INGOT.get(),
                0.7f, 200, "tin");
        oreSmelting(consumer, ITEM_SMELTABLE, RecipeCategory.MISC, ModItems.STEEL_INGOT.get(),
                0.7f, 200, "ingot");
    }

    public static void addOreBlastingRecipes(Consumer<FinishedRecipe> consumer) {
        oreBlasting(consumer, TITAN_SMELTABLE, RecipeCategory.MISC, ModItems.TITANIUM_INGOT.get(),
                0.9f, 115, "titanium");
        oreBlasting(consumer, TIN_SMELTABLE, RecipeCategory.MISC, ModItems.TIN_INGOT.get(),
                0.7f, 100, "tin");
        oreBlasting(consumer, ITEM_SMELTABLE, RecipeCategory.MISC, ModItems.STEEL_INGOT.get(),
                0.7f, 100, "ingot");
    }


    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

}
