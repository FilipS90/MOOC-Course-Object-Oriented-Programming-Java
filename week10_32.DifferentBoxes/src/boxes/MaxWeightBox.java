package boxes;


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
public class MaxWeightBox extends Box {
    private int max;
    private ArrayList<Thing> things = new ArrayList<Thing>();
    
    public MaxWeightBox(int max){
        this.max=max;
    }
    
    @Override
    public void add(Thing thing) {
        if(currentWeight()+thing.getWeight()<=max)
            things.add(thing);
    }
    
    public int currentWeight(){
        int n=0;
        for(Thing t:things)
            n+=t.getWeight();
        return n;
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        for(Thing t:things){
            if(t.equals(thing))
                return true;
        }
        return false;
    }
    
    
    
    
}
