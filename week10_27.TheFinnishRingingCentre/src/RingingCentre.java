
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filip
 */
public class RingingCentre {
    private HashMap<Bird, ArrayList<String>> lista = new HashMap<Bird, ArrayList<String>>();
    
    public RingingCentre(){
        
    }
    
    public void observe(Bird bird, String place){
        ArrayList<String> x = lista.get(bird);
        if(x!=null){
            x.add(place);
            lista.put(bird, x);
        }
        else{
            ArrayList<String> q = new ArrayList<String>();
            q.add(place);
            lista.put(bird, q);
        }
    }
    
    public void observations(Bird bird){
        if(!lista.containsKey(bird)){
            System.out.println(bird.getLatinName()+" ("+bird.getRingingYear()+") "
        + "observations: 0");
            return;
        }
        ArrayList<String> x = lista.get(bird);
        System.out.println(bird.getLatinName()+" ("+bird.getRingingYear()+") "
        + "observations: "+ x.size());
        for(String s:x){
            System.out.println(s);
        }
    }
    
}
