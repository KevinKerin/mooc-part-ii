/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author kevinkerin
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {

    private Map<String, Set<String>> hashMap;
    
    public PersonalMultipleEntryDictionary(){
        hashMap = new HashMap<String, Set<String>>();
    }
    
    @Override
    public void add(String word, String entry) {
        if(!hashMap.containsKey(word)){
            hashMap.put(word, new HashSet<String>());
        }
        this.hashMap.get(word).add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        if(!hashMap.containsKey(word)){
            return null;
        }
        Set<String> set = new HashSet<String>(hashMap.get(word));
        return set;
    }

    @Override
    public void remove(String word) {
        if(hashMap.containsKey(word)){
            hashMap.remove(word);
        } else {
            
        }
    }
    
}
