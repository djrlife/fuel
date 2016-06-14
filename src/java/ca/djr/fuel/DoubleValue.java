/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.djr.fuel;

/**
 *
 * @author derek
 */
public class DoubleValue {
    private double value;
    private boolean set = false;

    /**
     * @return the value
     */
    public double getValue() {
        if(!set) {
            throw new ValueUnsetException();
        }
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(double value) {
        this.value = value;
        set = true;
    }
    
    /**
     * @return if the value has been set
     */
    public boolean isSet() {
        return set;
    }
    
    /**
     * Unsets the value.
     */
    public void unset() {
        value = 0;
        set = false;
    }
    
    public class ValueUnsetException extends RuntimeException {
    }
}
