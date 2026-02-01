package com.mark719.magicalcrops.events;

import com.mark719.magicalcrops.handlers.Armour;
import com.mark719.magicalcrops.items.armour.ItemZivicioArmour;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

public class FireProtectionEvent {

    @SubscribeEvent
    public void onBurnDamage(LivingAttackEvent event) {
        if (event.entity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) event.entity;

            // Получаем слоты брони: 0-boots, 1-legs, 2-chest, 3-helm
            ItemStack boots = player.getEquipmentInSlot(1);
            ItemStack legs = player.getEquipmentInSlot(2);
            ItemStack chest = player.getEquipmentInSlot(3);
            ItemStack helm = player.getEquipmentInSlot(4);

            // Проверяем типы урона: InFire, OnFire, Lava
            if (event.source.equals(DamageSource.inFire) ||
                    event.source.equals(DamageSource.onFire) ||
                    event.source.equals(DamageSource.lava)) {

                if (boots != null && legs != null && chest != null && helm != null) {

                    boolean isZivicioSet = boots.getItem() instanceof ItemZivicioArmour &&
                            legs.getItem() instanceof ItemZivicioArmour &&
                            chest.getItem() == Armour.ZivicioArmourChestplateFire &&
                            helm.getItem() instanceof ItemZivicioArmour;

                    if (isZivicioSet) {
                        event.setCanceled(true);
                        player.extinguish(); // Тушим игрока визуально
                    }
                    // УБРАНО: event.setCanceled(false) - это вызывало баги с другими модами
                }
            }
        }
    }
}