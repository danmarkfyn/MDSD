package vendingmachine.DSL;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jakob 
 * Made with use of code provided by Ulrik Pagh Schultz,
 * University of Southern Denmark
 */
// State machine builder
public abstract class Builder {

    // Machine return this
    // State
    // When/transition
    // To
    
    private State currentState;
    private List<State> all = new ArrayList<State>(); // List of all States
    private String event;

    public List<State> getAll() {
        return all;
    }
    
    public Builder machine() {
        return this;
    }
    
    protected abstract void build();
    
    public int getSize() {
        return all.size();
    }
    // Add state to list
    public Builder state(String name) {
        currentState = new State(name);
        all.add(currentState);
        return this;
    }
    
    public Builder when(String e) {
        this.event = e;
        
        return this;
    }
    
    // Add transition to current state
    public Builder to(String s) {
        
        currentState.addTransition(new Transition(currentState.getName(), s));
        
        return this;
    }
    
    // For testing (prints all states in the list)
    public void printStates() {
        
        int s = all.size();
        
        for (int i = 0; i < s; i++) {
            
            System.out.println("State " + (i+1) + ": "+all.get(i));
        }
    }
}
