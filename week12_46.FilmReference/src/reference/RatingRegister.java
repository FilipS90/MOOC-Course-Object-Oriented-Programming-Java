/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author Filip
 */
public class RatingRegister {
    private Map<Film,ArrayList<Rating>> list =
            new HashMap<Film,ArrayList<Rating>>();
    private Map<Person,HashMap<Film,Rating>> pRating =
            new HashMap<Person,HashMap<Film,Rating>>();
    
    
    
    public RatingRegister(){
        
    }
    
    public void addRating(Film film, Rating rating){
        if(!list.containsKey(film))
            list.put(film, new ArrayList<Rating>());
            
        list.get(film).add(rating);
    }
    
    public List<Rating> getRatings(Film film){
        ArrayList ratings = list.get(film);
        return ratings;
    }
    
    public Map<Film, ArrayList<Rating>> filmRatings(){
        return list;
    }
    
    public void addRating(Person p, Film f, Rating r){
        if(!pRating.containsKey(p)){
            pRating.put(p, new HashMap<Film,Rating>());
            pRating.get(p).put(f, r);
            addRating(f,r);
        }
        else{
            pRating.get(p).put(f, r);
            addRating(f, r);
        }
            
    }
    
    public List<Person> reviewers(){
        List<Person> reviewers = new ArrayList<Person>();
        for(Person p:pRating.keySet()){
            reviewers.add(p);
        }
        return reviewers;
    }
    
    public Rating getRating(Person p,Film f){
        if(pRating.containsKey(p)){
            if(pRating.get(p).containsKey(f))
                return pRating.get(p).get(f);
        }
        return Rating.NOT_WATCHED;
    }
    
    public Map<Film, Rating> getPersonalRatings(Person person){
        if(!pRating.containsKey(person))
            return new HashMap();
        return pRating.get(person);
    }
    
    
}
