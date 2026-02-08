/*    */ package com.mark719.magicalcrops.items;
/*    */ 
/*    */ import com.mark719.magicalcrops.MagicalCrops;
/*    */ import com.mark719.magicalcrops.config.ConfigMain;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import java.util.List;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.EnumChatFormatting;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ItemInfusionStone3Strong
/*    */   extends Item
/*    */ {
/* 19 */   int durability = ConfigMain.STRONG_DURABILITY;
/*    */ 
/*    */   
/*    */   public ItemInfusionStone3Strong() {
/* 23 */     this.field_77777_bU = 1;
/* 24 */     func_77656_e(this.durability);
/* 25 */     func_77637_a(MagicalCrops.tabMagical);
/* 26 */     func_111206_d("magicalcrops:InfusionStone_T3");
/* 27 */     func_77655_b("InfusionStoneStrong");
/* 28 */     this.canRepair = false;
/* 29 */     this.field_77787_bX = true;
/*    */   }
/*    */ 
/*    */   
/*    */   public String func_77653_i(ItemStack stack) {
/* 34 */     return EnumChatFormatting.AQUA + super.func_77653_i(stack);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean func_77630_h(ItemStack itemstack) {
/* 39 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public ItemStack getContainerItem(ItemStack itemStack) {
/* 44 */     ItemStack cStack = itemStack.func_77946_l();
/* 45 */     if (ConfigMain.INFUSION_DURABILITY) {
/* 46 */       cStack.func_77964_b(cStack.func_77960_j() + 1);
/* 47 */       cStack.field_77994_a = 1;
/*    */     } 
/* 49 */     return cStack;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hasContainerItem(ItemStack stack) {
/* 54 */     return true;
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_77624_a(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> par3List, boolean par4) {
/* 59 */     par3List.add("Crucio -> Imperio");
/* 60 */     if (ConfigMain.INFUSION_DURABILITY)
/* 61 */       par3List.add("Durability: " + (par1ItemStack.func_77958_k() - par1ItemStack.func_77960_j()) + "/" + par1ItemStack.func_77958_k()); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\ItemInfusionStone3Strong.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */