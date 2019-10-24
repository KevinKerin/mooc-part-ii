
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinkerin
 */

public class Storehouse {
    
    private Map<String, Integer> priceMap = new HashMap<String, Integer>();
    private Map<String, Integer> stockMap = new HashMap<String, Integer>();
    
    public void addProduct(String product, int price, int stock){
        priceMap.put(product, price);
        stockMap.put(product, stock);
    }
    
    public int price(String product){
        for (String str : priceMap.keySet()){
            if (str.equalsIgnoreCase(product)){
                return priceMap.get(str);
            }
        }
        return -99;
    }
    
    public int stock(String product){
        for (String str : stockMap.keySet()){
            if (str.equalsIgnoreCase(product)){
                return stockMap.get(str);
            }
        }
        return 0;
    }
    
    public boolean take(String product){
        for (String str : stockMap.keySet()){
            if (str.equalsIgnoreCase(product)){
                if(stockMap.get(str) > 0){
                    stockMap.put(str, (stockMap.get(str)-1));
                    return true;
                }
                return false;
            }
        }
        return false;
    }
    
    public Set<String> products(){
        return priceMap.keySet();
    }
    
    
    
}
