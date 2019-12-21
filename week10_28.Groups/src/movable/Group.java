/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;

/**
 *
 * @author Filip
 */
public class Group implements Movable {
    private ArrayList<Organism> list = new ArrayList<Organism>();
    
    public Group(){
        
    }
    
    @Override
    public String toString(){
        String s="";
        
        for(int i=0;i<list.size();i++){
            s+=list.get(i).toString();
            if(i<list.size()-1)
                s+="\n";
        }
        return s;
    }
    
    public void addToGroup(Movable movable){
        list.add((Organism) movable);
    }
    
    
    @Override
    public void move(int dx, int dy) {
      for(Organism o:list){
          o.move(dx, dy);
      }  
    }
    
    
}
