package net.rayl1x.minefear.datagen.recipes;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.rayl1x.minefear.datagen.ModRecipeProvider;
import net.rayl1x.minefear.item.ModItems;

import java.util.function.Consumer;

public class ModArmorRecipes extends ModRecipeProvider {

    public ModArmorRecipes(PackOutput pOutput) {
        super(pOutput);
    }

    public static void addModTitaniumArmorRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_HELMET.get())
                .pattern("TTT")
                .pattern("T T")
                .pattern("   ")
                .define('T', ModItems.TITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_CHESTPLATE.get())
                .pattern("T T")
                .pattern("TTT")
                .pattern("TTT")
                .define('T', ModItems.TITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_LEGGINGS.get())
                .pattern("TTT")
                .pattern("T T")
                .pattern("T T")
                .define('T', ModItems.TITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_BOOTS.get())
                .pattern("   ")
                .pattern("T T")
                .pattern("T T")
                .define('T', ModItems.TITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get()))
                .save(consumer);

    }

    public static void addModTinArmorRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIN_HELMET.get())
                .pattern("TTT")
                .pattern("T T")
                .pattern("   ")
                .define('T', ModItems.TIN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIN_CHESTPLATE.get())
                .pattern("T T")
                .pattern("TTT")
                .pattern("TTT")
                .define('T', ModItems.TIN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIN_LEGGINGS.get())
                .pattern("TTT")
                .pattern("T T")
                .pattern("T T")
                .define('T', ModItems.TIN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIN_BOOTS.get())
                .pattern("   ")
                .pattern("T T")
                .pattern("T T")
                .define('T', ModItems.TIN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(consumer);

    }

}
