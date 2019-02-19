/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import vendingmachine.DSL.Builder;

/**
 *
 * @author Jakob Made with use of code provided by Ulrik Pagh Schultz,
 * University of Southern Denmark
 */
// Logic for the vending state machine
public class Vending extends Builder {

    @Override
    public void build() {
// Meta Model (Diagram found in Metamodel folder)
    
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
