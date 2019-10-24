/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kevinkerin
 */
public class AverageSensor implements Sensor {

    private List<Sensor> sensorList = new ArrayList<Sensor>();
    
    public void addSensor(Sensor additional){
        sensorList.add(additional);
    }
    
    @Override
    public boolean isOn() {
        for (Sensor s : sensorList){
            if (!s.isOn()){
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor s : sensorList){
            s.on();
        }
    }

    @Override
    public void off() {
        for (Sensor s : sensorList){
            if (!s.isOn()){
                return;
            }
        }
        try {
            Sensor s = sensorList.get(0);
            s.off();
        } catch (NullPointerException e){
        }
    }

    @Override
    public int measure() {
        if (!isOn() || sensorList.isEmpty()){
            throw new IllegalStateException();
        }
        int sum = 0;
        for (Sensor s : sensorList){
            sum += s.measure();
        }
        return (int) sum/sensorList.size();
    }
    
    public List<Integer> readings(){
        List<Integer> list = new ArrayList<Integer>();
        for (Sensor s : sensorList){
            list.add(s.measure());
        }
        return list;
    }
    
}
