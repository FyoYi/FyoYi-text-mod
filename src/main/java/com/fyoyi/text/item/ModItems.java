package com.fyoyi.text.item;

import com.fyoyi.text.text_mod;
import com.fyoyi.text.util.ModTiers;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, text_mod.MOD_ID);

    //================================================================物品注册
    public static final RegistryObject<Item> TEXT_ITEM =
            ITEMS.register("text_item", () -> new Item(new Item.Properties().
                    stacksTo(64)));//注册红宝石

    public static final RegistryObject<Item> RUBY =
            ITEMS.register("ruby", () -> new Item(new Item.Properties().
                    stacksTo(64)));

    public static final RegistryObject<Item> RUBY_SWORD =
            ITEMS.register("ruby_sword", () -> new SwordItem(
                    ModTiers.RUBY_SWORD,
                    2,
                    -2.4F,
                    new Item.Properties().stacksTo(1)
            ));

    public static final RegistryObject<Item> RUBY_INLAID_WOODEN_SWORD =
            ITEMS.register("ruby_inlaid_wooden_sword", () -> new SwordItem(
                    ModTiers.RUBY_WOODEN_SWORD,
                    2,
                    -2.4F,
                    new Item.Properties().stacksTo(1)
            ));

    public static final RegistryObject<Item> RUBY_INLAID_GOLDEN_SWORD =
            ITEMS.register("ruby_inlaid_golden_sword", () -> new SwordItem(
                    ModTiers.RUBY_GOLDEN_SWORD,
                    2,
                    -2.4F,
                    new Item.Properties().stacksTo(1)
            ));

    public static final RegistryObject<Item> RUBY_INLAID_STONE_SWORD =
            ITEMS.register("ruby_inlaid_stone_sword", () -> new SwordItem(
                    ModTiers.RUBY_STONE_SWORD,
                    2,
                    -2.4F,
                    new Item.Properties().stacksTo(1)
            ));

    public static final RegistryObject<Item> RUBY_INLAID_IRON_SWORD =
            ITEMS.register("ruby_inlaid_iron_sword", () -> new SwordItem(
                    ModTiers.RUBY_IRON_SWORD,
                    2,
                    -2.4F,
                    new Item.Properties().stacksTo(1)
            ));

    public static final RegistryObject<Item> RUBY_INLAID_DIAMOND_SWORD =
            ITEMS.register("ruby_inlaid_diamond_sword", () -> new SwordItem(
                    ModTiers.RUBY_DIAMOND_SWORD,
                    2,
                    -2.4F,
                    new Item.Properties().stacksTo(1)
            ));

//    public static final RegistryObject<Item> RUBY_INLAID_NETHERITE_SWORD =
//            ITEMS.register("ruby_inlaid_netherite_sword", () -> new SwordItem(
//                    ModTiers.RUBY_NETTHERITE_SWORD,
//                    2,
//                    -2.4F,
//                    new Item.Properties().stacksTo(1)
//            ));


    //================================================================

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
