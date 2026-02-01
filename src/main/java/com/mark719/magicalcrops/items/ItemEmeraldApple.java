package com.mark719.magicalcrops.items;

import com.mark719.magicalcrops.MagicalCrops;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import org.lwjgl.input.Keyboard;

public class ItemEmeraldApple extends ItemFood {

    public ItemEmeraldApple(int hunger, float saturation, boolean isWolfFood) {
        super(hunger, saturation, isWolfFood);
        this.setCreativeTab(MagicalCrops.tabMagical);
        this.setAlwaysEdible();
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        if (!world.isRemote) {
            // Эффекты: Регенерация, Огнестойкость, Поглощение 5, Сопротивление 2, Спешка, Сила
            player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 1200, 0));
            player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 1200, 0));
            player.addPotionEffect(new PotionEffect(22, 1200, 4)); // Absorption V
            player.addPotionEffect(new PotionEffect(Potion.resistance.id, 1200, 1));
            player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 1200, 0));
            player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1200, 0));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        list.add(EnumChatFormatting.YELLOW + "Зажмите SHIFT для инфо");

        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
            list.add(EnumChatFormatting.AQUA + "- Регенерация (1:00)");
            list.add(EnumChatFormatting.AQUA + "- Огнестойкость (1:00)");
            list.add(EnumChatFormatting.AQUA + "- Поглощение V (1:00)");
            list.add(EnumChatFormatting.AQUA + "- Сопротивление II (1:00)");
            list.add(EnumChatFormatting.AQUA + "- Спешка (1:00)");
            list.add(EnumChatFormatting.AQUA + "- Сила (1:00)");
        }
    }
}