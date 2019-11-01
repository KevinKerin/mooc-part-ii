/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author kevinkerin
 */
public class RatingRegister {

    private Map<Film, List<Rating>> filmMap;
    private Map<Person, Map<Film, Rating>> reviewerMap;

    public RatingRegister() {
        filmMap = new HashMap<Film, List<Rating>>();
        reviewerMap = new HashMap<Person, Map<Film, Rating>>();
    }

    public List<Rating> getRatings(Film film) {
        if (filmMap.containsKey(film)) {
            System.out.println(film.getName() + " found!");
            return filmMap.get(film);
        }
        System.out.println(film.getName() + " not found! List of films are :");
        for (Film f : filmMap.keySet()) {
            System.out.println(f.getName());
        }
        return null;
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        if (reviewerMap.containsKey(person)) {
            return reviewerMap.get(person);
        }
        return new HashMap<Film, Rating>();
    }

    public Map<Film, List<Rating>> filmRatings() {
        return filmMap;
    }

    public void addRating(Film film, Rating rating) {
        if (!filmMap.containsKey(film)) {
            filmMap.put(film, new ArrayList<Rating>());
        }

        filmMap.get(film).add(rating);
    }

    public void addRating(Person person, Film film, Rating rating) {
        if (!reviewerMap.containsKey(person)) {
            reviewerMap.put(person, new HashMap<Film, Rating>());
        }

        Map<Film, Rating> map = reviewerMap.get(person);
        if (!map.containsKey(film)) {
            map.put(film, rating);
        } else {
            System.out.println("Already reviewed");
        }
        addRating(film, rating);
    }

    public Rating getRating(Person person, Film film) {
        if (reviewerMap.containsKey(person)) {
            Map<Film, Rating> map = (HashMap) reviewerMap.get(person);
            if(map.containsKey(film)){
                return map.get(film);
            }
        }
        return Rating.NOT_WATCHED;
    }
    public Map<Person, Map<Film, Rating>> getReviewerMap(){
        return reviewerMap;
    }

    public List<Person> reviewers() {
        List<Person> list = new ArrayList<Person>();
        for (Person p : reviewerMap.keySet()) {
            list.add(p);
        }
        return list;
    }

}
