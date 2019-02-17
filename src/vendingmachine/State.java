/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import java.util.List;

/**
 *
 * @author Jakob
 */


// Represents a state
public class State {

    private String name;

    List<Transition> transitionList;

    public State(String name) {
        this.name = name;
    }

    public void addTransition(Transition t){
        transitionList.add(t);
    }
}
