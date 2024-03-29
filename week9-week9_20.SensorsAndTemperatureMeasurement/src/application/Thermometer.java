/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author kevinkerin
 */
public class Thermometer implements Sensor {

    private boolean isOn;
    
    public Thermometer(){
        isOn = false;
    }
    
    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void on() {
        isOn = true;
    }

    @Override
    public void off() {
        isOn = false;
    }

    @Override
    public int measure() {
        if (isOn){
            return (int) ThreadLocalRandom.current().nextInt(-30, 31);
        }
        throw new IllegalStateException();
    }
    
}
