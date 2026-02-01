package com.mark719.magicalcrops.items;

import com.mark719.magicalcrops.MagicalCrops;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import org.lwjgl.input.Keyboard;

public class ItemUltimateEmeraldApple extends ItemFood {

    public ItemUltimateEmeraldApple(int hunger, float saturation, boolean isWolfFood) {
        super(hunger, saturation, isWolfFood);
        this.setCreativeTab(MagicalCrops.tabMagical);
        this.setAlwaysEdible();
        this.setMaxDamage(0);
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        if (!world.isRemote) {
            // Regeneration I (id 10)
            addOrExtendEffect(player, Potion.regeneration.id, 12000, 0);

            // Fire Resistance (id 12)
            addOrExtendEffect(player, Potion.fireResistance.id, 12000, 0);

            // Absorption V (id 22)
            addOrExtendEffect(player, 22, 12000, 4);

            // Resistance II (id 11)
            addOrExtendEffect(player, Potion.resistance.id, 12000, 1);

            // Haste (id 3)
            addOrExtendEffect(player, Potion.digSpeed.id, 12000, 0);

            // Strength (id 5)
            addOrExtendEffect(player, Potion.damageBoost.id, 12000, 0);
        }
    }

    /**
     * Вспомогательный метод для добавления эффекта или продления существующего
     */
    private void addOrExtendEffect(EntityPlayer player, int potionId, int durationToAdd, int amplifier) {
        int currentDuration = 0;
        PotionEffect existing = player.getActivePotionEffect(Potion.potionTypes[potionId]);

        if (existing != null) {
            currentDuration = existing.getDuration();
        }

        player.addPotionEffect(new PotionEffect(potionId, currentDuration + durationToAdd, amplifier));
    }

    @Override
    public int getMaxItemUseDuration(ItemStack stack) {
        return 32;
    }

    @Override
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.eat;
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        return EnumChatFormatting.GREEN + super.getItemStackDisplayName(stack);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        list.add(EnumChatFormatting.YELLOW + "Hold shift for info");

        // В 1.7.10 коды клавиш: 42 (LShift), 54 (RShift)
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
            list.add("Regeneration I - +10:00");
            list.add("Fire Resistance - +10:00");
            list.add("Absorption V - +10:00");
            list.add("Damage Resistance II - +10:00");
            list.add("Haste - +10:00");
            list.add("Strength - +10:00");
        }
    }
}