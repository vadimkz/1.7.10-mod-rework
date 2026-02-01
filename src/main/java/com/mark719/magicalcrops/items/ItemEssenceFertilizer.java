package com.mark719.magicalcrops.items;

import com.mark719.magicalcrops.MagicalCrops;
import com.mark719.magicalcrops.handlers.MBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ItemEssenceFertilizer extends Item {

    public static final String[] names = new String[] { "accio", "crucio", "imperio", "zivicio" };
    public static final String[] iconNames = new String[] { "fertilizer_accio", "fertilizer_crucio", "fertilizer_imperio", "fertilizer_zivicio" };

    @SideOnly(Side.CLIENT)
    private IIcon[] icons;

    public ItemEssenceFertilizer() {
        this.setHasSubtypes(true);
        // Если setMaxDamage не работает, используем это для предотвращения поломки
        this.setMaxStackSize(64);
        this.setCreativeTab(MagicalCrops.tabMagical);
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        // Цвет названия зависит от метаданных предмета.
        switch (stack.getItemDamage()) {
            case 0: return EnumChatFormatting.GOLD + super.getItemStackDisplayName(stack);
            case 1: return EnumChatFormatting.YELLOW + super.getItemStackDisplayName(stack);
            case 2: return EnumChatFormatting.AQUA + super.getItemStackDisplayName(stack);
            case 3: return EnumChatFormatting.LIGHT_PURPLE + super.getItemStackDisplayName(stack);
            default: return EnumChatFormatting.GRAY + super.getItemStackDisplayName(stack);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int damage) {
        int j = MathHelper.clamp_int(damage, 0, 3);
        return this.icons[j];
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        int i = MathHelper.clamp_int(stack.getItemDamage(), 0, 3);
        return super.getUnlocalizedName() + "." + names[i];
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs tab, List list) {
        for (int i = 0; i < 4; i++) {
            list.add(new ItemStack(item, 1, i));
        }
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        switch (stack.getItemDamage()) {
            case 0: return EnumRarity.common;
            case 1: return EnumRarity.uncommon;
            case 2: return EnumRarity.rare;
            case 3: return EnumRarity.epic;
            default: return EnumRarity.rare;
        }
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
        if (side != 1) return false;

        // Проверяем возможность редактирования блока игроком
        if (!player.canPlayerEdit(x, y, z, side, stack)) return false;

        // Проверяем, является ли блок ванильной грядкой
        if (world.getBlock(x, y, z) == Blocks.farmland) {
            if (!world.isRemote) {
                int damage = stack.getItemDamage();
                if (damage == 0) world.setBlock(x, y, z, MBlocks.FarmlandAccio);
                else if (damage == 1) world.setBlock(x, y, z, MBlocks.FarmlandCrucio);
                else if (damage == 2) world.setBlock(x, y, z, MBlocks.FarmlandImperio);
                else if (damage == 3) world.setBlock(x, y, z, MBlocks.FarmlandZivicio);

                --stack.stackSize;
            }
            return true;
        }
        return false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.icons = new IIcon[iconNames.length];
        for (int i = 0; i < iconNames.length; i++) {
            this.icons[i] = iconRegister.registerIcon("magicalcrops:" + iconNames[i]);
        }
    }
}
