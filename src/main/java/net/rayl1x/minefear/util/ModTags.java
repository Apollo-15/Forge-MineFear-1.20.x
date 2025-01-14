package net.rayl1x.minefear.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.rayl1x.minefear.MineFear;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_CHAINSAW = tag("needs_chainsaw");
        public static final TagKey<Block> NEEDS_TITANIUM_TOOL = tag("needs_titanium_tool");
        public static final TagKey<Block> NEEDS_TIN_TOOL = tag("needs_tin_tool");

        private static TagKey<Block> tag(final String name) {
            return BlockTags.create(new ResourceLocation(MineFear.MODID, name));
        }
    }
}
