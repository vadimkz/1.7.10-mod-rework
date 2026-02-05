package com.mark719.magicalcrops.items.seeds;

import com.mark719.magicalcrops.MagicalCrops;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class NetherSeeds extends ItemSeeds {

    private final Block cropBlock;

    public NetherSeeds(Block crop, Block farmlandIgnored) {
        super(crop, Blocks.farmland); // всегда используем ванильную пашню
        this.cropBlock = crop;
        this.maxStackSize = 64;
        setCreativeTab(MagicalCrops.tabMagical);
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world,
                             int x, int y, int z, int side,
                             float hitX, float hitY, float hitZ) {

        if (side != 1) return false;

        if (!world.getBlock(x, y, z).equals(Blocks.farmland)) return false;

        if (!world.isAirBlock(x, y + 1, z)) return false;

        world.setBlock(x, y + 1, z, cropBlock);
        stack.stackSize--;
        return true;
    }
}
