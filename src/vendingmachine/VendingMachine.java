/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import vendingmachine.DSL.Builder;
import vendingmachine.DSL.Executer;

/**
 *
 * @author Jakob
 * Made with use of code provided by Ulrik Pagh Schultz, University of Southern Denmark
 */
public class VendingMachine{

    /**
     * @param args the command line arguments
     */
    // Run the Vending State Machine here
    public static void main(String[] args) {
        // Run Code
        
        
        Builder b = new Vending();
        Executer e = new Executer(b);
        
        
      //  e.processEvent();

    }
}
