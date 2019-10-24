/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinkerin
 */
public class Calculator {
   
    private Reader reader;
    private int calcCounter;
    
    public Calculator(){
        reader = new Reader();
        calcCounter = 0;
    }
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }   
    
    private void sum(){
        int[] arr = questions();
        sum(arr);
    }
    
    private void sum(int [] arr){
        System.out.println("sum of the values " + (arr[0]+arr[1]));
        calcCounter++;
    }
    
    private void difference(){
        int[] arr = questions();
        difference(arr);
    }
    
    private void difference(int [] arr){
        System.out.println("difference of the values " + (arr[0]-arr[1]));
        calcCounter++;
    }
    
        
    private void product(){
        int[] arr = questions();
        product(arr);
    }
    
    private void product(int [] arr){
        System.out.println("product of the values " + (arr[0]*arr[1]));
        calcCounter++;
    }
    
    
    
    private int [] questions(){
        int[] arr = new int[2];
        System.out.println("value1: ");
        arr[0] = reader.readInteger();
        System.out.println("value2: ");
        arr[1] = reader.readInteger();
        return arr;
    }
    
    private void statistics(){
        System.out.println("Calculations done " + calcCounter);
    }
    
}
