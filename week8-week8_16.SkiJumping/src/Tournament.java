
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinkerin
 */
public class Tournament {
    
    private List<Player> playerList = new ArrayList<Player>();
    private int roundNum;
   
    public Tournament(){
        roundNum = 0;
    }
        
    public void newPlayer(String name){
        Player newPlayer = new Player(name);
        playerList.add(newPlayer);
    }
    
    public void beginRound(){
        int playerOrder = 1;
        roundNum++;
        System.out.println("\n" + "Round " + roundNum + ":\n");
        System.out.println("Jumping order:");
        sort();
        for (Player player : playerList){
            System.out.println("  " + playerOrder + ". " + player.getName() + " (" + player.getPoints() + " points)");
            playerOrder++;
        }
        System.out.println("\n" + "Results of round " + roundNum + "\r");
        for (Player player : playerList){
            player.newRound();
        }
    }
    
    public void sort(){
        Collections.sort(playerList);
    }

    public void getResults(){
        sort();
        int positions = 1;
        for (int i = playerList.size()-1; i >= 0; i--) {
            List<Integer> lengths = playerList.get(i).getLengths();
            System.out.println(positions + "           " + playerList.get(i).toString());
            positions++;
            System.out.print("            jump lengths: ");
            for (int j=0; j < lengths.size()-1; j++) {
                System.out.print(lengths.get(j) + " m, ");
            }
            System.out.print(lengths.get(lengths.size()-1) + " m" + "\n");
        }
    }

}