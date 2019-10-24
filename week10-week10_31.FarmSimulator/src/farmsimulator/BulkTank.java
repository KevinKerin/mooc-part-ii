
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author kevinkerin
 */
public class BulkTank {

    private double capacity;
    private double currentVolume;
    
    public BulkTank(){
        this(2000);
    }

    public BulkTank(double capacity){
        this.capacity = capacity;
        currentVolume = 0;
    }

    public double getCapacity(){
        return capacity;
    }

    public double getVolume(){
        return currentVolume;
    }

    public double howMuchFreeSpace(){
        return capacity - currentVolume;
    }

    public void addToTank(double amount){
        if (amount < 0){
            return;
        }
        if((currentVolume + amount) <= capacity){
            currentVolume += amount;
        } else {
            currentVolume = capacity;
        }
    }
    
    public double getFromTank(double amount){
        if (amount < 0){
            return currentVolume;
        }
        if (amount > currentVolume){
            currentVolume = 0;
            return currentVolume;
        } else {
            currentVolume -= amount;
            return currentVolume;
        }
    }

    @Override
    public String toString() {
        return Math.ceil(getVolume()) + "/" + Math.ceil(getCapacity());
    }
    
}