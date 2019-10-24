
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
public class RingingCentre {
    
    private Map<Bird, List<String>> hashMap;
    
    public RingingCentre(){
        hashMap = new HashMap<Bird, List<String>>();
    }
    
    public void observe(Bird bird, String place){
        for (Map.Entry<Bird, List<String>> entry : hashMap.entrySet()){
            if (entry.getKey().equals(bird)){
                entry.getValue().add(place);
                return;
            }
        }
        List<String> list = new ArrayList<String>();
        list.add(place);
        hashMap.put(bird, list);
    }
    
    public void observations(Bird bird){
        for (Map.Entry<Bird, List<String>> entry : hashMap.entrySet()){
            if (entry.getKey().equals(bird)){
                System.out.print(entry.getKey().toString() + " observations: " + entry.getValue().size() + "\n");
                List<String> placeList = entry.getValue();
                for (String str : placeList){
                    System.out.println(str);
                }
                return;
            }
        }
        hashMap.put(bird, new ArrayList<String>());
        observations(bird);
    }
}
