package com.fyoyi.text.item.weapon.bow;

import com.fyoyi.text.item.ModItems;
import com.fyoyi.text.item.weapon.bow.ruby_inlaid_bow.RubyInlaidBowItem;
import com.fyoyi.text.util.weapon.Sword_util;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.Item;

public class Bow_item {

    public static final RegistryObject<Item>RUBY_INLAID_BOW =
            ModItems.ITEMS.register("ruby_inlaid_bow", () -> new RubyInlaidBowItem(
                    new Item.Properties()
                            .stacksTo(1)
                            .durability(884)
            ));

    public static void init() {
        // 这个方法是空的，它的存在就是为了让主类可以调用它来加载这个类
    }
}
