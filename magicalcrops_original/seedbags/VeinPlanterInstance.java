/*     */ package com.mark719.magicalcrops.seedbags;
/*     */ 
/*     */ import cpw.mods.fml.common.FMLCommonHandler;
/*     */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*     */ import cpw.mods.fml.common.gameevent.TickEvent;
/*     */ import java.util.concurrent.ConcurrentLinkedQueue;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.util.ChatComponentTranslation;
/*     */ import net.minecraft.util.IChatComponent;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class VeinPlanterInstance
/*     */ {
/*     */   private ConcurrentLinkedQueue<Point> plantQueue;
/*     */   private World world;
/*     */   private ForgeDirection direction;
/*     */   private boolean finished;
/*     */   private Planter usedPlanter;
/*     */   private SeedInventory inventory;
/*     */   private EntityPlayer player;
/*     */   private Point initialBlock;
/*     */   
/*     */   public VeinPlanterInstance(EntityPlayer player, IInventory inventory, Planter usedPlanter, World world, int x, int y, int z, ForgeDirection direction) {
/*  28 */     this.plantQueue = new ConcurrentLinkedQueue<Point>();
/*  29 */     this.world = world;
/*  30 */     this.direction = direction;
/*  31 */     this.finished = false;
/*  32 */     this.usedPlanter = usedPlanter;
/*  33 */     if (inventory instanceof SeedInventory) {
/*  34 */       this.inventory = (SeedInventory)inventory;
/*     */     }
/*  36 */     this.player = player;
/*  37 */     this.initialBlock = new Point(x, y, z);
/*     */     
/*  39 */     FMLCommonHandler.instance().bus().register(this);
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void ticker(TickEvent.ServerTickEvent event) {
/*  44 */     if (event.phase == TickEvent.Phase.END) {
/*  45 */       plantScheduled();
/*     */     }
/*     */   }
/*     */   
/*     */   public synchronized void plantField(int x, int y, int z) {
/*  50 */     if (this.world == null || this.usedPlanter == null || this.inventory == null || !(this.usedPlanter instanceof Planter))
/*     */     {
/*  52 */       this.finished = true;
/*     */     }
/*     */     
/*  55 */     if (this.finished) {
/*     */       return;
/*     */     }
/*     */     
/*  59 */     byte d = 1;
/*  60 */     for (int dx = -d; dx <= d; dx++) {
/*  61 */       for (int dy = -d; dy <= d; dy++) {
/*  62 */         for (int dz = -d; dz <= d; dz++) {
/*  63 */           if (dx != 0 || dz != 0) {
/*     */ 
/*     */ 
/*     */             
/*  67 */             Point blockPos = new Point(x + dx, y + dy, z + dz);
/*     */             
/*  69 */             int range = 75;
/*     */             
/*  71 */             if (this.initialBlock.isWithinRange(blockPos, range) || range <= 0) {
/*     */ 
/*     */ 
/*     */               
/*  75 */               if (this.player.func_71024_bL().func_75116_a() < 2) {
/*  76 */                 this.player.func_146105_b((IChatComponent)new ChatComponentTranslation("PlanterHelper:TooHungry", new Object[0]));
/*  77 */                 this.finished = true;
/*     */                 
/*     */                 return;
/*     */               } 
/*  81 */               if (this.usedPlanter.canPlant(this.inventory, this.world, blockPos.getX(), blockPos.getY(), blockPos.getZ(), this.direction)) {
/*  82 */                 boolean success = this.usedPlanter.plantSeedInPlace(this.inventory, this.world, blockPos.getX(), blockPos.getY(), blockPos.getZ(), this.direction);
/*  83 */                 if (success) {
/*  84 */                   this.player.func_71020_j(0.02F);
/*  85 */                   this.plantQueue.add(blockPos);
/*     */                 } 
/*     */                 
/*  88 */                 if (PlantingLogic.getSeedsSlot(this.inventory, this.usedPlanter.getFirstSlot(this.inventory)) < 0)
/*  89 */                   this.finished = true; 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   public void plantScheduled() {
/*  98 */     int speed = 20;
/*  99 */     for (int i = 0; i < speed; i++) {
/* 100 */       if (!this.plantQueue.isEmpty() && !this.finished) {
/* 101 */         if (this.player.func_71024_bL().func_75116_a() < 2) {
/* 102 */           this.player.func_146105_b((IChatComponent)new ChatComponentTranslation("PlanterHelper:TooHungry", new Object[0]));
/* 103 */           this.finished = true;
/*     */           
/*     */           return;
/*     */         } 
/* 107 */         Point target = this.plantQueue.remove();
/* 108 */         plantField(target.getX(), target.getY(), target.getZ());
/*     */       } else {
/*     */         return;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\seedbags\VeinPlanterInstance.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */