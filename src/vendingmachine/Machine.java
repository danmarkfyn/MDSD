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
public class Machine {
    
    private List<State> states;
    
    
    public Machine(){
        this.states = new ArrayList<State>();
    }
    
    
    public List<State> getStates(){
        
        return this.states;
    }
    
    
}
