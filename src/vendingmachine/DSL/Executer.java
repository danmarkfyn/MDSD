package vendingmachine.DSL;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Jakob 
 * Made with use of code provided by Ulrik Pagh Schultz, University of Southern Denmark
 */

public class Executer {

    // Executer of Statemachine on meta model

    private List<State> all = new ArrayList<State>(); // List of all States
    
    public Executer(Builder b) {

        all = b.getAll();
        
        //Build Meta
        b.build();
        
        //Tests 
        System.out.println("Size Of Statelist: " + b.getSize()+"\n");
        
        System.out.println("All States In The List: "+"\n");
        b.printStates();
    }

    public void processEvent(String event) {
    /*
            
            for (int i = 0; i < all.size(); i++) {
            all.get(i).getTransitionList().
                
        }
    */
    }
}
