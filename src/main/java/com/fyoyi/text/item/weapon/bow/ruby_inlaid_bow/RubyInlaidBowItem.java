package com.fyoyi.text.item.weapon.bow.ruby_inlaid_bow;

import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

public class RubyInlaidBowItem extends BowItem {

    public RubyInlaidBowItem(Item.Properties pProperties) {
        super(pProperties);
    }

    public AbstractArrow customArrow(AbstractArrow arrow){

        arrow.setBaseDamage(6.0D);
        arrow.setNoGravity(true);

        return arrow;
    }

}
