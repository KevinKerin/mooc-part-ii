/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author kevinkerin
 */
public class PersonalDuplicateRemover implements DuplicateRemover{

    private Set<String> set;
    private int duplicateCount;
    
    public PersonalDuplicateRemover(){
        duplicateCount = 0;
        set = new HashSet<String>();
    }
    
    @Override
    public void add(String characterString) {
        if(!set.contains(characterString)){
            set.add(characterString);
        } else {
            duplicateCount++;
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return duplicateCount;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return set;
    }

    @Override
    public void empty() {
        duplicateCount = 0;
        set.clear();
    }
    
}
