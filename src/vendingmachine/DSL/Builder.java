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
 * @author Jakob Made with use of code provided by Ulrik Pagh Schultz,
 * University of Southern Denmark
 */
// State machine builder
public abstract class Builder {

    // Machine return this
    // State
    // When/transition
    // To
    private State currentState;
    private List<State> all = new ArrayList<State>();
    private String event;
    
    public Builder machine() {
        return this;
    }
    
    protected abstract void build();
    
    public int getSize() {
        return all.size();
    }
    
    public Builder state(String name) {
        currentState = new State(name);
        all.add(currentState);
        return this;
    }
    
    public Builder when(String e) {
        this.event = e;
        
        return this;
    }
    
    public Builder to(String s) {
        
        currentState.addTransition(new Transition(currentState.getName(), s));
        
        return this;
    }
    
    public void printStates() {
        
        int s = all.size();
        
        for (int i = 0; i < s; i++) {
            
            System.out.println(all.get(i));
        }
    }
}
