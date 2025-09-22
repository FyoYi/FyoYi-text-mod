package com.fyoyi.text.item;

import com.fyoyi.text.text_mod;
import com.fyoyi.text.util.ModTiers;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RubyTools {

    public static final RegistryObject<Item> RUBY_SWORD =
            ModItems.ITEMS.register("ruby_sword", () -> new SwordItem(
                    ModTiers.RUBY_SWORD,
                    2,
                    -2.2F,
                    new Item.Properties().stacksTo(1)
            ));

    public static final RegistryObject<Item> RUBY_PICKAXE =
            ModItems.ITEMS.register("ruby_pickaxe",() -> new PickaxeItem(
                    ModTiers.RUBY_PICKAXE,
                    0,
                    -2.8F,
                    new Item.Properties().stacksTo(1)
            ));

    public static final RegistryObject<Item> RUBY_HOE =
            ModItems.ITEMS.register("ruby_hoe",() -> new HoeItem(
                    ModTiers.RUBY_HOE,
                    0,
                    0.0F,
                    new Item.Properties().stacksTo(1)
            ));

    public static final RegistryObject<Item> RUBY_AXE =
            ModItems.ITEMS.register("ruby_axe",() -> new AxeItem(
                    ModTiers.RUBY_AXE,
                    5,
                    -3.0F,
                    new Item.Properties().stacksTo(1)
            ));

    public static final RegistryObject<Item> RUBY_SHOVEL =
            ModItems.ITEMS.register("ruby_shovel",() -> new ShovelItem(
                    ModTiers.RUBY_SHOVEL,
                    0,
                    -3.0F,
                    new Item.Properties().stacksTo(1)
            ));

    public static void init() {
        // 这个方法是空的，它的存在就是为了让主类可以调用它来加载这个类
    }

}
