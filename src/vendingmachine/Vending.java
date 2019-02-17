/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

/**
 *
 * @author Jakob
 */


// Logic for the vending state machine
public class Vending extends Builder{
    
  

    protected void build() {
        state("NO COINS").
          transition("BUY").to("POWER_ON","").setState("power",MIN_POWER).
        state("POWER_ON").
          transition("PLUS").to("MAX_POWER").whenStateEquals("power",MAX_POWER).
                             changeState("power",1).otherwise().
          transition("MINUS").to("POWER_OFF").whenStateEquals("power",MIN_POWER).
                             changeState("power",-1).otherwise().
        state("MAX_POWER").
          transition("MINUS").to("POWER_ON").setState("power",MAX_POWER)
        ;
    }
    
    
    
}
