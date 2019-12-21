
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
public class Suitcase {
    private int maxWeight;
    private ArrayList<Thing> list = new ArrayList<Thing>();
    
    public Suitcase(int max){
        this.maxWeight=max;
    }
    
    public void addThing(Thing t){
        int max=maxWeight;
        for(Thing a:list)
            max-=a.getWeight();
        
        if(max-t.getWeight()>=0)
            list.add(t);
    }
    
    @Override
    public String toString(){
        int a = getCountNWeight();
        if(list.size()==1){
            String s ="1 thing ("+a+" kg)";
            return s;
        }
        else if(list.size()>1){
            String s =list.size()+"things ("+a+" kg)";
            return s;
        }
        else if(list.size()==0){
            String s ="empty ("+a+" kg)";
            return s;
        }
        return null;
            
    }
    
    public int getCountNWeight(){
        int weight=0;
        for(Thing t:list)
            weight+=t.getWeight();
        
        int x = weight;
        return x;
    }
    
    public void printThings(){
        for(Thing t:list){
            System.out.println(t.toString());
        }
    }
    
    public int totalWeight(){
        int n=0;
        for(Thing t:list){
            n+=t.getWeight();
        }
        return n;
    }
    
    public Thing heaviestThing(){
        if(list.size()==0)
            return null;
        Thing n = new Thing("heaviest",0);
        for(Thing t:list){
            if(t.getWeight()>n.getWeight())
                n=t;
        }
        return n;
    }
    
    
    
    
    
}
