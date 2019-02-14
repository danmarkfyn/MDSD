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
public class Event {

    /**
     * The code of the event, represented as a string
     */
    private String code;

    /**
     * Construct event with the given code
     *
     * @param code the string representation of the event name
     */
    public Event(String code) {
        this.code = code;
    }

    /**
     * Get the string representing the event code
     *
     * @return the event code
     */
    public String code() {
        return code;
    }

}
