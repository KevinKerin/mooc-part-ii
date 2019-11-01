/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author kevinkerin
 */
public class Reference {

    private RatingRegister ratingRegister;

    public Reference(RatingRegister ratingRegister) {
        this.ratingRegister = ratingRegister;
    }

    public Film recommendFilm(Person person) {
        if(ratingRegister.getPersonalRatings(person).size() == ratingRegister.filmRatings().size()){
            return null;
        }
        int enumValue = 0;
        Person similarTaste = new Person("Test");
        for (Map.Entry<Person, Map<Film, Rating>> entry : ratingRegister.getReviewerMap().entrySet()) {
            if (entry.getKey() != person) {
                int thisValue = 0;
                Map<Film, Rating> map = entry.getValue();
                for (Map.Entry<Film, Rating> personalEntry : map.entrySet()) {
                    //If person's personal ratings i.e. viewed movies, contain current movie
                    if (ratingRegister.getPersonalRatings(person).containsKey(personalEntry.getKey())) {
                        thisValue += map.get(personalEntry.getKey()).getValue();
                    }
                    if (thisValue > enumValue) {
                        enumValue = thisValue;
                        similarTaste = entry.getKey();
                    }
                }
            }
        }
        if (enumValue > 0) {
            Film recommendedFilm = null;
            Map<Film, Rating> mapSimilar = ratingRegister.getPersonalRatings(similarTaste);
            Map<Film, Rating> mapPerson = ratingRegister.getPersonalRatings(person);
            for (Map.Entry<Film, Rating> mapEntry : mapSimilar.entrySet()) {
                if (mapEntry.getValue().getValue() > 1) {
                    if (!mapPerson.containsKey(mapEntry.getKey())) {
                        recommendedFilm = mapEntry.getKey();
                    }
                }
            }
            if(recommendedFilm != null){
                return recommendedFilm;
            }
        }

        Map<Film, List<Rating>> filmRatings = ratingRegister.filmRatings();
        List<Film> films = new ArrayList<Film>();
        for (Film f : filmRatings.keySet()) {
            films.add(f);
        }
        Collections.sort(films, new FilmComparator(filmRatings));
        return films.get(0);
    }

}
