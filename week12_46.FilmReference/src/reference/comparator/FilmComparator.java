/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author Filip
 */
public class FilmComparator implements Comparator<Film> {
    private Map<Film, ArrayList<Rating>> ratings;
    
    public FilmComparator(Map<Film, ArrayList<Rating>> ratings){
        this.ratings=ratings;
    }
    
    @Override
    public int compare(Film o1, Film o2) {
        double rating1=0,rating2=0;
        
        for(Rating r:ratings.get(o1)){
            rating1+=r.getValue();
        }
        rating1/=ratings.size();
        rating1=(int)rating1;
        
        for(Rating r:ratings.get(o2)){
            rating2+=r.getValue();
        }
        rating2/=ratings.size();
        rating2=(int)rating2;
        
        if(rating1>rating2)
            return -1;
        else if(rating1==rating2)
            return 0;
        else
            return 1;
    }
    
}
