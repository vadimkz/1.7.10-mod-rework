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
/* 29 */     this.rows = itemInv.func_70302_i_() / 9;
/*    */     
/* 31 */     this.field_147000_g = j + this.rows * 18;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void func_146979_b(int par1, int par2) {
/* 36 */     this.field_146289_q.func_78276_b(this.seedInventory.func_145818_k_() ? this.seedInventory.func_145825_b() : I18n.func_135052_a(this.seedInventory.func_145825_b(), new Object[0]), 8, 6, 4210752);
/* 37 */     this.field_146289_q.func_78276_b(this.playerInventory.func_145818_k_() ? this.playerInventory.func_145825_b() : I18n.func_135052_a(this.playerInventory.func_145825_b(), new Object[0]), 8, this.field_147000_g - 94, 4210752);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void func_146976_a(float par1, int par2, int par3) {
/* 44 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*    */     
/* 46 */     this.field_146297_k.func_110434_K().func_110577_a(background);
/*    */     
/* 48 */     int i = (this.field_146294_l - this.field_146999_f) / 2;
/* 49 */     int j = (this.field_146295_m - this.field_147000_g) / 2;
/* 50 */     func_73729_b(i, j, 0, 0, this.field_146999_f, this.rows * 18 + 17);
/* 51 */     func_73729_b(i, j + this.rows * 18 + 17, 0, 126, this.field_146999_f, 96);
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\seedbags\SeedPlanterGui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */