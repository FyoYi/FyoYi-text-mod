package com.fyoyi.text.item.weapon.bow.ruby_inlaid_bow;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.UseAnim;

public class RubyInlaidBowItem extends BowItem {

    public RubyInlaidBowItem(Item.Properties pProperties) {
        super(pProperties);
    }

    public AbstractArrow customArrow(AbstractArrow arrow){

        arrow.setBaseDamage(4.0D);

        return arrow;
    }
    @Override
    public void releaseUsing(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity, int pUseRemaining) {
        // 这个方法的大部分逻辑都复制自原版的 BowItem
        if (!(pLivingEntity instanceof Player player)) {
            return;
        }

        boolean hasInfinity = player.getAbilities().instabuild || EnchantmentHelper.getItemEnchantmentLevel(Enchantments.INFINITY_ARROWS, pStack) > 0;
        ItemStack ammoStack = player.getProjectile(pStack);

        if (!ammoStack.isEmpty() || hasInfinity) {
            if (ammoStack.isEmpty()) {
                ammoStack = new ItemStack(Items.ARROW);
            }

            int useDuration = this.getUseDuration(pStack) - pUseRemaining;
            float power = getPowerForTime(useDuration);
            if (!((double)power < 0.1D)) {
                boolean isCreativeOrInfinity = hasInfinity && ammoStack.is(Items.ARROW);
                ItemStack itemstack = player.getProjectile(pStack);
                if (!pLevel.isClientSide) {

                    int numberOfArrows = 1; // <--- 在这里定义你想发射的箭矢数量

                    for (int i = 0; i < numberOfArrows; ++i) {
                        ArrowItem arrowitem = (ArrowItem) (ammoStack.getItem() instanceof ArrowItem ? ammoStack.getItem() : Items.ARROW);
                        AbstractArrow abstractarrow = arrowitem.createArrow(pLevel, ammoStack, player);

                        float velocityMultiplier = 3.5F; // <--- 在这里定义你的速度乘数
                        abstractarrow.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, power * velocityMultiplier, 1.0F);

                        // 在发射前，应用我们自定义的箭矢属性
                        abstractarrow = this.customArrow(abstractarrow);

                        if (power == 1) {
                            abstractarrow.setCritArrow(true);
                        }

                        // 处理力量附魔
                        int powerLevel = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.POWER_ARROWS, pStack);
                        if (powerLevel > 0) {
                            abstractarrow.setBaseDamage(abstractarrow.getBaseDamage() + (double) powerLevel * 0.7D + 0.5D);
                        }

                        // 处理冲击附魔
                        int punchLevel = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.PUNCH_ARROWS, pStack);
                        if (punchLevel > 0) {
                            abstractarrow.setKnockback(punchLevel);
                        }

                        // 处理火矢附魔
                        if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FLAMING_ARROWS, pStack) > 0) {
                            abstractarrow.setSecondsOnFire(100);
                        }

                        pStack.hurtAndBreak(1, player, (p_40665_) -> {
                            p_40665_.broadcastBreakEvent(player.getUsedItemHand());
                        });

                        pLevel.addFreshEntity(abstractarrow);
                    }
                }
                pLevel.playSound((Player)null, player.getX(), player.getY(), player.getZ(), SoundEvents.ARROW_SHOOT, SoundSource.PLAYERS, 1.0F, 1.0F / (pLevel.getRandom().nextFloat() * 0.4F + 1.2F) + power * 0.5F);
                if (!isCreativeOrInfinity && !player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                    if (itemstack.isEmpty()) {
                        player.getInventory().removeItem(itemstack);
                    }
                }

                player.awardStat(Stats.ITEM_USED.get(this));
            }
        }
    }
}



