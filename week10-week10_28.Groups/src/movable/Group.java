/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kevinkerin
 */
public class Group implements Movable {

    private List<Movable> list;
    
    public Group(){
        list = new ArrayList<Movable>();
    }
    
    public void addToGroup(Movable movable){
        list.add(movable);
    }

    @Override
    public String toString() {
        String str = "";
        for (Movable m : list){
            str += m + "\n";
        }
        return str;
    }
        
    @Override
    public void move(int dx, int dy) {
        for (Movable m : list){
            m.move(dx, dy);
        }
    }
    
}
