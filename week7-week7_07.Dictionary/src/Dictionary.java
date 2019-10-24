
import java.util.ArrayList;
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
public class Dictionary {
    
    private HashMap<String, String> hashmap;
    
    public Dictionary(){
        hashmap = new HashMap<String, String>();
    }
    
    public String translate(String word){
        if(word.isEmpty()){
            return null;
        }
        if(hashmap.containsKey(word)){
            return hashmap.get(word);
        } else {
            return null;
        }
    }
    
    public void add(String word, String translation){
        hashmap.put(word, translation);
    }
    
    public int amountOfWords(){
        return hashmap.size();
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> list = new ArrayList<String>();
        for (HashMap.Entry<String, String> str : hashmap.entrySet()){
            String string = str.getKey() + " = " + str.getValue();
            list.add(string);
        }
        return list;
    }
    
    
    
}
