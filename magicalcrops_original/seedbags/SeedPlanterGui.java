/*    */ package com.mark719.magicalcrops.seedbags;
/*    */ 
/*    */ import net.minecraft.client.gui.inventory.GuiContainer;
/*    */ import net.minecraft.client.resources.I18n;
/*    */ import net.minecraft.entity.player.InventoryPlayer;
/*    */ import net.minecraft.util.ResourceLocation;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SeedPlanterGui
/*    */   extends GuiContainer
/*    */ {
/* 14 */   private static final ResourceLocation background = new ResourceLocation("textures/gui/container/generic_54.png");
/*    */   
/*    */   private int rows;
/*    */   
/*    */   InventoryPlayer playerInventory;
/*    */   
/*    */   SeedInventory seedInventory;
/*    */   
/*    */   public SeedPlanterGui(InventoryPlayer playerInv, SeedInventory itemInv) {
/* 23 */     super(new SeedContainer(playerInv, itemInv));
/* 24 */     this.playerInventory = playerInv;
/* 25 */     this.seedInventory = itemInv;
/*    */     
/* 27 */     int i = 222;
/* 28 */     int j = i - 108;
/* 29 */     this.rows = itemInv.getSizeInventory() / 9;
/*    */     
/* 31 */     this.ySize = j + this.rows * 18;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void drawGuiContainerForegroundLayer(int par1, int par2) {
/* 36 */     this.fontRendererObj.drawString(this.seedInventory.isCustomInventoryName() ? this.seedInventory.getInventoryName() : I18n.format(this.seedInventory.getInventoryName(), new Object[0]), 8, 6, 4210752);
/* 37 */     this.fontRendererObj.drawString(this.playerInventory.isCustomInventoryName() ? this.playerInventory.getInventoryName() : I18n.format(this.playerInventory.getInventoryName(), new Object[0]), 8, this.ySize - 94, 4210752);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
/* 44 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*    */     
/* 46 */     this.mc.getTextureManager().bindTexture(background);
/*    */     
/* 48 */     int i = (this.width - this.xSize) / 2;
/* 49 */     int j = (this.height - this.ySize) / 2;
/* 50 */     drawTexturedModalRect(i, j, 0, 0, this.xSize, this.rows * 18 + 17);
/* 51 */     drawTexturedModalRect(i, j + this.rows * 18 + 17, 0, 126, this.xSize, 96);
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\seedbags\SeedPlanterGui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */