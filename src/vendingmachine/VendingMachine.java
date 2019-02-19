package vendingmachine;

import vendingmachine.DSL.Builder;
import vendingmachine.DSL.Executer;

/**
 *
 * @author Jakob
 * Made with use of code provided by Ulrik Pagh Schultz, University of Southern Denmark
 */
public class VendingMachine{

    // Run the Vending State Machine here
    public static void main(String[] args) {
        
        // Run Code
        Builder b = new Vending();
        Executer e = new Executer(b);

    }
}
