
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinkerin
 */
public class Suitcase {
    
    private int maxWeight;
    private ArrayList<Thing> things;
    //private int currentWeight;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        things = new ArrayList<Thing>();
        //currentWeight = 0;
    }
    
    public void addThing(Thing thing){
        int currentWeight = 0;
        for (Thing th : things){
            currentWeight += th.getWeight();
        }
        if ((currentWeight + thing.getWeight()) <= maxWeight){
            things.add(thing);
            currentWeight += thing.getWeight();
        }
    }
    
    @Override
    public String toString(){
        if(things.isEmpty()){
            return("empty (0kg)");
        } else if (things.size() == 1){
            return("1 thing (" + things.get(0).getWeight() + "kg)");
        } else {
            int currentWeight = 0;
            for (Thing th : things){
                currentWeight += th.getWeight();
            }
            return(things.size() + " things  (" + currentWeight + " kg)");
        }
    }
    
    public void printThings(){
        for (Thing th : things){
            System.out.println(th);
        }
    }
    
    public int totalWeight(){
        int currentWeight = 0;
        for (Thing th : things){
            currentWeight += th.getWeight();
        }
        return currentWeight;
    }
    
    public Thing heaviestThing(){
        if(things.isEmpty()){
            return null;
        }
        Thing heaviest = things.get(0);
        for (Thing th : things){
            if (th.getWeight() > heaviest.getWeight()){
                heaviest = th;
            }
        }
        return heaviest;
    }
    
}
