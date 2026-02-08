/*     */ package com.mark719.magicalcrops.recipes;
/*     */ 
/*     */ import com.mark719.magicalcrops.config.ConfigCrafting;
/*     */ import com.mark719.magicalcrops.handlers.Essence;
/*     */ import com.mark719.magicalcrops.handlers.MBlocks;
/*     */ import cpw.mods.fml.common.registry.GameRegistry;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ResourceRecipes
/*     */ {
/*  18 */   static Item minicioEssence = Essence.MinicioEssence;
/*  19 */   static Item accioEssence = Essence.AccioEssence;
/*  20 */   static Item crucioEssence = Essence.CrucioEssence;
/*  21 */   static Item imperioEssence = Essence.ImperioEssence;
/*  22 */   static Item zivicioEssence = Essence.ZivicioEssence;
/*     */   
/*  24 */   static ItemStack airEssence = new ItemStack(Essence.AirEssence, 1, 0);
/*  25 */   static ItemStack coalEssence = new ItemStack(Essence.CoalEssence, 1, 0);
/*  26 */   static ItemStack diamondEssence = new ItemStack(Essence.DiamondEssence, 1, 0);
/*  27 */   static ItemStack dyeEssence = new ItemStack(Essence.DyeEssence, 1, 0);
/*  28 */   static ItemStack earthEssence = new ItemStack(Essence.EarthEssence, 1, 0);
/*  29 */   static ItemStack emeraldEssence = new ItemStack(Essence.EmeraldEssence, 1, 0);
/*  30 */   static ItemStack xpEssence = new ItemStack(Essence.ExperienceEssence, 1, 0);
/*  31 */   static ItemStack fireEssence = new ItemStack(Essence.FireEssence, 1, 0);
/*  32 */   static ItemStack glowstoneEssence = new ItemStack(Essence.GlowstoneEssence, 1, 0);
/*  33 */   static ItemStack goldEssence = new ItemStack(Essence.GoldEssence, 1, 0);
/*  34 */   static ItemStack ironEssence = new ItemStack(Essence.IronEssence, 1, 0);
/*  35 */   static ItemStack lapisEssence = new ItemStack(Essence.LapisEssence, 1, 0);
/*  36 */   static ItemStack natureEssence = new ItemStack(Essence.NatureEssence, 1, 0);
/*  37 */   static ItemStack netherEssence = new ItemStack(Essence.NetherEssence, 1, 0);
/*  38 */   static ItemStack obsidianEssence = new ItemStack(Essence.ObsidianEssence, 1, 0);
/*  39 */   static ItemStack quartzEssence = new ItemStack(Essence.QuartzEssence, 1, 0);
/*  40 */   static ItemStack redstoneEssence = new ItemStack(Essence.RedstoneEssence, 1, 0);
/*  41 */   static ItemStack taintedEssence = new ItemStack(Essence.TaintedEssence, 1, 0);
/*  42 */   static ItemStack waterEssence = new ItemStack(Essence.WaterEssence, 1, 0);
/*     */   
/*  44 */   static ItemStack blazeEssence = new ItemStack(Essence.BlazeEssence, 1, 0);
/*  45 */   static ItemStack creeperEssence = new ItemStack(Essence.CreeperEssence, 1, 0);
/*  46 */   static ItemStack endermanEssence = new ItemStack(Essence.EndermanEssence, 1, 0);
/*  47 */   static ItemStack ghastEssence = new ItemStack(Essence.GhastEssence, 1, 0);
/*  48 */   static ItemStack skeletonEssence = new ItemStack(Essence.SkeletonEssence, 1, 0);
/*  49 */   static ItemStack slimeEssence = new ItemStack(Essence.SlimeEssence, 1, 0);
/*  50 */   static ItemStack spiderEssence = new ItemStack(Essence.SpiderEssence, 1, 0);
/*  51 */   static ItemStack witherEssence = new ItemStack(Essence.WitherEssence, 1, 0);
/*     */   
/*  53 */   static ItemStack chickenEssence = new ItemStack(Essence.ChickenEssence, 1, 0);
/*  54 */   static ItemStack cowEssence = new ItemStack(Essence.CowEssence, 1, 0);
/*  55 */   static ItemStack pigEssence = new ItemStack(Essence.PigEssence, 1, 0);
/*  56 */   static ItemStack sheepEssence = new ItemStack(Essence.SheepEssence, 1, 0);
/*     */ 
/*     */ 
/*     */   
/*     */   public static void loadRecipes() {
/*  61 */     GameRegistry.addRecipe(new ItemStack(Items.coal, ConfigCrafting.outPutCoal), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), coalEssence });
/*     */     
/*  63 */     GameRegistry.addRecipe(new ItemStack(Items.dye, ConfigCrafting.outPutDye, 0), new Object[] { "XXX", "   ", "   ", Character.valueOf('X'), dyeEssence });
/*  64 */     GameRegistry.addRecipe(new ItemStack(Items.dye, ConfigCrafting.outPutDye, 1), new Object[] { "   ", "XXX", "   ", Character.valueOf('X'), dyeEssence });
/*  65 */     GameRegistry.addRecipe(new ItemStack(Items.dye, ConfigCrafting.outPutDye, 2), new Object[] { "   ", "   ", "XXX", Character.valueOf('X'), dyeEssence });
/*  66 */     GameRegistry.addRecipe(new ItemStack(Items.dye, ConfigCrafting.outPutDye, 5), new Object[] { " X ", " X ", " X ", Character.valueOf('X'), dyeEssence });
/*  67 */     GameRegistry.addRecipe(new ItemStack(Items.dye, ConfigCrafting.outPutDye, 6), new Object[] { "X  ", "X  ", "X  ", Character.valueOf('X'), dyeEssence });
/*  68 */     GameRegistry.addRecipe(new ItemStack(Items.dye, ConfigCrafting.outPutDye, 7), new Object[] { "X  ", " X ", "  X", Character.valueOf('X'), dyeEssence });
/*  69 */     GameRegistry.addRecipe(new ItemStack(Items.dye, ConfigCrafting.outPutDye, 8), new Object[] { " X ", " X ", "X  ", Character.valueOf('X'), dyeEssence });
/*  70 */     GameRegistry.addRecipe(new ItemStack(Items.dye, ConfigCrafting.outPutDye, 9), new Object[] { "XX ", "X  ", "   ", Character.valueOf('X'), dyeEssence });
/*  71 */     GameRegistry.addRecipe(new ItemStack(Items.dye, ConfigCrafting.outPutDye, 10), new Object[] { " XX", "X  ", "   ", Character.valueOf('X'), dyeEssence });
/*  72 */     GameRegistry.addRecipe(new ItemStack(Items.dye, ConfigCrafting.outPutDye, 11), new Object[] { "   ", " X ", "X X", Character.valueOf('X'), dyeEssence });
/*  73 */     GameRegistry.addRecipe(new ItemStack(Items.dye, ConfigCrafting.outPutDye, 12), new Object[] { "XX ", " X ", "   ", Character.valueOf('X'), dyeEssence });
/*  74 */     GameRegistry.addRecipe(new ItemStack(Items.dye, ConfigCrafting.outPutDye, 13), new Object[] { " X ", "X  ", " X ", Character.valueOf('X'), dyeEssence });
/*  75 */     GameRegistry.addRecipe(new ItemStack(Items.dye, ConfigCrafting.outPutDye, 14), new Object[] { "  X", " X ", " X ", Character.valueOf('X'), dyeEssence });
/*     */     
/*  77 */     GameRegistry.addRecipe(new ItemStack(Blocks.mossy_cobblestone, ConfigCrafting.outPutMossyCobble), new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), Blocks.cobblestone, Character.valueOf('Y'), natureEssence });
/*  78 */     GameRegistry.addRecipe(new ItemStack(Blocks.stonebrick, ConfigCrafting.outPutMossyBrick, 1), new Object[] { "XXX", "XYX", "XXX", Character.valueOf('Y'), natureEssence, Character.valueOf('X'), Blocks.stonebrick });
/*  79 */     GameRegistry.addRecipe(new ItemStack(Blocks.vine, ConfigCrafting.outPutVines), new Object[] { "X X", "XXX", "X X", Character.valueOf('X'), natureEssence });
/*  80 */     GameRegistry.addRecipe(new ItemStack(Blocks.waterlily, ConfigCrafting.outPutLily), new Object[] { " X ", "XXX", "X X", Character.valueOf('X'), natureEssence });
/*  81 */     GameRegistry.addRecipe(new ItemStack((Block)Blocks.mycelium, ConfigCrafting.outPutMycelium), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), natureEssence, Character.valueOf('Y'), Blocks.dirt, Character.valueOf('Z'), Blocks.brown_mushroom });
/*  82 */     GameRegistry.addRecipe(new ItemStack((Block)Blocks.mycelium, ConfigCrafting.outPutMycelium), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), natureEssence, Character.valueOf('Y'), Blocks.dirt, Character.valueOf('Z'), Blocks.red_mushroom });
/*  83 */     GameRegistry.addRecipe(new ItemStack(Blocks.cactus, ConfigCrafting.outPutCactus), new Object[] { "XX ", "XX ", "XX ", Character.valueOf('X'), natureEssence });
/*     */     
/*  85 */     GameRegistry.addRecipe(new ItemStack(Blocks.log, ConfigCrafting.outPutWood, 0), new Object[] { "YX ", "XX ", Character.valueOf('X'), natureEssence, Character.valueOf('Y'), waterEssence });
/*  86 */     GameRegistry.addRecipe(new ItemStack(Blocks.log, ConfigCrafting.outPutWood, 1), new Object[] { "XY ", "XX ", Character.valueOf('X'), natureEssence, Character.valueOf('Y'), waterEssence });
/*  87 */     GameRegistry.addRecipe(new ItemStack(Blocks.log, ConfigCrafting.outPutWood, 2), new Object[] { "XX ", "YX ", Character.valueOf('X'), natureEssence, Character.valueOf('Y'), waterEssence });
/*  88 */     GameRegistry.addRecipe(new ItemStack(Blocks.log, ConfigCrafting.outPutWood, 3), new Object[] { "XX ", "XY ", Character.valueOf('X'), natureEssence, Character.valueOf('Y'), waterEssence });
/*     */     
/*  90 */     GameRegistry.addRecipe(new ItemStack(Items.snowball, ConfigCrafting.outPutSnowBalls), new Object[] { "XY ", "YX ", Character.valueOf('X'), waterEssence, Character.valueOf('Y'), airEssence });
/*  91 */     GameRegistry.addRecipe(new ItemStack(Items.lava_bucket, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), fireEssence, Character.valueOf('Y'), new ItemStack(Items.bucket, 1) });
/*  92 */     GameRegistry.addRecipe(new ItemStack(Items.water_bucket, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), waterEssence, Character.valueOf('Y'), new ItemStack(Items.bucket, 1) });
/*  93 */     GameRegistry.addRecipe(new ItemStack(Items.clay_ball, ConfigCrafting.outPutClayBall), new Object[] { "XY ", "YX ", Character.valueOf('X'), waterEssence, Character.valueOf('Y'), earthEssence });
/*  94 */     GameRegistry.addRecipe(new ItemStack(Blocks.cobblestone, ConfigCrafting.outPutCobblestone), new Object[] { "XY ", "YX ", Character.valueOf('X'), fireEssence, Character.valueOf('Y'), earthEssence });
/*  95 */     GameRegistry.addRecipe(new ItemStack(Blocks.dirt, ConfigCrafting.outPutDirt), new Object[] { "XXX", "X X", "XXX", Character.valueOf('X'), earthEssence });
/*  96 */     GameRegistry.addRecipe(new ItemStack((Block)Blocks.sand, ConfigCrafting.outPutSand), new Object[] { "YX ", "XY ", Character.valueOf('X'), fireEssence, Character.valueOf('Y'), earthEssence });
/*  97 */     GameRegistry.addRecipe(new ItemStack(Blocks.gravel, ConfigCrafting.outPutGravel), new Object[] { "YY ", "XX ", Character.valueOf('X'), fireEssence, Character.valueOf('Y'), earthEssence });
/*     */     
/*  99 */     GameRegistry.addRecipe(new ItemStack(Items.redstone, ConfigCrafting.outPutRedstone), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), redstoneEssence });
/* 100 */     GameRegistry.addRecipe(new ItemStack(Items.glowstone_dust, ConfigCrafting.outPutGlowstone), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), glowstoneEssence });
/* 101 */     GameRegistry.addRecipe(new ItemStack(Blocks.obsidian, ConfigCrafting.outPutObsidian), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), obsidianEssence });
/*     */     
/* 103 */     GameRegistry.addRecipe(new ItemStack(Blocks.soul_sand, ConfigCrafting.outPutSoul), new Object[] { "XXX", "X X", "XXX", Character.valueOf('X'), netherEssence });
/* 104 */     GameRegistry.addRecipe(new ItemStack(Blocks.netherrack, ConfigCrafting.outPutNether), new Object[] { "XX", "XX", Character.valueOf('X'), netherEssence });
/* 105 */     GameRegistry.addRecipe(new ItemStack(Blocks.nether_brick, ConfigCrafting.outPutNetherbrick), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), netherEssence });
/*     */     
/* 107 */     GameRegistry.addRecipe(new ItemStack(Blocks.iron_ore, ConfigCrafting.outPutIron), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), ironEssence });
/* 108 */     GameRegistry.addRecipe(new ItemStack(Blocks.gold_ore, ConfigCrafting.outPutGold), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), goldEssence });
/* 109 */     GameRegistry.addRecipe(new ItemStack(Items.dye, ConfigCrafting.outPutLapis, 4), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), lapisEssence });
/* 110 */     GameRegistry.addRecipe(new ItemStack(Items.quartz, ConfigCrafting.outPutQuartz), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), quartzEssence });
/* 111 */     GameRegistry.addRecipe(new ItemStack(Items.experience_bottle, ConfigCrafting.outPutXP), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), xpEssence });
/*     */     
/* 113 */     GameRegistry.addRecipe(new ItemStack(Items.emerald, ConfigCrafting.outPutEmerald), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), emeraldEssence });
/* 114 */     GameRegistry.addRecipe(new ItemStack(Items.diamond, ConfigCrafting.outPutDiamond), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), diamondEssence });
/*     */ 
/*     */     
/* 117 */     GameRegistry.addRecipe(new ItemStack(Items.leather, ConfigCrafting.outPutCowLeather), new Object[] { "XXX", "X X", "XXX", Character.valueOf('X'), cowEssence });
/* 118 */     GameRegistry.addRecipe(new ItemStack(Items.beef, ConfigCrafting.outPutCowBeef), new Object[] { "XX", "XX", Character.valueOf('X'), cowEssence });
/* 119 */     GameRegistry.addRecipe(new ItemStack(Items.milk_bucket, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), cowEssence, Character.valueOf('Y'), Items.bucket });
/*     */ 
/*     */     
/* 122 */     GameRegistry.addRecipe(new ItemStack(Items.porkchop, ConfigCrafting.outPutPigPork), new Object[] { "XX", "XX", Character.valueOf('X'), pigEssence });
/*     */ 
/*     */     
/* 125 */     GameRegistry.addRecipe(new ItemStack(Items.chicken, ConfigCrafting.outPutChicken), new Object[] { "XX", "XX", Character.valueOf('X'), chickenEssence });
/* 126 */     GameRegistry.addRecipe(new ItemStack(Items.feather, ConfigCrafting.outPutFeather), new Object[] { "XXX", "X X", "XXX", Character.valueOf('X'), chickenEssence });
/* 127 */     GameRegistry.addRecipe(new ItemStack(Items.egg, ConfigCrafting.outPutEggs), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), chickenEssence });
/*     */ 
/*     */     
/* 130 */     GameRegistry.addRecipe(new ItemStack(Blocks.wool, ConfigCrafting.outPutSheepWool), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), sheepEssence });
/*     */ 
/*     */     
/* 133 */     GameRegistry.addRecipe(new ItemStack(Items.skull, ConfigCrafting.outPutCreeperHead, 4), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), creeperEssence });
/* 134 */     GameRegistry.addRecipe(new ItemStack(Items.gunpowder, ConfigCrafting.outPutCreeperGun), new Object[] { "XXX", "X X", "XXX", Character.valueOf('X'), creeperEssence });
/*     */ 
/*     */     
/* 137 */     GameRegistry.addRecipe(new ItemStack(Items.blaze_rod, ConfigCrafting.outPutBlazerod), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), blazeEssence });
/*     */ 
/*     */     
/* 140 */     GameRegistry.addRecipe(new ItemStack(Items.ender_pearl, ConfigCrafting.outPutEnderPearl), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), endermanEssence });
/* 141 */     GameRegistry.addRecipe(new ItemStack(Blocks.end_stone, 8), new Object[] { "XXX", "XYX", "XXX", Character.valueOf('Y'), endermanEssence, Character.valueOf('X'), Blocks.stone });
/*     */ 
/*     */     
/* 144 */     GameRegistry.addRecipe(new ItemStack(Items.skull, ConfigCrafting.outPutSkeleSkull, 0), new Object[] { "XXX", "X X", "XXX", Character.valueOf('X'), skeletonEssence });
/* 145 */     GameRegistry.addRecipe(new ItemStack(Items.bone, ConfigCrafting.outPutBones), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), skeletonEssence });
/*     */ 
/*     */     
/* 148 */     GameRegistry.addRecipe(new ItemStack(Items.skull, ConfigCrafting.outPutWitherSkull, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), witherEssence });
/*     */ 
/*     */     
/* 151 */     GameRegistry.addRecipe(new ItemStack(Items.slime_ball, ConfigCrafting.outPutSlimeBall), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), slimeEssence });
/*     */ 
/*     */     
/* 154 */     GameRegistry.addRecipe(new ItemStack(Items.string, ConfigCrafting.outPutSpiderString), new Object[] { "XXX", "X X", "XXX", Character.valueOf('X'), spiderEssence });
/* 155 */     GameRegistry.addRecipe(new ItemStack(Items.spider_eye, ConfigCrafting.outPutSpiderEye), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), spiderEssence });
/*     */ 
/*     */     
/* 158 */     GameRegistry.addRecipe(new ItemStack(Items.ghast_tear, ConfigCrafting.outPutGhastTear), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), ghastEssence });
/*     */ 
/*     */     
/* 161 */     GameRegistry.addRecipe(new ItemStack(Items.record_13, 1), new Object[] { "XYX", "YZY", "XYX", Character.valueOf('X'), skeletonEssence, Character.valueOf('Y'), creeperEssence, Character.valueOf('Z'), new ItemStack(Items.dye, 1, 11) });
/* 162 */     GameRegistry.addRecipe(new ItemStack(Items.record_cat, 1), new Object[] { "XYX", "YZY", "XYX", Character.valueOf('X'), skeletonEssence, Character.valueOf('Y'), creeperEssence, Character.valueOf('Z'), new ItemStack(Items.dye, 1, 2) });
/* 163 */     GameRegistry.addRecipe(new ItemStack(Items.record_blocks, 1), new Object[] { "XYX", "YZY", "XYX", Character.valueOf('X'), skeletonEssence, Character.valueOf('Y'), creeperEssence, Character.valueOf('Z'), new ItemStack(Items.dye, 1, 14) });
/* 164 */     GameRegistry.addRecipe(new ItemStack(Items.record_chirp, 1), new Object[] { "XYX", "YZY", "XYX", Character.valueOf('X'), skeletonEssence, Character.valueOf('Y'), creeperEssence, Character.valueOf('Z'), new ItemStack(Items.dye, 1, 1) });
/* 165 */     GameRegistry.addRecipe(new ItemStack(Items.record_strad, 1), new Object[] { "XYX", "YZY", "XYX", Character.valueOf('X'), skeletonEssence, Character.valueOf('Y'), creeperEssence, Character.valueOf('Z'), new ItemStack(Items.dye, 1, 15) });
/* 166 */     GameRegistry.addRecipe(new ItemStack(Items.record_ward, 1), new Object[] { "XYX", "YZY", "XYX", Character.valueOf('X'), skeletonEssence, Character.valueOf('Y'), creeperEssence, Character.valueOf('Z'), new ItemStack(Items.dye, 1, 6) });
/* 167 */     GameRegistry.addRecipe(new ItemStack(Items.record_far, 1), new Object[] { "XYX", "YZY", "XYX", Character.valueOf('X'), skeletonEssence, Character.valueOf('Y'), creeperEssence, Character.valueOf('Z'), new ItemStack(Items.dye, 1, 10) });
/* 168 */     GameRegistry.addRecipe(new ItemStack(Items.record_mall, 1), new Object[] { "XYX", "YZY", "XYX", Character.valueOf('X'), skeletonEssence, Character.valueOf('Y'), creeperEssence, Character.valueOf('Z'), new ItemStack(Items.dye, 1, 5) });
/* 169 */     GameRegistry.addRecipe(new ItemStack(Items.record_mellohi, 1), new Object[] { "XYX", "YZY", "XYX", Character.valueOf('X'), skeletonEssence, Character.valueOf('Y'), creeperEssence, Character.valueOf('Z'), new ItemStack(Items.dye, 1, 9) });
/* 170 */     GameRegistry.addRecipe(new ItemStack(Items.record_stal, 1), new Object[] { "XYX", "YZY", "XYX", Character.valueOf('X'), skeletonEssence, Character.valueOf('Y'), creeperEssence, Character.valueOf('Z'), new ItemStack(Items.dye, 1, 0) });
/* 171 */     GameRegistry.addRecipe(new ItemStack(Items.record_11, 1), new Object[] { "XYX", "YZY", "XYX", Character.valueOf('X'), skeletonEssence, Character.valueOf('Y'), creeperEssence, Character.valueOf('Z'), new ItemStack(Items.dye, 1, 8) });
/* 172 */     GameRegistry.addRecipe(new ItemStack(Items.record_wait, 1), new Object[] { "XYX", "YZY", "XYX", Character.valueOf('X'), skeletonEssence, Character.valueOf('Y'), creeperEssence, Character.valueOf('Z'), new ItemStack(Items.dye, 1, 4) });
/*     */ 
/*     */     
/* 175 */     GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner, 1, 61), new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), blazeEssence, Character.valueOf('Y'), MBlocks.WitherProof });
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\recipes\ResourceRecipes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */