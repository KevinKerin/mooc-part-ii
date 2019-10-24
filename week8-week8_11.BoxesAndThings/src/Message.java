/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinkerin
 */
public class Message implements ToBeStored{
    
    private String writer, message;
    private double weight;
    
    public Message(String writer, String message){
        this.writer = writer;
        this.message = message;
        weight = 0.1;
    }
    
    @Override
    public double weight() {
        return weight;
    }
    
    @Override
    public String toString() {
        return this.writer + ": " + this.message;
    }
    
    
}
