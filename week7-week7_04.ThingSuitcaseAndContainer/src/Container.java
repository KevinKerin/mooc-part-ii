
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
public class Container {
    
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Container(int maxWeight){
        this.maxWeight = maxWeight;
        suitcases = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        int currentWeight = 0;
        for (Suitcase sc : suitcases){
            currentWeight += sc.totalWeight();
        }
        if ((currentWeight + suitcase.totalWeight()) <= maxWeight){
            suitcases.add(suitcase);
            currentWeight += suitcase.totalWeight();
        }
    }
    
    public void printThings(){
        for (Suitcase sc : suitcases){
            sc.printThings();
        }
    }
    
    @Override
    public String toString(){
        int totalWeight = 0;
        for (Suitcase sc : suitcases){
            totalWeight += sc.totalWeight();
        }
        return(suitcases.size() + " suitcases (" + totalWeight + " kg)");
    }
    
}
