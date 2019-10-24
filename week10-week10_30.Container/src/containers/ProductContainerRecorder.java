/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author kevinkerin
 */
public class ProductContainerRecorder extends ProductContainer {
    
    private ContainerHistory ch;
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume){
        super(productName, capacity);
        super.addToTheContainer(initialVolume);
        this.ch = new ContainerHistory();
        this.ch.add(initialVolume);
    }
    
    public String history(){
        return ch.toString();
    }
    
    @Override
    public void addToTheContainer(double amount){
        super.addToTheContainer(amount);
        ch.add(super.getVolume());
    }
    
    @Override
    public double takeFromTheContainer(double amount) {
        double prevVolume = this.getVolume();
        super.takeFromTheContainer(amount);
        this.ch.add(this.getVolume());
        
        return prevVolume - this.getVolume();
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.ch);
        System.out.println("Greatest product amount: " + this.ch.maxValue());
        System.out.println("Smallest product amount: " + this.ch.minValue());
        System.out.println("Average: " + this.ch.average());
        System.out.println("Greatest change: " + this.ch.greatestFluctuation());
        System.out.println("Variance: " + this.ch.variance());
    }
    
    
    
}
