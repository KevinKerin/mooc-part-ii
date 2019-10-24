
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinkerin
 */
public class SortScores implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        return o1.getPoints()- o2.getPoints();
    }
    
}
