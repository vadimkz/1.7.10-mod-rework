package com.mark719.magicalcrops.worldgen;

import com.mark719.magicalcrops.config.ConfigMain;
import com.mark719.magicalcrops.handlers.MBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

/**
 * Исправленный класс генерации руды для Magical Crops.
 * Все "field_..." и "func_..." заменены на читаемые названия Forge.
 */
public class WorldGenEssence implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        // world.provider.dimensionId вместо обфусцированных полей
        switch (world.provider.dimensionId) {
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
                break;
        }
    }

    private void generateSurface(World world, Random random, int i, int j) {
        if (ConfigMain.essOreOverworld) {
            // В оригинале было 25 попыток на чанк
            for (int k = 0; k < 25; k++) {
                int posX = i + random.nextInt(16);
                int posY = random.nextInt(ConfigMain.oreGenerateYCord);
                int posZ = j + random.nextInt(16);

                // .generate(...) вместо .func_76484_a(...)
                new WorldGenMinable(MBlocks.MinicioOre, ConfigMain.maxVeinSize).generate(world, random, posX, posY, posZ);
            }
        }
    }

    // В оригинале эти методы пустые, оставляем их для совместимости
    private void generateEnd(World world, Random random, int i, int j) {
        // Если захотите добавить генерацию в Энде, пишите сюда по аналогии с Overworld
    }

    private void generateNether(World world, Random random, int i, int j) {
        // Если захотите добавить генерацию в Незере, пишите сюда
    }
}