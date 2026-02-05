package com.mark719.magicalcrops.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

/**
 * ПКМ-сбор урожая: по fully-grown BlockCrops (meta >= 7) дропает лут и откатывает стадию роста.
 * Работает для ванильных и Magical Crops кропов, если они наследуются от BlockCrops.
 */
public class CropPlantOnBreak {

    @SubscribeEvent
    public void onRightClick(PlayerInteractEvent event) {
        if (event == null) return;
        if (event.action != PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK) return;

        World world = event.world;
        int x = event.x;
        int y = event.y;
        int z = event.z;

        Block block = world.getBlock(x, y, z);
        if (!(block instanceof BlockCrops)) return;

        int meta = world.getBlockMetadata(x, y, z);
        if (meta < 7) return;

        EntityPlayer player = event.entityPlayer;
        if (player == null) return;

        // Не мешаем использованию предметов по ПКМ (например, ведро воды), только сбор растения.
        // Если игрок крадётся — не собираем, чтобы дать "обходной путь" для взаимодействий.
        if (player.isSneaking()) return;

        if (!world.isRemote) {
            // Дропаем как при ломании (с учётом Fortune и т.п., если будет)
            block.dropBlockAsItem(world, x, y, z, meta, 0);

            // Оставляем растение и откатываем стадию роста (3 = середина, выглядит нормально)
            world.setBlockMetadataWithNotify(x, y, z, 3, 2);
        }

        // Отменяем стандартное действие ПКМ по блоку
        event.setCanceled(true);
    }
}
