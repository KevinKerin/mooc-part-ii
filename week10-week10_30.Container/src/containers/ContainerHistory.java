/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kevinkerin
 */
public class ContainerHistory {
    
    private List<Double> list = new ArrayList<Double>();
    
    public ContainerHistory(){
        
    }
    
    public void add(double situation){
        list.add(situation);
    }
    
    public void reset(){
        list.clear();
    }
    
    @Override
    public String toString(){
        return list.toString();
    }
    
    public double maxValue(){
        if (list.isEmpty()){
            return 0;
        }
        double maxVal = list.get(0);
        for (double d : list){
            if (d > maxVal){
                maxVal = d;
            }
        }
        return maxVal;
    }
    
    public double minValue() {
        if (list.isEmpty()) {
            return 0;
        }
        double minVal = list.get(0);
        for (double d : list) {
            if (d < minVal) {
                minVal = d;
            }
        }
        return minVal;
    }
    
    public double average(){
        if(list.isEmpty()){
            return 0;
        }
        double sum = 0;
        for (double d : list){
            sum += d;
        }
        return sum / list.size();
    }
    
    public double greatestFluctuation() {
        if (list.isEmpty() || list.size() == 1) {
            return 0;
        }
        double maxFlux = Math.abs(list.get(0) - list.get(1));
        for (int i = 0; i < list.size()-1; i++) {
            double current = Math.abs(list.get(i) - list.get(i+1));
            if (current > maxFlux){
                maxFlux = current;
            }
        }
        
        return maxFlux;
    }
    
    public double variance(){
        if(list.isEmpty() || list.size() == 1){
            return 0;
        }
        double variance = 0;
        for (double d : list){
            variance += ((d - average()) * (d - average()));
        }
        return variance / (list.size()-1);
    }

}
