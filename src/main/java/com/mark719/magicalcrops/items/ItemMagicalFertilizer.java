package com.mark719.magicalcrops.items;

import com.mark719.magicalcrops.MagicalCrops;
import com.mark719.magicalcrops.blocks.BlockMagicalCrops;
import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.FakePlayerFactory;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class ItemMagicalFertilizer extends Item {

    public ItemMagicalFertilizer() {
        super();
        this.setMaxStackSize(64); // setMaxStackSize
        this.setCreativeTab(MagicalCrops.tabMagical); // setCreativeTab
        this.setTextureName("magicalcrops:MagicalFertilizer"); // setTextureName
        this.setUnlocalizedName("MagicalFertilizer");
    }

    /**
     * Вызывается при использовании предмета на блоке (ПКМ).
     */
    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
        // Проверяем мету блока. В Minecraft растения обычно имеют 7 стадий (0-7).
        int meta = world.getBlockMetadata(x, y, z); // func_72805_g

        if (meta < 7) {
            // Проверка прав игрока на редактирование блока
            if (!player.canPlayerEdit(x, y, z, side, stack)) { // canPlayerEdit
                return false;
            }

            // Пытаемся применить удобрение
            if (applyBonemeal(stack, world, x, y, z, player)) {
                if (!world.isRemote) { // isRemote
                    // Спавним частицы костной муки (ID 2005)
                    world.playAuxSFX(2005, x, y, z, 0); // playAuxSFX
                }
                return true;
            }
        }
        return false;
    }

    /**
     * Статический метод для использования удобрения (например, через механизмы/FakePlayer).
     */
    public static boolean applyFertilizer(ItemStack stack, WorldServer world, int x, int y, int z) {
        return applyBonemeal(stack, world, x, y, z, FakePlayerFactory.getMinecraft(world));
    }

    public static boolean applyBonemeal(ItemStack stack, World world, int x, int y, int z, EntityPlayer player) {
        Block block = world.getBlock(x, y, z); // getBlock

        // Генерируем событие BonemealEvent для совместимости с Forge
        BonemealEvent event = new BonemealEvent(player, world, block, x, y, z);
        if (MinecraftForge.EVENT_BUS.post(event)) {
            return false;
        }

        // Если другие моды разрешили использование через Event
        if (event.getResult() == Event.Result.ALLOW) {
            if (!world.isRemote) {
                stack.stackSize--; // stackSize
            }
            return true;
        }

        // Логика конкретно для растений из Magical Crops
        if (block instanceof BlockMagicalCrops) {
            if (!world.isRemote) {
                // В оригинале: текущая мета + случайное число (7), но не выше 7.
                // Это по сути мгновенный рост до финальной стадии.
                int newMeta = world.getBlockMetadata(x, y, z) + MathHelper.getRandomIntegerInRange(world.rand, 7, 7);

                if (newMeta > 7) {
                    newMeta = 7;
                }

                // Устанавливаем новую мету (стадию роста)
                world.setBlockMetadataWithNotify(x, y, z, newMeta, 2); // setBlockMetadataWithNotify
                stack.stackSize--;
            }
            return true;
        }

        return false;
    }
}