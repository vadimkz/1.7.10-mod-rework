package com.mark719.magicalcrops;

import com.mark719.magicalcrops.furnace.*;
import com.mark719.magicalcrops.seedbags.*;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {

    public GuiHandler() {
        NetworkRegistry.INSTANCE.registerGuiHandler(MagicalCrops.instance, this);
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tile = world.getTileEntity(x, y, z);

        if (ID == 0) {
            ItemStack stack = player.getHeldItem();
            if (stack == null || stack.getItem() == null) return null;

            Item item = stack.getItem();
            // Проверяем, является ли предмет сумкой (Planter)
            if (!(item instanceof Planter)) return null;

            if (item instanceof ItemSeedBagAccio || item instanceof ItemSeedBagCrucio ||
                    item instanceof ItemSeedBagImperio || item instanceof ItemSeedBagZivicio) {
                return new SeedContainer(player.inventory, new SeedInventory(stack));
            }
        }

        // Обработка печек
        switch (ID) {
            case 1: return new ContainerAccioFurnace(player.inventory, (TileEntityAccioFurnace) tile);
            case 2: return new ContainerCrucioFurnace(player.inventory, (TileEntityCrucioFurnace) tile);
            case 3: return new ContainerImperioFurnace(player.inventory, (TileEntityImperioFurnace) tile);
            case 4: return new ContainerZivicioFurnace(player.inventory, (TileEntityZivicioFurnace) tile);
            case 5: return new ContainerUltimateFurnace(player.inventory, (TileEntityUltimateFurnace) tile);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tile = world.getTileEntity(x, y, z);

        if (ID == 0) {
            ItemStack stack = player.getHeldItem();
            if (stack == null || stack.getItem() == null) return null;

            Item item = stack.getItem();
            if (!(item instanceof Planter)) return null;

            if (item instanceof ItemSeedBagAccio || item instanceof ItemSeedBagCrucio ||
                    item instanceof ItemSeedBagImperio || item instanceof ItemSeedBagZivicio) {
                return new SeedPlanterGui(player.inventory, new SeedInventory(stack));
            }
        }

        // Обработка GUI печек
        switch (ID) {
            case 1: return new GuiAccioFurnace(player.inventory, (TileEntityAccioFurnace) tile);
            case 2: return new GuiCrucioFurnace(player.inventory, (TileEntityCrucioFurnace) tile);
            case 3: return new GuiImperioFurnace(player.inventory, (TileEntityImperioFurnace) tile);
            case 4: return new GuiZivicioFurnace(player.inventory, (TileEntityZivicioFurnace) tile);
            case 5: return new GuiUltimateFurnace(player.inventory, (TileEntityUltimateFurnace) tile);
        }
        return null;
    }
}