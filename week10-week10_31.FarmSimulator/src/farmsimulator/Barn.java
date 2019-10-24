/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;

/**
 *
 * @author kevinkerin
 */
public class Barn {
    
    private MilkingRobot milkingRobot;
    private BulkTank tank;
    
    public Barn(BulkTank tank){
        this.tank = tank;
    }
    
    public BulkTank getBulkTank(){
        return tank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.milkingRobot = milkingRobot;
        milkingRobot.setBulkTank(tank);
    }
    
    public void takeCareOf(Cow cow){
        if(milkingRobot == null){
            throw new IllegalStateException();
        }
        milkingRobot.milk(cow);
        
    }
    
    public void takeCareOf(Collection<Cow> cows){
        for (Cow cow : cows){
            takeCareOf(cow);
        }
    }
    
    public String toString(){
        return tank.toString();
    }
    
}
