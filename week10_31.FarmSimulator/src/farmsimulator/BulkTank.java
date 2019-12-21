/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Filip
 */
public class BulkTank {
    private double capacity;
    private double volume;
    
    
    public BulkTank(){
        this.capacity=2000;
        this.volume=0;
    }
    
    public BulkTank(double capacity){
        this.capacity=capacity;
        this.volume=0;
    }
    
    public double getCapacity(){
        return capacity;
    }
    
    public double getVolume(){
        return volume;
    }
    
    public double howMuchFreeSpace(){
        return capacity-volume;
    }
    
    public void addToTank(double amount){
        if(volume==capacity)
            return;
        if(amount>howMuchFreeSpace())
            volume=capacity;
        if(amount<howMuchFreeSpace())
            volume+=amount;
    }
    
    public double getFromTank(double a){
        if(volume==0)
            return 0;
        if(a>volume){
            volume=0;
            return volume;
        }
        volume-=a;
        return a;
    }
    
    public String toString(){
        String s= Math.ceil(volume)+"/"+Math.ceil(capacity);
        return s;
    }
}
