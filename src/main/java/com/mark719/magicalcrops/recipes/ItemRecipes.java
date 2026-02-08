/*     */ package com.mark719.magicalcrops.recipes;
/*     */ 
/*     */ import com.mark719.magicalcrops.config.ConfigMain;
/*     */ import com.mark719.magicalcrops.handlers.Armour;
/*     */ import com.mark719.magicalcrops.handlers.Essence;
/*     */ import com.mark719.magicalcrops.handlers.MBlocks;
/*     */ import com.mark719.magicalcrops.handlers.MItems;
/*     */ import com.mark719.magicalcrops.handlers.Tools;
/*     */ import cpw.mods.fml.common.registry.GameRegistry;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.item.crafting.IRecipe;
/*     */ import net.minecraftforge.oredict.ShapedOreRecipe;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ItemRecipes
/*     */ {
/*  22 */   static int meta = 32767;
/*     */   
/*  24 */   static Item minicioEssence = Essence.MinicioEssence;
/*  25 */   static Item accioEssence = Essence.AccioEssence;
/*  26 */   static Item crucioEssence = Essence.CrucioEssence;
/*  27 */   static Item imperioEssence = Essence.ImperioEssence;
/*  28 */   static Item zivicioEssence = Essence.ZivicioEssence;
/*     */   
/*  30 */   static ItemStack infusionWeak = new ItemStack(MItems.InfusionStoneWeak, 1, 32767);
/*  31 */   static ItemStack infusionRegular = new ItemStack(MItems.InfusionStoneRegular, 1, 32767);
/*  32 */   static ItemStack infusionStrong = new ItemStack(MItems.InfusionStoneStrong, 1, 32767);
/*  33 */   static ItemStack infusionExtreme = new ItemStack(MItems.InfusionStoneExtreme, 1, 32767);
/*  34 */   static ItemStack infusionMaster = new ItemStack(MItems.InfusionStoneMaster, 1, 32767);
/*     */   
/*  36 */   static ItemStack allWool = new ItemStack(Blocks.wool, 1, 32767);
/*     */   
/*  38 */   static ItemStack accioIngot = new ItemStack(MItems.EssenceIngots, 1, 0);
/*  39 */   static ItemStack crucioIngot = new ItemStack(MItems.EssenceIngots, 1, 1);
/*  40 */   static ItemStack imperioIngot = new ItemStack(MItems.EssenceIngots, 1, 2);
/*  41 */   static ItemStack zivicioIngot = new ItemStack(MItems.EssenceIngots, 1, 3);
/*     */ 
/*     */ 
/*     */   
/*     */   public static void loadRecipes() {
/*  46 */     GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(MItems.InfusionStoneWeak, new Object[] { Boolean.valueOf(true), "XXX", "XYX", "XXX", Character.valueOf('X'), minicioEssence, Character.valueOf('Y'), "MainInfusionMaterial" }));
/*  47 */     GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(MItems.InfusionStoneRegular, new Object[] { Boolean.valueOf(true), "XXX", "XYX", "XXX", Character.valueOf('Y'), infusionWeak, Character.valueOf('X'), "accioMaterial" }));
/*  48 */     GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(MItems.InfusionStoneStrong, new Object[] { Boolean.valueOf(true), "XXX", "XYX", "XXX", Character.valueOf('Y'), infusionRegular, Character.valueOf('X'), "crucioMaterial" }));
/*  49 */     GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(MItems.InfusionStoneExtreme, new Object[] { Boolean.valueOf(true), "XXX", "XYX", "XXX", Character.valueOf('Y'), infusionStrong, Character.valueOf('X'), "imperioMaterial" }));
/*  50 */     GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(MItems.InfusionStoneMaster, new Object[] { Boolean.valueOf(true), "XXX", "XYX", "XXX", Character.valueOf('Y'), infusionExtreme, Character.valueOf('X'), "zivicioMaterial" }));
/*     */ 
/*     */     
/*  53 */     GameRegistry.addRecipe(new ItemStack(Essence.AccioEssence, 1), new Object[] { " X ", "XZX", " X ", Character.valueOf('X'), minicioEssence, Character.valueOf('Z'), infusionWeak });
/*  54 */     GameRegistry.addRecipe(new ItemStack(Essence.CrucioEssence, 1), new Object[] { " X ", "XZX", " X ", Character.valueOf('X'), accioEssence, Character.valueOf('Z'), infusionRegular });
/*  55 */     GameRegistry.addRecipe(new ItemStack(Essence.ImperioEssence, 1), new Object[] { " X ", "XZX", " X ", Character.valueOf('X'), crucioEssence, Character.valueOf('Z'), infusionStrong });
/*  56 */     GameRegistry.addRecipe(new ItemStack(Essence.ZivicioEssence, 1), new Object[] { " X ", "XZX", " X ", Character.valueOf('X'), imperioEssence, Character.valueOf('Z'), infusionExtreme });
/*     */     
/*  58 */     GameRegistry.addRecipe(new ItemStack(Essence.AccioEssence, 1), new Object[] { " X ", "XZX", " X ", Character.valueOf('X'), minicioEssence, Character.valueOf('Z'), infusionMaster });
/*  59 */     GameRegistry.addRecipe(new ItemStack(Essence.CrucioEssence, 1), new Object[] { " X ", "XZX", " X ", Character.valueOf('X'), accioEssence, Character.valueOf('Z'), infusionMaster });
/*  60 */     GameRegistry.addRecipe(new ItemStack(Essence.ImperioEssence, 1), new Object[] { " X ", "XZX", " X ", Character.valueOf('X'), crucioEssence, Character.valueOf('Z'), infusionMaster });
/*  61 */     GameRegistry.addRecipe(new ItemStack(Essence.ZivicioEssence, 1), new Object[] { " X ", "XZX", " X ", Character.valueOf('X'), imperioEssence, Character.valueOf('Z'), infusionMaster });
/*     */     
/*  63 */     GameRegistry.addShapelessRecipe(new ItemStack(Essence.MinicioEssence, 4), new Object[] { accioEssence });
/*  64 */     GameRegistry.addShapelessRecipe(new ItemStack(Essence.AccioEssence, 4), new Object[] { crucioEssence });
/*  65 */     GameRegistry.addShapelessRecipe(new ItemStack(Essence.CrucioEssence, 4), new Object[] { imperioEssence });
/*  66 */     GameRegistry.addShapelessRecipe(new ItemStack(Essence.ImperioEssence, 4), new Object[] { zivicioEssence });
/*     */ 
/*     */     
/*  69 */     GameRegistry.addRecipe(new ItemStack(MItems.MagicalFertilizer, 4), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), minicioEssence, Character.valueOf('Y'), new ItemStack(Items.dye, 1, 15), Character.valueOf('Z'), Items.diamond });
/*     */ 
/*     */     
/*  72 */     GameRegistry.addRecipe(new ItemStack(MItems.SeedBagAccio, 1), new Object[] { " X ", "XZX", " X ", Character.valueOf('X'), accioEssence, Character.valueOf('Z'), Items.leather });
/*  73 */     GameRegistry.addRecipe(new ItemStack(MItems.SeedBagCrucio, 1), new Object[] { " X ", "XZX", " X ", Character.valueOf('X'), crucioEssence, Character.valueOf('Z'), new ItemStack(MItems.SeedBagAccio, 1) });
/*  74 */     GameRegistry.addRecipe(new ItemStack(MItems.SeedBagImperio, 1), new Object[] { " X ", "XZX", " X ", Character.valueOf('X'), imperioEssence, Character.valueOf('Z'), new ItemStack(MItems.SeedBagCrucio, 1) });
/*  75 */     GameRegistry.addRecipe(new ItemStack(MItems.SeedBagZivicio, 1), new Object[] { " X ", "XZX", " X ", Character.valueOf('X'), zivicioEssence, Character.valueOf('Z'), new ItemStack(MItems.SeedBagImperio, 1) });
/*     */ 
/*     */     
/*  78 */     GameRegistry.addRecipe(new ItemStack(MItems.EssenceIngots, ConfigMain.ESSENCE_INGOTS, 0), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), Items.iron_ingot, Character.valueOf('Z'), accioEssence, Character.valueOf('Y'), Items.gold_nugget });
/*  79 */     GameRegistry.addRecipe(new ItemStack(MItems.EssenceIngots, ConfigMain.ESSENCE_INGOTS, 1), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), Items.iron_ingot, Character.valueOf('Z'), crucioEssence, Character.valueOf('Y'), Items.gold_nugget });
/*  80 */     GameRegistry.addRecipe(new ItemStack(MItems.EssenceIngots, ConfigMain.ESSENCE_INGOTS, 2), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), Items.iron_ingot, Character.valueOf('Z'), imperioEssence, Character.valueOf('Y'), Items.gold_nugget });
/*  81 */     GameRegistry.addRecipe(new ItemStack(MItems.EssenceIngots, ConfigMain.ESSENCE_INGOTS, 3), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), Items.iron_ingot, Character.valueOf('Z'), zivicioEssence, Character.valueOf('Y'), Items.gold_nugget });
/*     */ 
/*     */     
/*  84 */     GameRegistry.addRecipe(new ItemStack(Armour.AccioArmourHelmet, 1), new Object[] { "XXX", "XYX", Character.valueOf('X'), accioIngot, Character.valueOf('Y'), Items.diamond_helmet });
/*  85 */     GameRegistry.addRecipe(new ItemStack(Armour.AccioArmourChestplate, 1), new Object[] { "XYX", "XXX", "XXX", Character.valueOf('X'), accioIngot, Character.valueOf('Y'), Items.diamond_chestplate });
/*  86 */     GameRegistry.addRecipe(new ItemStack(Armour.AccioArmourLeggings, 1), new Object[] { "XXX", "XYX", "X X", Character.valueOf('X'), accioIngot, Character.valueOf('Y'), Items.diamond_leggings });
/*  87 */     GameRegistry.addRecipe(new ItemStack(Armour.AccioArmourBoots, 1), new Object[] { "X X", "XYX", Character.valueOf('X'), accioIngot, Character.valueOf('Y'), Items.diamond_boots });
/*     */ 
/*     */     
/*  90 */     GameRegistry.addRecipe(new ItemStack(Tools.AccioAxe, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), accioEssence, Character.valueOf('Y'), Items.diamond_axe });
/*  91 */     GameRegistry.addRecipe(new ItemStack(Tools.AccioHoe, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), accioEssence, Character.valueOf('Y'), Items.diamond_hoe });
/*  92 */     GameRegistry.addRecipe(new ItemStack(Tools.AccioPickaxe, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), accioEssence, Character.valueOf('Y'), Items.diamond_pickaxe });
/*  93 */     GameRegistry.addRecipe(new ItemStack(Tools.AccioShovel, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), accioEssence, Character.valueOf('Y'), Items.diamond_shovel });
/*  94 */     GameRegistry.addRecipe(new ItemStack(Tools.AccioSword, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), accioEssence, Character.valueOf('Y'), Items.diamond_sword });
/*     */ 
/*     */     
/*  97 */     GameRegistry.addRecipe(new ItemStack(Armour.CrucioArmourHelmet, 1), new Object[] { "XXX", "X X", Character.valueOf('X'), crucioIngot });
/*  98 */     GameRegistry.addRecipe(new ItemStack(Armour.CrucioArmourChestplate, 1), new Object[] { "X X", "XXX", "XXX", Character.valueOf('X'), crucioIngot });
/*  99 */     GameRegistry.addRecipe(new ItemStack(Armour.CrucioArmourLeggings, 1), new Object[] { "XXX", "X X", "X X", Character.valueOf('X'), crucioIngot });
/* 100 */     GameRegistry.addRecipe(new ItemStack(Armour.CrucioArmourBoots, 1), new Object[] { "X X", "X X", Character.valueOf('X'), crucioIngot });
/*     */ 
/*     */     
/* 103 */     GameRegistry.addRecipe(new ItemStack(Tools.CrucioAxe, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), crucioEssence, Character.valueOf('Y'), new ItemStack(Tools.AccioAxe, 1, meta) });
/* 104 */     GameRegistry.addRecipe(new ItemStack(Tools.CrucioHoe, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), crucioEssence, Character.valueOf('Y'), new ItemStack(Tools.AccioHoe, 1, meta) });
/* 105 */     GameRegistry.addRecipe(new ItemStack(Tools.CrucioPickaxe, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), crucioEssence, Character.valueOf('Y'), new ItemStack(Tools.AccioPickaxe, 1, meta) });
/* 106 */     GameRegistry.addRecipe(new ItemStack(Tools.CrucioShovel, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), crucioEssence, Character.valueOf('Y'), new ItemStack(Tools.AccioShovel, 1, meta) });
/* 107 */     GameRegistry.addRecipe(new ItemStack(Tools.CrucioSword, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), crucioEssence, Character.valueOf('Y'), new ItemStack(Tools.AccioSword, 1, meta) });
/*     */ 
/*     */     
/* 110 */     GameRegistry.addRecipe(new ItemStack(Armour.ImperioArmourHelmet, 1), new Object[] { "XXX", "X X", Character.valueOf('X'), imperioIngot });
/* 111 */     GameRegistry.addRecipe(new ItemStack(Armour.ImperioArmourChestplate, 1), new Object[] { "X X", "XXX", "XXX", Character.valueOf('X'), imperioIngot });
/* 112 */     GameRegistry.addRecipe(new ItemStack(Armour.ImperioArmourLeggings, 1), new Object[] { "XXX", "X X", "X X", Character.valueOf('X'), imperioIngot });
/* 113 */     GameRegistry.addRecipe(new ItemStack(Armour.ImperioArmourBoots, 1), new Object[] { "X X", "X X", Character.valueOf('X'), imperioIngot });
/*     */ 
/*     */     
/* 116 */     GameRegistry.addRecipe(new ItemStack(Tools.ImperioAxe, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), new ItemStack(Tools.CrucioAxe, 1, meta) });
/* 117 */     GameRegistry.addRecipe(new ItemStack(Tools.ImperioHoe, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), new ItemStack(Tools.CrucioHoe, 1, meta) });
/* 118 */     GameRegistry.addRecipe(new ItemStack(Tools.ImperioPickaxe, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), new ItemStack(Tools.CrucioPickaxe, 1, meta) });
/* 119 */     GameRegistry.addRecipe(new ItemStack(Tools.ImperioShovel, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), new ItemStack(Tools.CrucioShovel, 1, meta) });
/* 120 */     GameRegistry.addRecipe(new ItemStack(Tools.ImperioSword, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), new ItemStack(Tools.CrucioSword, 1, meta) });
/*     */ 
/*     */     
/* 123 */     GameRegistry.addRecipe(new ItemStack(Armour.ZivicioArmourHelmet, 1), new Object[] { "XXX", "X X", Character.valueOf('X'), zivicioIngot });
/* 124 */     GameRegistry.addRecipe(new ItemStack(Armour.ZivicioArmourChestplate, 1), new Object[] { "X X", "XXX", "XXX", Character.valueOf('X'), zivicioIngot });
/* 125 */     GameRegistry.addRecipe(new ItemStack(Armour.ZivicioArmourLeggings, 1), new Object[] { "XXX", "X X", "X X", Character.valueOf('X'), zivicioIngot });
/* 126 */     GameRegistry.addRecipe(new ItemStack(Armour.ZivicioArmourBoots, 1), new Object[] { "X X", "X X", Character.valueOf('X'), zivicioIngot });
/*     */ 
/*     */     
/* 129 */     GameRegistry.addRecipe(new ItemStack(Tools.ZivicioAxe, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), zivicioEssence, Character.valueOf('Y'), new ItemStack(Tools.ImperioAxe, 1, meta) });
/* 130 */     GameRegistry.addRecipe(new ItemStack(Tools.ZivicioHoe, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), zivicioEssence, Character.valueOf('Y'), new ItemStack(Tools.ImperioHoe, 1, meta) });
/* 131 */     GameRegistry.addRecipe(new ItemStack(Tools.ZivicioPickaxe, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), zivicioEssence, Character.valueOf('Y'), new ItemStack(Tools.ImperioPickaxe, 1, meta) });
/* 132 */     GameRegistry.addRecipe(new ItemStack(Tools.ZivicioShovel, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), zivicioEssence, Character.valueOf('Y'), new ItemStack(Tools.ImperioShovel, 1, meta) });
/* 133 */     GameRegistry.addRecipe(new ItemStack(Tools.ZivicioSword, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), zivicioEssence, Character.valueOf('Y'), new ItemStack(Tools.ImperioSword, 1, meta) });
/*     */ 
/*     */     
/* 136 */     GameRegistry.addRecipe(new ItemStack(minicioEssence, 9), new Object[] { "X", Character.valueOf('X'), new ItemStack(MBlocks.EssenceStorage, 1, 0) });
/* 137 */     GameRegistry.addRecipe(new ItemStack(accioEssence, 9), new Object[] { "X", Character.valueOf('X'), new ItemStack(MBlocks.EssenceStorage, 1, 1) });
/* 138 */     GameRegistry.addRecipe(new ItemStack(crucioEssence, 9), new Object[] { "X", Character.valueOf('X'), new ItemStack(MBlocks.EssenceStorage, 1, 2) });
/* 139 */     GameRegistry.addRecipe(new ItemStack(imperioEssence, 9), new Object[] { "X", Character.valueOf('X'), new ItemStack(MBlocks.EssenceStorage, 1, 3) });
/* 140 */     GameRegistry.addRecipe(new ItemStack(zivicioEssence, 9), new Object[] { "X", Character.valueOf('X'), new ItemStack(MBlocks.EssenceStorage, 1, 4) });
/* 141 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceStorage, 9, 4), new Object[] { "X", Character.valueOf('X'), new ItemStack(MBlocks.EssenceStorage, 1, 5) });
/*     */ 
/*     */     
/* 144 */     GameRegistry.addRecipe(new ItemStack(MItems.UltimateDiamondApple, 1), new Object[] { "XZX", "ZYZ", "XZX", Character.valueOf('Y'), Items.apple, Character.valueOf('X'), Blocks.diamond_block, Character.valueOf('Z'), Items.diamond });
/* 145 */     GameRegistry.addRecipe(new ItemStack(MItems.EmeraldApple, 1), new Object[] { "ZZZ", "ZYZ", "ZZZ", Character.valueOf('Y'), Items.apple, Character.valueOf('Z'), Items.emerald });
/* 146 */     GameRegistry.addRecipe(new ItemStack(MItems.UltimateEmeraldApple, 1), new Object[] { "XZX", "ZYZ", "XZX", Character.valueOf('Y'), Items.apple, Character.valueOf('X'), Blocks.emerald_block, Character.valueOf('Z'), Items.emerald });
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\recipes\ItemRecipes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
