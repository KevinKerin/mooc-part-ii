
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinkerin
 */
public class Box implements ToBeStored{
 
    private double boxWeight;
    private double maxWeight;
    private List<ToBeStored> things = new ArrayList<ToBeStored>();

    public Box(double weight, double maxWeight) {
        this.boxWeight = weight;
        this.maxWeight = maxWeight + boxWeight;
    }
    
    public void add(ToBeStored tbs){
        if ((tbs.weight() + weight()) <= maxWeight){
            things.add(tbs);
        }
    }
    
    @Override
    public double weight(){
        double weight = 0;
        for(ToBeStored item : things){
            weight += item.weight();
        }
        return weight + boxWeight;
    }

    @Override
    public String toString() {
        return "Box: " + things.size() + " things, total weight " + weight() + " kg";
    }
    
    
    
}