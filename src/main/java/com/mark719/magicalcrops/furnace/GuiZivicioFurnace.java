/*    */ package com.mark719.magicalcrops.furnace;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.gui.inventory.GuiContainer;
/*    */ import net.minecraft.client.resources.I18n;
/*    */ import net.minecraft.entity.player.InventoryPlayer;
/*    */ import net.minecraft.util.ResourceLocation;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ @SideOnly(Side.CLIENT)
/*    */ public class GuiZivicioFurnace
/*    */   extends GuiContainer
/*    */ {
/* 18 */   private static final ResourceLocation texture = new ResourceLocation("magicalcrops".toLowerCase(), "textures/gui/zivicio_furnace_gui.png");
/*    */   private TileEntityZivicioFurnace tileFurnace;
/*    */   
/*    */   public GuiZivicioFurnace(InventoryPlayer invPlayer, TileEntityZivicioFurnace tile) {
/* 22 */     super(new ContainerZivicioFurnace(invPlayer, tile));
/* 23 */     this.tileFurnace = tile;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
/* 28 */     String string = this.tileFurnace.hasCustomInventoryName() ? this.tileFurnace.getInventoryName() : I18n.format(this.tileFurnace.getInventoryName());
/* 29 */     this.fontRendererObj.drawString(string, 137 - this.fontRendererObj.getStringWidth(string), 6, 4210752);
/* 30 */     this.fontRendererObj.drawString(I18n.format("container.inventory"), 8, this.ySize - 94, 4210752);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
/* 35 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 36 */     Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
/* 37 */     int k = (this.width - this.xSize) / 2;
/* 38 */     int l = (this.height - this.ySize) / 2;
/* 39 */     drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
/*    */ 
/*    */     
/* 42 */     if (this.tileFurnace.isBurning()) {
/*    */       
/* 44 */       int i = this.tileFurnace.getBurnTimeRemainingScaled(12);
/* 45 */       drawTexturedModalRect(k + 56, l + 36 + 12 - i, 176, 12 - i, 14, i + 2);
/*    */     } 
/*    */     
/* 48 */     int i1 = this.tileFurnace.getCookProgressScaled(24);
/* 49 */     drawTexturedModalRect(k + 79, l + 34, 176, 14, i1 + 1, 16);
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\furnace\GuiZivicioFurnace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
