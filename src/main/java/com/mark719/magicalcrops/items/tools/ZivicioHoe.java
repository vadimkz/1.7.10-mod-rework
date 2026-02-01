package com.mark719.magicalcrops.items.tools;

import com.mark719.magicalcrops.MagicalCrops;
import com.mark719.magicalcrops.config.ConfigMain;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.UseHoeEvent;
import org.lwjgl.input.Keyboard;

public class ZivicioHoe extends ItemHoe {

    public ZivicioHoe(int par1, Item.ToolMaterial material) {
        super(material);
        this.maxStackSize = 1;
        this.setCreativeTab(MagicalCrops.tabMagical);
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        return EnumChatFormatting.LIGHT_PURPLE + super.getItemStackDisplayName(stack);
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
        if (!player.canPlayerEdit(x, y, z, side, stack)) {
            return false;
        }

        UseHoeEvent event = new UseHoeEvent(player, stack, world, x, y, z);
        if (MinecraftForge.EVENT_BUS.post(event)) {
            return false;
        }

        if (event.getResult() == Event.Result.ALLOW) {
            return true;
        }

        Block block = world.getBlock(x, y, z);

        if (side != 0 && world.isAirBlock(x, y + 1, z) && (block == Blocks.grass || block == Blocks.dirt)) {
            Block farmland = Blocks.farmland;

            // Упрощенный вызов звука без избыточного приведения типов
            // Координаты x + 0.5f автоматически расширяются до double
            world.playSoundEffect(
                    x + 0.5F,
                    y + 0.5F,
                    z + 0.5F,
                    "step.grass",
                    1.0F,
                    1.0F
            );

            if (world.isRemote) {
                return true;
            } else {
                world.setBlock(x, y, z, farmland);
                return true;
            }
        }
        return false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        if (ConfigMain.EXTRA_HOE) {
            list.add(EnumChatFormatting.WHITE + "Hold " + EnumChatFormatting.YELLOW + "SHIFT" + EnumChatFormatting.WHITE + " for tool bonus:");
            if (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54)) {
                list.add(EnumChatFormatting.ITALIC + "- Infinite durability");
                list.add(EnumChatFormatting.ITALIC + "- 8 Extra essence from Minicio Crops");
            }
        }
        list.add(EnumChatFormatting.WHITE + "Durability: " + EnumChatFormatting.GRAY + "Infinite");
    }
}