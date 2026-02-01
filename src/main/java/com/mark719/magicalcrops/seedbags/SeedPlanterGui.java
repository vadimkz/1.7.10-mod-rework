package com.mark719.magicalcrops.seedbags;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class SeedPlanterGui extends GuiContainer {
    private static final ResourceLocation texture = new ResourceLocation("textures/gui/container/generic_54.png");
    private SeedInventory seedInventory;
    private int rows;

    public SeedPlanterGui(InventoryPlayer playerInv, SeedInventory itemInv) {
        super(new SeedContainer(playerInv, itemInv));
        this.seedInventory = itemInv;
        this.rows = itemInv.getSizeInventory() / 9;
        this.ySize = 114 + this.rows * 18;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        this.fontRendererObj.drawString(this.seedInventory.hasCustomInventoryName() ? this.seedInventory.getInventoryName() : I18n.format(this.seedInventory.getInventoryName()), 8, 6, 4210752);
        this.fontRendererObj.drawString(I18n.format("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(texture);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;

        // Рисуем верхнюю часть GUI
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.rows * 18 + 17);
        // Рисуем нижнюю часть (инвентарь игрока)
        this.drawTexturedModalRect(k, l + this.rows * 18 + 17, 0, 126, this.xSize, 96);
    }
}