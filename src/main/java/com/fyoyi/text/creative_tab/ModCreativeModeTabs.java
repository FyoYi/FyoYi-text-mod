package com.fyoyi.text.creative_tab;

import com.fyoyi.text.item.ModItems;
import com.fyoyi.text.text_mod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, text_mod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TEXT_TAB =
            CREATIVE_MODE_TABS.register("text_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.RUBY.get()))
                    .title(Component.translatable("ItemGroup.text_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.RUBY.get());
                        pOutput.accept(ModItems.RUBY_SWORD.get());
                        pOutput.accept(ModItems.RUBY_INLAID_WOODEN_SWORD.get());
                        pOutput.accept(ModItems.RUBY_INLAID_STONE_SWORD.get());
                        pOutput.accept(ModItems.RUBY_INLAID_GOLDEN_SWORD.get());
                        pOutput.accept(ModItems.RUBY_INLAID_IRON_SWORD.get());
                        pOutput.accept(ModItems.RUBY_INLAID_DIAMOND_SWORD.get());
                        pOutput.accept(ModItems.RUBY_INLAID_NETHERITE_SWORD.get());
                    }).build());

//    public static final RegistryObject<CreativeModeTab> TEXT_TAB =
//            CREATIVE_MODE_TABS.register("text_tab", () -> CreativeModeTab.builder()
//                    .icon(() -> new ItemStack(ModItems.RUBY.get()))
//                    .title(Component.translatable("itemGroup.text_tab"))
//                    .displayItems((pParameters, pOutput) -> {
//                        pOutput.accept(ModItems.RUBY.get());
//
//                    }).withTabsBefore(TEXT_TAB.getKey()).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
