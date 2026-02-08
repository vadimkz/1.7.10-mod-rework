/*    */ package com.mark719.magicalcrops.items;
/*    */ 
/*    */ import com.mark719.magicalcrops.MagicalCrops;
/*    */ import com.mark719.magicalcrops.config.ConfigMain;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import java.util.List;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.EnumRarity;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ItemInfusionStone4Extreme
/*    */   extends Item
/*    */ {
/* 18 */   int durability = ConfigMain.EXTREME_DURABILITY;
/*    */ 
/*    */   
/*    */   public ItemInfusionStone4Extreme() {
/* 22 */     this.field_77777_bU = 1;
/* 23 */     func_77656_e(this.durability);
/* 24 */     func_77637_a(MagicalCrops.tabMagical);
/* 25 */     func_111206_d("magicalcrops:InfusionStone_T4");
/* 26 */     func_77655_b("InfusionStoneExtreme");
/* 27 */     this.canRepair = false;
/* 28 */     this.field_77787_bX = true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean func_77630_h(ItemStack itemstack) {
/* 33 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public ItemStack getContainerItem(ItemStack itemStack) {
/* 38 */     ItemStack cStack = itemStack.func_77946_l();
/* 39 */     if (ConfigMain.INFUSION_DURABILITY) {
/* 40 */       cStack.func_77964_b(cStack.func_77960_j() + 1);
/* 41 */       cStack.field_77994_a = 1;
/*    */     } 
/* 43 */     return cStack;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hasContainerItem(ItemStack stack) {
/* 48 */     return true;
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public EnumRarity func_77613_e(ItemStack par2) {
/* 53 */     return EnumRarity.epic;
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_77624_a(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> par3List, boolean par4) {
/* 58 */     par3List.add("Imperio -> Zivicio");
/* 59 */     if (ConfigMain.INFUSION_DURABILITY)
/* 60 */       par3List.add("Durability: " + (par1ItemStack.func_77958_k() - par1ItemStack.func_77960_j()) + "/" + par1ItemStack.func_77958_k()); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\ItemInfusionStone4Extreme.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */