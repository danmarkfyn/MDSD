/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine.DSL;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jakob
 * Made with use of code provided by Ulrik Pagh Schultz, University of Southern Denmark
 */
// Represents a state
public class State {

    private String name;

    List<Transition> transitionList;

    public State(String name) {
        this.name = name;
        
        transitionList = new ArrayList<Transition>();
        
    }

    public String getName() {
        return name;
    }

    public List<Transition> getTransitionList() {
        return transitionList;
    }

    public void addTransition(Transition t) {
        transitionList.add(t);
    }

    public String toString() {
        return name;

    }

}
