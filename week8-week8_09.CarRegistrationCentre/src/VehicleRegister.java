
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
public class VehicleRegister {
    
    private Map<RegistrationPlate, String> hashmap = new HashMap<RegistrationPlate, String>();
    
    
    
    public boolean add(RegistrationPlate plate, String owner){
        if(!hashmap.containsKey(plate)){
            hashmap.put(plate, owner);
            return true;
        }
        return false;
    }
    
    public String get(RegistrationPlate plate){
        if(hashmap.containsKey(plate)){
            return hashmap.get(plate);
        }
        return null;
    }
    
    public boolean delete(RegistrationPlate plate){
        if(hashmap.containsKey(plate)){
            hashmap.remove(plate);
            return true;
        } return false;
    }
    
    public void printRegistrationPlates(){
        for (RegistrationPlate rp : hashmap.keySet()){
            System.out.println(rp);
        }
    }
    
    public void printOwners(){
        List<String> owners = new ArrayList<String>();
        for (String str : hashmap.values()){
            if(!owners.contains(str)){
                owners.add(str);
                System.out.println(str);               
            }
        }
    }
    
}
