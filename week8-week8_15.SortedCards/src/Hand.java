
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinkerin
 */
public class Hand implements Comparable<Hand>{
    
    private List<Card> hand = new ArrayList<Card>();
    
    public void add(Card card){
        hand.add(card);
    }
    
    public void print(){
        for (Card c : hand){
            System.out.println(c);
        }
    }
    
    public void sort(){
        Collections.sort(hand);
    }

    public int handValue(){
        int sum = 0;
        for (Card c : hand){
            sum += c.getValue();
        }
        return sum;
    }
    
    @Override
    public int compareTo(Hand o) {
        return this.handValue() - o.handValue();
    }
    
    public void sortAgainstSuit(){
        Collections.sort(hand, new SortAgainstSuitAndValue());
    }
    
    
}
