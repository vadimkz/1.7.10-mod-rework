/*     */ package com.mark719.magicalcrops;
/*     */ 
/*     */ import com.mark719.magicalcrops.furnace.ContainerAccioFurnace;
/*     */ import com.mark719.magicalcrops.furnace.ContainerCrucioFurnace;
/*     */ import com.mark719.magicalcrops.furnace.ContainerImperioFurnace;
/*     */ import com.mark719.magicalcrops.furnace.ContainerUltimateFurnace;
/*     */ import com.mark719.magicalcrops.furnace.ContainerZivicioFurnace;
/*     */ import com.mark719.magicalcrops.furnace.GuiAccioFurnace;
/*     */ import com.mark719.magicalcrops.furnace.GuiCrucioFurnace;
/*     */ import com.mark719.magicalcrops.furnace.GuiImperioFurnace;
/*     */ import com.mark719.magicalcrops.furnace.GuiUltimateFurnace;
/*     */ import com.mark719.magicalcrops.furnace.GuiZivicioFurnace;
/*     */ import com.mark719.magicalcrops.furnace.TileEntityAccioFurnace;
/*     */ import com.mark719.magicalcrops.furnace.TileEntityCrucioFurnace;
/*     */ import com.mark719.magicalcrops.furnace.TileEntityImperioFurnace;
/*     */ import com.mark719.magicalcrops.furnace.TileEntityUltimateFurnace;
/*     */ import com.mark719.magicalcrops.furnace.TileEntityZivicioFurnace;
/*     */ import com.mark719.magicalcrops.seedbags.SeedContainer;
/*     */ import com.mark719.magicalcrops.seedbags.SeedInventory;
/*     */ import com.mark719.magicalcrops.seedbags.SeedPlanterGui;
/*     */ import cpw.mods.fml.common.network.IGuiHandler;
/*     */ import cpw.mods.fml.common.network.NetworkRegistry;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class GuiHandler
/*     */   implements IGuiHandler
/*     */ {
/*     */   public GuiHandler() {
/*  38 */     NetworkRegistry.INSTANCE.registerGuiHandler(MagicalCrops.instance, this);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
/*  44 */     if (ID == 0) {
/*  45 */       TileEntity tileEntity = world.func_147438_o(x, y, z);
/*     */       
/*  47 */       if (player == null || player.func_71045_bC() == null || player.func_71045_bC().func_77973_b() == null) {
/*  48 */         return null;
/*     */       }
/*     */       
/*  51 */       Item currentItem = player.func_71045_bC().func_77973_b();
/*  52 */       if (!(currentItem instanceof com.mark719.magicalcrops.seedbags.Planter)) {
/*  53 */         return null;
/*     */       }
/*     */       
/*  56 */       if (currentItem instanceof com.mark719.magicalcrops.seedbags.ItemSeedBagAccio || currentItem instanceof com.mark719.magicalcrops.seedbags.ItemSeedBagCrucio || currentItem instanceof com.mark719.magicalcrops.seedbags.ItemSeedBagImperio || currentItem instanceof com.mark719.magicalcrops.seedbags.ItemSeedBagZivicio) {
/*  57 */         return new SeedContainer(player.field_71071_by, new SeedInventory(player.func_70694_bm()));
/*     */       }
/*     */     } 
/*  60 */     if (ID == 1) {
/*  61 */       TileEntityAccioFurnace tileEntityAccioFurnace = (TileEntityAccioFurnace)world.func_147438_o(x, y, z);
/*  62 */       return new ContainerAccioFurnace(player.field_71071_by, tileEntityAccioFurnace);
/*     */     } 
/*  64 */     if (ID == 2) {
/*  65 */       TileEntityCrucioFurnace tileEntityCrucioFurnace = (TileEntityCrucioFurnace)world.func_147438_o(x, y, z);
/*  66 */       return new ContainerCrucioFurnace(player.field_71071_by, tileEntityCrucioFurnace);
/*     */     } 
/*  68 */     if (ID == 3) {
/*  69 */       TileEntityImperioFurnace tileEntityImperioFurnace = (TileEntityImperioFurnace)world.func_147438_o(x, y, z);
/*  70 */       return new ContainerImperioFurnace(player.field_71071_by, tileEntityImperioFurnace);
/*     */     } 
/*  72 */     if (ID == 4) {
/*  73 */       TileEntityZivicioFurnace tileEntityZivicioFurnace = (TileEntityZivicioFurnace)world.func_147438_o(x, y, z);
/*  74 */       return new ContainerZivicioFurnace(player.field_71071_by, tileEntityZivicioFurnace);
/*     */     } 
/*  76 */     if (ID == 5) {
/*  77 */       TileEntityUltimateFurnace tileEntityUltimateFurnace = (TileEntityUltimateFurnace)world.func_147438_o(x, y, z);
/*  78 */       return new ContainerUltimateFurnace(player.field_71071_by, tileEntityUltimateFurnace);
/*     */     } 
/*     */     
/*  81 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
/*  87 */     if (ID == 0) {
/*  88 */       TileEntity tileEntity = world.func_147438_o(x, y, z);
/*     */       
/*  90 */       if (player == null || player.func_71045_bC() == null || player.func_71045_bC().func_77973_b() == null) {
/*  91 */         return null;
/*     */       }
/*     */       
/*  94 */       Item currentItem = player.func_71045_bC().func_77973_b();
/*  95 */       if (!(currentItem instanceof com.mark719.magicalcrops.seedbags.Planter)) {
/*  96 */         return null;
/*     */       }
/*     */       
/*  99 */       if (currentItem instanceof com.mark719.magicalcrops.seedbags.ItemSeedBagAccio || currentItem instanceof com.mark719.magicalcrops.seedbags.ItemSeedBagCrucio || currentItem instanceof com.mark719.magicalcrops.seedbags.ItemSeedBagImperio || currentItem instanceof com.mark719.magicalcrops.seedbags.ItemSeedBagZivicio) {
/* 100 */         return new SeedPlanterGui(player.field_71071_by, new SeedInventory(player.func_70694_bm()));
/*     */       }
/*     */     } 
/* 103 */     if (ID == 1) {
/* 104 */       TileEntityAccioFurnace tileEntityAccioFurnace = (TileEntityAccioFurnace)world.func_147438_o(x, y, z);
/* 105 */       return new GuiAccioFurnace(player.field_71071_by, tileEntityAccioFurnace);
/*     */     } 
/* 107 */     if (ID == 2) {
/* 108 */       TileEntityCrucioFurnace tileEntityCrucioFurnace = (TileEntityCrucioFurnace)world.func_147438_o(x, y, z);
/* 109 */       return new GuiCrucioFurnace(player.field_71071_by, tileEntityCrucioFurnace);
/*     */     } 
/* 111 */     if (ID == 3) {
/* 112 */       TileEntityImperioFurnace tileEntityImperioFurnace = (TileEntityImperioFurnace)world.func_147438_o(x, y, z);
/* 113 */       return new GuiImperioFurnace(player.field_71071_by, tileEntityImperioFurnace);
/*     */     } 
/* 115 */     if (ID == 4) {
/* 116 */       TileEntityZivicioFurnace tileEntityZivicioFurnace = (TileEntityZivicioFurnace)world.func_147438_o(x, y, z);
/* 117 */       return new GuiZivicioFurnace(player.field_71071_by, tileEntityZivicioFurnace);
/*     */     } 
/* 119 */     if (ID == 5) {
/* 120 */       TileEntityUltimateFurnace tileEntityUltimateFurnace = (TileEntityUltimateFurnace)world.func_147438_o(x, y, z);
/* 121 */       return new GuiUltimateFurnace(player.field_71071_by, tileEntityUltimateFurnace);
/*     */     } 
/*     */     
/* 124 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\GuiHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */