package com.mark719.magicalcrops.seedbags;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Класс, отвечающий за логику постепенной посадки семян в области (Vein Planting).
 * Работает через серверные тики, чтобы не вызывать лагов при посадке больших полей.
 */
public class VeinPlanterInstance {
    private ConcurrentLinkedQueue<Point> plantQueue;
    private World world;
    private ForgeDirection direction;
    private boolean finished;
    private Planter usedPlanter;
    private SeedInventory inventory;
    private EntityPlayer player;
    private Point initialBlock;

    public VeinPlanterInstance(EntityPlayer player, IInventory inventory, Planter usedPlanter, World world, int x, int y, int z, ForgeDirection direction) {
        this.plantQueue = new ConcurrentLinkedQueue<Point>();
        this.world = world;
        this.direction = direction;
        this.finished = false;
        this.usedPlanter = usedPlanter;

        if (inventory instanceof SeedInventory) {
            this.inventory = (SeedInventory) inventory;
        }

        this.player = player;
        this.initialBlock = new Point(x, y, z);

        // Регистрация в шине событий FML для обработки тиков
        FMLCommonHandler.instance().bus().register(this);
    }

    @SubscribeEvent
    public void ticker(TickEvent.ServerTickEvent event) {
        // Выполняем посадку в конце серверного тика
        if (event.phase == TickEvent.Phase.END) {
            plantScheduled();
        }
    }

    /**
     * Анализирует область вокруг точки и добавляет подходящие блоки в очередь на посадку.
     */
    public synchronized void plantField(int x, int y, int z) {
        if (this.world == null || this.usedPlanter == null || this.inventory == null) {
            this.finished = true;
        }

        if (this.finished) {
            return;
        }

        byte radius = 1;
        for (int dx = -radius; dx <= radius; dx++) {
            for (int dy = -radius; dy <= radius; dy++) {
                for (int dz = -radius; dz <= radius; dz++) {
                    // Пропускаем центральный блок, так как он уже обработан
                    if (dx != 0 || dz != 0) {
                        Point blockPos = new Point(x + dx, y + dy, z + dz);
                        int maxRange = 75; // Максимальное расстояние от начальной точки

                        if (this.initialBlock.isWithinRange(blockPos, maxRange) || maxRange <= 0) {

                            // Проверка на голод (игрок должен быть не слишком голоден)
                            if (this.player.getFoodStats().getFoodLevel() < 2) {
                                this.player.addChatMessage(new ChatComponentTranslation("PlanterHelper:TooHungry"));
                                this.finished = true;
                                return;
                            }

                            // Если блок подходит для посадки
                            if (this.usedPlanter.canPlant(this.inventory, this.world, blockPos.getX(), blockPos.getY(), blockPos.getZ(), this.direction)) {
                                boolean success = this.usedPlanter.plantSeedInPlace(this.inventory, this.world, blockPos.getX(), blockPos.getY(), blockPos.getZ(), this.direction);

                                if (success) {
                                    // Тратим немного выносливости игрока
                                    this.player.addExhaustion(0.02F);
                                    // Добавляем координаты в очередь для дальнейшего распространения
                                    this.plantQueue.add(blockPos);
                                }

                                // Если семена закончились — прекращаем работу
                                if (PlantingLogic.getSeedsSlot(this.inventory, this.usedPlanter.getFirstSlot(this.inventory)) < 0) {
                                    this.finished = true;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Метод, вызываемый каждый тик. Сажает до 20 блоков за раз из очереди.
     */
    public void plantScheduled() {
        int blocksPerTick = 20;
        for (int i = 0; i < blocksPerTick; i++) {
            if (!this.plantQueue.isEmpty() && !this.finished) {
                // Проверка голода перед каждой операцией
                if (this.player.getFoodStats().getFoodLevel() < 2) {
                    this.player.addChatMessage(new ChatComponentTranslation("PlanterHelper:TooHungry"));
                    this.finished = true;
                    return;
                }

                Point target = this.plantQueue.poll(); // Извлекаем точку из очереди
                if (target != null) {
                    plantField(target.getX(), target.getY(), target.getZ());
                }
            } else {
                // Если очередь пуста или работа завершена, отписываемся от тиков
                if (this.plantQueue.isEmpty() || this.finished) {
                    FMLCommonHandler.instance().bus().unregister(this);
                }
                return;
            }
        }
    }
}
