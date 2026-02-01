package com.mark719.magicalcrops.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.world.BlockEvent;
import com.mark719.magicalcrops.blocks.BlockMagicalCrops;

/**
 * Класс обрабатывает событие сбора урожая.
 * Если игрок ломает полностью созревшее растение, оно автоматически пересаживается.
 */
public class CropPlantOnBreak {

    @SubscribeEvent
    public void onCropPlantBreak(BlockEvent.HarvestDropsEvent event) {
        // Проверяем, что блок сломал именно игрок
        if (event.harvester instanceof EntityPlayer) {

            // Проверяем, является ли блок нашим магическим растением и созрело ли оно (метадата 7)
            if (event.block instanceof BlockMagicalCrops && event.blockMetadata == 7) {

                // setBlock — это setBlock. Устанавливаем стадию роста 1 (после посадки)
                // Параметры: x, y, z, block, metadata, flag
                event.world.setBlock(event.x, event.y, event.z, event.block, 1, 2);
            }
        }
    }
}