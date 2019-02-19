/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine.DSL;

/**
 *
 * @author Jakob
 * Made with use of code provided by Ulrik Pagh Schultz, University of Southern Denmark
 */
// Represents a transition
public class Transition {

    String event;
    String target;

    public String getEvent() {
        return event;
    }

    public String getTarget() {
        return target;
    }

    public Transition(String event, String target) {

        this.event = event;
        this.target = target;
    }
}
