/*    */ package com.mark719.magicalcrops;
/*    */ 
/*    */ import com.mark719.magicalcrops.furnace.TileEntityAccioFurnace;
/*    */ import com.mark719.magicalcrops.furnace.TileEntityCrucioFurnace;
/*    */ import com.mark719.magicalcrops.furnace.TileEntityImperioFurnace;
/*    */ import com.mark719.magicalcrops.furnace.TileEntityUltimateFurnace;
/*    */ import com.mark719.magicalcrops.furnace.TileEntityZivicioFurnace;
/*    */ import cpw.mods.fml.common.network.NetworkRegistry;
/*    */ import cpw.mods.fml.common.registry.GameRegistry;
/*    */ 
/*    */ 
/*    */ public class CommonProxy
/*    */ {
/*    */   public static void renderStuff() {}
/*    */   
/*    */   public void registerNetworkStuff() {
/* 17 */     NetworkRegistry.INSTANCE.registerGuiHandler(MagicalCrops.instance, new GuiHandler());
/*    */   }
/*    */   
/*    */   public void registerTileEntities() {
/* 21 */     GameRegistry.registerTileEntity(TileEntityAccioFurnace.class, "TileEntityAccioFurnace");
/* 22 */     GameRegistry.registerTileEntity(TileEntityCrucioFurnace.class, "TileEntityCrucioFurnace");
/* 23 */     GameRegistry.registerTileEntity(TileEntityImperioFurnace.class, "TileEntityImperioFurnace");
/* 24 */     GameRegistry.registerTileEntity(TileEntityZivicioFurnace.class, "TileEntityZivicioFurnace");
/* 25 */     GameRegistry.registerTileEntity(TileEntityUltimateFurnace.class, "TileEntityUltimateFurnace");
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\CommonProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */