
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
public class Changer {
    
    
    private ArrayList<Change> changeList;
    
    public Changer(){
        changeList = new ArrayList<Change>();
    }
    
    public void addChange(Change change){
        changeList.add(change);
    }
    
    public String change(String characterString){
        
        for (Change ch : changeList){
            characterString = ch.change(characterString);
        }
        
        
        return characterString;
    }
    
}
