/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinkerin
 */
public class Main {
    
    public static void main(String[] args) {
        
        Message message = new Message("Brian Kennedy", "Put me in box");
        
        Box box = new Box(1, 10);

        Box car = new Box(1000, 100);
        
        Box aroundTheWorld = new Box(100000, 10000);
        
        box.add(message);
        System.out.println(box);
        car.add(box);
        System.out.println(car);
        aroundTheWorld.add(car);
        System.out.println(aroundTheWorld);
        System.out.println("until you get there");
        
        
    }
         
    
}
