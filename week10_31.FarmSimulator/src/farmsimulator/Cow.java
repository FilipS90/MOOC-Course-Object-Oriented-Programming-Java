/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author Filip
 */
public class Cow implements Milkable, Alive {
    private String name;
    private double udder;
    private double remaining;
    private Random rand = new Random();
    
    public Cow(){
        String [] x = {
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
        this.name=x[rand.nextInt(29)];
        this.udder=15+rand.nextInt(26);
        this.remaining=0;
    }
    
    public Cow(String name){
        this.name=name;
        this.udder=15+rand.nextInt(26);
        this.remaining=0;
    }
    
    public String getName(){
        return name;
    }
    
    public double getCapacity(){
        return Math.ceil(udder);
    }
    
    public double getAmount(){
        return Math.ceil(remaining);
    }
    @Override
    public String toString(){
        String s=name+" "+getAmount()+"/"+getCapacity();
        return s;
    }

    @Override
    public double milk() {
        double x = Math.ceil(remaining);
        remaining=0;
        return x;
    }

    @Override
    public void liveHour() {
        double x = Math.random()*1.3+0.7;
        if(x+remaining<=udder)
            remaining+=x;
        else
            remaining=udder;
    }
}
