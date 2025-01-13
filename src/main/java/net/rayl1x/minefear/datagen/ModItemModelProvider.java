package net.rayl1x.minefear.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.rayl1x.minefear.MineFear;
import net.rayl1x.minefear.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MineFear.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.TITAN_INGOT);
        simpleItem(ModItems.RAW_TITAN);

        handheldItem(ModItems.TITAN_AXE);
        handheldItem(ModItems.TITAN_HOE);
        handheldItem(ModItems.TITAN_PICKAXE);
        handheldItem(ModItems.TITAN_SHOVEL);
        handheldItem(ModItems.TITAN_SWORD);

        simpleItem(ModItems.TIN_INGOT);
        simpleItem(ModItems.RAW_TIN);
        simpleItem(ModItems.TIN_CAN);
        simpleItem(ModItems.TIN_NUGGET);
        simpleItem(ModItems.TIN_PLATE);

        simpleItem(ModItems.STEEL_INGOT);

        simpleItem(ModItems.CANNED_BEEF_RAW);
        simpleItem(ModItems.CANNED_CHICKEN_RAW);
        simpleItem(ModItems.CANNED_RABBIT_RAW);
        simpleItem(ModItems.CANNED_MUTTON_RAW);
        simpleItem(ModItems.CANNED_PORKCHOP_RAW);

        simpleItem(ModItems.CANNED_BEEF_COOKED);
        simpleItem(ModItems.CANNED_CHICKEN_COOKED);
        simpleItem(ModItems.CANNED_RABBIT_COOKED);
        simpleItem(ModItems.CANNED_MUTTON_COOKED);
        simpleItem(ModItems.CANNED_PORKCHOP_COOKED);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MineFear.MODID, "item/" + item.getId().getPath()));

    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(MineFear.MODID,"item/" + item.getId().getPath()));
    }
}
