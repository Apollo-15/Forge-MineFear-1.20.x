package net.rayl1x.minefear.datagen.recipes;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.rayl1x.minefear.MineFear;
import net.rayl1x.minefear.datagen.ModRecipeProvider;
import net.rayl1x.minefear.item.ModItems;

import java.util.function.Consumer;

public class ModToolsRecipes extends ModRecipeProvider {
    public ModToolsRecipes(PackOutput pOutput) {
        super(pOutput);
    }

    public static void addModTitaniumToolsRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_SWORD.get())
                .pattern(" T ")
                .pattern(" T ")
                .pattern(" S ")
                .define('T', ModItems.TITANIUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_PICKAXE.get())
                .pattern("TTT")
                .pattern(" S ")
                .pattern(" S ")
                .define('T', ModItems.TITANIUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_AXE.get())
                .pattern(" TT")
                .pattern(" ST")
                .pattern(" S ")
                .define('T', ModItems.TITANIUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_AXE.get())
                .pattern("TT ")
                .pattern("TS ")
                .pattern(" S ")
                .define('T', ModItems.TITANIUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get()))
                .save(consumer, MineFear.MODID + ":titanium_axe_two");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_SHOVEL.get())
                .pattern(" T ")
                .pattern(" S ")
                .pattern(" S ")
                .define('T', ModItems.TITANIUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_HOE.get())
                .pattern(" TT")
                .pattern(" S ")
                .pattern(" S ")
                .define('T', ModItems.TITANIUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_HOE.get())
                .pattern("TT ")
                .pattern(" S ")
                .pattern(" S ")
                .define('T', ModItems.TITANIUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get()))
                .save(consumer, MineFear.MODID + ":titanium_hoe_two");
    }

    public static void addModTinToolsRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIN_SWORD.get())
                .pattern(" T ")
                .pattern(" T ")
                .pattern(" S ")
                .define('T', ModItems.TIN_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIN_PICKAXE.get())
                .pattern("TTT")
                .pattern(" S ")
                .pattern(" S ")
                .define('T', ModItems.TIN_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIN_AXE.get())
                .pattern(" TT")
                .pattern(" ST")
                .pattern(" S ")
                .define('T', ModItems.TIN_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIN_AXE.get())
                .pattern("TT ")
                .pattern("TS ")
                .pattern(" S ")
                .define('T', ModItems.TIN_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(consumer, MineFear.MODID + ":tin_axe_two");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIN_SHOVEL.get())
                .pattern(" T ")
                .pattern(" S ")
                .pattern(" S ")
                .define('T', ModItems.TIN_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIN_HOE.get())
                .pattern(" TT")
                .pattern(" S ")
                .pattern(" S ")
                .define('T', ModItems.TIN_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIN_HOE.get())
                .pattern("TT ")
                .pattern(" S ")
                .pattern(" S ")
                .define('T', ModItems.TIN_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(consumer, MineFear.MODID + ":tin_hoe_two");
    }
}
