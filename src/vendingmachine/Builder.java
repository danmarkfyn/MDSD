/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jakob
 */
public abstract class Builder {

    // machine return this
    // State
    //when/transition
    // To
    private State currentState;
    private List<State> all = new ArrayList<State>();
    private String event;

    public Builder machine() {
        return this;
    }

    public Builder state(String name) {
        currentState = new State(name);
        all.add(currentState);
        return this;
    }

    public Builder when(String e) {
        event = e;
        
        return this;
    }
    
    public Builder to(String s){
       currentState.addTransition(new Transition("e",s));
    
    return this;
    }

}