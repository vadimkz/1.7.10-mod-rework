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
/*    */ import net.minecraft.util.EnumChatFormatting;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ItemInfusionStone5Master
/*    */   extends Item
/*    */ {
/*    */   public ItemInfusionStone5Master() {
/* 21 */     this.field_77777_bU = 1;
/* 22 */     func_77656_e(0);
/* 23 */     func_77637_a(MagicalCrops.tabMagical);
/* 24 */     func_111206_d("magicalcrops:InfusionStone_T5");
/* 25 */     func_77655_b("InfusionStoneMaster");
/* 26 */     this.canRepair = false;
/* 27 */     this.field_77787_bX = true;
/*    */   }
/*    */ 
/*    */   
/*    */   public String func_77653_i(ItemStack stack) {
/* 32 */     return EnumChatFormatting.DARK_RED + super.func_77653_i(stack);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean func_77630_h(ItemStack itemstack) {
/* 37 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public ItemStack getContainerItem(ItemStack itemStack) {
/* 42 */     ItemStack cStack = itemStack.func_77946_l();
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
/* 58 */     par3List.add("Infuses All");
/* 59 */     if (ConfigMain.INFUSION_DURABILITY)
/* 60 */       par3List.add("Durability: Infinate"); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\ItemInfusionStone5Master.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */