/*    */ package com.mark719.magicalcrops.handlers;
/*    */ 
/*    */ import com.mark719.magicalcrops.items.armour.ItemAccioArmour;
/*    */ import com.mark719.magicalcrops.items.armour.ItemCrucioArmour;
/*    */ import com.mark719.magicalcrops.items.armour.ItemImperioArmour;
/*    */ import com.mark719.magicalcrops.items.armour.ItemZivicioArmour;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemArmor;
/*    */ import net.minecraftforge.common.util.EnumHelper;
/*    */ 
/*    */ 
/*    */ public class Armour
/*    */ {
/* 14 */   public static ItemArmor.ArmorMaterial AccioArmour = EnumHelper.addArmorMaterial("AccioArmour", 40, new int[] { 3, 8, 7, 3 }, 15);
/* 15 */   public static ItemArmor.ArmorMaterial CrucioArmour = EnumHelper.addArmorMaterial("CrucioArmour", 80, new int[] { 4, 8, 7, 3 }, 20);
/* 16 */   public static ItemArmor.ArmorMaterial ImperioArmour = EnumHelper.addArmorMaterial("ImperioArmour", 160, new int[] { 4, 8, 7, 4 }, 25);
/* 17 */   public static ItemArmor.ArmorMaterial ZivicioArmour = EnumHelper.addArmorMaterial("ZivicioArmour", 320, new int[] { 4, 9, 8, 3 }, 30);
/*    */ 
/*    */   
/* 20 */   public static Item AccioArmourHelmet = (Item)new ItemAccioArmour(AccioArmour, 0, "AccioArmourHelmet");
/* 21 */   public static Item AccioArmourChestplate = (Item)new ItemAccioArmour(AccioArmour, 1, "AccioArmourChestplate");
/* 22 */   public static Item AccioArmourLeggings = (Item)new ItemAccioArmour(AccioArmour, 2, "AccioArmourLeggings");
/* 23 */   public static Item AccioArmourBoots = (Item)new ItemAccioArmour(AccioArmour, 3, "AccioArmourBoots");
/*    */ 
/*    */   
/* 26 */   public static Item CrucioArmourHelmet = (Item)new ItemCrucioArmour(CrucioArmour, 0, "CrucioArmourHelmet");
/* 27 */   public static Item CrucioArmourChestplate = (Item)new ItemCrucioArmour(CrucioArmour, 1, "CrucioArmourChestplate");
/* 28 */   public static Item CrucioArmourLeggings = (Item)new ItemCrucioArmour(CrucioArmour, 2, "CrucioArmourLeggings");
/* 29 */   public static Item CrucioArmourBoots = (Item)new ItemCrucioArmour(CrucioArmour, 3, "CrucioArmourBoots");
/*    */ 
/*    */   
/* 32 */   public static Item ImperioArmourHelmet = (Item)new ItemImperioArmour(ImperioArmour, 0, "ImperioArmourHelmet");
/* 33 */   public static Item ImperioArmourChestplate = (Item)new ItemImperioArmour(ImperioArmour, 1, "ImperioArmourChestplate");
/* 34 */   public static Item ImperioArmourLeggings = (Item)new ItemImperioArmour(ImperioArmour, 2, "ImperioArmourLeggings");
/* 35 */   public static Item ImperioArmourBoots = (Item)new ItemImperioArmour(ImperioArmour, 3, "ImperioArmourBoots");
/*    */ 
/*    */   
/* 38 */   public static Item ZivicioArmourHelmet = (Item)new ItemZivicioArmour(ZivicioArmour, 0, "ZivicioArmourHelmet");
/* 39 */   public static Item ZivicioArmourChestplate = (Item)new ItemZivicioArmour(ZivicioArmour, 1, "ZivicioArmourChestplate");
/* 40 */   public static Item ZivicioArmourLeggings = (Item)new ItemZivicioArmour(ZivicioArmour, 2, "ZivicioArmourLeggings");
/* 41 */   public static Item ZivicioArmourBoots = (Item)new ItemZivicioArmour(ZivicioArmour, 3, "ZivicioArmourBoots");
/*    */ 
/*    */   
/* 44 */   public static Item ZivicioArmourHelmetFeed = (Item)new ItemZivicioArmour(ZivicioArmour, 0, "ZivicioArmourHelmetFeed");
/* 45 */   public static Item ZivicioArmourHelmetNight = (Item)new ItemZivicioArmour(ZivicioArmour, 0, "ZivicioArmourHelmetNight");
/* 46 */   public static Item ZivicioArmourHelmetWater = (Item)new ItemZivicioArmour(ZivicioArmour, 0, "ZivicioArmourHelmetWater");
/*    */ 
/*    */   
/* 49 */   public static Item ZivicioArmourChestplateFire = (Item)new ItemZivicioArmour(ZivicioArmour, 1, "ZivicioArmourChestplateFire");
/* 50 */   public static Item ZivicioArmourChestplateWither = (Item)new ItemZivicioArmour(ZivicioArmour, 1, "ZivicioArmourChestplateWither");
/* 51 */   public static Item ZivicioArmourChestplatePoison = (Item)new ItemZivicioArmour(ZivicioArmour, 1, "ZivicioArmourChestplatePoison");
/*    */ 
/*    */   
/* 54 */   public static Item ZivicioArmourLeggingsBlind = (Item)new ItemZivicioArmour(ZivicioArmour, 2, "ZivicioArmourLeggingsBlind");
/* 55 */   public static Item ZivicioArmourLeggingsWeak = (Item)new ItemZivicioArmour(ZivicioArmour, 2, "ZivicioArmourLeggingsWeak");
/* 56 */   public static Item ZivicioArmourLeggingsConfusion = (Item)new ItemZivicioArmour(ZivicioArmour, 2, "ZivicioArmourLeggingsConfusion");
/*    */ 
/*    */   
/* 59 */   public static Item ZivicioArmourBootsStep = (Item)new ItemZivicioArmour(ZivicioArmour, 3, "ZivicioArmourBootsStep");
/* 60 */   public static Item ZivicioArmourBootsSpeed = (Item)new ItemZivicioArmour(ZivicioArmour, 3, "ZivicioArmourBootsSpeed");
/* 61 */   public static Item ZivicioArmourBootsJump = (Item)new ItemZivicioArmour(ZivicioArmour, 3, "ZivicioArmourBootsJump");
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\handlers\Armour.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */