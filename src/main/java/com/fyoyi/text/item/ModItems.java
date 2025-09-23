package com.fyoyi.text.item;

import com.fyoyi.text.item.weapon.bow.Bow_item;
import com.fyoyi.text.item.weapon.CrossBow_item;
import com.fyoyi.text.item.weapon.Spear_item;
import com.fyoyi.text.item.weapon.Sword_item;
import com.fyoyi.text.item.tools.RubyTools_item;
import com.fyoyi.text.item.sundries.Sundries_item;
import com.fyoyi.text.text_mod;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, text_mod.MOD_ID);

    public static void init() {
        Sundries_item.init();
        Bow_item.init();
        CrossBow_item.init();
        Spear_item.init();
        Sword_item.init();
        RubyTools_item.init();
    }

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
