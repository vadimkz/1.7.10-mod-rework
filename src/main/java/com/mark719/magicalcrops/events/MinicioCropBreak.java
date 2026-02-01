package com.mark719.magicalcrops.events;

import com.mark719.magicalcrops.handlers.Essence;
import com.mark719.magicalcrops.handlers.MCrops;
import com.mark719.magicalcrops.handlers.Tools;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;

public class MinicioCropBreak {

    @SubscribeEvent
    public void onCropBreak(BlockEvent.HarvestDropsEvent event) {
        // Проверяем, что блок сломал игрок
        if (event.harvester != null) {
            // Если сломан куст Minicio (созревший) и у игрока что-то есть в руке
            if (event.block == MCrops.MinicioCrop && event.blockMetadata == 7 && event.harvester.getCurrentEquippedItem() != null) {

                ItemStack heldItem = event.harvester.getCurrentEquippedItem();

                // Бонус для Accio мотыги (+1)
                if (heldItem.getItem() == Tools.AccioHoe) {
                    event.drops.add(new ItemStack(Essence.MinicioEssence, 1));
                }
                // Бонус для Crucio мотыги (+2)
                else if (heldItem.getItem() == Tools.CrucioHoe) {
                    event.drops.add(new ItemStack(Essence.MinicioEssence, 2));
                }
                // Бонус для Imperio мотыги (+4)
                else if (heldItem.getItem() == Tools.ImperioHoe) {
                    event.drops.add(new ItemStack(Essence.MinicioEssence, 4));
                }
                // Бонус для Zivicio мотыги (+8)
                else if (heldItem.getItem() == Tools.ZivicioHoe) {
                    event.drops.add(new ItemStack(Essence.MinicioEssence, 8));
                }
            }
        }
    }
}