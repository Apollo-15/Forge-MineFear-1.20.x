package net.rayl1x.minefear.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.rayl1x.minefear.MineFear;
import net.rayl1x.minefear.block.ModBlocks;
import net.rayl1x.minefear.datagen.recipes.CannedFoodRecieps;
import net.rayl1x.minefear.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> TITAN_SMELTABLES = List.of(ModItems.RAW_TITAN.get(),
            ModBlocks.TITAN_ORE.get(), ModBlocks.DEEPSLATE_TITAN_ORE.get());

    private static final List<ItemLike> TIN_SMELTABLES = List.of(ModItems.RAW_TIN.get(),
            ModBlocks.TIN_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        oreSmelting(consumer, TITAN_SMELTABLES, RecipeCategory.MISC, ModItems.RAW_TITAN.get(), 0.9f, 230, "titan");
        oreSmelting(consumer, TIN_SMELTABLES, RecipeCategory.MISC, ModBlocks.TIN_ORE.get(), 0.7f, 200, "tin");
        oreBlasting(consumer, TITAN_SMELTABLES, RecipeCategory.MISC, ModItems.RAW_TITAN.get(), 0.9f, 115, "titan");
        oreBlasting(consumer, TIN_SMELTABLES, RecipeCategory.MISC, ModBlocks.TIN_ORE.get(), 0.7f, 100, "tin");


//        CannedFoodRecieps.addCannedFoodRecipes(consumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TITAN_BLOCK.get())
                .pattern("TTT")
                .pattern("TTT")
                .pattern("TTT")
                .define('T', ModItems.TITAN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITAN_INGOT.get()), has(ModItems.TITAN_INGOT.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TITAN_INGOT.get(), 9)
                .requires(ModBlocks.TITAN_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.TITAN_BLOCK.get()), has(ModBlocks.TITAN_BLOCK.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CANNED_BEEF_RAW.get())
                .requires(ModItems.TIN_CAN.get())
                .requires(Items.BEEF)
                .unlockedBy(getHasName(ModItems.TIN_CAN.get()), has(ModItems.TIN_CAN.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CANNED_CHICKEN_RAW.get())
                .requires(ModItems.TIN_CAN.get())
                .requires(Items.CHICKEN)
                .unlockedBy(getHasName(ModItems.TIN_CAN.get()), has(ModItems.TIN_CAN.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CANNED_MUTTON_RAW.get())
                .requires(ModItems.TIN_CAN.get())
                .requires(Items.MUTTON)
                .unlockedBy(getHasName(ModItems.TIN_CAN.get()), has(ModItems.TIN_CAN.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CANNED_PORKCHOP_RAW.get())
                .requires(ModItems.TIN_CAN.get())
                .requires(Items.PORKCHOP)
                .unlockedBy(getHasName(ModItems.TIN_CAN.get()), has(ModItems.TIN_CAN.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CANNED_RABBIT_RAW.get())
                .requires(ModItems.TIN_CAN.get())
                .requires(Items.RABBIT)
                .unlockedBy(getHasName(ModItems.TIN_CAN.get()), has(ModItems.TIN_CAN.get()))
                .save(consumer);
    }



    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), pCategory,
                    pResult, pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, MineFear.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }


}
