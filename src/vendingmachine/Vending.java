package vendingmachine;

import vendingmachine.DSL.Builder;

/**
 *
 * @author Jakob 
 * Made with use of code provided by Ulrik Pagh Schultz,
 * University of Southern Denmark
 */
public class Vending extends Builder {

    @Override
    public void build() {
// Meta Model based on diagram (Diagram found in Metamodel folder)
    
        state("NO_COINS").
                when("ADD").to("1_COIN").
        state("1_COIN").
                when("ADD").to("2_COIN").
                when("CANCEL").to("NO_COINS").
        state("2_COINS").
                when("BUY").to("NO_COINS").
                when("CANCEL").to("NO_COINS");
    }
}
