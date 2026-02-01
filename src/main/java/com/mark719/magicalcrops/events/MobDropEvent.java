package com.mark719.magicalcrops.events;

import com.mark719.magicalcrops.config.ConfigMain;
import com.mark719.magicalcrops.handlers.Essence;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

import java.util.Random;

public class MobDropEvent {

    // Используем один экземпляр Random для экономии ресурсов
    private static final Random RANDOM = new Random();

    @SubscribeEvent
    public void essenceMobDrops(LivingDropsEvent event) {
        if (event.entityLiving == null || event.entityLiving.worldObj.isRemote) {
            return;
        }

        double x = event.entityLiving.posX;
        double y = event.entityLiving.posY;
        double z = event.entityLiving.posZ;

        // 1. Проверка на Боссов (Дракон и Визер)
        if (event.entityLiving instanceof EntityDragon && ConfigMain.DRAGON_ESS_DROP) {
            addDrop(event, new ItemStack(Essence.ZivicioEssence, ConfigMain.DRGAON_ESS_DROP_AMOUNT), x, y, z);
        }
        else if (event.entityLiving instanceof EntityWither && ConfigMain.WITHER_ESS_DROP) {
            addDrop(event, new ItemStack(Essence.ZivicioEssence, ConfigMain.WITHER_ESS_DROP_AMOUNT), x, y, z);
        }

        // 2. Проверка на обычных мобов
        else {
            int chance = RANDOM.nextInt(100);

            // Мирные животные
            if (event.entityLiving instanceof EntityAnimal && ConfigMain.PASSIVE_ESS_DROP) {
                if (chance < ConfigMain.PASSIVE_DROP_CHANCE) {
                    addDrop(event, new ItemStack(Essence.MinicioEssence, 1), x, y, z);
                }
            }
            // Враждебные мобы
            else if (event.entityLiving instanceof EntityMob && ConfigMain.HOSTILE_ESS_DROP) {
                if (chance < ConfigMain.HOSTILE_DROP_CHANCE) {
                    addDrop(event, new ItemStack(Essence.MinicioEssence, 1), x, y, z);
                }
            }
        }
    }

    /**
     * Вспомогательный метод для создания EntityItem и добавления его в список дропа
     */
    private void addDrop(LivingDropsEvent event, ItemStack stack, double x, double y, double z) {
        if (stack == null || stack.getItem() == null) return;

        EntityItem entityItem = new EntityItem(event.entityLiving.worldObj, x, y, z, stack);
        // Небольшая задержка перед подбором, как у стандартного дропа
        entityItem.delayBeforeCanPickup = 10;
        event.drops.add(entityItem);
    }
}