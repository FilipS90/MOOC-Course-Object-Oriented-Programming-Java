
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filip
 */
public class Storehouse {
    private Map<String,Integer> map = new HashMap<String,Integer>();
    private Map<String,Integer> stock = new HashMap<String,Integer>();
    
    public Storehouse(){
        
    }
    
    public void addProduct(String p, int price, int s){
        if(!map.containsKey(p))
            map.put(p, price);
        if(!stock.containsKey(p))
            stock.put(p, s);
    }
    
    public int price(String product){
        if(map.containsKey(product))
            return map.get(product);
        return -99;
    }
    
    public int stock(String p){
        if(stock.containsKey(p)){
            return stock.get(p);
        }
        return 0;
    }
    
    public boolean take(String p){
        if(stock.containsKey(p) && stock.get(p)>0){
            stock.put(p, stock.get(p)-1);
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        Set<String> list = new HashSet<String>();
        
        for(String s:stock.keySet()){
            list.add(s);
        }
        return list;
    }
    
    
    
    
}
