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

public class ItemUltimateDiamondApple extends ItemFood {

    public ItemUltimateDiamondApple(int hunger, float saturation, boolean isWolfFood) {
        super(hunger, saturation, isWolfFood);
        this.setCreativeTab(MagicalCrops.tabMagical);
        this.setAlwaysEdible();
        // В 1.7.10 метод называется setMaxDamage, но в некоторых средах MCP он может быть func_77656_e
        this.setMaxDamage(0);
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        if (!world.isRemote) {
            // Potion.field_76444_x — это Absorption (Поглощение)
            // Если IDE не видит поле, используем Potion.potionTypes[22]
            addOrExtendEffect(player, 22, 12000, 4); // Absorption V
            addOrExtendEffect(player, Potion.resistance.id, 12000, 0); // Сопротивление
            addOrExtendEffect(player, Potion.digSpeed.id, 12000, 0);    // Спешка
            addOrExtendEffect(player, Potion.damageBoost.id, 12000, 0); // Сила
        }
    }

    private void addOrExtendEffect(EntityPlayer player, int potionId, int durationToAdd, int amplifier) {
        int currentDuration = 0;
        PotionEffect existing = player.getActivePotionEffect(Potion.potionTypes[potionId]);

        if (existing != null) {
            currentDuration = existing.getDuration();
        }

        player.addPotionEffect(new PotionEffect(potionId, currentDuration + durationToAdd, amplifier));
    }

    @Override
    public int getMaxItemUseDuration(ItemStack par1ItemStack) {
        return 32;
    }

    @Override
    public EnumAction getItemUseAction(ItemStack par1ItemStack) {
        return EnumAction.eat;
    }

    @Override
    public boolean hasEffect(ItemStack is) {
        return true;
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        return EnumChatFormatting.AQUA + super.getItemStackDisplayName(stack);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        list.add(EnumChatFormatting.YELLOW + "Hold shift for info");

        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
            list.add("Absorption V - +10:00");
            list.add("Damage Resistance - +10:00");
            list.add("Haste - +10:00");
            list.add("Strength - +10:00");
        }
    }
}