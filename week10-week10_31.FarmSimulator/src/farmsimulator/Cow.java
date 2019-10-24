/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author kevinkerin
 */
public class Cow implements Milkable, Alive {
    
    private String name;
    private double udderCapacity;
    private double milkAvailable;
    
    public Cow(){
        this(NAMES[new Random().nextInt(31)]);
    }
    
    public Cow(String name){
        this.name = name;
        udderCapacity = 15 + new Random().nextInt(26);
        milkAvailable = 0;
    }

    public String getName(){
        return name;
    }
    
    public double getCapacity(){
        return udderCapacity;
    }
    
    public double getAmount(){
        return Math.ceil(milkAvailable);
    }
    
    private static final String[] NAMES = new String[]{
        "Adrian", "Anthony", "Barry", "Charlie", "Dexter",
         "Evelyn", "Eileen", "Fergal", "Gavin", "Harry", "Imogen", "James", "Jonno",
        "Kevin", "Louis", "Michael", "Neil", "Oliver", "Pat", "Philip",
        "Quentin", "Roger", "Stephen", "Tarantino", "Ungur",
        "Vivien", "Walter", "Xavier", "Yvonne", "Zane", "Zeus"};

    @Override
    public double milk() {
        double milkedMilk = milkAvailable;
        milkAvailable = 0;
        return milkedMilk;
    }

    @Override
    public void liveHour() {
        double num = new Random().nextDouble() * 1.3 + 0.7;
        num = Math.ceil(num);
        if(num + milkAvailable <= udderCapacity){
            milkAvailable += num;
        } else {
            milkAvailable = udderCapacity;
        }
    }
    
    @Override
    public String toString(){
        return name + " " + getAmount() + "/" + udderCapacity;
    }
    
}
