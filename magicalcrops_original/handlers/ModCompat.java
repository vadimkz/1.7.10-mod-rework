/*     */ package com.mark719.magicalcrops.handlers;
/*     */ 
/*     */ import com.mark719.magicalcrops.blocks.crops.AluminiumCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.AlumiteCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.ArditeCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.BlizzCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.BronzeCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.CertusQuartzCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.CobaltCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.CopperCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.ElectrumCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.EnderiumCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.FluixCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.InvarCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.LeadCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.LumiumCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.ManasteelCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.ManyullynCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.NickelCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.OsmiumCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.PeridotCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.PlatinumCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.RubberCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.RubyCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.SaltpeterCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.SapphireCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.SignalumCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.SilverCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.SteelCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.SulfurCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.TerrasteelCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.TinCrop;
/*     */ import com.mark719.magicalcrops.blocks.crops.YelloriteCrop;
/*     */ import com.mark719.magicalcrops.config.ConfigCrafting;
/*     */ import com.mark719.magicalcrops.config.ConfigDisable;
/*     */ import com.mark719.magicalcrops.config.ConfigMain;
/*     */ import com.mark719.magicalcrops.help.BlockRegisterHelper;
/*     */ import com.mark719.magicalcrops.help.ItemRegisterHelper;
/*     */ import com.mark719.magicalcrops.help.OreCheck;
/*     */ import com.mark719.magicalcrops.items.essence.AluminiumEssence;
/*     */ import com.mark719.magicalcrops.items.essence.AlumiteEssence;
/*     */ import com.mark719.magicalcrops.items.essence.ArditeEssence;
/*     */ import com.mark719.magicalcrops.items.essence.BlizzEssence;
/*     */ import com.mark719.magicalcrops.items.essence.BronzeEssence;
/*     */ import com.mark719.magicalcrops.items.essence.CertusQuartzEssence;
/*     */ import com.mark719.magicalcrops.items.essence.CobaltEssence;
/*     */ import com.mark719.magicalcrops.items.essence.CopperEssence;
/*     */ import com.mark719.magicalcrops.items.essence.ElectrumEssence;
/*     */ import com.mark719.magicalcrops.items.essence.EnderiumEssence;
/*     */ import com.mark719.magicalcrops.items.essence.FluixEssence;
/*     */ import com.mark719.magicalcrops.items.essence.InvarEssence;
/*     */ import com.mark719.magicalcrops.items.essence.LeadEssence;
/*     */ import com.mark719.magicalcrops.items.essence.LumiumEssence;
/*     */ import com.mark719.magicalcrops.items.essence.ManasteelEssence;
/*     */ import com.mark719.magicalcrops.items.essence.ManyullynEssence;
/*     */ import com.mark719.magicalcrops.items.essence.NickelEssence;
/*     */ import com.mark719.magicalcrops.items.essence.OsmiumEssence;
/*     */ import com.mark719.magicalcrops.items.essence.PeridotEssence;
/*     */ import com.mark719.magicalcrops.items.essence.PlatinumEssence;
/*     */ import com.mark719.magicalcrops.items.essence.RubberEssence;
/*     */ import com.mark719.magicalcrops.items.essence.RubyEssence;
/*     */ import com.mark719.magicalcrops.items.essence.SaltpeterEssence;
/*     */ import com.mark719.magicalcrops.items.essence.SapphireEssence;
/*     */ import com.mark719.magicalcrops.items.essence.SignalumEssence;
/*     */ import com.mark719.magicalcrops.items.essence.SilverEssence;
/*     */ import com.mark719.magicalcrops.items.essence.SteelEssence;
/*     */ import com.mark719.magicalcrops.items.essence.SulfurEssence;
/*     */ import com.mark719.magicalcrops.items.essence.TerrasteelEssence;
/*     */ import com.mark719.magicalcrops.items.essence.TinEssence;
/*     */ import com.mark719.magicalcrops.items.essence.YelloriteEssence;
/*     */ import com.mark719.magicalcrops.items.seeds.AluminiumSeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.AlumiteSeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.ArditeSeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.BlizzSeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.BronzeSeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.CertusQuartzSeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.CobaltSeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.CopperSeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.ElectrumSeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.EnderiumSeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.FluixSeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.InvarSeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.LeadSeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.LumiumSeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.ManasteelSeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.ManyullynSeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.NickelSeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.OsmiumSeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.PeridotSeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.PlatinumSeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.RubberSeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.RubySeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.SaltpeterSeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.SapphireSeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.SignalumSeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.SilverSeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.SteelSeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.SulfurSeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.TerrasteelSeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.TinSeeds;
/*     */ import com.mark719.magicalcrops.items.seeds.YelloriteSeeds;
/*     */ import cpw.mods.fml.common.registry.GameRegistry;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.item.crafting.IRecipe;
/*     */ import net.minecraftforge.oredict.OreDictionary;
/*     */ import net.minecraftforge.oredict.ShapedOreRecipe;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ModCompat
/*     */ {
/* 115 */   static int seedOutPut = ConfigMain.SEED_OUTPUT;
/*     */   
/* 117 */   static Item minicioEssence = Essence.MinicioEssence;
/* 118 */   static Item accioEssence = Essence.AccioEssence;
/* 119 */   static Item crucioEssence = Essence.CrucioEssence;
/* 120 */   static Item imperioEssence = Essence.ImperioEssence;
/* 121 */   static Item zivicioEssence = Essence.ZivicioEssence;
/*     */   
/* 123 */   static ItemStack minicioSeeds = new ItemStack(MSeeds.MinicioSeeds, 1, 32767);
/*     */   
/* 125 */   public static Block farmland = Blocks.field_150458_ak;
/*     */   
/*     */   public static Item AluminiumEssence;
/*     */   
/*     */   public static Item ArditeEssence;
/*     */   
/*     */   public static Item CobaltEssence;
/*     */   public static Item CopperEssence;
/*     */   public static Item CertusQuartzEssence;
/*     */   public static Item LeadEssence;
/*     */   public static Item NickelEssence;
/*     */   public static Item OsmiumEssence;
/*     */   public static Item PeridotEssence;
/*     */   public static Item RubyEssence;
/*     */   public static Item SapphireEssence;
/*     */   
/*     */   public static void loadCompat() {
/* 142 */     if (ConfigDisable.ALUMINIUM && OreCheck.getModOre("oreAluminium") != null && OreCheck.getModOre("ingotAluminium") != null) {
/*     */       
/* 144 */       AluminiumEssence = (new AluminiumEssence()).func_77655_b("AluminiumEssence");
/* 145 */       AluminiumCrop = (new AluminiumCrop()).func_149663_c("AluminiumCrop");
/* 146 */       AluminiumSeeds = (new AluminiumSeeds(AluminiumCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("AluminiumSeeds");
/*     */       
/* 148 */       ItemRegisterHelper.registerItem(AluminiumEssence);
/* 149 */       BlockRegisterHelper.registerBlock(AluminiumCrop);
/* 150 */       ItemRegisterHelper.registerItem(AluminiumSeeds);
/*     */       
/* 152 */       ItemStack modIngot = OreCheck.getModOre("ingotAluminium");
/* 153 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(AluminiumSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), crucioEssence, Character.valueOf('Y'), "ingotAluminium", Character.valueOf('Z'), minicioSeeds }));
/* 154 */       ItemStack modOre = OreCheck.getModOre("oreAluminium");
/* 155 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modOre.func_77973_b(), ConfigCrafting.outPutAluminium, modOre.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), AluminiumEssence }));
/* 156 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(AluminiumEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), AluminiumSeeds }));
/* 157 */       OreDictionary.registerOre("crucioMaterial", new ItemStack(AluminiumEssence));
/*     */     } 
/*     */     
/* 160 */     if (ConfigDisable.ARDITE && OreCheck.getModOre("oreArdite") != null && OreCheck.getModOre("ingotArdite") != null) {
/*     */       
/* 162 */       ArditeEssence = (new ArditeEssence()).func_77655_b("ArditeEssence");
/* 163 */       ArditeCrop = (new ArditeCrop()).func_149663_c("ArditeCrop");
/* 164 */       ArditeSeeds = (new ArditeSeeds(ArditeCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("ArditeSeeds");
/*     */       
/* 166 */       ItemRegisterHelper.registerItem(ArditeEssence);
/* 167 */       BlockRegisterHelper.registerBlock(ArditeCrop);
/* 168 */       ItemRegisterHelper.registerItem(ArditeSeeds);
/*     */       
/* 170 */       ItemStack modIngot = OreCheck.getModOre("ingotArdite");
/* 171 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ArditeSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), "ingotArdite", Character.valueOf('Z'), minicioSeeds }));
/* 172 */       ItemStack modOre = OreCheck.getModOre("oreArdite");
/* 173 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modOre.func_77973_b(), ConfigCrafting.outPutArdite, modOre.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), ArditeEssence }));
/* 174 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ArditeEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), ArditeSeeds }));
/* 175 */       OreDictionary.registerOre("imperioMaterial", new ItemStack(ArditeEssence));
/*     */     } 
/*     */     
/* 178 */     if (ConfigDisable.COBALT && OreCheck.getModOre("oreCobalt") != null && OreCheck.getModOre("ingotCobalt") != null) {
/*     */       
/* 180 */       CobaltEssence = (new CobaltEssence()).func_77655_b("CobaltEssence");
/* 181 */       CobaltCrop = (new CobaltCrop()).func_149663_c("CobaltCrop");
/* 182 */       CobaltSeeds = (new CobaltSeeds(CobaltCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("CobaltSeeds");
/*     */       
/* 184 */       ItemRegisterHelper.registerItem(CobaltEssence);
/* 185 */       BlockRegisterHelper.registerBlock(CobaltCrop);
/* 186 */       ItemRegisterHelper.registerItem(CobaltSeeds);
/*     */       
/* 188 */       ItemStack modIngot = OreCheck.getModOre("ingotCobalt");
/* 189 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(CobaltSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), zivicioEssence, Character.valueOf('Y'), "ingotCobalt", Character.valueOf('Z'), minicioSeeds }));
/* 190 */       ItemStack modOre = OreCheck.getModOre("oreCobalt");
/* 191 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modOre.func_77973_b(), ConfigCrafting.outPutCobalt, modOre.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), CobaltEssence }));
/* 192 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(CobaltEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), CobaltSeeds }));
/* 193 */       OreDictionary.registerOre("zivicioMaterial", new ItemStack(CobaltEssence));
/*     */     } 
/*     */     
/* 196 */     if (ConfigDisable.COPPER && OreCheck.getModOre("oreCopper") != null && OreCheck.getModOre("ingotCopper") != null) {
/*     */       
/* 198 */       CopperEssence = (new CopperEssence()).func_77655_b("CopperEssence");
/* 199 */       CopperCrop = (new CopperCrop()).func_149663_c("CopperCrop");
/* 200 */       CopperSeeds = (new CopperSeeds(CopperCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("CopperSeeds");
/*     */       
/* 202 */       ItemRegisterHelper.registerItem(CopperEssence);
/* 203 */       BlockRegisterHelper.registerBlock(CopperCrop);
/* 204 */       ItemRegisterHelper.registerItem(CopperSeeds);
/*     */       
/* 206 */       ItemStack modIngot = OreCheck.getModOre("ingotCopper");
/* 207 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(CopperSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), crucioEssence, Character.valueOf('Y'), "ingotCopper", Character.valueOf('Z'), minicioSeeds }));
/* 208 */       ItemStack modOre = OreCheck.getModOre("oreCopper");
/* 209 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modOre.func_77973_b(), ConfigCrafting.outPutCopper, modOre.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), CopperEssence }));
/* 210 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(CopperEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), CopperSeeds }));
/* 211 */       OreDictionary.registerOre("crucioMaterial", new ItemStack(CopperEssence));
/*     */     } 
/*     */     
/* 214 */     if (ConfigDisable.CERTUSQUARTZ && OreCheck.getModOre("oreCertusQuartz") != null && OreCheck.getModOre("crystalCertusQuartz") != null) {
/*     */       
/* 216 */       CertusQuartzEssence = (new CertusQuartzEssence()).func_77655_b("CertusQuartzEssence");
/* 217 */       CertusQuartzCrop = (new CertusQuartzCrop()).func_149663_c("CertusQuartzCrop");
/* 218 */       CertusQuartzSeeds = (new CertusQuartzSeeds(CertusQuartzCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("CertusQuartzSeeds");
/*     */       
/* 220 */       ItemRegisterHelper.registerItem(CertusQuartzEssence);
/* 221 */       BlockRegisterHelper.registerBlock(CertusQuartzCrop);
/* 222 */       ItemRegisterHelper.registerItem(CertusQuartzSeeds);
/*     */       
/* 224 */       ItemStack modIngot = OreCheck.getModOre("crystalCertusQuartz");
/* 225 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(CertusQuartzSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), crucioEssence, Character.valueOf('Y'), "crystalCertusQuartz", Character.valueOf('Z'), minicioSeeds }));
/* 226 */       ItemStack modOre = OreCheck.getModOre("oreCertusQuartz");
/* 227 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modOre.func_77973_b(), ConfigCrafting.outPutCertusQuartz, modOre.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), CertusQuartzEssence }));
/* 228 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(CertusQuartzEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), CertusQuartzSeeds }));
/* 229 */       OreDictionary.registerOre("crucioMaterial", new ItemStack(CertusQuartzEssence));
/*     */     } 
/*     */     
/* 232 */     if (ConfigDisable.LEAD && OreCheck.getModOre("oreLead") != null && OreCheck.getModOre("ingotLead") != null) {
/*     */       
/* 234 */       LeadEssence = (new LeadEssence()).func_77655_b("LeadEssence");
/* 235 */       LeadCrop = (new LeadCrop()).func_149663_c("LeadCrop");
/* 236 */       LeadSeeds = (new LeadSeeds(LeadCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("LeadSeeds");
/*     */       
/* 238 */       ItemRegisterHelper.registerItem(LeadEssence);
/* 239 */       BlockRegisterHelper.registerBlock(LeadCrop);
/* 240 */       ItemRegisterHelper.registerItem(LeadSeeds);
/*     */       
/* 242 */       ItemStack modIngot = OreCheck.getModOre("ingotLead");
/* 243 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(LeadSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), crucioEssence, Character.valueOf('Y'), "ingotLead", Character.valueOf('Z'), minicioSeeds }));
/* 244 */       ItemStack modOre = OreCheck.getModOre("oreLead");
/* 245 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modOre.func_77973_b(), ConfigCrafting.outPutLead, modOre.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), LeadEssence }));
/* 246 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(LeadEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), LeadSeeds }));
/* 247 */       OreDictionary.registerOre("crucioMaterial", new ItemStack(LeadEssence));
/*     */     } 
/*     */     
/* 250 */     if (ConfigDisable.NICKEL && OreCheck.getModOre("oreNickel") != null && OreCheck.getModOre("ingotNickel") != null) {
/*     */       
/* 252 */       NickelEssence = (new NickelEssence()).func_77655_b("NickelEssence");
/* 253 */       NickelCrop = (new NickelCrop()).func_149663_c("NickelCrop");
/* 254 */       NickelSeeds = (new NickelSeeds(NickelCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("NickelSeeds");
/*     */       
/* 256 */       ItemRegisterHelper.registerItem(NickelEssence);
/* 257 */       BlockRegisterHelper.registerBlock(NickelCrop);
/* 258 */       ItemRegisterHelper.registerItem(NickelSeeds);
/*     */       
/* 260 */       ItemStack modIngot = OreCheck.getModOre("ingotNickel");
/* 261 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(NickelSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), "ingotNickel", Character.valueOf('Z'), minicioSeeds }));
/* 262 */       ItemStack modOre = OreCheck.getModOre("oreNickel");
/* 263 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modOre.func_77973_b(), ConfigCrafting.outPutNickel, modOre.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), NickelEssence }));
/* 264 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(NickelEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), NickelSeeds }));
/* 265 */       OreDictionary.registerOre("imperioMaterial", new ItemStack(NickelEssence));
/*     */     } 
/*     */     
/* 268 */     if (ConfigDisable.OSMIUM && OreCheck.getModOre("oreOsmium") != null && OreCheck.getModOre("ingotOsmium") != null) {
/*     */       
/* 270 */       OsmiumEssence = (new OsmiumEssence()).func_77655_b("OsmiumEssence");
/* 271 */       OsmiumCrop = (new OsmiumCrop()).func_149663_c("OsmiumCrop");
/* 272 */       OsmiumSeeds = (new OsmiumSeeds(OsmiumCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("OsmiumSeeds");
/*     */       
/* 274 */       ItemRegisterHelper.registerItem(OsmiumEssence);
/* 275 */       BlockRegisterHelper.registerBlock(OsmiumCrop);
/* 276 */       ItemRegisterHelper.registerItem(OsmiumSeeds);
/*     */       
/* 278 */       ItemStack modIngot = OreCheck.getModOre("ingotOsmium");
/* 279 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(OsmiumSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), "ingotOsmium", Character.valueOf('Z'), minicioSeeds }));
/* 280 */       ItemStack modOre = OreCheck.getModOre("oreOsmium");
/* 281 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modOre.func_77973_b(), ConfigCrafting.outPutOsmium, modOre.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), OsmiumEssence }));
/* 282 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(OsmiumEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), OsmiumSeeds }));
/* 283 */       OreDictionary.registerOre("imperioMaterial", new ItemStack(OsmiumEssence));
/*     */     } 
/*     */     
/* 286 */     if (ConfigDisable.PERIDOT && OreCheck.getModOre("gemPeridot") != null) {
/*     */       
/* 288 */       PeridotEssence = (new PeridotEssence()).func_77655_b("PeridotEssence");
/* 289 */       PeridotCrop = (new PeridotCrop()).func_149663_c("PeridotCrop");
/* 290 */       PeridotSeeds = (new PeridotSeeds(PeridotCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("PeridotSeeds");
/*     */       
/* 292 */       ItemRegisterHelper.registerItem(PeridotEssence);
/* 293 */       BlockRegisterHelper.registerBlock(PeridotCrop);
/* 294 */       ItemRegisterHelper.registerItem(PeridotSeeds);
/*     */       
/* 296 */       ItemStack modIngot = OreCheck.getModOre("gemPeridot");
/* 297 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(PeridotSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), "gemPeridot", Character.valueOf('Z'), minicioSeeds }));
/* 298 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.func_77973_b(), ConfigCrafting.outPutPeridot, modIngot.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), PeridotEssence }));
/* 299 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(PeridotEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), PeridotSeeds }));
/* 300 */       OreDictionary.registerOre("imperioMaterial", new ItemStack(PeridotEssence));
/*     */     } 
/*     */     
/* 303 */     if (ConfigDisable.RUBY && OreCheck.getModOre("gemRuby") != null) {
/*     */       
/* 305 */       RubyEssence = (new RubyEssence()).func_77655_b("RubyEssence");
/* 306 */       RubyCrop = (new RubyCrop()).func_149663_c("RubyCrop");
/* 307 */       RubySeeds = (new RubySeeds(RubyCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("RubySeeds");
/*     */       
/* 309 */       ItemRegisterHelper.registerItem(RubyEssence);
/* 310 */       BlockRegisterHelper.registerBlock(RubyCrop);
/* 311 */       ItemRegisterHelper.registerItem(RubySeeds);
/*     */       
/* 313 */       ItemStack modIngot = OreCheck.getModOre("gemRuby");
/* 314 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(RubySeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), "gemRuby", Character.valueOf('Z'), minicioSeeds }));
/* 315 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.func_77973_b(), ConfigCrafting.outPutRuby, modIngot.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), RubyEssence }));
/* 316 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(RubyEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), RubySeeds }));
/* 317 */       OreDictionary.registerOre("imperioMaterial", new ItemStack(RubyEssence));
/*     */     } 
/*     */     
/* 320 */     if (ConfigDisable.SAPPHIRE && OreCheck.getModOre("gemSapphire") != null) {
/*     */       
/* 322 */       SapphireEssence = (new SapphireEssence()).func_77655_b("SapphireEssence");
/* 323 */       SapphireCrop = (new SapphireCrop()).func_149663_c("SapphireCrop");
/* 324 */       SapphireSeeds = (new SapphireSeeds(SapphireCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("SapphireSeeds");
/*     */       
/* 326 */       ItemRegisterHelper.registerItem(SapphireEssence);
/* 327 */       BlockRegisterHelper.registerBlock(SapphireCrop);
/* 328 */       ItemRegisterHelper.registerItem(SapphireSeeds);
/*     */       
/* 330 */       ItemStack modIngot = OreCheck.getModOre("gemSapphire");
/* 331 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(SapphireSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), "gemSapphire", Character.valueOf('Z'), minicioSeeds }));
/* 332 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.func_77973_b(), ConfigCrafting.outPutSapphire, modIngot.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), SapphireEssence }));
/* 333 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(SapphireEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), SapphireSeeds }));
/* 334 */       OreDictionary.registerOre("imperioMaterial", new ItemStack(SapphireEssence));
/*     */     } 
/*     */     
/* 337 */     if (ConfigDisable.PLATINUM && OreCheck.getModOre("ingotPlatinum") != null) {
/*     */       
/* 339 */       PlatinumEssence = (new PlatinumEssence()).func_77655_b("PlatinumEssence");
/* 340 */       PlatinumCrop = (new PlatinumCrop()).func_149663_c("PlatinumCrop");
/* 341 */       PlatinumSeeds = (new PlatinumSeeds(PlatinumCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("PlatinumSeeds");
/*     */       
/* 343 */       ItemRegisterHelper.registerItem(PlatinumEssence);
/* 344 */       BlockRegisterHelper.registerBlock(PlatinumCrop);
/* 345 */       ItemRegisterHelper.registerItem(PlatinumSeeds);
/*     */       
/* 347 */       ItemStack modIngot = OreCheck.getModOre("ingotPlatinum");
/* 348 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(PlatinumSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), zivicioEssence, Character.valueOf('Y'), "ingotPlatinum", Character.valueOf('Z'), minicioSeeds }));
/* 349 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.func_77973_b(), ConfigCrafting.outPutPlatinum, modIngot.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), PlatinumEssence }));
/* 350 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(PlatinumEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), PlatinumSeeds }));
/* 351 */       OreDictionary.registerOre("zivicioMaterial", new ItemStack(PlatinumEssence));
/*     */     } 
/*     */     
/* 354 */     if (ConfigDisable.RUBBER && OreCheck.getModOre("itemRawRubber") != null) {
/*     */       
/* 356 */       RubberEssence = (new RubberEssence()).func_77655_b("RubberEssence");
/* 357 */       RubberCrop = (new RubberCrop()).func_149663_c("RubberCrop");
/* 358 */       RubberSeeds = (new RubberSeeds(RubberCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("RubberSeeds");
/*     */       
/* 360 */       ItemRegisterHelper.registerItem(RubberEssence);
/* 361 */       BlockRegisterHelper.registerBlock(RubberCrop);
/* 362 */       ItemRegisterHelper.registerItem(RubberSeeds);
/*     */       
/* 364 */       ItemStack modIngot = OreCheck.getModOre("itemRawRubber");
/* 365 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(RubberSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), accioEssence, Character.valueOf('Y'), "itemRawRubber", Character.valueOf('Z'), minicioSeeds }));
/* 366 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.func_77973_b(), ConfigCrafting.outPutRubber, modIngot.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), RubberEssence }));
/* 367 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(RubberEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), RubberSeeds }));
/* 368 */       OreDictionary.registerOre("accioMaterial", new ItemStack(RubberEssence));
/*     */     } 
/*     */     
/* 371 */     if (ConfigDisable.SILVER && OreCheck.getModOre("oreSilver") != null && OreCheck.getModOre("ingotSilver") != null) {
/*     */       
/* 373 */       SilverEssence = (new SilverEssence()).func_77655_b("SilverEssence");
/* 374 */       SilverCrop = (new SilverCrop()).func_149663_c("SilverCrop");
/* 375 */       SilverSeeds = (new SilverSeeds(SilverCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("SilverSeeds");
/*     */       
/* 377 */       ItemRegisterHelper.registerItem(SilverEssence);
/* 378 */       BlockRegisterHelper.registerBlock(SilverCrop);
/* 379 */       ItemRegisterHelper.registerItem(SilverSeeds);
/*     */       
/* 381 */       ItemStack modIngot = OreCheck.getModOre("ingotSilver");
/* 382 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(SilverSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), "ingotSilver", Character.valueOf('Z'), minicioSeeds }));
/* 383 */       ItemStack modOre = OreCheck.getModOre("oreSilver");
/* 384 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modOre.func_77973_b(), ConfigCrafting.outPutSilver, modOre.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), SilverEssence }));
/* 385 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(SilverEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), SilverSeeds }));
/* 386 */       OreDictionary.registerOre("imperioMaterial", new ItemStack(SilverEssence));
/*     */     } 
/*     */     
/* 389 */     if (ConfigDisable.TIN && OreCheck.getModOre("oreTin") != null && OreCheck.getModOre("ingotTin") != null) {
/*     */       
/* 391 */       TinEssence = (new TinEssence()).func_77655_b("TinEssence");
/* 392 */       TinCrop = (new TinCrop()).func_149663_c("TinCrop");
/* 393 */       TinSeeds = (new TinSeeds(TinCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("TinSeeds");
/*     */       
/* 395 */       ItemRegisterHelper.registerItem(TinEssence);
/* 396 */       BlockRegisterHelper.registerBlock(TinCrop);
/* 397 */       ItemRegisterHelper.registerItem(TinSeeds);
/*     */       
/* 399 */       ItemStack modIngot = OreCheck.getModOre("ingotTin");
/* 400 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(TinSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), crucioEssence, Character.valueOf('Y'), "ingotTin", Character.valueOf('Z'), minicioSeeds }));
/* 401 */       ItemStack modOre = OreCheck.getModOre("oreTin");
/* 402 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modOre.func_77973_b(), ConfigCrafting.outPutTin, modOre.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), TinEssence }));
/* 403 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(TinEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), TinSeeds }));
/* 404 */       OreDictionary.registerOre("crucioMaterial", new ItemStack(TinEssence));
/*     */     } 
/*     */     
/* 407 */     if (ConfigDisable.SULFUR && OreCheck.getModOre("dustSulfur") != null) {
/*     */       
/* 409 */       SulfurEssence = (new SulfurEssence()).func_77655_b("SulfurEssence");
/* 410 */       SulfurCrop = (new SulfurCrop()).func_149663_c("SulfurCrop");
/* 411 */       SulfurSeeds = (new SulfurSeeds(SulfurCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("SulfurSeeds");
/*     */       
/* 413 */       ItemRegisterHelper.registerItem(SulfurEssence);
/* 414 */       BlockRegisterHelper.registerBlock(SulfurCrop);
/* 415 */       ItemRegisterHelper.registerItem(SulfurSeeds);
/*     */       
/* 417 */       ItemStack modIngot = OreCheck.getModOre("dustSulfur");
/* 418 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(SulfurSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), crucioEssence, Character.valueOf('Y'), "dustSulfur", Character.valueOf('Z'), minicioSeeds }));
/* 419 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.func_77973_b(), ConfigCrafting.outPutSulfur, modIngot.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), SulfurEssence }));
/* 420 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(SulfurEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), SulfurSeeds }));
/* 421 */       OreDictionary.registerOre("crucioMaterial", new ItemStack(SulfurEssence));
/*     */     } 
/*     */     
/* 424 */     if (ConfigDisable.YELLORITE && OreCheck.getModOre("oreYellorite") != null && OreCheck.getModOre("ingotYellorium") != null) {
/*     */       
/* 426 */       YelloriteEssence = (new YelloriteEssence()).func_77655_b("YelloriteEssence");
/* 427 */       YelloriteCrop = (new YelloriteCrop()).func_149663_c("YelloriteCrop");
/* 428 */       YelloriteSeeds = (new YelloriteSeeds(YelloriteCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("YelloriteSeeds");
/*     */       
/* 430 */       ItemRegisterHelper.registerItem(YelloriteEssence);
/* 431 */       BlockRegisterHelper.registerBlock(YelloriteCrop);
/* 432 */       ItemRegisterHelper.registerItem(YelloriteSeeds);
/*     */       
/* 434 */       ItemStack modIngot = OreCheck.getModOre("ingotYellorium");
/* 435 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(YelloriteSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), "ingotYellorium", Character.valueOf('Z'), minicioSeeds }));
/* 436 */       ItemStack modOre = OreCheck.getModOre("oreYellorite");
/* 437 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modOre.func_77973_b(), ConfigCrafting.outPutYellorite, modOre.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), YelloriteEssence }));
/* 438 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(YelloriteEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), YelloriteSeeds }));
/* 439 */       OreDictionary.registerOre("imperioMaterial", new ItemStack(YelloriteEssence));
/*     */     } 
/*     */     
/* 442 */     if (ConfigDisable.ALUMITE && OreCheck.getModOre("ingotAlumite") != null) {
/*     */       
/* 444 */       AlumiteEssence = (new AlumiteEssence()).func_77655_b("AlumiteEssence");
/* 445 */       AlumiteCrop = (new AlumiteCrop()).func_149663_c("AlumiteCrop");
/* 446 */       AlumiteSeeds = (new AlumiteSeeds(AlumiteCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("AlumiteSeeds");
/*     */       
/* 448 */       ItemRegisterHelper.registerItem(AlumiteEssence);
/* 449 */       BlockRegisterHelper.registerBlock(AlumiteCrop);
/* 450 */       ItemRegisterHelper.registerItem(AlumiteSeeds);
/*     */       
/* 452 */       ItemStack modIngot = OreCheck.getModOre("ingotAlumite");
/* 453 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(AlumiteSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), "ingotAlumite", Character.valueOf('Z'), minicioSeeds }));
/* 454 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.func_77973_b(), ConfigCrafting.outPutAlumite, modIngot.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), AlumiteEssence }));
/* 455 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(AlumiteEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), AlumiteSeeds }));
/* 456 */       OreDictionary.registerOre("imperioMaterial", new ItemStack(AlumiteEssence));
/*     */     } 
/*     */     
/* 459 */     if (ConfigDisable.BLIZZ && OreCheck.getModOre("rodBlizz") != null) {
/*     */       
/* 461 */       BlizzEssence = (new BlizzEssence()).func_77655_b("BlizzEssence");
/* 462 */       BlizzCrop = (new BlizzCrop()).func_149663_c("BlizzCrop");
/* 463 */       BlizzSeeds = (new BlizzSeeds(BlizzCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("BlizzSeeds");
/*     */       
/* 465 */       ItemRegisterHelper.registerItem(BlizzEssence);
/* 466 */       BlockRegisterHelper.registerBlock(BlizzCrop);
/* 467 */       ItemRegisterHelper.registerItem(BlizzSeeds);
/*     */       
/* 469 */       ItemStack modIngot = OreCheck.getModOre("rodBlizz");
/* 470 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(BlizzSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), "rodBlizz", Character.valueOf('Z'), minicioSeeds }));
/* 471 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.func_77973_b(), ConfigCrafting.outPutBlizz, modIngot.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), BlizzEssence }));
/* 472 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(BlizzEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), BlizzSeeds }));
/* 473 */       OreDictionary.registerOre("imperioMaterial", new ItemStack(BlizzEssence));
/*     */     } 
/*     */     
/* 476 */     if (ConfigDisable.BRONZE && OreCheck.getModOre("ingotBronze") != null) {
/*     */       
/* 478 */       BronzeEssence = (new BronzeEssence()).func_77655_b("BronzeEssence");
/* 479 */       BronzeCrop = (new BronzeCrop()).func_149663_c("BronzeCrop");
/* 480 */       BronzeSeeds = (new BronzeSeeds(BronzeCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("BronzeSeeds");
/*     */       
/* 482 */       ItemRegisterHelper.registerItem(BronzeEssence);
/* 483 */       BlockRegisterHelper.registerBlock(BronzeCrop);
/* 484 */       ItemRegisterHelper.registerItem(BronzeSeeds);
/*     */       
/* 486 */       ItemStack modIngot = OreCheck.getModOre("ingotBronze");
/* 487 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(BronzeSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), crucioEssence, Character.valueOf('Y'), "ingotBronze", Character.valueOf('Z'), minicioSeeds }));
/* 488 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.func_77973_b(), ConfigCrafting.outPutBronze, modIngot.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), BronzeEssence }));
/* 489 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(BronzeEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), BronzeSeeds }));
/* 490 */       OreDictionary.registerOre("crucioMaterial", new ItemStack(BronzeEssence));
/*     */     } 
/*     */     
/* 493 */     if (ConfigDisable.ELECTRUM && OreCheck.getModOre("ingotElectrum") != null) {
/*     */       
/* 495 */       ElectrumEssence = (new ElectrumEssence()).func_77655_b("ElectrumEssence");
/* 496 */       ElectrumCrop = (new ElectrumCrop()).func_149663_c("ElectrumCrop");
/* 497 */       ElectrumSeeds = (new ElectrumSeeds(ElectrumCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("ElectrumSeeds");
/*     */       
/* 499 */       ItemRegisterHelper.registerItem(ElectrumEssence);
/* 500 */       BlockRegisterHelper.registerBlock(ElectrumCrop);
/* 501 */       ItemRegisterHelper.registerItem(ElectrumSeeds);
/*     */       
/* 503 */       ItemStack modIngot = OreCheck.getModOre("ingotElectrum");
/* 504 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ElectrumSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), "ingotElectrum", Character.valueOf('Z'), minicioSeeds }));
/* 505 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.func_77973_b(), ConfigCrafting.outPutElectrum, modIngot.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), ElectrumEssence }));
/* 506 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ElectrumEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), ElectrumSeeds }));
/* 507 */       OreDictionary.registerOre("imperioMaterial", new ItemStack(ElectrumEssence));
/*     */     } 
/*     */     
/* 510 */     if (ConfigDisable.ENDERIUM && OreCheck.getModOre("ingotEnderium") != null) {
/*     */       
/* 512 */       EnderiumEssence = (new EnderiumEssence()).func_77655_b("EnderiumEssence");
/* 513 */       EnderiumCrop = (new EnderiumCrop()).func_149663_c("EnderiumCrop");
/* 514 */       EnderiumSeeds = (new EnderiumSeeds(EnderiumCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("EnderiumSeeds");
/*     */       
/* 516 */       ItemRegisterHelper.registerItem(EnderiumEssence);
/* 517 */       BlockRegisterHelper.registerBlock(EnderiumCrop);
/* 518 */       ItemRegisterHelper.registerItem(EnderiumSeeds);
/*     */       
/* 520 */       ItemStack modIngot = OreCheck.getModOre("ingotEnderium");
/* 521 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(EnderiumSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), zivicioEssence, Character.valueOf('Y'), "ingotEnderium", Character.valueOf('Z'), minicioSeeds }));
/* 522 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.func_77973_b(), ConfigCrafting.outPutEnderium, modIngot.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), EnderiumEssence }));
/* 523 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(EnderiumEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), EnderiumSeeds }));
/* 524 */       OreDictionary.registerOre("zivicioMaterial", new ItemStack(EnderiumEssence));
/*     */     } 
/*     */     
/* 527 */     if (ConfigDisable.FLUIX && OreCheck.getModOre("crystalFluix") != null) {
/*     */       
/* 529 */       FluixEssence = (new FluixEssence()).func_77655_b("FluixEssence");
/* 530 */       FluixCrop = (new FluixCrop()).func_149663_c("FluixCrop");
/* 531 */       FluixSeeds = (new FluixSeeds(FluixCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("FluixSeeds");
/*     */       
/* 533 */       ItemRegisterHelper.registerItem(FluixEssence);
/* 534 */       BlockRegisterHelper.registerBlock(FluixCrop);
/* 535 */       ItemRegisterHelper.registerItem(FluixSeeds);
/*     */       
/* 537 */       ItemStack modIngot = OreCheck.getModOre("crystalFluix");
/* 538 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(FluixSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), "crystalFluix", Character.valueOf('Z'), minicioSeeds }));
/* 539 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.func_77973_b(), ConfigCrafting.outPutFluix, modIngot.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), FluixEssence }));
/* 540 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(FluixEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), FluixSeeds }));
/* 541 */       OreDictionary.registerOre("imperioMaterial", new ItemStack(FluixEssence));
/*     */     } 
/*     */     
/* 544 */     if (ConfigDisable.INVAR && OreCheck.getModOre("ingotInvar") != null) {
/*     */       
/* 546 */       InvarEssence = (new InvarEssence()).func_77655_b("InvarEssence");
/* 547 */       InvarCrop = (new InvarCrop()).func_149663_c("InvarCrop");
/* 548 */       InvarSeeds = (new InvarSeeds(InvarCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("InvarSeeds");
/*     */       
/* 550 */       ItemRegisterHelper.registerItem(InvarEssence);
/* 551 */       BlockRegisterHelper.registerBlock(InvarCrop);
/* 552 */       ItemRegisterHelper.registerItem(InvarSeeds);
/*     */       
/* 554 */       ItemStack modIngot = OreCheck.getModOre("ingotInvar");
/* 555 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(InvarSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), "ingotInvar", Character.valueOf('Z'), minicioSeeds }));
/* 556 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.func_77973_b(), ConfigCrafting.outPutInvar, modIngot.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), InvarEssence }));
/* 557 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(InvarEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), InvarSeeds }));
/* 558 */       OreDictionary.registerOre("imperioMaterial", new ItemStack(InvarEssence));
/*     */     } 
/*     */     
/* 561 */     if (ConfigDisable.LUMIUM && OreCheck.getModOre("ingotLumium") != null) {
/*     */       
/* 563 */       LumiumEssence = (new LumiumEssence()).func_77655_b("LumiumEssence");
/* 564 */       LumiumCrop = (new LumiumCrop()).func_149663_c("LumiumCrop");
/* 565 */       LumiumSeeds = (new LumiumSeeds(LumiumCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("LumiumSeeds");
/*     */       
/* 567 */       ItemRegisterHelper.registerItem(LumiumEssence);
/* 568 */       BlockRegisterHelper.registerBlock(LumiumCrop);
/* 569 */       ItemRegisterHelper.registerItem(LumiumSeeds);
/*     */       
/* 571 */       ItemStack modIngot = OreCheck.getModOre("ingotLumium");
/* 572 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(LumiumSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), "ingotLumium", Character.valueOf('Z'), minicioSeeds }));
/* 573 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.func_77973_b(), ConfigCrafting.outPutLumium, modIngot.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), LumiumEssence }));
/* 574 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(LumiumEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), LumiumSeeds }));
/* 575 */       OreDictionary.registerOre("imperioMaterial", new ItemStack(LumiumEssence));
/*     */     } 
/*     */     
/* 578 */     if (ConfigDisable.MANASTEEL && OreCheck.getModOre("ingotManasteel") != null) {
/*     */       
/* 580 */       ManasteelEssence = (new ManasteelEssence()).func_77655_b("ManasteelEssence");
/* 581 */       ManasteelCrop = (new ManasteelCrop()).func_149663_c("ManasteelCrop");
/* 582 */       ManasteelSeeds = (new ManasteelSeeds(ManasteelCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("ManasteelSeeds");
/*     */       
/* 584 */       ItemRegisterHelper.registerItem(ManasteelEssence);
/* 585 */       BlockRegisterHelper.registerBlock(ManasteelCrop);
/* 586 */       ItemRegisterHelper.registerItem(ManasteelSeeds);
/*     */       
/* 588 */       ItemStack modIngot = OreCheck.getModOre("ingotManasteel");
/* 589 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ManasteelSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), crucioEssence, Character.valueOf('Y'), "ingotManasteel", Character.valueOf('Z'), minicioSeeds }));
/* 590 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.func_77973_b(), ConfigCrafting.outPutManasteel, modIngot.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), ManasteelEssence }));
/* 591 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ManasteelEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), ManasteelSeeds }));
/* 592 */       OreDictionary.registerOre("crucioMaterial", new ItemStack(ManasteelEssence));
/*     */     } 
/*     */     
/* 595 */     if (ConfigDisable.MANYULLYN && OreCheck.getModOre("ingotManyullyn") != null) {
/*     */       
/* 597 */       ManyullynEssence = (new ManyullynEssence()).func_77655_b("ManyullynEssence");
/* 598 */       ManyullynCrop = (new ManyullynCrop()).func_149663_c("ManyullynCrop");
/* 599 */       ManyullynSeeds = (new ManyullynSeeds(ManyullynCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("ManyullynSeeds");
/*     */       
/* 601 */       ItemRegisterHelper.registerItem(ManyullynEssence);
/* 602 */       BlockRegisterHelper.registerBlock(ManyullynCrop);
/* 603 */       ItemRegisterHelper.registerItem(ManyullynSeeds);
/*     */       
/* 605 */       ItemStack modIngot = OreCheck.getModOre("ingotManyullyn");
/* 606 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ManyullynSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), zivicioEssence, Character.valueOf('Y'), "ingotManyullyn", Character.valueOf('Z'), minicioSeeds }));
/* 607 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.func_77973_b(), ConfigCrafting.outPutManyullyn, modIngot.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), ManyullynEssence }));
/* 608 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ManyullynEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), ManyullynSeeds }));
/* 609 */       OreDictionary.registerOre("zivicioMaterial", new ItemStack(ManyullynEssence));
/*     */     } 
/*     */     
/* 612 */     if (ConfigDisable.SALTPETER && OreCheck.getModOre("dustSaltpeter") != null) {
/*     */       
/* 614 */       SaltpeterEssence = (new SaltpeterEssence()).func_77655_b("SaltpeterEssence");
/* 615 */       SaltpeterCrop = (new SaltpeterCrop()).func_149663_c("SaltpeterCrop");
/* 616 */       SaltpeterSeeds = (new SaltpeterSeeds(SaltpeterCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("SaltpeterSeeds");
/*     */       
/* 618 */       ItemRegisterHelper.registerItem(SaltpeterEssence);
/* 619 */       BlockRegisterHelper.registerBlock(SaltpeterCrop);
/* 620 */       ItemRegisterHelper.registerItem(SaltpeterSeeds);
/*     */       
/* 622 */       ItemStack modIngot = OreCheck.getModOre("dustSaltpeter");
/* 623 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(SaltpeterSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), crucioEssence, Character.valueOf('Y'), "dustSaltpeter", Character.valueOf('Z'), minicioSeeds }));
/* 624 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.func_77973_b(), ConfigCrafting.outPutSaltpeter, modIngot.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), SaltpeterEssence }));
/* 625 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(SaltpeterEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), SaltpeterSeeds }));
/* 626 */       OreDictionary.registerOre("crucioMaterial", new ItemStack(SaltpeterEssence));
/*     */     } 
/*     */     
/* 629 */     if (ConfigDisable.SIGNALUM && OreCheck.getModOre("ingotSignalum") != null) {
/*     */       
/* 631 */       SignalumEssence = (new SignalumEssence()).func_77655_b("SignalumEssence");
/* 632 */       SignalumCrop = (new SignalumCrop()).func_149663_c("SignalumCrop");
/* 633 */       SignalumSeeds = (new SignalumSeeds(SignalumCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("SignalumSeeds");
/*     */       
/* 635 */       ItemRegisterHelper.registerItem(SignalumEssence);
/* 636 */       BlockRegisterHelper.registerBlock(SignalumCrop);
/* 637 */       ItemRegisterHelper.registerItem(SignalumSeeds);
/*     */       
/* 639 */       ItemStack modIngot = OreCheck.getModOre("ingotSignalum");
/* 640 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(SignalumSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), "ingotSignalum", Character.valueOf('Z'), minicioSeeds }));
/* 641 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.func_77973_b(), ConfigCrafting.outPutSignalum, modIngot.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), SignalumEssence }));
/* 642 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(SignalumEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), SignalumSeeds }));
/* 643 */       OreDictionary.registerOre("imperioMaterial", new ItemStack(SignalumEssence));
/*     */     } 
/*     */     
/* 646 */     if (ConfigDisable.STEEL && OreCheck.getModOre("ingotSteel") != null) {
/*     */       
/* 648 */       SteelEssence = (new SteelEssence()).func_77655_b("SteelEssence");
/* 649 */       SteelCrop = (new SteelCrop()).func_149663_c("SteelCrop");
/* 650 */       SteelSeeds = (new SteelSeeds(SteelCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("SteelSeeds");
/*     */       
/* 652 */       ItemRegisterHelper.registerItem(SteelEssence);
/* 653 */       BlockRegisterHelper.registerBlock(SteelCrop);
/* 654 */       ItemRegisterHelper.registerItem(SteelSeeds);
/*     */       
/* 656 */       ItemStack modIngot = OreCheck.getModOre("ingotSteel");
/* 657 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(SteelSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), "ingotSteel", Character.valueOf('Z'), minicioSeeds }));
/* 658 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.func_77973_b(), ConfigCrafting.outPutSteel, modIngot.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), SteelEssence }));
/* 659 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(SteelEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), SteelSeeds }));
/* 660 */       OreDictionary.registerOre("imperioMaterial", new ItemStack(SteelEssence));
/*     */     } 
/*     */     
/* 663 */     if (ConfigDisable.TERRASTEEL && OreCheck.getModOre("ingotTerrasteel") != null) {
/*     */       
/* 665 */       TerrasteelEssence = (new TerrasteelEssence()).func_77655_b("TerrasteelEssence");
/* 666 */       TerrasteelCrop = (new TerrasteelCrop()).func_149663_c("TerrasteelCrop");
/* 667 */       TerrasteelSeeds = (new TerrasteelSeeds(TerrasteelCrop, farmland)).func_111206_d("magicalcrops:seeds_blank").func_77655_b("TerrasteelSeeds");
/*     */       
/* 669 */       ItemRegisterHelper.registerItem(TerrasteelEssence);
/* 670 */       BlockRegisterHelper.registerBlock(TerrasteelCrop);
/* 671 */       ItemRegisterHelper.registerItem(TerrasteelSeeds);
/*     */       
/* 673 */       ItemStack modIngot = OreCheck.getModOre("ingotTerrasteel");
/* 674 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(TerrasteelSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), zivicioEssence, Character.valueOf('Y'), "ingotTerrasteel", Character.valueOf('Z'), minicioSeeds }));
/* 675 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.func_77973_b(), ConfigCrafting.outPutTerrasteel, modIngot.func_77960_j()), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), TerrasteelEssence }));
/* 676 */       GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(TerrasteelEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), TerrasteelSeeds }));
/* 677 */       OreDictionary.registerOre("zivicioMaterial", new ItemStack(TerrasteelEssence));
/*     */     } 
/*     */   }
/*     */   
/*     */   public static Item PlatinumEssence;
/*     */   public static Item RubberEssence;
/*     */   public static Item SilverEssence;
/*     */   public static Item TinEssence;
/*     */   public static Item SulfurEssence;
/*     */   public static Item YelloriteEssence;
/*     */   public static Item AlumiteEssence;
/*     */   public static Item BlizzEssence;
/*     */   public static Item BronzeEssence;
/*     */   public static Item ElectrumEssence;
/*     */   public static Item EnderiumEssence;
/*     */   public static Item FluixEssence;
/*     */   public static Item InvarEssence;
/*     */   public static Item LumiumEssence;
/*     */   public static Item ManasteelEssence;
/*     */   public static Item ManyullynEssence;
/*     */   public static Item SaltpeterEssence;
/*     */   public static Item SignalumEssence;
/*     */   public static Item SteelEssence;
/*     */   public static Item TerrasteelEssence;
/*     */   public static Block AluminiumCrop;
/*     */   public static Block ArditeCrop;
/*     */   public static Block CobaltCrop;
/*     */   public static Block CopperCrop;
/*     */   public static Block CertusQuartzCrop;
/*     */   public static Block LeadCrop;
/*     */   public static Block NickelCrop;
/*     */   public static Block OsmiumCrop;
/*     */   public static Block PeridotCrop;
/*     */   public static Block RubyCrop;
/*     */   public static Block SapphireCrop;
/*     */   public static Block PlatinumCrop;
/*     */   public static Block RubberCrop;
/*     */   public static Block SilverCrop;
/*     */   public static Block TinCrop;
/*     */   public static Block SulfurCrop;
/*     */   public static Block YelloriteCrop;
/*     */   public static Block AlumiteCrop;
/*     */   public static Block BlizzCrop;
/*     */   public static Block BronzeCrop;
/*     */   public static Block ElectrumCrop;
/*     */   public static Block EnderiumCrop;
/*     */   public static Block FluixCrop;
/*     */   public static Block InvarCrop;
/*     */   public static Block LumiumCrop;
/*     */   public static Block ManasteelCrop;
/*     */   public static Block ManyullynCrop;
/*     */   public static Block SaltpeterCrop;
/*     */   public static Block SignalumCrop;
/*     */   public static Block SteelCrop;
/*     */   public static Block TerrasteelCrop;
/*     */   public static Item AluminiumSeeds;
/*     */   public static Item ArditeSeeds;
/*     */   public static Item CobaltSeeds;
/*     */   public static Item CopperSeeds;
/*     */   public static Item CertusQuartzSeeds;
/*     */   public static Item LeadSeeds;
/*     */   public static Item NickelSeeds;
/*     */   public static Item OsmiumSeeds;
/*     */   public static Item PeridotSeeds;
/*     */   public static Item RubySeeds;
/*     */   public static Item SapphireSeeds;
/*     */   public static Item PlatinumSeeds;
/*     */   public static Item RubberSeeds;
/*     */   public static Item SilverSeeds;
/*     */   public static Item TinSeeds;
/*     */   public static Item SulfurSeeds;
/*     */   public static Item YelloriteSeeds;
/*     */   public static Item AlumiteSeeds;
/*     */   public static Item BlizzSeeds;
/*     */   public static Item BronzeSeeds;
/*     */   public static Item ElectrumSeeds;
/*     */   public static Item EnderiumSeeds;
/*     */   public static Item FluixSeeds;
/*     */   public static Item InvarSeeds;
/*     */   public static Item LumiumSeeds;
/*     */   public static Item ManasteelSeeds;
/*     */   public static Item ManyullynSeeds;
/*     */   public static Item SaltpeterSeeds;
/*     */   public static Item SignalumSeeds;
/*     */   public static Item SteelSeeds;
/*     */   public static Item TerrasteelSeeds;
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\handlers\ModCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
