/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kevinkerin
 */
public class Box implements Thing{
    
    private List<Thing> thingList;
    private int maximumCapacity;
    
    public Box(int maximumCapacity){
        this.thingList = new ArrayList<Thing>();
        this.maximumCapacity = maximumCapacity;
    }
    
    public boolean addThing(Thing thing){
        if ((thing.getVolume() + getVolume()) <= maximumCapacity){
            thingList.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        int result = 0;
        for (Thing thing : thingList){
            result += thing.getVolume();
        }
        return result;
    }
    
}
