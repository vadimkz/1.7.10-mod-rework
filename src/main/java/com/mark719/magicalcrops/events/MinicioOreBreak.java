package com.mark719.magicalcrops.events;

import com.mark719.magicalcrops.handlers.Essence;
import com.mark719.magicalcrops.handlers.MBlocks;
import com.mark719.magicalcrops.handlers.Tools;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;

public class MinicioOreBreak {

    @SubscribeEvent
    public void onOreBreak(BlockEvent.HarvestDropsEvent event) {
        // Проверяем, что блок — это руда миничио и копал именно игрок
        if (event.harvester != null && event.block == MBlocks.MinicioOre) {

            // Если копали Шелковым касанием — никаких бонусов, только руда
            if (event.isSilkTouching) {
                return;
            }

            ItemStack heldItem = event.harvester.getCurrentEquippedItem();
            if (heldItem != null) {
                Item tool = heldItem.getItem();
                int bonusAmount = 0;

                // Определяем количество бонусной эссенции в зависимости от тира кирки
                if (tool == Tools.AccioPickaxe) {
                    bonusAmount = 2;
                } else if (tool == Tools.CrucioPickaxe) {
                    bonusAmount = 4;
                } else if (tool == Tools.ImperioPickaxe) {
                    bonusAmount = 8;
                } else if (tool == Tools.ZivicioPickaxe) {
                    bonusAmount = 16;
                }

                // Если кирка подходящая, добавляем эссенцию в список дропа
                if (bonusAmount > 0) {
                    // Очищаем стандартный дроп, если хотим, чтобы падал ТОЛЬКО бонус (опционально)
                    // event.drops.clear(); 
                    event.drops.add(new ItemStack(Essence.MinicioEssence, bonusAmount));
                }
            }
        }
    }
}