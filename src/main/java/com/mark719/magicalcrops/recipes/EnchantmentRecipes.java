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
/*  65 */     GameRegistry.addRecipe(xpBook1, new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), xpEssence, Character.valueOf('Z'), Items.book });
/*  66 */     GameRegistry.addRecipe(xpBook2, new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), xpEssence, Character.valueOf('Z'), xpBook1 });
/*  67 */     GameRegistry.addRecipe(xpBook3, new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), xpEssence, Character.valueOf('Z'), xpBook2 });
/*  68 */     GameRegistry.addRecipe(xpBook4, new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), xpEssence, Character.valueOf('Z'), xpBook3 });
/*  69 */     GameRegistry.addRecipe(xpBook5, new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), xpEssence, Character.valueOf('Z'), xpBook4 });
/*     */ 
/*     */     
/*  72 */     EnchantmentData flame1 = new EnchantmentData(Enchantment.flame, 1);
/*  73 */     ItemStack flameBook1 = new ItemStack((Item)Items.enchanted_book, 1);
/*  74 */     Items.enchanted_book.addEnchantment(flameBook1, flame1);
/*  75 */     GameRegistry.addRecipe(flameBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), fireEssence, Character.valueOf('Y'), xpBook1 });
/*     */ 
/*     */     
/*  78 */     EnchantmentData efficiency1 = new EnchantmentData(Enchantment.efficiency, 1);
/*  79 */     ItemStack efficiencyBook1 = new ItemStack((Item)Items.enchanted_book, 1);
/*  80 */     Items.enchanted_book.addEnchantment(efficiencyBook1, efficiency1);
/*  81 */     GameRegistry.addRecipe(efficiencyBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), redstoneEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/*  83 */     EnchantmentData efficiency2 = new EnchantmentData(Enchantment.efficiency, 2);
/*  84 */     ItemStack efficiencyBook2 = new ItemStack((Item)Items.enchanted_book, 1);
/*  85 */     Items.enchanted_book.addEnchantment(efficiencyBook2, efficiency2);
/*  86 */     GameRegistry.addRecipe(efficiencyBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), redstoneEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/*  88 */     EnchantmentData efficiency3 = new EnchantmentData(Enchantment.efficiency, 3);
/*  89 */     ItemStack efficiencyBook3 = new ItemStack((Item)Items.enchanted_book, 1);
/*  90 */     Items.enchanted_book.addEnchantment(efficiencyBook3, efficiency3);
/*  91 */     GameRegistry.addRecipe(efficiencyBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), redstoneEssence, Character.valueOf('Y'), xpBook3 });
/*     */     
/*  93 */     EnchantmentData efficiency4 = new EnchantmentData(Enchantment.efficiency, 4);
/*  94 */     ItemStack efficiencyBook4 = new ItemStack((Item)Items.enchanted_book, 1);
/*  95 */     Items.enchanted_book.addEnchantment(efficiencyBook4, efficiency4);
/*  96 */     GameRegistry.addRecipe(efficiencyBook4, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), redstoneEssence, Character.valueOf('Y'), xpBook4 });
/*     */     
/*  98 */     EnchantmentData efficiency5 = new EnchantmentData(Enchantment.efficiency, 5);
/*  99 */     ItemStack efficiencyBook5 = new ItemStack((Item)Items.enchanted_book, 1);
/* 100 */     Items.enchanted_book.addEnchantment(efficiencyBook5, efficiency5);
/* 101 */     GameRegistry.addRecipe(efficiencyBook5, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), redstoneEssence, Character.valueOf('Y'), xpBook5 });
/*     */ 
/*     */     
/* 104 */     EnchantmentData silk1 = new EnchantmentData(Enchantment.silkTouch, 1);
/* 105 */     ItemStack silkBook1 = new ItemStack((Item)Items.enchanted_book, 1);
/* 106 */     Items.enchanted_book.addEnchantment(silkBook1, silk1);
/* 107 */     GameRegistry.addRecipe(silkBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), emeraldEssence, Character.valueOf('Y'), xpBook1 });
/*     */ 
/*     */     
/* 110 */     EnchantmentData unbreaking1 = new EnchantmentData(Enchantment.unbreaking, 1);
/* 111 */     ItemStack unbreakingBook1 = new ItemStack((Item)Items.enchanted_book, 1);
/* 112 */     Items.enchanted_book.addEnchantment(unbreakingBook1, unbreaking1);
/* 113 */     GameRegistry.addRecipe(unbreakingBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), obsidianEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 115 */     EnchantmentData unbreaking2 = new EnchantmentData(Enchantment.unbreaking, 2);
/* 116 */     ItemStack unbreakingBook2 = new ItemStack((Item)Items.enchanted_book, 1);
/* 117 */     Items.enchanted_book.addEnchantment(unbreakingBook2, unbreaking2);
/* 118 */     GameRegistry.addRecipe(unbreakingBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), obsidianEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/* 120 */     EnchantmentData unbreaking3 = new EnchantmentData(Enchantment.unbreaking, 3);
/* 121 */     ItemStack unbreakingBook3 = new ItemStack((Item)Items.enchanted_book, 1);
/* 122 */     Items.enchanted_book.addEnchantment(unbreakingBook3, unbreaking3);
/* 123 */     GameRegistry.addRecipe(unbreakingBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), obsidianEssence, Character.valueOf('Y'), xpBook3 });
/*     */ 
/*     */     
/* 126 */     EnchantmentData fortune1 = new EnchantmentData(Enchantment.fortune, 1);
/* 127 */     ItemStack fortuneBook1 = new ItemStack((Item)Items.enchanted_book, 1);
/* 128 */     Items.enchanted_book.addEnchantment(fortuneBook1, fortune1);
/* 129 */     GameRegistry.addRecipe(fortuneBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), lapisEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 131 */     EnchantmentData fortune2 = new EnchantmentData(Enchantment.fortune, 2);
/* 132 */     ItemStack fortuneBook2 = new ItemStack((Item)Items.enchanted_book, 1);
/* 133 */     Items.enchanted_book.addEnchantment(fortuneBook2, fortune2);
/* 134 */     GameRegistry.addRecipe(fortuneBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), lapisEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/* 136 */     EnchantmentData fortune3 = new EnchantmentData(Enchantment.fortune, 3);
/* 137 */     ItemStack fortuneBook3 = new ItemStack((Item)Items.enchanted_book, 1);
/* 138 */     Items.enchanted_book.addEnchantment(fortuneBook3, fortune3);
/* 139 */     GameRegistry.addRecipe(fortuneBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), lapisEssence, Character.valueOf('Y'), xpBook3 });
/*     */ 
/*     */     
/* 142 */     EnchantmentData protection1 = new EnchantmentData(Enchantment.protection, 1);
/* 143 */     ItemStack protectionBook1 = new ItemStack((Item)Items.enchanted_book, 1);
/* 144 */     Items.enchanted_book.addEnchantment(protectionBook1, protection1);
/* 145 */     GameRegistry.addRecipe(protectionBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), diamondEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 147 */     EnchantmentData protection2 = new EnchantmentData(Enchantment.protection, 2);
/* 148 */     ItemStack protectionBook2 = new ItemStack((Item)Items.enchanted_book, 1);
/* 149 */     Items.enchanted_book.addEnchantment(protectionBook2, protection2);
/* 150 */     GameRegistry.addRecipe(protectionBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), diamondEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/* 152 */     EnchantmentData protection3 = new EnchantmentData(Enchantment.protection, 3);
/* 153 */     ItemStack protectionBook3 = new ItemStack((Item)Items.enchanted_book, 1);
/* 154 */     Items.enchanted_book.addEnchantment(protectionBook3, protection3);
/* 155 */     GameRegistry.addRecipe(protectionBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), diamondEssence, Character.valueOf('Y'), xpBook3 });
/*     */     
/* 157 */     EnchantmentData protection4 = new EnchantmentData(Enchantment.protection, 4);
/* 158 */     ItemStack protectionBook4 = new ItemStack((Item)Items.enchanted_book, 1);
/* 159 */     Items.enchanted_book.addEnchantment(protectionBook4, protection4);
/* 160 */     GameRegistry.addRecipe(protectionBook4, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), diamondEssence, Character.valueOf('Y'), xpBook4 });
/*     */ 
/*     */     
/* 163 */     EnchantmentData fireprotection1 = new EnchantmentData(Enchantment.fireProtection, 1);
/* 164 */     ItemStack fireprotectionBook1 = new ItemStack((Item)Items.enchanted_book, 1);
/* 165 */     Items.enchanted_book.addEnchantment(fireprotectionBook1, fireprotection1);
/* 166 */     GameRegistry.addRecipe(fireprotectionBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), blazeEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 168 */     EnchantmentData fireprotection2 = new EnchantmentData(Enchantment.fireProtection, 2);
/* 169 */     ItemStack fireprotectionBook2 = new ItemStack((Item)Items.enchanted_book, 1);
/* 170 */     Items.enchanted_book.addEnchantment(fireprotectionBook2, fireprotection2);
/* 171 */     GameRegistry.addRecipe(fireprotectionBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), blazeEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/* 173 */     EnchantmentData fireprotection3 = new EnchantmentData(Enchantment.fireProtection, 3);
/* 174 */     ItemStack fireprotectionBook3 = new ItemStack((Item)Items.enchanted_book, 1);
/* 175 */     Items.enchanted_book.addEnchantment(fireprotectionBook3, fireprotection3);
/* 176 */     GameRegistry.addRecipe(fireprotectionBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), blazeEssence, Character.valueOf('Y'), xpBook3 });
/*     */     
/* 178 */     EnchantmentData fireprotection4 = new EnchantmentData(Enchantment.fireProtection, 4);
/* 179 */     ItemStack fireprotectionBook4 = new ItemStack((Item)Items.enchanted_book, 1);
/* 180 */     Items.enchanted_book.addEnchantment(fireprotectionBook4, fireprotection4);
/* 181 */     GameRegistry.addRecipe(fireprotectionBook4, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), blazeEssence, Character.valueOf('Y'), xpBook4 });
/*     */ 
/*     */     
/* 184 */     EnchantmentData feather1 = new EnchantmentData(Enchantment.featherFalling, 1);
/* 185 */     ItemStack featherBook1 = new ItemStack((Item)Items.enchanted_book, 1);
/* 186 */     Items.enchanted_book.addEnchantment(featherBook1, feather1);
/* 187 */     GameRegistry.addRecipe(featherBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), chickenEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 189 */     EnchantmentData feather2 = new EnchantmentData(Enchantment.featherFalling, 2);
/* 190 */     ItemStack featherBook2 = new ItemStack((Item)Items.enchanted_book, 1);
/* 191 */     Items.enchanted_book.addEnchantment(featherBook2, feather2);
/* 192 */     GameRegistry.addRecipe(featherBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), chickenEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/* 194 */     EnchantmentData feather3 = new EnchantmentData(Enchantment.featherFalling, 3);
/* 195 */     ItemStack featherBook3 = new ItemStack((Item)Items.enchanted_book, 1);
/* 196 */     Items.enchanted_book.addEnchantment(featherBook3, feather3);
/* 197 */     GameRegistry.addRecipe(featherBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), chickenEssence, Character.valueOf('Y'), xpBook3 });
/*     */     
/* 199 */     EnchantmentData feather4 = new EnchantmentData(Enchantment.featherFalling, 4);
/* 200 */     ItemStack featherBook4 = new ItemStack((Item)Items.enchanted_book, 1);
/* 201 */     Items.enchanted_book.addEnchantment(featherBook4, feather4);
/* 202 */     GameRegistry.addRecipe(featherBook4, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), chickenEssence, Character.valueOf('Y'), xpBook4 });
/*     */ 
/*     */     
/* 205 */     EnchantmentData blastprotection1 = new EnchantmentData(Enchantment.blastProtection, 1);
/* 206 */     ItemStack blastprotectionBook1 = new ItemStack((Item)Items.enchanted_book, 1);
/* 207 */     Items.enchanted_book.addEnchantment(blastprotectionBook1, blastprotection1);
/* 208 */     GameRegistry.addRecipe(blastprotectionBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), creeperEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 210 */     EnchantmentData blastprotection2 = new EnchantmentData(Enchantment.blastProtection, 2);
/* 211 */     ItemStack blastprotectionBook2 = new ItemStack((Item)Items.enchanted_book, 1);
/* 212 */     Items.enchanted_book.addEnchantment(blastprotectionBook2, blastprotection2);
/* 213 */     GameRegistry.addRecipe(blastprotectionBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), creeperEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/* 215 */     EnchantmentData blastprotection3 = new EnchantmentData(Enchantment.blastProtection, 3);
/* 216 */     ItemStack blastprotectionBook3 = new ItemStack((Item)Items.enchanted_book, 1);
/* 217 */     Items.enchanted_book.addEnchantment(blastprotectionBook3, blastprotection3);
/* 218 */     GameRegistry.addRecipe(blastprotectionBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), creeperEssence, Character.valueOf('Y'), xpBook3 });
/*     */     
/* 220 */     EnchantmentData blastprotection4 = new EnchantmentData(Enchantment.blastProtection, 4);
/* 221 */     ItemStack blastprotectionBook4 = new ItemStack((Item)Items.enchanted_book, 1);
/* 222 */     Items.enchanted_book.addEnchantment(blastprotectionBook4, blastprotection4);
/* 223 */     GameRegistry.addRecipe(blastprotectionBook4, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), creeperEssence, Character.valueOf('Y'), xpBook4 });
/*     */ 
/*     */     
/* 226 */     EnchantmentData projectileprotection1 = new EnchantmentData(Enchantment.projectileProtection, 1);
/* 227 */     ItemStack projectileprotectionBook1 = new ItemStack((Item)Items.enchanted_book, 1);
/* 228 */     Items.enchanted_book.addEnchantment(projectileprotectionBook1, projectileprotection1);
/* 229 */     GameRegistry.addRecipe(projectileprotectionBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), skeletonEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 231 */     EnchantmentData projectileprotection2 = new EnchantmentData(Enchantment.projectileProtection, 2);
/* 232 */     ItemStack projectileprotectionBook2 = new ItemStack((Item)Items.enchanted_book, 1);
/* 233 */     Items.enchanted_book.addEnchantment(projectileprotectionBook2, projectileprotection2);
/* 234 */     GameRegistry.addRecipe(projectileprotectionBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), skeletonEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/* 236 */     EnchantmentData projectileprotection3 = new EnchantmentData(Enchantment.projectileProtection, 3);
/* 237 */     ItemStack projectileprotectionBook3 = new ItemStack((Item)Items.enchanted_book, 1);
/* 238 */     Items.enchanted_book.addEnchantment(projectileprotectionBook3, projectileprotection3);
/* 239 */     GameRegistry.addRecipe(projectileprotectionBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), skeletonEssence, Character.valueOf('Y'), xpBook3 });
/*     */     
/* 241 */     EnchantmentData projectileprotection4 = new EnchantmentData(Enchantment.projectileProtection, 4);
/* 242 */     ItemStack projectileprotectionBook4 = new ItemStack((Item)Items.enchanted_book, 1);
/* 243 */     Items.enchanted_book.addEnchantment(projectileprotectionBook4, projectileprotection4);
/* 244 */     GameRegistry.addRecipe(projectileprotectionBook4, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), skeletonEssence, Character.valueOf('Y'), xpBook4 });
/*     */ 
/*     */     
/* 247 */     EnchantmentData respiration1 = new EnchantmentData(Enchantment.respiration, 1);
/* 248 */     ItemStack respirationBook1 = new ItemStack((Item)Items.enchanted_book, 1);
/* 249 */     Items.enchanted_book.addEnchantment(respirationBook1, respiration1);
/* 250 */     GameRegistry.addRecipe(respirationBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), airEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 252 */     EnchantmentData respiration2 = new EnchantmentData(Enchantment.respiration, 2);
/* 253 */     ItemStack respirationBook2 = new ItemStack((Item)Items.enchanted_book, 1);
/* 254 */     Items.enchanted_book.addEnchantment(respirationBook2, respiration2);
/* 255 */     GameRegistry.addRecipe(respirationBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), airEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/* 257 */     EnchantmentData respiration3 = new EnchantmentData(Enchantment.respiration, 3);
/* 258 */     ItemStack respirationBook3 = new ItemStack((Item)Items.enchanted_book, 1);
/* 259 */     Items.enchanted_book.addEnchantment(respirationBook3, respiration3);
/* 260 */     GameRegistry.addRecipe(respirationBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), airEssence, Character.valueOf('Y'), xpBook3 });
/*     */ 
/*     */     
/* 263 */     EnchantmentData aqua1 = new EnchantmentData(Enchantment.aquaAffinity, 1);
/* 264 */     ItemStack aquaBook1 = new ItemStack((Item)Items.enchanted_book, 1);
/* 265 */     Items.enchanted_book.addEnchantment(aquaBook1, aqua1);
/* 266 */     GameRegistry.addRecipe(aquaBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), waterEssence, Character.valueOf('Y'), xpBook1 });
/*     */ 
/*     */     
/* 269 */     EnchantmentData thorns1 = new EnchantmentData(Enchantment.thorns, 1);
/* 270 */     ItemStack thornsBook1 = new ItemStack((Item)Items.enchanted_book, 1);
/* 271 */     Items.enchanted_book.addEnchantment(thornsBook1, thorns1);
/* 272 */     GameRegistry.addRecipe(thornsBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), natureEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 274 */     EnchantmentData thorns2 = new EnchantmentData(Enchantment.thorns, 2);
/* 275 */     ItemStack thornsBook2 = new ItemStack((Item)Items.enchanted_book, 1);
/* 276 */     Items.enchanted_book.addEnchantment(thornsBook2, thorns2);
/* 277 */     GameRegistry.addRecipe(thornsBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), natureEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/* 279 */     EnchantmentData thorns3 = new EnchantmentData(Enchantment.thorns, 3);
/* 280 */     ItemStack thornsBook3 = new ItemStack((Item)Items.enchanted_book, 1);
/* 281 */     Items.enchanted_book.addEnchantment(thornsBook3, thorns3);
/* 282 */     GameRegistry.addRecipe(thornsBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), natureEssence, Character.valueOf('Y'), xpBook3 });
/*     */ 
/*     */     
/* 285 */     EnchantmentData sharpness1 = new EnchantmentData(Enchantment.sharpness, 1);
/* 286 */     ItemStack sharpnessBook1 = new ItemStack((Item)Items.enchanted_book, 1);
/* 287 */     Items.enchanted_book.addEnchantment(sharpnessBook1, sharpness1);
/* 288 */     GameRegistry.addRecipe(sharpnessBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), quartzEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 290 */     EnchantmentData sharpness2 = new EnchantmentData(Enchantment.sharpness, 2);
/* 291 */     ItemStack sharpnessBook2 = new ItemStack((Item)Items.enchanted_book, 1);
/* 292 */     Items.enchanted_book.addEnchantment(sharpnessBook2, sharpness2);
/* 293 */     GameRegistry.addRecipe(sharpnessBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), quartzEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/* 295 */     EnchantmentData sharpness3 = new EnchantmentData(Enchantment.sharpness, 3);
/* 296 */     ItemStack sharpnessBook3 = new ItemStack((Item)Items.enchanted_book, 1);
/* 297 */     Items.enchanted_book.addEnchantment(sharpnessBook3, sharpness3);
/* 298 */     GameRegistry.addRecipe(sharpnessBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), quartzEssence, Character.valueOf('Y'), xpBook3 });
/*     */     
/* 300 */     EnchantmentData sharpness4 = new EnchantmentData(Enchantment.sharpness, 4);
/* 301 */     ItemStack sharpnessBook4 = new ItemStack((Item)Items.enchanted_book, 1);
/* 302 */     Items.enchanted_book.addEnchantment(sharpnessBook4, sharpness4);
/* 303 */     GameRegistry.addRecipe(sharpnessBook4, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), quartzEssence, Character.valueOf('Y'), xpBook4 });
/*     */     
/* 305 */     EnchantmentData sharpness5 = new EnchantmentData(Enchantment.sharpness, 5);
/* 306 */     ItemStack sharpnessBook5 = new ItemStack((Item)Items.enchanted_book, 1);
/* 307 */     Items.enchanted_book.addEnchantment(sharpnessBook5, sharpness5);
/* 308 */     GameRegistry.addRecipe(sharpnessBook5, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), quartzEssence, Character.valueOf('Y'), xpBook5 });
/*     */ 
/*     */     
/* 311 */     EnchantmentData smite1 = new EnchantmentData(Enchantment.smite, 1);
/* 312 */     ItemStack smiteBook1 = new ItemStack((Item)Items.enchanted_book, 1);
/* 313 */     Items.enchanted_book.addEnchantment(smiteBook1, smite1);
/* 314 */     GameRegistry.addRecipe(smiteBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), netherEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 316 */     EnchantmentData smite2 = new EnchantmentData(Enchantment.smite, 2);
/* 317 */     ItemStack smiteBook2 = new ItemStack((Item)Items.enchanted_book, 1);
/* 318 */     Items.enchanted_book.addEnchantment(smiteBook2, smite2);
/* 319 */     GameRegistry.addRecipe(smiteBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), netherEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/* 321 */     EnchantmentData smite3 = new EnchantmentData(Enchantment.smite, 3);
/* 322 */     ItemStack smiteBook3 = new ItemStack((Item)Items.enchanted_book, 1);
/* 323 */     Items.enchanted_book.addEnchantment(smiteBook3, smite3);
/* 324 */     GameRegistry.addRecipe(smiteBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), netherEssence, Character.valueOf('Y'), xpBook3 });
/*     */     
/* 326 */     EnchantmentData smite4 = new EnchantmentData(Enchantment.smite, 4);
/* 327 */     ItemStack smiteBook4 = new ItemStack((Item)Items.enchanted_book, 1);
/* 328 */     Items.enchanted_book.addEnchantment(smiteBook4, smite4);
/* 329 */     GameRegistry.addRecipe(smiteBook4, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), netherEssence, Character.valueOf('Y'), xpBook4 });
/*     */     
/* 331 */     EnchantmentData smite5 = new EnchantmentData(Enchantment.smite, 5);
/* 332 */     ItemStack smiteBook5 = new ItemStack((Item)Items.enchanted_book, 1);
/* 333 */     Items.enchanted_book.addEnchantment(smiteBook5, smite5);
/* 334 */     GameRegistry.addRecipe(smiteBook5, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), netherEssence, Character.valueOf('Y'), xpBook5 });
/*     */ 
/*     */     
/* 337 */     EnchantmentData bane1 = new EnchantmentData(Enchantment.baneOfArthropods, 1);
/* 338 */     ItemStack baneBook1 = new ItemStack((Item)Items.enchanted_book, 1);
/* 339 */     Items.enchanted_book.addEnchantment(baneBook1, bane1);
/* 340 */     GameRegistry.addRecipe(baneBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), spiderEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 342 */     EnchantmentData bane2 = new EnchantmentData(Enchantment.baneOfArthropods, 2);
/* 343 */     ItemStack baneBook2 = new ItemStack((Item)Items.enchanted_book, 1);
/* 344 */     Items.enchanted_book.addEnchantment(baneBook2, bane2);
/* 345 */     GameRegistry.addRecipe(baneBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), spiderEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/* 347 */     EnchantmentData bane3 = new EnchantmentData(Enchantment.baneOfArthropods, 3);
/* 348 */     ItemStack baneBook3 = new ItemStack((Item)Items.enchanted_book, 1);
/* 349 */     Items.enchanted_book.addEnchantment(baneBook3, bane3);
/* 350 */     GameRegistry.addRecipe(baneBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), spiderEssence, Character.valueOf('Y'), xpBook3 });
/*     */     
/* 352 */     EnchantmentData bane4 = new EnchantmentData(Enchantment.baneOfArthropods, 4);
/* 353 */     ItemStack baneBook4 = new ItemStack((Item)Items.enchanted_book, 1);
/* 354 */     Items.enchanted_book.addEnchantment(baneBook4, bane4);
/* 355 */     GameRegistry.addRecipe(baneBook4, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), spiderEssence, Character.valueOf('Y'), xpBook4 });
/*     */     
/* 357 */     EnchantmentData bane5 = new EnchantmentData(Enchantment.baneOfArthropods, 5);
/* 358 */     ItemStack baneBook5 = new ItemStack((Item)Items.enchanted_book, 1);
/* 359 */     Items.enchanted_book.addEnchantment(baneBook5, bane5);
/* 360 */     GameRegistry.addRecipe(baneBook5, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), spiderEssence, Character.valueOf('Y'), xpBook5 });
/*     */ 
/*     */     
/* 363 */     EnchantmentData knockback1 = new EnchantmentData(Enchantment.knockback, 1);
/* 364 */     ItemStack knockbackBook1 = new ItemStack((Item)Items.enchanted_book, 1);
/* 365 */     Items.enchanted_book.addEnchantment(knockbackBook1, knockback1);
/* 366 */     GameRegistry.addRecipe(knockbackBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), ironEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 368 */     EnchantmentData knockback2 = new EnchantmentData(Enchantment.knockback, 2);
/* 369 */     ItemStack knockbackBook2 = new ItemStack((Item)Items.enchanted_book, 1);
/* 370 */     Items.enchanted_book.addEnchantment(knockbackBook2, knockback2);
/* 371 */     GameRegistry.addRecipe(knockbackBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), ironEssence, Character.valueOf('Y'), xpBook2 });
/*     */ 
/*     */     
/* 374 */     EnchantmentData looting1 = new EnchantmentData(Enchantment.looting, 1);
/* 375 */     ItemStack lootingBook1 = new ItemStack((Item)Items.enchanted_book, 1);
/* 376 */     Items.enchanted_book.addEnchantment(lootingBook1, looting1);
/* 377 */     GameRegistry.addRecipe(lootingBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), goldEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 379 */     EnchantmentData looting2 = new EnchantmentData(Enchantment.looting, 2);
/* 380 */     ItemStack lootingBook2 = new ItemStack((Item)Items.enchanted_book, 1);
/* 381 */     Items.enchanted_book.addEnchantment(lootingBook2, looting2);
/* 382 */     GameRegistry.addRecipe(lootingBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), goldEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/* 384 */     EnchantmentData looting3 = new EnchantmentData(Enchantment.looting, 3);
/* 385 */     ItemStack lootingBook3 = new ItemStack((Item)Items.enchanted_book, 1);
/* 386 */     Items.enchanted_book.addEnchantment(lootingBook3, looting3);
/* 387 */     GameRegistry.addRecipe(lootingBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), goldEssence, Character.valueOf('Y'), xpBook3 });
/*     */ 
/*     */     
/* 390 */     EnchantmentData power1 = new EnchantmentData(Enchantment.power, 1);
/* 391 */     ItemStack powerBook1 = new ItemStack((Item)Items.enchanted_book, 1);
/* 392 */     Items.enchanted_book.addEnchantment(powerBook1, power1);
/* 393 */     GameRegistry.addRecipe(powerBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), coalEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 395 */     EnchantmentData power2 = new EnchantmentData(Enchantment.power, 2);
/* 396 */     ItemStack powerBook2 = new ItemStack((Item)Items.enchanted_book, 1);
/* 397 */     Items.enchanted_book.addEnchantment(powerBook2, power2);
/* 398 */     GameRegistry.addRecipe(powerBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), coalEssence, Character.valueOf('Y'), xpBook2 });
/*     */     
/* 400 */     EnchantmentData power3 = new EnchantmentData(Enchantment.power, 3);
/* 401 */     ItemStack powerBook3 = new ItemStack((Item)Items.enchanted_book, 1);
/* 402 */     Items.enchanted_book.addEnchantment(powerBook3, power3);
/* 403 */     GameRegistry.addRecipe(powerBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), coalEssence, Character.valueOf('Y'), xpBook3 });
/*     */     
/* 405 */     EnchantmentData power4 = new EnchantmentData(Enchantment.power, 4);
/* 406 */     ItemStack powerBook4 = new ItemStack((Item)Items.enchanted_book, 1);
/* 407 */     Items.enchanted_book.addEnchantment(powerBook4, power4);
/* 408 */     GameRegistry.addRecipe(powerBook4, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), coalEssence, Character.valueOf('Y'), xpBook4 });
/*     */     
/* 410 */     EnchantmentData power5 = new EnchantmentData(Enchantment.power, 5);
/* 411 */     ItemStack powerBook5 = new ItemStack((Item)Items.enchanted_book, 1);
/* 412 */     Items.enchanted_book.addEnchantment(powerBook5, power5);
/* 413 */     GameRegistry.addRecipe(powerBook5, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), coalEssence, Character.valueOf('Y'), xpBook5 });
/*     */ 
/*     */     
/* 416 */     EnchantmentData infinity1 = new EnchantmentData(Enchantment.infinity, 1);
/* 417 */     ItemStack infinityBook1 = new ItemStack((Item)Items.enchanted_book, 1);
/* 418 */     Items.enchanted_book.addEnchantment(infinityBook1, infinity1);
/* 419 */     GameRegistry.addRecipe(infinityBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), slimeEssence, Character.valueOf('Y'), xpBook1 });
/*     */ 
/*     */     
/* 422 */     EnchantmentData punch1 = new EnchantmentData(Enchantment.punch, 1);
/* 423 */     ItemStack punchBook1 = new ItemStack((Item)Items.enchanted_book, 1);
/* 424 */     Items.enchanted_book.addEnchantment(punchBook1, punch1);
/* 425 */     GameRegistry.addRecipe(punchBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), glowstoneEssence, Character.valueOf('Y'), xpBook1 });
/*     */     
/* 427 */     EnchantmentData punch2 = new EnchantmentData(Enchantment.punch, 2);
/* 428 */     ItemStack punchBook2 = new ItemStack((Item)Items.enchanted_book, 1);
/* 429 */     Items.enchanted_book.addEnchantment(punchBook2, punch2);
/* 430 */     GameRegistry.addRecipe(punchBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), glowstoneEssence, Character.valueOf('Y'), xpBook2 });
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\recipes\EnchantmentRecipes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */