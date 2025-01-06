package net.rayl1x.minefear.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rayl1x.minefear.MineFear;
import net.rayl1x.minefear.block.custom.WeaponWorkbench;
import net.rayl1x.minefear.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MineFear.MODID);

    public static final RegistryObject<Block> TITAN_ORE = registerBlock("titan_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));

    public static final RegistryObject<Block> DEEPSLATE_TITAN_ORE = registerBlock("deepslate_titan_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)));

    public static final RegistryObject<Block> TITAN_BLOCK = registerBlock("titan_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));

    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> WEAPON_WORKBENCH = registerBlock("weapon_work_bench",
            () -> new WeaponWorkbench(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> WEAPON_WORKBENCH_BOTTOM_LEFT = registerBlock("weapon_work_bench_bottom_left",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    
    public static final RegistryObject<Block> WEAPON_WORKBENCH_BOTTOM_RIGHT = registerBlock("weapon_work_bench_bottom_right",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registryBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
