/*     */ package com.mark719.magicalcrops.recipes;
/*     */ 
/*     */ import com.mark719.magicalcrops.handlers.Essence;
/*     */ import com.mark719.magicalcrops.handlers.MItems;
/*     */ import cpw.mods.fml.common.registry.GameRegistry;
/*     */ import net.minecraft.enchantment.Enchantment;
/*     */ import net.minecraft.enchantment.EnchantmentData;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class EnchantmentRecipes
/*     */ {
/*  17 */   static Item minicioEssence = Essence.MinicioEssence;
/*  18 */   static Item accioEssence = Essence.AccioEssence;
/*  19 */   static Item crucioEssence = Essence.CrucioEssence;
/*  20 */   static Item imperioEssence = Essence.ImperioEssence;
/*  21 */   static Item zivicioEssence = Essence.ZivicioEssence;
/*     */   
/*  23 */   static ItemStack airEssence = new ItemStack(Essence.AirEssence, 1, 0);
/*  24 */   static ItemStack coalEssence = new ItemStack(Essence.CoalEssence, 1, 0);
/*  25 */   static ItemStack diamondEssence = new ItemStack(Essence.DiamondEssence, 1, 0);
/*  26 */   static ItemStack dyeEssence = new ItemStack(Essence.DyeEssence, 1, 0);
/*  27 */   static ItemStack earthEssence = new ItemStack(Essence.EarthEssence, 1, 0);
/*  28 */   static ItemStack emeraldEssence = new ItemStack(Essence.EmeraldEssence, 1, 0);
/*  29 */   static ItemStack xpEssence = new ItemStack(Essence.ExperienceEssence, 1, 0);
/*  30 */   static ItemStack fireEssence = new ItemStack(Essence.FireEssence, 1, 0);
/*  31 */   static ItemStack glowstoneEssence = new ItemStack(Essence.GlowstoneEssence, 1, 0);
/*  32 */   static ItemStack goldEssence = new ItemStack(Essence.GoldEssence, 1, 0);
/*  33 */   static ItemStack ironEssence = new ItemStack(Essence.IronEssence, 1, 0);
/*  34 */   static ItemStack lapisEssence = new ItemStack(Essence.LapisEssence, 1, 0);
/*  35 */   static ItemStack natureEssence = new ItemStack(Essence.NatureEssence, 1, 0);
/*  36 */   static ItemStack netherEssence = new ItemStack(Essence.NetherEssence, 1, 0);
/*  37 */   static ItemStack obsidianEssence = new ItemStack(Essence.ObsidianEssence, 1, 0);
/*  38 */   static ItemStack quartzEssence = new ItemStack(Essence.QuartzEssence, 1, 0);
/*  39 */   static ItemStack redstoneEssence = new ItemStack(Essence.RedstoneEssence, 1, 0);
/*  40 */   static ItemStack taintedEssence = new ItemStack(Essence.TaintedEssence, 1, 0);
/*  41 */   static ItemStack waterEssence = new ItemStack(Essence.WaterEssence, 1, 0);
/*     */   
/*  43 */   static ItemStack blazeEssence = new ItemStack(Essence.BlazeEssence, 1, 0);
/*  44 */   static ItemStack creeperEssence = new ItemStack(Essence.CreeperEssence, 1, 0);
/*  45 */   static ItemStack EndermanEssence = new ItemStack(Essence.EndermanEssence, 1, 0);
/*  46 */   static ItemStack ghastEssence = new ItemStack(Essence.GhastEssence, 1, 0);
/*  47 */   static ItemStack skeletonEssence = new ItemStack(Essence.SkeletonEssence, 1, 0);
/*  48 */   static ItemStack slimeEssence = new ItemStack(Essence.SlimeEssence, 1, 0);
/*  49 */   static ItemStack spiderEssence = new ItemStack(Essence.SpiderEssence, 1, 0);
/*  50 */   static ItemStack witherEssence = new ItemStack(Essence.WitherEssence, 1, 0);
/*  51 */   static ItemStack cowEssence = new ItemStack(Essence.CowEssence, 1, 0);
/*  52 */   static ItemStack pigEssence = new ItemStack(Essence.PigEssence, 1, 0);
/*  53 */   static ItemStack chickenEssence = new ItemStack(Essence.ChickenEssence, 1, 0);
/*  54 */   static ItemStack sheepEssence = new ItemStack(Essence.SheepEssence, 1, 0);
/*     */   
/*  56 */   static ItemStack xpBook1 = new ItemStack(MItems.ExperienceBook, 1, 0);
/*  57 */   static ItemStack xpBook2 = new ItemStack(MItems.ExperienceBook, 1, 1);
/*  58 */   static ItemStack xpBook3 = new ItemStack(MItems.ExperienceBook, 1, 2);
/*  59 */   static ItemStack xpBook4 = new ItemStack(MItems.ExperienceBook, 1, 3);
/*  60 */   static ItemStack xpBook5 = new ItemStack(MItems.ExperienceBook, 1, 4);
/*     */ 
/*     */ 
/*     */   
/*     */   public static void loadRecipes() {
/*  65 */     GameRegistry.addRecipe(xpBook1, new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), xpEssence, Character.valueOf('Z'), Items.field_151122_aG });
/*  66 */     GameRegistry.addRecipe(xpBook2, new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), xpEssence, Character.valueOf('Z'), xpBook1 });
/*  67 */     GameRegistry.addRecipe(xpBook3, new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), xpEssence, Character.valueOf('Z'), xpBook2 });
/*  68 */     GameRegistry.addRecipe(xpBook4, new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), xpEssence, Character.valueOf('Z'), xpBook3 });
/*  69 */     GameRegistry.addRecipe(xpBook5, new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), xpEssence, Character.valueOf('Z'), xpBook4 });
/*     */ 
/*     */     
/*  72 */     EnchantmentData flame1 = new EnchantmentData(Enchantment.field_77343_v, 1);
/*  73 */     ItemStack flameBook1 = new ItemStack((Item)Items.field_151134_bR, 1);
/*  74 */     Items.field_151134_bR.func_92115_a(flameBook1, flame1);
/*  75 */     GameRegistry.addRecipe(flameBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), fireEssence, Character.valueOf('Y'), xpBook1 });
/*     */ 
/*     */     
/*  78 */     EnchantmentData efficiency1 = new EnchantmentData(Enchantment.field_77349_p, 1);
/*  79 */     ItemStack efficiencyBook1 = new ItemStack((Item)Items.field_151134_bR, 1);
/*  80 */     Items.field_151134_bR.func_92115_a(efficiencyBook1, efficiency1);
/*  81 */     GameRegistry.addRecipe(efficiencyBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), redstoneEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/*  83 */     EnchantmentData efficiency2 = new EnchantmentData(Enchantment.field_77349_p, 2);
/*  84 */     ItemStack efficiencyBook2 = new ItemStack((Item)Items.field_151134_bR, 1);
/*  85 */     Items.field_151134_bR.func_92115_a(efficiencyBook2, efficiency2);
/*  86 */     GameRegistry.addRecipe(efficiencyBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), redstoneEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/*  88 */     EnchantmentData efficiency3 = new EnchantmentData(Enchantment.field_77349_p, 3);
/*  89 */     ItemStack efficiencyBook3 = new ItemStack((Item)Items.field_151134_bR, 1);
/*  90 */     Items.field_151134_bR.func_92115_a(efficiencyBook3, efficiency3);
/*  91 */     GameRegistry.addRecipe(efficiencyBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), redstoneEssence, Character.valueOf('Y'), xpBook3 });
/*     */     
/*  93 */     EnchantmentData efficiency4 = new EnchantmentData(Enchantment.field_77349_p, 4);
/*  94 */     ItemStack efficiencyBook4 = new ItemStack((Item)Items.field_151134_bR, 1);
/*  95 */     Items.field_151134_bR.func_92115_a(efficiencyBook4, efficiency4);
/*  96 */     GameRegistry.addRecipe(efficiencyBook4, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), redstoneEssence, Character.valueOf('Y'), xpBook4 });
/*     */     
/*  98 */     EnchantmentData efficiency5 = new EnchantmentData(Enchantment.field_77349_p, 5);
/*  99 */     ItemStack efficiencyBook5 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 100 */     Items.field_151134_bR.func_92115_a(efficiencyBook5, efficiency5);
/* 101 */     GameRegistry.addRecipe(efficiencyBook5, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), redstoneEssence, Character.valueOf('Y'), xpBook5 });
/*     */ 
/*     */     
/* 104 */     EnchantmentData silk1 = new EnchantmentData(Enchantment.field_77348_q, 1);
/* 105 */     ItemStack silkBook1 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 106 */     Items.field_151134_bR.func_92115_a(silkBook1, silk1);
/* 107 */     GameRegistry.addRecipe(silkBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), emeraldEssence, Character.valueOf('Y'), xpBook1 });
/*     */ 
/*     */     
/* 110 */     EnchantmentData unbreaking1 = new EnchantmentData(Enchantment.field_77347_r, 1);
/* 111 */     ItemStack unbreakingBook1 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 112 */     Items.field_151134_bR.func_92115_a(unbreakingBook1, unbreaking1);
/* 113 */     GameRegistry.addRecipe(unbreakingBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), obsidianEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 115 */     EnchantmentData unbreaking2 = new EnchantmentData(Enchantment.field_77347_r, 2);
/* 116 */     ItemStack unbreakingBook2 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 117 */     Items.field_151134_bR.func_92115_a(unbreakingBook2, unbreaking2);
/* 118 */     GameRegistry.addRecipe(unbreakingBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), obsidianEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/* 120 */     EnchantmentData unbreaking3 = new EnchantmentData(Enchantment.field_77347_r, 3);
/* 121 */     ItemStack unbreakingBook3 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 122 */     Items.field_151134_bR.func_92115_a(unbreakingBook3, unbreaking3);
/* 123 */     GameRegistry.addRecipe(unbreakingBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), obsidianEssence, Character.valueOf('Y'), xpBook3 });
/*     */ 
/*     */     
/* 126 */     EnchantmentData fortune1 = new EnchantmentData(Enchantment.field_77346_s, 1);
/* 127 */     ItemStack fortuneBook1 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 128 */     Items.field_151134_bR.func_92115_a(fortuneBook1, fortune1);
/* 129 */     GameRegistry.addRecipe(fortuneBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), lapisEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 131 */     EnchantmentData fortune2 = new EnchantmentData(Enchantment.field_77346_s, 2);
/* 132 */     ItemStack fortuneBook2 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 133 */     Items.field_151134_bR.func_92115_a(fortuneBook2, fortune2);
/* 134 */     GameRegistry.addRecipe(fortuneBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), lapisEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/* 136 */     EnchantmentData fortune3 = new EnchantmentData(Enchantment.field_77346_s, 3);
/* 137 */     ItemStack fortuneBook3 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 138 */     Items.field_151134_bR.func_92115_a(fortuneBook3, fortune3);
/* 139 */     GameRegistry.addRecipe(fortuneBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), lapisEssence, Character.valueOf('Y'), xpBook3 });
/*     */ 
/*     */     
/* 142 */     EnchantmentData protection1 = new EnchantmentData(Enchantment.field_77332_c, 1);
/* 143 */     ItemStack protectionBook1 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 144 */     Items.field_151134_bR.func_92115_a(protectionBook1, protection1);
/* 145 */     GameRegistry.addRecipe(protectionBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), diamondEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 147 */     EnchantmentData protection2 = new EnchantmentData(Enchantment.field_77332_c, 2);
/* 148 */     ItemStack protectionBook2 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 149 */     Items.field_151134_bR.func_92115_a(protectionBook2, protection2);
/* 150 */     GameRegistry.addRecipe(protectionBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), diamondEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/* 152 */     EnchantmentData protection3 = new EnchantmentData(Enchantment.field_77332_c, 3);
/* 153 */     ItemStack protectionBook3 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 154 */     Items.field_151134_bR.func_92115_a(protectionBook3, protection3);
/* 155 */     GameRegistry.addRecipe(protectionBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), diamondEssence, Character.valueOf('Y'), xpBook3 });
/*     */     
/* 157 */     EnchantmentData protection4 = new EnchantmentData(Enchantment.field_77332_c, 4);
/* 158 */     ItemStack protectionBook4 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 159 */     Items.field_151134_bR.func_92115_a(protectionBook4, protection4);
/* 160 */     GameRegistry.addRecipe(protectionBook4, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), diamondEssence, Character.valueOf('Y'), xpBook4 });
/*     */ 
/*     */     
/* 163 */     EnchantmentData fireprotection1 = new EnchantmentData(Enchantment.field_77329_d, 1);
/* 164 */     ItemStack fireprotectionBook1 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 165 */     Items.field_151134_bR.func_92115_a(fireprotectionBook1, fireprotection1);
/* 166 */     GameRegistry.addRecipe(fireprotectionBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), blazeEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 168 */     EnchantmentData fireprotection2 = new EnchantmentData(Enchantment.field_77329_d, 2);
/* 169 */     ItemStack fireprotectionBook2 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 170 */     Items.field_151134_bR.func_92115_a(fireprotectionBook2, fireprotection2);
/* 171 */     GameRegistry.addRecipe(fireprotectionBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), blazeEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/* 173 */     EnchantmentData fireprotection3 = new EnchantmentData(Enchantment.field_77329_d, 3);
/* 174 */     ItemStack fireprotectionBook3 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 175 */     Items.field_151134_bR.func_92115_a(fireprotectionBook3, fireprotection3);
/* 176 */     GameRegistry.addRecipe(fireprotectionBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), blazeEssence, Character.valueOf('Y'), xpBook3 });
/*     */     
/* 178 */     EnchantmentData fireprotection4 = new EnchantmentData(Enchantment.field_77329_d, 4);
/* 179 */     ItemStack fireprotectionBook4 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 180 */     Items.field_151134_bR.func_92115_a(fireprotectionBook4, fireprotection4);
/* 181 */     GameRegistry.addRecipe(fireprotectionBook4, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), blazeEssence, Character.valueOf('Y'), xpBook4 });
/*     */ 
/*     */     
/* 184 */     EnchantmentData feather1 = new EnchantmentData(Enchantment.field_77330_e, 1);
/* 185 */     ItemStack featherBook1 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 186 */     Items.field_151134_bR.func_92115_a(featherBook1, feather1);
/* 187 */     GameRegistry.addRecipe(featherBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), chickenEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 189 */     EnchantmentData feather2 = new EnchantmentData(Enchantment.field_77330_e, 2);
/* 190 */     ItemStack featherBook2 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 191 */     Items.field_151134_bR.func_92115_a(featherBook2, feather2);
/* 192 */     GameRegistry.addRecipe(featherBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), chickenEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/* 194 */     EnchantmentData feather3 = new EnchantmentData(Enchantment.field_77330_e, 3);
/* 195 */     ItemStack featherBook3 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 196 */     Items.field_151134_bR.func_92115_a(featherBook3, feather3);
/* 197 */     GameRegistry.addRecipe(featherBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), chickenEssence, Character.valueOf('Y'), xpBook3 });
/*     */     
/* 199 */     EnchantmentData feather4 = new EnchantmentData(Enchantment.field_77330_e, 4);
/* 200 */     ItemStack featherBook4 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 201 */     Items.field_151134_bR.func_92115_a(featherBook4, feather4);
/* 202 */     GameRegistry.addRecipe(featherBook4, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), chickenEssence, Character.valueOf('Y'), xpBook4 });
/*     */ 
/*     */     
/* 205 */     EnchantmentData blastprotection1 = new EnchantmentData(Enchantment.field_77327_f, 1);
/* 206 */     ItemStack blastprotectionBook1 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 207 */     Items.field_151134_bR.func_92115_a(blastprotectionBook1, blastprotection1);
/* 208 */     GameRegistry.addRecipe(blastprotectionBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), creeperEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 210 */     EnchantmentData blastprotection2 = new EnchantmentData(Enchantment.field_77327_f, 2);
/* 211 */     ItemStack blastprotectionBook2 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 212 */     Items.field_151134_bR.func_92115_a(blastprotectionBook2, blastprotection2);
/* 213 */     GameRegistry.addRecipe(blastprotectionBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), creeperEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/* 215 */     EnchantmentData blastprotection3 = new EnchantmentData(Enchantment.field_77327_f, 3);
/* 216 */     ItemStack blastprotectionBook3 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 217 */     Items.field_151134_bR.func_92115_a(blastprotectionBook3, blastprotection3);
/* 218 */     GameRegistry.addRecipe(blastprotectionBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), creeperEssence, Character.valueOf('Y'), xpBook3 });
/*     */     
/* 220 */     EnchantmentData blastprotection4 = new EnchantmentData(Enchantment.field_77327_f, 4);
/* 221 */     ItemStack blastprotectionBook4 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 222 */     Items.field_151134_bR.func_92115_a(blastprotectionBook4, blastprotection4);
/* 223 */     GameRegistry.addRecipe(blastprotectionBook4, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), creeperEssence, Character.valueOf('Y'), xpBook4 });
/*     */ 
/*     */     
/* 226 */     EnchantmentData projectileprotection1 = new EnchantmentData(Enchantment.field_77328_g, 1);
/* 227 */     ItemStack projectileprotectionBook1 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 228 */     Items.field_151134_bR.func_92115_a(projectileprotectionBook1, projectileprotection1);
/* 229 */     GameRegistry.addRecipe(projectileprotectionBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), skeletonEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 231 */     EnchantmentData projectileprotection2 = new EnchantmentData(Enchantment.field_77328_g, 2);
/* 232 */     ItemStack projectileprotectionBook2 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 233 */     Items.field_151134_bR.func_92115_a(projectileprotectionBook2, projectileprotection2);
/* 234 */     GameRegistry.addRecipe(projectileprotectionBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), skeletonEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/* 236 */     EnchantmentData projectileprotection3 = new EnchantmentData(Enchantment.field_77328_g, 3);
/* 237 */     ItemStack projectileprotectionBook3 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 238 */     Items.field_151134_bR.func_92115_a(projectileprotectionBook3, projectileprotection3);
/* 239 */     GameRegistry.addRecipe(projectileprotectionBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), skeletonEssence, Character.valueOf('Y'), xpBook3 });
/*     */     
/* 241 */     EnchantmentData projectileprotection4 = new EnchantmentData(Enchantment.field_77328_g, 4);
/* 242 */     ItemStack projectileprotectionBook4 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 243 */     Items.field_151134_bR.func_92115_a(projectileprotectionBook4, projectileprotection4);
/* 244 */     GameRegistry.addRecipe(projectileprotectionBook4, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), skeletonEssence, Character.valueOf('Y'), xpBook4 });
/*     */ 
/*     */     
/* 247 */     EnchantmentData respiration1 = new EnchantmentData(Enchantment.field_77340_h, 1);
/* 248 */     ItemStack respirationBook1 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 249 */     Items.field_151134_bR.func_92115_a(respirationBook1, respiration1);
/* 250 */     GameRegistry.addRecipe(respirationBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), airEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 252 */     EnchantmentData respiration2 = new EnchantmentData(Enchantment.field_77340_h, 2);
/* 253 */     ItemStack respirationBook2 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 254 */     Items.field_151134_bR.func_92115_a(respirationBook2, respiration2);
/* 255 */     GameRegistry.addRecipe(respirationBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), airEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/* 257 */     EnchantmentData respiration3 = new EnchantmentData(Enchantment.field_77340_h, 3);
/* 258 */     ItemStack respirationBook3 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 259 */     Items.field_151134_bR.func_92115_a(respirationBook3, respiration3);
/* 260 */     GameRegistry.addRecipe(respirationBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), airEssence, Character.valueOf('Y'), xpBook3 });
/*     */ 
/*     */     
/* 263 */     EnchantmentData aqua1 = new EnchantmentData(Enchantment.field_77341_i, 1);
/* 264 */     ItemStack aquaBook1 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 265 */     Items.field_151134_bR.func_92115_a(aquaBook1, aqua1);
/* 266 */     GameRegistry.addRecipe(aquaBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), waterEssence, Character.valueOf('Y'), xpBook1 });
/*     */ 
/*     */     
/* 269 */     EnchantmentData thorns1 = new EnchantmentData(Enchantment.field_92091_k, 1);
/* 270 */     ItemStack thornsBook1 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 271 */     Items.field_151134_bR.func_92115_a(thornsBook1, thorns1);
/* 272 */     GameRegistry.addRecipe(thornsBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), natureEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 274 */     EnchantmentData thorns2 = new EnchantmentData(Enchantment.field_92091_k, 2);
/* 275 */     ItemStack thornsBook2 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 276 */     Items.field_151134_bR.func_92115_a(thornsBook2, thorns2);
/* 277 */     GameRegistry.addRecipe(thornsBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), natureEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/* 279 */     EnchantmentData thorns3 = new EnchantmentData(Enchantment.field_92091_k, 3);
/* 280 */     ItemStack thornsBook3 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 281 */     Items.field_151134_bR.func_92115_a(thornsBook3, thorns3);
/* 282 */     GameRegistry.addRecipe(thornsBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), natureEssence, Character.valueOf('Y'), xpBook3 });
/*     */ 
/*     */     
/* 285 */     EnchantmentData sharpness1 = new EnchantmentData(Enchantment.field_77338_j, 1);
/* 286 */     ItemStack sharpnessBook1 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 287 */     Items.field_151134_bR.func_92115_a(sharpnessBook1, sharpness1);
/* 288 */     GameRegistry.addRecipe(sharpnessBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), quartzEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 290 */     EnchantmentData sharpness2 = new EnchantmentData(Enchantment.field_77338_j, 2);
/* 291 */     ItemStack sharpnessBook2 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 292 */     Items.field_151134_bR.func_92115_a(sharpnessBook2, sharpness2);
/* 293 */     GameRegistry.addRecipe(sharpnessBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), quartzEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/* 295 */     EnchantmentData sharpness3 = new EnchantmentData(Enchantment.field_77338_j, 3);
/* 296 */     ItemStack sharpnessBook3 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 297 */     Items.field_151134_bR.func_92115_a(sharpnessBook3, sharpness3);
/* 298 */     GameRegistry.addRecipe(sharpnessBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), quartzEssence, Character.valueOf('Y'), xpBook3 });
/*     */     
/* 300 */     EnchantmentData sharpness4 = new EnchantmentData(Enchantment.field_77338_j, 4);
/* 301 */     ItemStack sharpnessBook4 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 302 */     Items.field_151134_bR.func_92115_a(sharpnessBook4, sharpness4);
/* 303 */     GameRegistry.addRecipe(sharpnessBook4, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), quartzEssence, Character.valueOf('Y'), xpBook4 });
/*     */     
/* 305 */     EnchantmentData sharpness5 = new EnchantmentData(Enchantment.field_77338_j, 5);
/* 306 */     ItemStack sharpnessBook5 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 307 */     Items.field_151134_bR.func_92115_a(sharpnessBook5, sharpness5);
/* 308 */     GameRegistry.addRecipe(sharpnessBook5, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), quartzEssence, Character.valueOf('Y'), xpBook5 });
/*     */ 
/*     */     
/* 311 */     EnchantmentData smite1 = new EnchantmentData(Enchantment.field_77339_k, 1);
/* 312 */     ItemStack smiteBook1 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 313 */     Items.field_151134_bR.func_92115_a(smiteBook1, smite1);
/* 314 */     GameRegistry.addRecipe(smiteBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), netherEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 316 */     EnchantmentData smite2 = new EnchantmentData(Enchantment.field_77339_k, 2);
/* 317 */     ItemStack smiteBook2 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 318 */     Items.field_151134_bR.func_92115_a(smiteBook2, smite2);
/* 319 */     GameRegistry.addRecipe(smiteBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), netherEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/* 321 */     EnchantmentData smite3 = new EnchantmentData(Enchantment.field_77339_k, 3);
/* 322 */     ItemStack smiteBook3 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 323 */     Items.field_151134_bR.func_92115_a(smiteBook3, smite3);
/* 324 */     GameRegistry.addRecipe(smiteBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), netherEssence, Character.valueOf('Y'), xpBook3 });
/*     */     
/* 326 */     EnchantmentData smite4 = new EnchantmentData(Enchantment.field_77339_k, 4);
/* 327 */     ItemStack smiteBook4 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 328 */     Items.field_151134_bR.func_92115_a(smiteBook4, smite4);
/* 329 */     GameRegistry.addRecipe(smiteBook4, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), netherEssence, Character.valueOf('Y'), xpBook4 });
/*     */     
/* 331 */     EnchantmentData smite5 = new EnchantmentData(Enchantment.field_77339_k, 5);
/* 332 */     ItemStack smiteBook5 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 333 */     Items.field_151134_bR.func_92115_a(smiteBook5, smite5);
/* 334 */     GameRegistry.addRecipe(smiteBook5, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), netherEssence, Character.valueOf('Y'), xpBook5 });
/*     */ 
/*     */     
/* 337 */     EnchantmentData bane1 = new EnchantmentData(Enchantment.field_77336_l, 1);
/* 338 */     ItemStack baneBook1 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 339 */     Items.field_151134_bR.func_92115_a(baneBook1, bane1);
/* 340 */     GameRegistry.addRecipe(baneBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), spiderEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 342 */     EnchantmentData bane2 = new EnchantmentData(Enchantment.field_77336_l, 2);
/* 343 */     ItemStack baneBook2 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 344 */     Items.field_151134_bR.func_92115_a(baneBook2, bane2);
/* 345 */     GameRegistry.addRecipe(baneBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), spiderEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/* 347 */     EnchantmentData bane3 = new EnchantmentData(Enchantment.field_77336_l, 3);
/* 348 */     ItemStack baneBook3 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 349 */     Items.field_151134_bR.func_92115_a(baneBook3, bane3);
/* 350 */     GameRegistry.addRecipe(baneBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), spiderEssence, Character.valueOf('Y'), xpBook3 });
/*     */     
/* 352 */     EnchantmentData bane4 = new EnchantmentData(Enchantment.field_77336_l, 4);
/* 353 */     ItemStack baneBook4 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 354 */     Items.field_151134_bR.func_92115_a(baneBook4, bane4);
/* 355 */     GameRegistry.addRecipe(baneBook4, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), spiderEssence, Character.valueOf('Y'), xpBook4 });
/*     */     
/* 357 */     EnchantmentData bane5 = new EnchantmentData(Enchantment.field_77336_l, 5);
/* 358 */     ItemStack baneBook5 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 359 */     Items.field_151134_bR.func_92115_a(baneBook5, bane5);
/* 360 */     GameRegistry.addRecipe(baneBook5, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), spiderEssence, Character.valueOf('Y'), xpBook5 });
/*     */ 
/*     */     
/* 363 */     EnchantmentData knockback1 = new EnchantmentData(Enchantment.field_77337_m, 1);
/* 364 */     ItemStack knockbackBook1 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 365 */     Items.field_151134_bR.func_92115_a(knockbackBook1, knockback1);
/* 366 */     GameRegistry.addRecipe(knockbackBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), ironEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 368 */     EnchantmentData knockback2 = new EnchantmentData(Enchantment.field_77337_m, 2);
/* 369 */     ItemStack knockbackBook2 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 370 */     Items.field_151134_bR.func_92115_a(knockbackBook2, knockback2);
/* 371 */     GameRegistry.addRecipe(knockbackBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), ironEssence, Character.valueOf('Y'), xpBook2 });
/*     */ 
/*     */     
/* 374 */     EnchantmentData looting1 = new EnchantmentData(Enchantment.field_77335_o, 1);
/* 375 */     ItemStack lootingBook1 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 376 */     Items.field_151134_bR.func_92115_a(lootingBook1, looting1);
/* 377 */     GameRegistry.addRecipe(lootingBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), goldEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 379 */     EnchantmentData looting2 = new EnchantmentData(Enchantment.field_77335_o, 2);
/* 380 */     ItemStack lootingBook2 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 381 */     Items.field_151134_bR.func_92115_a(lootingBook2, looting2);
/* 382 */     GameRegistry.addRecipe(lootingBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), goldEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/* 384 */     EnchantmentData looting3 = new EnchantmentData(Enchantment.field_77335_o, 3);
/* 385 */     ItemStack lootingBook3 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 386 */     Items.field_151134_bR.func_92115_a(lootingBook3, looting3);
/* 387 */     GameRegistry.addRecipe(lootingBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), goldEssence, Character.valueOf('Y'), xpBook3 });
/*     */ 
/*     */     
/* 390 */     EnchantmentData power1 = new EnchantmentData(Enchantment.field_77345_t, 1);
/* 391 */     ItemStack powerBook1 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 392 */     Items.field_151134_bR.func_92115_a(powerBook1, power1);
/* 393 */     GameRegistry.addRecipe(powerBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), coalEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 395 */     EnchantmentData power2 = new EnchantmentData(Enchantment.field_77345_t, 2);
/* 396 */     ItemStack powerBook2 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 397 */     Items.field_151134_bR.func_92115_a(powerBook2, power2);
/* 398 */     GameRegistry.addRecipe(powerBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), coalEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/* 400 */     EnchantmentData power3 = new EnchantmentData(Enchantment.field_77345_t, 3);
/* 401 */     ItemStack powerBook3 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 402 */     Items.field_151134_bR.func_92115_a(powerBook3, power3);
/* 403 */     GameRegistry.addRecipe(powerBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), coalEssence, Character.valueOf('Y'), xpBook3 });
/*     */     
/* 405 */     EnchantmentData power4 = new EnchantmentData(Enchantment.field_77345_t, 4);
/* 406 */     ItemStack powerBook4 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 407 */     Items.field_151134_bR.func_92115_a(powerBook4, power4);
/* 408 */     GameRegistry.addRecipe(powerBook4, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), coalEssence, Character.valueOf('Y'), xpBook4 });
/*     */     
/* 410 */     EnchantmentData power5 = new EnchantmentData(Enchantment.field_77345_t, 5);
/* 411 */     ItemStack powerBook5 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 412 */     Items.field_151134_bR.func_92115_a(powerBook5, power5);
/* 413 */     GameRegistry.addRecipe(powerBook5, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), coalEssence, Character.valueOf('Y'), xpBook5 });
/*     */ 
/*     */     
/* 416 */     EnchantmentData infinity1 = new EnchantmentData(Enchantment.field_77342_w, 1);
/* 417 */     ItemStack infinityBook1 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 418 */     Items.field_151134_bR.func_92115_a(infinityBook1, infinity1);
/* 419 */     GameRegistry.addRecipe(infinityBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), slimeEssence, Character.valueOf('Y'), xpBook1 });
/*     */ 
/*     */     
/* 422 */     EnchantmentData punch1 = new EnchantmentData(Enchantment.field_77344_u, 1);
/* 423 */     ItemStack punchBook1 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 424 */     Items.field_151134_bR.func_92115_a(punchBook1, punch1);
/* 425 */     GameRegistry.addRecipe(punchBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), glowstoneEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 427 */     EnchantmentData punch2 = new EnchantmentData(Enchantment.field_77344_u, 2);
/* 428 */     ItemStack punchBook2 = new ItemStack((Item)Items.field_151134_bR, 1);
/* 429 */     Items.field_151134_bR.func_92115_a(punchBook2, punch2);
/* 430 */     GameRegistry.addRecipe(punchBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), glowstoneEssence, Character.valueOf('Y'), xpBook2 });
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\recipes\EnchantmentRecipes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */