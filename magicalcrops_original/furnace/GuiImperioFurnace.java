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
/*    */ public class GuiImperioFurnace
/*    */   extends GuiContainer
/*    */ {
/* 18 */   private static final ResourceLocation texture = new ResourceLocation("magicalcrops".toLowerCase(), "textures/gui/imperio_furnace_gui.png");
/*    */   private TileEntityImperioFurnace tileFurnace;
/*    */   
/*    */   public GuiImperioFurnace(InventoryPlayer invPlayer, TileEntityImperioFurnace tile) {
/* 22 */     super(new ContainerImperioFurnace(invPlayer, tile));
/* 23 */     this.tileFurnace = tile;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void func_146979_b(int par1, int par2) {
/* 28 */     String string = this.tileFurnace.func_145818_k_() ? this.tileFurnace.func_145825_b() : I18n.func_135052_a(this.tileFurnace.func_145825_b(), new Object[0]);
/* 29 */     this.field_146289_q.func_78276_b(string, 140 - this.field_146289_q.func_78256_a(string), 6, 4210752);
/* 30 */     this.field_146289_q.func_78276_b(I18n.func_135052_a("container.inventory", new Object[0]), 8, this.field_147000_g - 94, 4210752);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void func_146976_a(float var1, int var2, int var3) {
/* 35 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 36 */     (Minecraft.func_71410_x()).field_71446_o.func_110577_a(texture);
/* 37 */     int k = (this.field_146294_l - this.field_146999_f) / 2;
/* 38 */     int l = (this.field_146295_m - this.field_147000_g) / 2;
/* 39 */     func_73729_b(k, l, 0, 0, this.field_146999_f, this.field_147000_g);
/*    */ 
/*    */     
/* 42 */     if (this.tileFurnace.isBurning()) {
/*    */       
/* 44 */       int i = this.tileFurnace.getBurnTimeRemainingScaled(12);
/* 45 */       func_73729_b(k + 56, l + 36 + 12 - i, 176, 12 - i, 14, i + 2);
/*    */     } 
/*    */     
/* 48 */     int i1 = this.tileFurnace.getCookProgressScaled(24);
/* 49 */     func_73729_b(k + 79, l + 34, 176, 14, i1 + 1, 16);
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\furnace\GuiImperioFurnace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */