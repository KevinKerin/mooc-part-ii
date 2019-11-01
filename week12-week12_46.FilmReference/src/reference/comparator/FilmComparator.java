/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author kevinkerin
 */
public class FilmComparator implements Comparator<Film>{

    private Map<Film, List<Rating>> ratings;
    
    public FilmComparator(Map<Film, List<Rating>> ratings){
        this.ratings = ratings;
    }
    
    @Override
    public int compare(Film film1, Film film2) {
        int sumFilm1 = 0;
        int sumFilm2 = 0;
        List<Rating> list1 = ratings.get(film1);
        List<Rating> list2 = ratings.get(film2);
        for (Rating r : list1){
            sumFilm1 += r.getValue();
        }
        for (Rating r : list2){
            sumFilm2 += r.getValue();
        }
        return (int) (sumFilm2 / list2.size()) - (sumFilm1 / list1.size());
    }
    
}
