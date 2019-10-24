
import static java.lang.Integer.max;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author kevinkerin
 */
public class Player implements Comparable<Player>{
    
    private String name;
    private int length;
    private int points;
    private List<Integer> lengthList = new ArrayList<Integer>();
    private int [] judgeScores = new int[5];
    
    public Player(String name){
        this.name = name;
        length = 0;
        points = 0;
    }
    
    public void newRound(){
        length = ThreadLocalRandom.current().nextInt(60, 121);
        lengthList.add(length);
        for (int i=0; i < judgeScores.length; i++){
            judgeScores[i] = ThreadLocalRandom.current().nextInt(10, 21);
        }
        sortJudgeScores(judgeScores);
        System.out.println("\r  " + name);
        System.out.println("\r    length: " + length);
        System.out.println("    judge votes: " + printScores());
        printScores();
        points += length;
        for (int i=1; i < judgeScores.length-1; i++){
            points += judgeScores[i];
        }
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPoints(){
        return this.points;
    }
    
    public List<Integer> getLengths(){
        return lengthList;
    }
    
    public void sortJudgeScores(int [] array){
        Arrays.sort(array);
    }
    
    public String printScores(){
        String result = "[";
        for (int i = 0; i < judgeScores.length-1; i++) {
            result += judgeScores[i] + ", ";
        }
        result += judgeScores[judgeScores.length-1] + "]";
        return result;
    }
    
    public void toString(int [] array){
        System.out.print("[");
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length-1] + "]");
    }
    
    @Override
    public String toString(){
        return this.name + " (" + this.points + " points)";
    }

    @Override
    public int compareTo(Player o) {
        return this.getPoints() - o.getPoints();
    }
    
}
