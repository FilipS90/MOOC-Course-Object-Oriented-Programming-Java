
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filip
 */
public class Dictionary {
    private HashMap<String,String> mapa = new HashMap<String,String>();
    
    public Dictionary(){
        
    }
    
    public String translate(String w){
        return mapa.get(w);
    }
    
    public void add(String w, String eng){
        mapa.put(w, eng);
    }
    
    public int amountOfWords(){
        return mapa.size();
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> list = new ArrayList<String>();
        for(String s:mapa.keySet()){
            list.add(s+" = "+mapa.get(s));
        }
        return list;
    }
}
