/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filip
 */
public class CD implements ToBeStored {
    private String artist;
    private String title;
    private int year;
    private double weight;
    
    public CD(String art, String tit, int y){
        this.artist=art;
        this.title=tit;
        this.year=y;
        this.weight=0.1;
    }

    @Override
    public double weight() {
        return weight;
    }
    
    @Override
    public String toString(){
        String s=artist+": "+title+" ("+year+")";
        return s;
    }
    
    
    
    
}
