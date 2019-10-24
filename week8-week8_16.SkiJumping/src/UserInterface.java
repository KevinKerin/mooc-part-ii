
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
 
    protected Tournament tournament;
    
    public UserInterface(){
        tournament = new Tournament();
    }
    
    public void begin(Scanner reader){
        System.out.println("Kumpula ski jumping week" + "\n" + "\n" +
                            "Write the names of the participants one at a time; an empty string brings you to the jumping phase.\r");
        
        while (true) {
            System.out.print("  Participant name: ");
            String name = reader.nextLine();
            if(name.isEmpty()){
                System.out.println("\n" + "The tournament begins!");
                beginTournament(reader);
                break;
            }
            tournament.newPlayer(name);
        }

    }
    
    public void beginTournament(Scanner reader){
        String direction;
        boolean play;
        do{
            play = true;
            System.out.println("\n");
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            direction = reader.nextLine();
            if(!direction.equals("jump")){
                play = false;
                getResults();
                break;
            }
            tournament.beginRound();
        } while (play);        
    }
    
    public void getResults(){
        System.out.println("\n" + "Thanks!");
        System.out.println("\n" + "Tournament results:" + "\n" + "Position    Name");
        tournament.getResults();
                            
    }
    
}
