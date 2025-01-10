package net.rayl1x.minefear.datagen.recipes;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.rayl1x.minefear.datagen.ModRecipeProvider;
import net.rayl1x.minefear.item.ModItems;

import java.util.function.Consumer;

public class CannedFoodRecieps extends ModRecipeProvider {

    public CannedFoodRecieps(PackOutput pOutput) {
        super(pOutput);
    }

    public static void addCannedFoodCookedRecipes(Consumer<FinishedRecipe> consumer) {
        campfireCooking(consumer, ModItems.CANNED_BEEF_RAW.get(), ModItems.CANNED_BEEF_COOKED.get(),
                0.5f, 350);

        campfireCooking(consumer, ModItems.CANNED_PORKCHOP_RAW.get(), ModItems.CANNED_PORKCHOP_COOKED.get(),
                0.5f, 350);

        campfireCooking(consumer, ModItems.CANNED_RABBIT_RAW.get(), ModItems.CANNED_RABBIT_COOKED.get(),
                0.4f, 350);

        campfireCooking(consumer, ModItems.CANNED_MUTTON_RAW.get(), ModItems.CANNED_MUTTON_COOKED.get(),
                0.4f, 350);

        campfireCooking(consumer, ModItems.CANNED_CHICKEN_RAW.get(), ModItems.CANNED_CHICKEN_COOKED.get(),
                0.3f, 350);

    }

    public static void addCannedFoodRawRecipes(Consumer<FinishedRecipe> consumer) {
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
}
