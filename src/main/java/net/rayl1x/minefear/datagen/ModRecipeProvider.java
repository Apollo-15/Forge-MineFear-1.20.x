package net.rayl1x.minefear.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.rayl1x.minefear.MineFear;
import net.rayl1x.minefear.datagen.recipes.*;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        OreSmeltingRecipes.addOreSmeltingRecipes(consumer);
        OreSmeltingRecipes.addOreBlastingRecipes(consumer);

        ModItemsRecipes.addModItemsRecipes(consumer);
        ModBlocksRecipes.addModBlockRecipes(consumer);

        ModToolsRecipes.addModToolsRecipes(consumer);

        ModArmorRecipes.addModArmorRecipes(consumer);

        CannedFoodRecieps.addCannedFoodRawRecipes(consumer);
        CannedFoodRecieps.addCannedFoodCookedRecipes(consumer);


    }

    protected static void campfireCooking(Consumer<FinishedRecipe> consumer, ItemLike input, ItemLike output, float experience, int cookingTime) {
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(input), RecipeCategory.MISC, output, experience, cookingTime)
                .unlockedBy("has_" + getItemName(input), has(input))
                .save(consumer, new ResourceLocation(MineFear.MODID, getItemName(output) + "_from_campfire_cooking"));
    }
}
