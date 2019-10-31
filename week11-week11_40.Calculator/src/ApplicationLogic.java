/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinkerin
 */
public class ApplicationLogic {
    
    private int currentTotal;
    
    public ApplicationLogic(){
        currentTotal = 0;
    }
    
    public int add(int input){
        currentTotal += input;
        return currentTotal;
    }
    
    public int minus(int input){
        currentTotal -= input;
        return currentTotal;
    }
    
    public int reset(){
        currentTotal = 0;
        return currentTotal;
    }
    
    public int getCurrentTotal(){
        return currentTotal;
    }
    
}