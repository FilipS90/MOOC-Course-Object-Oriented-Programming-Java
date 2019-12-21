/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author Filip
 */
public class Item implements Comparable<Item>, Thing {
    private String name;
    private int volume;
    
    public Item(String name, int volume){
        this.name=name;
        this.volume=volume;
    }

    public int getVolume() {
        return volume;
    }
    
    public String getName(){
        return name;
    }
    
    @Override
    public String toString(){
        String s =name+" ("+volume+" dm^3)";
        return s;
    }

    @Override
    public int compareTo(Item o) {
        if(volume>o.getVolume())
            return 1;
        if(volume==o.getVolume())
            return 0;
        return -1;
    }
    
    
}
