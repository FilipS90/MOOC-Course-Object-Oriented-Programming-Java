/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filip
 */
public class Bird {
    private String name;
    private String latinName;
    private int observations=0;
    
    public Bird(String name, String latinName){
        this.name=name;
        this.latinName=latinName;
    }
    
    public void addObservation(){
        observations++;
    }
    
    public String getName(){
        return name;
    }
    
    public String getLName(){
        return latinName;
    }
    
    @Override
    public String toString(){
        String s=name+" ("+latinName+"): "+observations+" observations";
        return s;
    }
}
