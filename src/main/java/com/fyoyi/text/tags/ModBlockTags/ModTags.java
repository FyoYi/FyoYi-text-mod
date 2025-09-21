package com.fyoyi.text.tags.ModBlockTags;

import com.fyoyi.text.text_mod;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;


public class ModTags {

    public static class Blocks{
        public static final TagKey<Block> MULTI_TOOL_EFFICIENT =
                BlockTags.create(ResourceLocation.parse(text_mod.MOD_ID + ":multi_tool_efficient"));
    }

}
