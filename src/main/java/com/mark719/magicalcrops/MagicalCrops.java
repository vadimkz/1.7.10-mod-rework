package com.mark719.magicalcrops;

import com.mark719.magicalcrops.config.ConfigCrafting;
import com.mark719.magicalcrops.config.ConfigDisable;
import com.mark719.magicalcrops.config.ConfigMain;
import com.mark719.magicalcrops.events.CropPlantOnBreak;
import com.mark719.magicalcrops.events.FireProtectionEvent;
import com.mark719.magicalcrops.events.MinicioCropBreak;
import com.mark719.magicalcrops.events.MinicioOreBreak;
import com.mark719.magicalcrops.events.MobDropEvent;
import com.mark719.magicalcrops.handlers.MBlocks;
import com.mark719.magicalcrops.handlers.MCrops;
import com.mark719.magicalcrops.handlers.MSeeds;
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
import cpw.mods.fml.common.registry.GameRegistry;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;

@Mod(
        modid = "magicalcrops",
        name = "Magical Crops",
        version = "4.0.0_PUBLIC_BETA_3",
        dependencies = "after:appliedenergistics2;after:Mekanism"
)
public class MagicalCrops {

    @Instance("magicalcrops")
    public static MagicalCrops instance;

    public static CreativeTabs tabMagical = new tabMagical(CreativeTabs.getNextID(), "magicalcrops");

    public static File CONFIG_DIR;

    @SidedProxy(
            clientSide = "com.mark719.magicalcrops.ClientProxy",
            serverSide = "com.mark719.magicalcrops.CommonProxy"
    )
    public static CommonProxy serverProxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        CONFIG_DIR = new File(event.getModConfigurationDirectory(), "MagicalCrops");
        if (!CONFIG_DIR.exists()) {
            //noinspection ResultOfMethodCallIgnored
            CONFIG_DIR.mkdirs();
        }

        ConfigMain.init(new File(CONFIG_DIR, "MagicalCropsMain.cfg"));
        ConfigCrafting.init(new File(CONFIG_DIR, "Crafting.cfg"));
        ConfigDisable.init(new File(CONFIG_DIR, "CropDisableConfig.cfg"));

        // В этой сборке блоки создаются отдельно, иначе BlockRegister может получать null.
        MBlocks.init();
        MCrops.init();
        MSeeds.init();

        serverProxy.registerTileEntities();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        // 1) Регистрируем предметы/блоки
        ItemRegister.registerItem();
        BlockRegister.registerBlock();

        // 2) Совместимости
        ModCompat.loadCompat();

        // 3) OreDictionary
        OreDictionaryRegister.oreRegister();

        // 4) Рецепты
        ItemRecipes.loadRecipes();
        BlockRecipes.loadRecipes();
        SeedRecipes.loadRecipes();
        ResourceRecipes.loadRecipes();
        if (ConfigMain.ENCHANT_CRAFT) {
            EnchantmentRecipes.loadRecipes();
        }

        // 5) Генерация мира
        GameRegistry.registerWorldGenerator((IWorldGenerator) new WorldGenEssence(), 0);
        GameRegistry.registerWorldGenerator((IWorldGenerator) new WorldGenEssenceNether(), 0);
        GameRegistry.registerWorldGenerator((IWorldGenerator) new WorldGenEssenceEnd(), 0);

        // 6) Ивенты
        // Включаем сбор урожая по ПКМ (наш фикс).
        MinecraftForge.EVENT_BUS.register(new CropPlantOnBreak());

        if (ConfigMain.EXTRA_PICKAXE) {
            MinecraftForge.EVENT_BUS.register(new MinicioOreBreak());
        }
        if (ConfigMain.EXTRA_HOE) {
            MinecraftForge.EVENT_BUS.register(new MinicioCropBreak());
        }
        if (ConfigMain.MOB_ESS_DROP) {
            MinecraftForge.EVENT_BUS.register(new MobDropEvent());
        }
        MinecraftForge.EVENT_BUS.register(new FireProtectionEvent());

        // 7) Сети/пакеты
        serverProxy.registerNetworkStuff();
    }
}
