
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinkerin
 */
public class TextUserInterface {
    
    private Scanner reader;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    public void start(){
        System.out.println("Statement: ");
        System.out.println("add - adds a word pair to the dictionary");
        System.out.println("translate - asks a word and prints its translation");
        System.out.println("quit - quit the user interface");
        
        while (true) {
            System.out.print("Statement: ");
            String input = reader.nextLine();
            if (input.equals("quit")) {
                break;
            }
 
            handleStatement(input);
            System.out.println("");
        }
 
        System.out.println("Cheers!");
    }
 
    private void handleStatement(String statement) {
        if (statement.equals("add")) {
            add();
        } else if (statement.equals("translate")) {
            translate();
        } else {
            System.out.println("Unknown statement.");
        }
    }
    
    public void add(){
        System.out.print("In Irish: ");
        String fin = reader.nextLine();
        System.out.print("Translation: ");
        String eng = reader.nextLine();
        dictionary.add(fin, eng);
    }
    
    public void translate(){
        System.out.print("Give a word: ");
        String fin = reader.nextLine();
        System.out.println("Translation: " + dictionary.translate(fin));
    }
    
}
