/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Filip
 */
public class Box implements Thing {
    private int max;
    private List<Thing> list = new ArrayList<Thing>();
    
    public Box(int max){
        this.max=max;
    }
    
    public boolean addThing(Thing e){
        if(getVolume()+e.getVolume()<=max){
            list.add(e);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        int n=0;
        for(Thing t:list){
            n+=t.getVolume();
        }
        return n;
    }
    
    public int getMax(){
        return max;
    }
}
