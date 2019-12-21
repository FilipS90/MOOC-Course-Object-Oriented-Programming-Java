
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
public class PromissoryNote {
    private HashMap<String,Double> mapa = new HashMap<String,Double>();
    
    public PromissoryNote(){
    }
    
    public void setLoan(String name, double value){
        if(mapa.get(name)==null)
            mapa.put(name, value);
        else{
            double x = mapa.get(name)+value;
            mapa.put(name, x);
        }  
    }
    
    public double howMuchIsTheDebt(String w){
        if(mapa.get(w)!=null)
            return mapa.get(w);
        return 0;
    }
}
