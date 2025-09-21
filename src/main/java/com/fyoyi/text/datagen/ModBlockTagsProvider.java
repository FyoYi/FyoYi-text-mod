package com.fyoyi.text.datagen;

import com.fyoyi.text.text_mod;
import com.fyoyi.text.tags.ModBlockTags.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class ModBlockTagsProvider extends BlockTagsProvider{
    public ModBlockTagsProvider(DataGenerator generator, @Nullable ExistingFileHelper existingFileHelper){
        super(generator, text_mod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(java.util.function.Consumer<net.minecraft.core.Holder.Reference<net.minecraft.world.level.block.Block>> p_256330_) { // 这是更新后的 addTags 签名
        tag(ModTags.Blocks.MULTI_TOOL_EFFICIENT)
                .addTag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE)
                .addTag(net.minecraft.tags.BlockTags.MINEABLE_WITH_SHOVEL)
                .addTag(net.minecraft.tags.BlockTags.MINEABLE_WITH_AXE);
    }

}
