
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
public class Container {
    private int max;
    private ArrayList<Suitcase> list = new ArrayList<Suitcase>();
    
    public Container(int max){
        this.max=max;
    }
    
    public void addSuitcase(Suitcase s){
        int containerMax=max;
        for(Suitcase a:list)
            containerMax-=a.totalWeight();
        
        if(containerMax-s.totalWeight()>=0)
            list.add(s);
    }
    
    public int totalWeight(){
        int v=0;
        for(Suitcase t:list){
            v+=t.totalWeight();
        }
        return v;
    }
    
    public void printThings(){
        System.out.println("There are the following things in the container suitcases:");
        for(Suitcase s:list){
            s.printThings();
        }
    }
    
    @Override
    public String toString(){
        String s =list.size()+" suitcases ("+totalWeight()+" kg)";
        return s;
    }
}
