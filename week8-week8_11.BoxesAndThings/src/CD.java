/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinkerin
 */
public class CD implements ToBeStored {

    private String artist, title;
    private int publishingYear;

    public CD(String artist, String title, int publishingYear) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
    }
    
    @Override
    public double weight() {
        return 0.1;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.title + " (" + publishingYear + ")";
    }
    
    
    
}
