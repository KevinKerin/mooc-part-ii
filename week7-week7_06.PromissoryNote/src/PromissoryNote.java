
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinkerin
 */
public class PromissoryNote {
    
    private HashMap<String, Double> hashmap;
    
    public PromissoryNote(){
        hashmap = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value){
        hashmap.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose){
        if(hashmap.get(whose) != null){
            return hashmap.get(whose);
        } else {
            return 0;
        }
        
    }
    
}
