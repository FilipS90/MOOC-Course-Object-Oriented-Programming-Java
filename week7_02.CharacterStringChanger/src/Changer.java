
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filip
 */
public class Changer {
    private ArrayList<Change> list = new ArrayList<Change>();
    
    public void addChange(Change c){
        list.add(c);
    }
    
    public String change(String s){
        String k=s;
        for(Change x:list){
            k=x.change(k);
        }
        
        return k;
    }
}
