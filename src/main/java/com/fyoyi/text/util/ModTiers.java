package com.fyoyi.text.util;

import com.fyoyi.text.item.ModItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {

    public static final ToolStats RUBY =
            new ToolStats(2,1561,11,3.0F,25);
    public static final ToolStats RUBY_WOODEN =
            new ToolStats(1,559,3,2.0F,25);
    public static final ToolStats RUBY_GOLDEN =
            new ToolStats(1,532,13,2.0F,25);
    public static final ToolStats RUBY_STONE =
            new ToolStats(2,631,5,3.0F,25);
    public static final ToolStats RUBY_IRON =
            new ToolStats(3,750,7,4.0F,25);
    public static final ToolStats RUBY_DIAMOND =
            new ToolStats(4,2061,9,5.0F,25);
    public static final ToolStats RUBY_NETTHERITE =
            new ToolStats(4,2531,10,6.0F,25);
//===================================================================红宝石类
    public static final ForgeTier RUBY_SWORD =
            new ForgeTier(
                    RUBY.getLEVEL(),
                    RUBY.getUSES(),
                    RUBY.getSPEED(),
                    RUBY.getATTACKDAMAGE(),
                    RUBY.getENCHANTMENTVALUE(),
                    BlockTags.SWORD_EFFICIENT,
                    () -> Ingredient.of(ModItems.RUBY.get())
            );

    public static final ForgeTier RUBY_PICKAXE =
            new ForgeTier(
                    RUBY.getLEVEL(),
                    RUBY.getUSES(),
                    RUBY.getSPEED(),
                    RUBY.getATTACKDAMAGE(),
                    RUBY.getENCHANTMENTVALUE(),
                    BlockTags.NEEDS_IRON_TOOL,
                    () -> Ingredient.of(ModItems.RUBY.get())
            );

    public static final ForgeTier RUBY_AXE =
            new ForgeTier(
                    RUBY.getLEVEL(),
                    RUBY.getUSES(),
                    RUBY.getSPEED(),
                    RUBY.getATTACKDAMAGE(),
                    RUBY.getENCHANTMENTVALUE(),
                    BlockTags.MINEABLE_WITH_AXE,
                    () -> Ingredient.of(ModItems.RUBY.get())
            );

    public static final ForgeTier RUBY_SHOVEL =
            new ForgeTier(
                    RUBY.getLEVEL(),
                    RUBY.getUSES(),
                    RUBY.getSPEED(),
                    RUBY.getATTACKDAMAGE(),
                    RUBY.getENCHANTMENTVALUE(),
                    BlockTags.MINEABLE_WITH_SHOVEL,
                    () -> Ingredient.of(ModItems.RUBY.get())
            );

    public static final ForgeTier RUBY_HOE =
            new ForgeTier(
                    RUBY.getLEVEL(),
                    RUBY.getUSES(),
                    RUBY.getSPEED(),
                    RUBY.getATTACKDAMAGE(),
                    RUBY.getENCHANTMENTVALUE(),
                    BlockTags.MINEABLE_WITH_HOE,
                    () -> Ingredient.of(ModItems.RUBY.get())
            );
//====================================================================镶嵌红宝石类
    public static final ForgeTier RUBY_WOODEN_SWORD =
            new ForgeTier(
                    RUBY_WOODEN.getLEVEL(),
                    RUBY_WOODEN.getUSES(),
                    RUBY_WOODEN.getSPEED(),
                    RUBY_WOODEN.getATTACKDAMAGE(),
                    RUBY_WOODEN.getENCHANTMENTVALUE(),
                    BlockTags.SWORD_EFFICIENT,
                    () -> Ingredient.of(ModItems.RUBY.get())
            );
    public static final ForgeTier RUBY_GOLDEN_SWORD =
            new ForgeTier(
                    RUBY_GOLDEN.getLEVEL(),
                    RUBY_GOLDEN.getUSES(),
                    RUBY_GOLDEN.getSPEED(),
                    RUBY_GOLDEN.getATTACKDAMAGE(),
                    RUBY_GOLDEN.getENCHANTMENTVALUE(),
                    BlockTags.SWORD_EFFICIENT,
                    () -> Ingredient.of(ModItems.RUBY.get())
            );
    public static final ForgeTier RUBY_STONE_SWORD =
            new ForgeTier(
                    RUBY_STONE.getLEVEL(),
                    RUBY_STONE.getUSES(),
                    RUBY_STONE.getSPEED(),
                    RUBY_STONE.getATTACKDAMAGE(),
                    RUBY_STONE.getENCHANTMENTVALUE(),
                    BlockTags.SWORD_EFFICIENT,
                    () -> Ingredient.of(ModItems.RUBY.get())
            );
    public static final ForgeTier RUBY_IRON_SWORD =
            new ForgeTier(
                    RUBY_IRON.getLEVEL(),
                    RUBY_IRON.getUSES(),
                    RUBY_IRON.getSPEED(),
                    RUBY_IRON.getATTACKDAMAGE(),
                    RUBY_IRON.getENCHANTMENTVALUE(),
                    BlockTags.SWORD_EFFICIENT,
                    () -> Ingredient.of(ModItems.RUBY.get())
            );
    public static final ForgeTier RUBY_DIAMOND_SWORD =
            new ForgeTier(
                    RUBY_DIAMOND.getLEVEL(),
                    RUBY_DIAMOND.getUSES(),
                    RUBY_DIAMOND.getSPEED(),
                    RUBY_DIAMOND.getATTACKDAMAGE(),
                    RUBY_DIAMOND.getENCHANTMENTVALUE(),
                    BlockTags.SWORD_EFFICIENT,
                    () -> Ingredient.of(ModItems.RUBY.get())
            );
    public static final ForgeTier RUBY_NETTHERITE_SWORD =
            new ForgeTier(
                    RUBY_NETTHERITE.getLEVEL(),
                    RUBY_NETTHERITE.getUSES(),
                    RUBY_NETTHERITE.getSPEED(),
                    RUBY_NETTHERITE.getATTACKDAMAGE(),
                    RUBY_NETTHERITE.getENCHANTMENTVALUE(),
                    BlockTags.SWORD_EFFICIENT,
                    () -> Ingredient.of(ModItems.RUBY.get())
            );


}
