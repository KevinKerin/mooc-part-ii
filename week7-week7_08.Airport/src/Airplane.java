
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 *
 * @author kevinkerin
 */
public class Airplane {
    
    private String planeID;
    private int planeCapacity;
    private HashMap<String, String> flightMap;
    
    public Airplane(String planeID, int planeCapacity){
        this.planeID = planeID;
        this.planeCapacity = planeCapacity;
        flightMap = new HashMap<String, String>();
    }
    
    public String getPlaneID(){
        return planeID;
    }
    
    public int getPlaceCapacity(){
        return planeCapacity;
    }
    
    public void addFlight(String dep, String arr){
        dep = airportCodeMaker(dep);
        arr = airportCodeMaker(arr);
        flightMap.put(dep, arr);
    }
    
    private String airportCodeMaker(String str){
        return str.toUpperCase();
    }
    
    public void printPlanes(){
        for (HashMap.Entry<String, String> str : flightMap.entrySet()){
            System.out.println(this.getPlaneID() + " (" + this.getPlaceCapacity() + " ppl) (" + str.getKey() + "-" + str.getValue() + ")");
        }
    }

    @Override
    public String toString() {
        return planeID + " (" + planeCapacity + " ppl)";
    }
    
    
        
    
    
}