/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author Filip
 */
public class Packer {
        private int boxVol;
    
    public Packer(int boxesVol){
        this.boxVol=boxesVol;
    }
    
    public List<Box> packThings(List<Thing> things){
        List<Box> buffer = new ArrayList<Box>();
        
        Box box = new Box(this.boxVol);
        
        for (Thing i : things){
            
            while(box.addThing(i)){
            }
            if(!box.addThing(i)){
                buffer.add(box);
                box = new Box(this.boxVol);
            }
        }
        return buffer;
    }
}
