/*    */ package com.mark719.magicalcrops;
/*    */ 
/*    */ import com.mark719.magicalcrops.config.ConfigCrafting;
/*    */ import com.mark719.magicalcrops.config.ConfigDisable;
/*    */ import com.mark719.magicalcrops.config.ConfigMain;
/*    */ import com.mark719.magicalcrops.events.CropPlantOnBreak;
/*    */ import com.mark719.magicalcrops.events.FireProtectionEvent;
/*    */ import com.mark719.magicalcrops.events.MinicioCropBreak;
/*    */ import com.mark719.magicalcrops.events.MinicioOreBreak;
/*    */ import com.mark719.magicalcrops.events.MobDropEvent;
/*    */ import com.mark719.magicalcrops.handlers.ModCompat;
/*    */ import com.mark719.magicalcrops.recipes.BlockRecipes;
/*    */ import com.mark719.magicalcrops.recipes.EnchantmentRecipes;
/*    */ import com.mark719.magicalcrops.recipes.ItemRecipes;
/*    */ import com.mark719.magicalcrops.recipes.ResourceRecipes;
/*    */ import com.mark719.magicalcrops.recipes.SeedRecipes;
/*    */ import com.mark719.magicalcrops.register.BlockRegister;
/*    */ import com.mark719.magicalcrops.register.ItemRegister;
/*    */ import com.mark719.magicalcrops.register.OreDictionaryRegister;
/*    */ import com.mark719.magicalcrops.worldgen.WorldGenEssence;
/*    */ import com.mark719.magicalcrops.worldgen.WorldGenEssenceEnd;
/*    */ import com.mark719.magicalcrops.worldgen.WorldGenEssenceNether;
/*    */ import cpw.mods.fml.common.IWorldGenerator;
/*    */ import cpw.mods.fml.common.Mod;
/*    */ import cpw.mods.fml.common.Mod.EventHandler;
/*    */ import cpw.mods.fml.common.Mod.Instance;
/*    */ import cpw.mods.fml.common.SidedProxy;
/*    */ import cpw.mods.fml.common.event.FMLInitializationEvent;
/*    */ import cpw.mods.fml.common.event.FMLPreInitializationEvent;
/*    */ import cpw.mods.fml.common.registry.GameRegistry;
/*    */ import java.io.File;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ 
/*    */ 
/*    */ @Mod(modid = "magicalcrops", name = "Magical Crops", version = "4.0.0_PUBLIC_BETA_3", dependencies = "after:appliedenergistics2;after:Mekanism")
/*    */ public class MagicalCrops
/*    */ {
/*    */   @Instance("magicalcrops")
/*    */   public static MagicalCrops instance;
/* 41 */   public static CreativeTabs tabMagical = new tabMagical(CreativeTabs.getNextID(), "magicalcrops"); public static File CONFIG_DIR; @SidedProxy(clientSide = "com.mark719.magicalcrops.ClientProxy", serverSide = "com.mark719.magicalcrops.CommonProxy")
/*    */   public static CommonProxy serverProxy;
/*    */   @EventHandler
/*    */   public static void preInit(FMLPreInitializationEvent event) {
/* 45 */     CONFIG_DIR = new File(event.getModConfigurationDirectory(), "MagicalCrops");
/* 46 */     if (!CONFIG_DIR.exists()) CONFIG_DIR.mkdirs(); 
/* 47 */     ConfigMain.init(new File(CONFIG_DIR, "MagicalCropsMain.cfg"));
/* 48 */     ConfigCrafting.init(new File(CONFIG_DIR, "Crafting.cfg"));
/* 49 */     ConfigDisable.init(new File(CONFIG_DIR, "CropDisableConfig.cfg"));
/* 50 */     serverProxy.registerTileEntities();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @EventHandler
/*    */   public void init(FMLInitializationEvent event) {
/* 57 */     ItemRegister.registerItem();
/* 58 */     BlockRegister.registerBlock();
/* 59 */     ModCompat.loadCompat();
/*    */ 
/*    */     
/* 62 */     OreDictionaryRegister.oreRegister();
/*    */ 
/*    */     
/* 65 */     ItemRecipes.loadRecipes();
/* 66 */     BlockRecipes.loadRecipes();
/* 67 */     SeedRecipes.loadRecipes();
/* 68 */     ResourceRecipes.loadRecipes();
/* 69 */     if (ConfigMain.ENCHANT_CRAFT) EnchantmentRecipes.loadRecipes();
/*    */ 
/*    */     
/* 72 */     GameRegistry.registerWorldGenerator((IWorldGenerator)new WorldGenEssence(), 0);
/* 73 */     GameRegistry.registerWorldGenerator((IWorldGenerator)new WorldGenEssenceNether(), 0);
/* 74 */     GameRegistry.registerWorldGenerator((IWorldGenerator)new WorldGenEssenceEnd(), 0);
/*    */ 
/*    */     
/* 77 */    // if (ConfigMain.PLANT_ON_BREAK) MinecraftForge.EVENT_BUS.register(new CropPlantOnBreak());
/* 78 */     if (ConfigMain.EXTRA_PICKAXE) MinecraftForge.EVENT_BUS.register(new MinicioOreBreak()); 
/* 79 */     if (ConfigMain.EXTRA_HOE) MinecraftForge.EVENT_BUS.register(new MinicioCropBreak()); 
/* 80 */     if (ConfigMain.MOB_ESS_DROP) MinecraftForge.EVENT_BUS.register(new MobDropEvent()); 
/* 81 */     MinecraftForge.EVENT_BUS.register(new FireProtectionEvent());
/*    */ 
/*    */     
/* 84 */     serverProxy.registerNetworkStuff();
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\MagicalCrops.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
