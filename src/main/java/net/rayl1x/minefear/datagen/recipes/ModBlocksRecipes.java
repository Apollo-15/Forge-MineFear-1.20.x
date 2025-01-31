package net.rayl1x.minefear.datagen.recipes;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.rayl1x.minefear.block.ModBlocks;
import net.rayl1x.minefear.datagen.ModRecipeProvider;
import net.rayl1x.minefear.item.ModItems;

import java.util.function.Consumer;

public class ModBlocksRecipes extends ModRecipeProvider {
    public ModBlocksRecipes(PackOutput pOutput) {
        super(pOutput);
    }

    public static void addModBlockRecipes(Consumer<FinishedRecipe> consumer) {
        // Titanium block from titanium ingots
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TITANIUM_BLOCK.get())
                .pattern("TTT")
                .pattern("TTT")
                .pattern("TTT")
                .define('T', ModItems.TITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get()))
                .save(consumer);

        // Tin block from Tin ingots
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TIN_BLOCK.get())
                .pattern("TTT")
                .pattern("TTT")
                .pattern("TTT")
                .define('T', ModItems.TIN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(consumer);

    }
}
