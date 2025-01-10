package net.rayl1x.minefear.datagen.recipes;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.rayl1x.minefear.MineFear;
import net.rayl1x.minefear.block.ModBlocks;
import net.rayl1x.minefear.datagen.ModRecipeProvider;
import net.rayl1x.minefear.item.ModItems;

import java.util.function.Consumer;

public class ModItemsRecipes extends ModRecipeProvider {
    public ModItemsRecipes(PackOutput pOutput) {
        super(pOutput);
    }

    public static void addModItemsRecipes(Consumer<FinishedRecipe> consumer) {
        // Titan ingots from Titan block
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TITAN_INGOT.get(), 9)
                .requires(ModBlocks.TITAN_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.TITAN_BLOCK.get()), has(ModBlocks.TITAN_BLOCK.get()))
                .save(consumer);

        // Tin ingots from Tin block
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 9)
                .requires(ModBlocks.TIN_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.TIN_BLOCK.get()), has(ModBlocks.TIN_BLOCK.get()))
                .save(consumer, MineFear.MODID + ":titan_ingot_from_block");

        // Tin nuggets from tin ingot
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TIN_NUGGET.get(), 9)
                .requires(ModItems.TIN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(consumer);

        // Tin ingot from tin nuggets
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIN_INGOT.get())
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .define('N', ModItems.TIN_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TIN_NUGGET.get()), has(ModItems.TIN_NUGGET.get()))
                .save(consumer, MineFear.MODID + ":titan_ingot_from_nuggets");

        // Tin Plate from tin nuggets and steel ingot
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIN_PLATE.get())
                .pattern(" N ")
                .pattern("NSN")
                .pattern(" N ")
                .define('N', ModItems.TIN_NUGGET.get())
                .define('S', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(consumer);

        // Tin cans from tin plates
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIN_CAN.get(),3)
                .pattern("   ")
                .pattern("P P")
                .pattern(" P ")
                .define('P', ModItems.TIN_PLATE.get())
                .unlockedBy(getHasName(ModItems.TIN_PLATE.get()), has(ModItems.TIN_PLATE.get()))
                .save(consumer);

    }
}
