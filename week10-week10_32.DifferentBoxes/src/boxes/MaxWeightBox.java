/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kevinkerin
 */
public class MaxWeightBox extends Box {

    private int maxWeight;
    private List<Thing> thingList;
    
    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        thingList = new ArrayList<Thing>();
    }
    
    @Override
    public void add(Thing thing) {
        int currentweight = 0;
        for (Thing th : thingList){
            currentweight += th.getWeight();
        }
        if ((currentweight + thing.getWeight()) <= maxWeight){
            thingList.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        for (Thing th : thingList){
            if (th.equals(thing)){
                return true;
            }
        }
        return false;
    }
    
    
    
}
