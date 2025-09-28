package com.fyoyi.text.item.sundries;

import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class FireworkArrowItem extends Item {

    public FireworkArrowItem(Properties pProperties) {
        super(pProperties);
    }

    /**
     * 这个方法负责添加物品的描述文本（鼠标悬停时显示）。
     * 这是实现“继承描述”的关键。
     */
    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        // 我们直接调用原版烟花火箭的 appendHoverText 方法来为我们生成描述！
        // 这是一个非常巧妙的方法，可以保证我们的描述和原版烟花火箭的描述格式完全一样。
        // 它会读取 pStack 上的 "Fireworks" NBT 数据，并生成对应的文本行。
        Items.FIREWORK_ROCKET.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
