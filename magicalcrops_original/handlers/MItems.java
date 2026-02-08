/*    */ package com.mark719.magicalcrops.handlers;
/*    */ 
/*    */ import com.mark719.magicalcrops.items.ItemEmeraldApple;
/*    */ import com.mark719.magicalcrops.items.ItemEssenceFertilizer;
/*    */ import com.mark719.magicalcrops.items.ItemExperienceBook;
/*    */ import com.mark719.magicalcrops.items.ItemInfusionStone1Weak;
/*    */ import com.mark719.magicalcrops.items.ItemInfusionStone2Regular;
/*    */ import com.mark719.magicalcrops.items.ItemInfusionStone3Strong;
/*    */ import com.mark719.magicalcrops.items.ItemInfusionStone4Extreme;
/*    */ import com.mark719.magicalcrops.items.ItemInfusionStone5Master;
/*    */ import com.mark719.magicalcrops.items.ItemMagicalFertilizer;
/*    */ import com.mark719.magicalcrops.items.ItemUltimateDiamondApple;
/*    */ import com.mark719.magicalcrops.items.ItemUltimateEmeraldApple;
/*    */ import com.mark719.magicalcrops.items.ItemsEssenceIngots;
/*    */ import com.mark719.magicalcrops.seedbags.ItemSeedBagAccio;
/*    */ import com.mark719.magicalcrops.seedbags.ItemSeedBagCrucio;
/*    */ import com.mark719.magicalcrops.seedbags.ItemSeedBagImperio;
/*    */ import com.mark719.magicalcrops.seedbags.ItemSeedBagZivicio;
/*    */ import net.minecraft.item.Item;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MItems
/*    */ {
/* 25 */   public static Item InfusionStoneWeak = (new ItemInfusionStone1Weak()).func_77655_b("InfusionStoneWeak");
/* 26 */   public static Item InfusionStoneRegular = (new ItemInfusionStone2Regular()).func_77655_b("InfusionStoneRegular");
/* 27 */   public static Item InfusionStoneStrong = (new ItemInfusionStone3Strong()).func_77655_b("InfusionStoneStrong");
/* 28 */   public static Item InfusionStoneExtreme = (new ItemInfusionStone4Extreme()).func_77655_b("InfusionStoneExtreme");
/* 29 */   public static Item InfusionStoneMaster = (new ItemInfusionStone5Master()).func_77655_b("InfusionStoneMaster");
/*    */ 
/*    */   
/* 32 */   public static Item MagicalFertilizer = (new ItemMagicalFertilizer()).func_77655_b("MagicalFertilizer");
/*    */ 
/*    */   
/* 35 */   public static Item EssenceFertilizer = (new ItemEssenceFertilizer()).func_77655_b("EssenceFertilizer");
/*    */ 
/*    */   
/* 38 */   public static Item ExperienceBook = (new ItemExperienceBook()).func_77655_b("ExperienceBook");
/*    */ 
/*    */   
/* 41 */   public static Item EssenceIngots = (new ItemsEssenceIngots()).func_77655_b("EssenceIngots");
/*    */ 
/*    */   
/* 44 */   public static Item SeedBagAccio = (Item)new ItemSeedBagAccio();
/* 45 */   public static Item SeedBagCrucio = (Item)new ItemSeedBagCrucio();
/* 46 */   public static Item SeedBagImperio = (Item)new ItemSeedBagImperio();
/* 47 */   public static Item SeedBagZivicio = (Item)new ItemSeedBagZivicio();
/*    */ 
/*    */   
/* 50 */   public static Item UltimateDiamondApple = (new ItemUltimateDiamondApple(4, 2.0F, false)).func_77655_b("UltimateDiamondApple").func_111206_d("magicalcrops:apple_diamond");
/* 51 */   public static Item EmeraldApple = (new ItemEmeraldApple(4, 2.0F, false)).func_77655_b("EmeraldApple").func_111206_d("magicalcrops:apple_emerald");
/* 52 */   public static Item UltimateEmeraldApple = (new ItemUltimateEmeraldApple(4, 2.0F, false)).func_77655_b("UltimateEmeraldApple").func_111206_d("magicalcrops:apple_emerald");
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\handlers\MItems.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
