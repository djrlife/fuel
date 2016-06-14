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
public class Fueling {
    private DoubleValue cost;
    private DoubleValue price;
    private DoubleValue volume;
    private long odometer;

    /**
     * @return the cost
     */
    public DoubleValue getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setTotalCost(double cost) {
        this.cost.setValue(cost);
        resolve();
    }
    
    /**
     * @return the price
     */
    public DoubleValue getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price.setValue(price);
        resolve();
    }

    /**
     * @return the volume
     */
    public DoubleValue getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(double volume) {
        this.volume.setValue(volume);
        resolve();
    }
    
    private void resolve() {
        if(cost.isSet() && price.isSet()) {
            volume.setValue(cost.getValue() / price.getValue());
        }
        else if(cost.isSet() && volume.isSet()) {
            price.setValue(cost.getValue() / volume.getValue());
        }
        else if(price.isSet() && volume.isSet()) {
            cost.setValue(volume.getValue() * cost.getValue());
        }
    }
    
    public boolean resolved() {
        return cost.isSet() && price.isSet() && volume.isSet();
    }

    /**
     * @return the odometer
     */
    public long getOdometer() {
        return odometer;
    }

    /**
     * @param odometer the odometer to set
     */
    public void setOdometer(long odometer) {
        this.odometer = odometer;
    }
    
}
