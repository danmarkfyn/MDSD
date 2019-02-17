/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

/**
 *
 * @author Jakob
 */
// Represents a transition
public class Transition {

    String event;
    String target;

    public Transition(String event, String target) {

        this.event = event;
        this.target = target;
    }
}
