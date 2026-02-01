/*    */ package com.mark719.magicalcrops.help;
/*    */ 
/*    */ import java.util.Random;
/*    */ 
/*    */ public class StemRandom
/*    */   extends Random {
/*    */   private boolean do_proper_random = false;
/*    */   
/*    */   public int nextInt(int i) {
/* 10 */     if (this.do_proper_random) {
/* 11 */       this.do_proper_random = !this.do_proper_random;
/* 12 */       return super.nextInt(i);
/*    */     } 
/*    */     
/* 15 */     this.do_proper_random = !this.do_proper_random;
/* 16 */     return 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\help\StemRandom.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */