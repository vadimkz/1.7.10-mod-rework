package com.mark719.magicalcrops;

import com.mark719.magicalcrops.compat.mfr.MFRCompat;
import com.mark719.magicalcrops.config.ConfigCrafting;
import com.mark719.magicalcrops.config.ConfigDisable;
import com.mark719.magicalcrops.config.ConfigMain;
import com.mark719.magicalcrops.events.CropPlantOnBreak;
import com.mark719.magicalcrops.events.FireProtectionEvent;
import com.mark719.magicalcrops.events.MinicioCropBreak;
import com.mark719.magicalcrops.events.MinicioOreBreak;
import com.mark719.magicalcrops.events.MobDropEvent;
import com.mark719.magicalcrops.handlers.ModCompat;
import com.mark719.magicalcrops.recipes.BlockRecipes;
import com.mark719.magicalcrops.recipes.EnchantmentRecipes;
import com.mark719.magicalcrops.recipes.ItemRecipes;
import com.mark719.magicalcrops.recipes.ResourceRecipes;
import com.mark719.magicalcrops.recipes.SeedRecipes;
import com.mark719.magicalcrops.register.BlockRegister;
import com.mark719.magicalcrops.register.ItemRegister;
import com.mark719.magicalcrops.register.OreDictionaryRegister;
import com.mark719.magicalcrops.worldgen.WorldGenEssence;
import com.mark719.magicalcrops.worldgen.WorldGenEssenceEnd;
import com.mark719.magicalcrops.worldgen.WorldGenEssenceNether;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import java.io.File;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = "magicalcrops", name = "Magical Crops", version = "4.0.0_PUBLIC_BETA_3", dependencies = "after:appliedenergistics2;after:Mekanism")
public class MagicalCrops {
  @Instance("magicalcrops")
  public static MagicalCrops instance;
  
  public static File CONFIG_DIR;
  
  @SidedProxy(clientSide = "com.mark719.magicalcrops.ClientProxy", serverSide = "com.mark719.magicalcrops.CommonProxy")
  public static CommonProxy serverProxy;
  
  public static CreativeTabs tabMagical = new tabMagical(CreativeTabs.getNextID(), "magicalcrops");
  
  @EventHandler
  public static void preInit(FMLPreInitializationEvent event) {
    CONFIG_DIR = new File(event.getModConfigurationDirectory(), "MagicalCrops");
    if (!CONFIG_DIR.exists())
      CONFIG_DIR.mkdirs(); 
    ConfigMain.init(new File(CONFIG_DIR, "MagicalCropsMain.cfg"));
    ConfigCrafting.init(new File(CONFIG_DIR, "Crafting.cfg"));
    ConfigDisable.init(new File(CONFIG_DIR, "CropDisableConfig.cfg"));
    serverProxy.registerTileEntities();
  }
  
  @EventHandler
  public void init(FMLInitializationEvent event) {
    ItemRegister.registerItem();
    BlockRegister.registerBlock();
    ModCompat.loadCompat();
    OreDictionaryRegister.oreRegister();
    ItemRecipes.loadRecipes();
    BlockRecipes.loadRecipes();
    SeedRecipes.loadRecipes();
    ResourceRecipes.loadRecipes();

    if (ConfigMain.ENCHANT_CRAFT)
      EnchantmentRecipes.loadRecipes(); 
    GameRegistry.registerWorldGenerator((IWorldGenerator)new WorldGenEssence(), 0);
    GameRegistry.registerWorldGenerator((IWorldGenerator)new WorldGenEssenceNether(), 0);
    GameRegistry.registerWorldGenerator((IWorldGenerator)new WorldGenEssenceEnd(), 0);
    if (ConfigMain.PLANT_ON_BREAK)
      MinecraftForge.EVENT_BUS.register(new CropPlantOnBreak()); 
    if (ConfigMain.EXTRA_PICKAXE)
      MinecraftForge.EVENT_BUS.register(new MinicioOreBreak()); 
    if (ConfigMain.EXTRA_HOE)
      MinecraftForge.EVENT_BUS.register(new MinicioCropBreak()); 
    if (ConfigMain.MOB_ESS_DROP)
      MinecraftForge.EVENT_BUS.register(new MobDropEvent()); 
    MinecraftForge.EVENT_BUS.register(new FireProtectionEvent());
    serverProxy.registerNetworkStuff();
  }
  @EventHandler
  public void postInit(FMLPostInitializationEvent event) {
    MFRCompat.registerAll();
  }
}
