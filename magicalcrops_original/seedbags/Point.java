/*    */ package com.mark719.magicalcrops.seedbags;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Point
/*    */ {
/*    */   private int x;
/*    */   private int y;
/*    */   private int z;
/*    */   
/*    */   public Point(int x, int y, int z) {
/* 13 */     this.x = x;
/* 14 */     this.y = y;
/* 15 */     this.z = z;
/*    */   }
/*    */   
/*    */   public int getX() {
/* 19 */     return this.x;
/*    */   }
/*    */   
/*    */   public int getY() {
/* 23 */     return this.y;
/*    */   }
/*    */   
/*    */   public int getZ() {
/* 27 */     return this.z;
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 32 */     int hash = 5;
/* 33 */     hash += 13 * this.x;
/* 34 */     hash += 19 * this.y;
/* 35 */     hash += 31 * this.z;
/*    */     
/* 37 */     return hash;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object other) {
/* 42 */     if (other == null) {
/* 43 */       return false;
/*    */     }
/* 45 */     if (other == this) {
/* 46 */       return true;
/*    */     }
/* 48 */     if (!(other instanceof Point)) {
/* 49 */       return false;
/*    */     }
/* 51 */     Point otherPoint = (Point)other;
/* 52 */     return (this.x == otherPoint.x && this.y == otherPoint.y && this.z == otherPoint.z);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int distanceFrom(int x, int y, int z) {
/* 63 */     int distanceX = this.x - x;
/* 64 */     int distanceY = this.y - y;
/* 65 */     int distanceZ = this.z - z;
/* 66 */     return distanceX * distanceX + distanceY * distanceY + distanceZ * distanceZ;
/*    */   }
/*    */   
/*    */   public boolean isWithinRange(Point target, int range) {
/* 70 */     return isWithinRange(target.x, target.y, target.z, range);
/*    */   }
/*    */   
/*    */   public boolean isWithinRange(int x, int y, int z, int range) {
/* 74 */     return (distanceFrom(x, y, z) <= range * range);
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\seedbags\Point.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */