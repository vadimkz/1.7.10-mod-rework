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
/* 25 */   public static Item InfusionStoneWeak = (new ItemInfusionStone1Weak()).setUnlocalizedName("InfusionStoneWeak");
/* 26 */   public static Item InfusionStoneRegular = (new ItemInfusionStone2Regular()).setUnlocalizedName("InfusionStoneRegular");
/* 27 */   public static Item InfusionStoneStrong = (new ItemInfusionStone3Strong()).setUnlocalizedName("InfusionStoneStrong");
/* 28 */   public static Item InfusionStoneExtreme = (new ItemInfusionStone4Extreme()).setUnlocalizedName("InfusionStoneExtreme");
/* 29 */   public static Item InfusionStoneMaster = (new ItemInfusionStone5Master()).setUnlocalizedName("InfusionStoneMaster");
/*    */ 
/*    */   
/* 32 */   public static Item MagicalFertilizer = (new ItemMagicalFertilizer()).setUnlocalizedName("MagicalFertilizer");
/*    */ 
/*    */   
/* 35 */   public static Item EssenceFertilizer = (new ItemEssenceFertilizer()).setUnlocalizedName("EssenceFertilizer");
/*    */ 
/*    */   
/* 38 */   public static Item ExperienceBook = (new ItemExperienceBook()).setUnlocalizedName("ExperienceBook");
/*    */ 
/*    */   
/* 41 */   public static Item EssenceIngots = (new ItemsEssenceIngots()).setUnlocalizedName("EssenceIngots");
/*    */ 
/*    */   
/* 44 */   public static Item SeedBagAccio = (Item)new ItemSeedBagAccio();
/* 45 */   public static Item SeedBagCrucio = (Item)new ItemSeedBagCrucio();
/* 46 */   public static Item SeedBagImperio = (Item)new ItemSeedBagImperio();
/* 47 */   public static Item SeedBagZivicio = (Item)new ItemSeedBagZivicio();
/*    */ 
/*    */   
/* 50 */   public static Item UltimateDiamondApple = (new ItemUltimateDiamondApple(4, 2.0F, false)).setUnlocalizedName("UltimateDiamondApple").setTextureName("magicalcrops:apple_diamond");
/* 51 */   public static Item EmeraldApple = (new ItemEmeraldApple(4, 2.0F, false)).setUnlocalizedName("EmeraldApple").setTextureName("magicalcrops:apple_emerald");
/* 52 */   public static Item UltimateEmeraldApple = (new ItemUltimateEmeraldApple(4, 2.0F, false)).setUnlocalizedName("UltimateEmeraldApple").setTextureName("magicalcrops:apple_emerald");
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\handlers\MItems.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
