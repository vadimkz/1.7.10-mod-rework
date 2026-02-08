/*    */ package com.mark719.magicalcrops.handlers;
/*    */ 
/*    */ import com.mark719.magicalcrops.items.tools.AccioAxe;
/*    */ import com.mark719.magicalcrops.items.tools.AccioHoe;
/*    */ import com.mark719.magicalcrops.items.tools.AccioPickaxe;
/*    */ import com.mark719.magicalcrops.items.tools.AccioShovel;
/*    */ import com.mark719.magicalcrops.items.tools.AccioSword;
/*    */ import com.mark719.magicalcrops.items.tools.CrucioAxe;
/*    */ import com.mark719.magicalcrops.items.tools.CrucioHoe;
/*    */ import com.mark719.magicalcrops.items.tools.CrucioPickaxe;
/*    */ import com.mark719.magicalcrops.items.tools.CrucioShovel;
/*    */ import com.mark719.magicalcrops.items.tools.CrucioSword;
/*    */ import com.mark719.magicalcrops.items.tools.ImperioAxe;
/*    */ import com.mark719.magicalcrops.items.tools.ImperioHoe;
/*    */ import com.mark719.magicalcrops.items.tools.ImperioPickaxe;
/*    */ import com.mark719.magicalcrops.items.tools.ImperioShovel;
/*    */ import com.mark719.magicalcrops.items.tools.ImperioSword;
/*    */ import com.mark719.magicalcrops.items.tools.ZivicioAxe;
/*    */ import com.mark719.magicalcrops.items.tools.ZivicioHoe;
/*    */ import com.mark719.magicalcrops.items.tools.ZivicioPickaxe;
/*    */ import com.mark719.magicalcrops.items.tools.ZivicioShovel;
/*    */ import com.mark719.magicalcrops.items.tools.ZivicioSword;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraftforge.common.util.EnumHelper;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Tools
/*    */ {
/* 30 */   public static Item.ToolMaterial AccioMaterial = EnumHelper.addToolMaterial("AccioMaterial", 3, 1900, 8.0F, 4.0F, 20);
/* 31 */   public static Item.ToolMaterial CrucioMaterial = EnumHelper.addToolMaterial("CrucioMaterial", 3, 2400, 9.0F, 6.0F, 25);
/* 32 */   public static Item.ToolMaterial ImperioMaterial = EnumHelper.addToolMaterial("ImperioMaterial", 4, 4000, 10.0F, 8.0F, 35);
/* 33 */   public static Item.ToolMaterial ZivicioMaterial = EnumHelper.addToolMaterial("ZivicioMaterial", 4, 8500, 15.0F, 10.0F, 50);
/*    */   
/* 35 */   public static Item AccioPickaxe = (new AccioPickaxe(0, AccioMaterial)).func_77655_b("AccioPickaxe").func_111206_d("magicalcrops:tools_accio_pickaxe");
/* 36 */   public static Item AccioSword = (new AccioSword(0, AccioMaterial)).func_77655_b("AccioSword").func_111206_d("magicalcrops:tools_accio_sword");
/* 37 */   public static Item AccioAxe = (new AccioAxe(0, AccioMaterial)).func_77655_b("AccioAxe").func_111206_d("magicalcrops:tools_accio_axe");
/* 38 */   public static Item AccioShovel = (new AccioShovel(0, AccioMaterial)).func_77655_b("AccioShovel").func_111206_d("magicalcrops:tools_accio_spade");
/* 39 */   public static Item AccioHoe = (new AccioHoe(0, AccioMaterial)).func_77655_b("AccioHoe").func_111206_d("magicalcrops:tools_accio_hoe");
/*    */   
/* 41 */   public static Item CrucioPickaxe = (new CrucioPickaxe(0, CrucioMaterial)).func_77655_b("CrucioPickaxe").func_111206_d("magicalcrops:tools_crucio_pickaxe");
/* 42 */   public static Item CrucioSword = (new CrucioSword(0, CrucioMaterial)).func_77655_b("CrucioSword").func_111206_d("magicalcrops:tools_crucio_sword");
/* 43 */   public static Item CrucioAxe = (new CrucioAxe(0, CrucioMaterial)).func_77655_b("CrucioAxe").func_111206_d("magicalcrops:tools_crucio_axe");
/* 44 */   public static Item CrucioShovel = (new CrucioShovel(0, CrucioMaterial)).func_77655_b("CrucioShovel").func_111206_d("magicalcrops:tools_crucio_spade");
/* 45 */   public static Item CrucioHoe = (new CrucioHoe(0, CrucioMaterial)).func_77655_b("CrucioHoe").func_111206_d("magicalcrops:tools_crucio_hoe");
/*    */   
/* 47 */   public static Item ImperioPickaxe = (new ImperioPickaxe(0, ImperioMaterial)).func_77655_b("ImperioPickaxe").func_111206_d("magicalcrops:tools_imperio_pickaxe");
/* 48 */   public static Item ImperioSword = (new ImperioSword(0, ImperioMaterial)).func_77655_b("ImperioSword").func_111206_d("magicalcrops:tools_imperio_sword");
/* 49 */   public static Item ImperioAxe = (new ImperioAxe(0, ImperioMaterial)).func_77655_b("ImperioAxe").func_111206_d("magicalcrops:tools_imperio_axe");
/* 50 */   public static Item ImperioShovel = (new ImperioShovel(0, ImperioMaterial)).func_77655_b("ImperioShovel").func_111206_d("magicalcrops:tools_imperio_spade");
/* 51 */   public static Item ImperioHoe = (new ImperioHoe(0, ImperioMaterial)).func_77655_b("ImperioHoe").func_111206_d("magicalcrops:tools_imperio_hoe");
/*    */   
/* 53 */   public static Item ZivicioPickaxe = (new ZivicioPickaxe(0, ZivicioMaterial)).func_77655_b("ZivicioPickaxe").func_111206_d("magicalcrops:tools_zivicio_pickaxe");
/* 54 */   public static Item ZivicioSword = (new ZivicioSword(0, ZivicioMaterial)).func_77655_b("ZivicioSword").func_111206_d("magicalcrops:tools_zivicio_sword");
/* 55 */   public static Item ZivicioAxe = (new ZivicioAxe(0, ZivicioMaterial)).func_77655_b("ZivicioAxe").func_111206_d("magicalcrops:tools_zivicio_axe");
/* 56 */   public static Item ZivicioShovel = (new ZivicioShovel(0, ZivicioMaterial)).func_77655_b("ZivicioShovel").func_111206_d("magicalcrops:tools_zivicio_spade");
/* 57 */   public static Item ZivicioHoe = (new ZivicioHoe(0, ZivicioMaterial)).func_77655_b("ZivicioHoe").func_111206_d("magicalcrops:tools_zivicio_hoe");
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\handlers\Tools.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */