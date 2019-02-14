/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import java.util.Observer;

/**
 *
 * @author Jakob
 */
public interface IMachine {

    /**
     * Initialize the statemachine (before sending events)
     */
    public void initialize();

    /**
     * Process a single event
     *
     * @param event a single event, delivered to the state machine
     */
    public void processEvent(Event event);

    /**
     * Add an observer to the state machine, notified whenever the state changes
     *
     * @param observer the statemachine observer
     */
    public void addObserver(Observer observer);

    /**
     * @param name the name of the extended state variable, null for the active
     * state of the machine
     * @return string representation of the current runtime state
     */
    public String getRuntimeStateFor(String what);
}
