package com.mark719.magicalcrops.itemblock;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;

public class ItemBlockEssenceBlock extends ItemBlock {

    private static final String[] SUBNAMES = new String[] {
            "coal", "earth", "emerald", "fire", "gold", "lapis", "obsidian", "redstone"
    };

    public ItemBlockEssenceBlock(Block block) {
        super(block);
        // Устанавливаем, что у предмета есть подтипы (метаданные)
        this.setHasSubtypes(true);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        // Получаем индекс от 0 до 7 на основе метадаты
        int i = MathHelper.clamp_int(stack.getMetadata(), 0, 7);
        // Возвращает имя вида: tile.EssenceBlock.coal
        return super.getUnlocalizedName() + "." + SUBNAMES[i];
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        // Добавляем цветовое форматирование к названию в зависимости от метадаты
        int meta = stack.getMetadata();
        if (meta == 0) {
            return EnumChatFormatting.DARK_GRAY + super.getItemStackDisplayName(stack);
        } else if (meta == 1) {
            return EnumChatFormatting.WHITE + super.getItemStackDisplayName(stack);
        } else if (meta == 2) {
            return EnumChatFormatting.GREEN + super.getItemStackDisplayName(stack);
        } else if (meta == 3) {
            return EnumChatFormatting.GOLD + super.getItemStackDisplayName(stack);
        } else if (meta == 4) {
            return EnumChatFormatting.YELLOW + super.getItemStackDisplayName(stack);
        } else if (meta == 5) {
            return EnumChatFormatting.AQUA + super.getItemStackDisplayName(stack);
        } else if (meta == 6) {
            return EnumChatFormatting.LIGHT_PURPLE + super.getItemStackDisplayName(stack);
        } else if (meta == 7) {
            return EnumChatFormatting.RED + super.getItemStackDisplayName(stack);
        }
        return EnumChatFormatting.GRAY + super.getItemStackDisplayName(stack);
    }

    @Override
    public int getMetadata(int meta) {
        // Важно: возвращает мету предмета как мету блока при установке
        return meta;
    }
}
