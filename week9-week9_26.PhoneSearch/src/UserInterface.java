
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
public class UserInterface {
    
    private Phonebook pb;
    public Scanner reader;
    
    public UserInterface(){
        reader = new Scanner(System.in);
        pb = new Phonebook(reader);
        begin(reader);
    }
    
    public void begin(Scanner reader) {
        System.out.println("phone search\n"
                + "available operations:\n"
                + " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit");
        commandBar(reader);
    }
    
    public void commandBar(Scanner reader){
        System.out.print("\ncommand: ");
        String choice = reader.nextLine();
        if(choice.equals("1")){
            pb.addNumber(reader);
            commandBar(reader);
        } else if (choice.equals("2")){
            pb.numberSearch(reader);
            commandBar(reader);
        } else if (choice.equals("3")){
            pb.searchByNumber(reader);
            commandBar(reader);
        } else if (choice.equals("4")){
            pb.addAddress(reader);
            commandBar(reader);
        } else if (choice.equals("5")){
            pb.personalInfoSearch(reader);
            commandBar(reader);
        } else if (choice.equals("6")){
            pb.delete(reader);
            commandBar(reader);
        } else if (choice.equals("7")){
            pb.filteredSearch(reader);
            commandBar(reader);
        } else if (choice.equalsIgnoreCase("x")){
            
        } else {
            System.out.println("Command not recognised. Make another selection");
            commandBar(reader);
        }
    }
    
    
    
}
