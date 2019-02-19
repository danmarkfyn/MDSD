/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine.DSL;


import java.util.List;

/**
 *
 * @author Jakob
 */
public class Executer {

    private State currentState;
    //private List<State> states;

    public Executer(Builder b) {

        
        b.build();
        
        System.out.println("Size Of State List: " + b.getSize());
        b.printStates();
        
    }

    public void processEvent(String event) {
    //Transition transition  = currentState.getTransitionList();
    }
}
