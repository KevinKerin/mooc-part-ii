
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinkerin
 */
public class ShoppingBasket {
    
    private Map<String, Purchase> hashmap = new HashMap<String, Purchase>();
    
    public ShoppingBasket(){
        
    }
    
    public void add(String product, int price){
        if(!hashmap.containsKey(product)){
            Purchase pur = new Purchase(product, 1, price);
            hashmap.put(product, pur);
        } else {
            for (Map.Entry<String, Purchase> entry : hashmap.entrySet()){
                if(entry.getKey().equalsIgnoreCase(product)){
                    entry.getValue().increaseAmount();
                }
            }
        }
    }
    
    public int price(){
        int total = 0;
        for (Purchase pur : hashmap.values()){
            total += pur.price();
        }
        return total;
    }
    
    public void print(){
        for (Purchase pur : hashmap.values()){
            System.out.println(pur);
        }
    }
    
}
