/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filip
 */
public class Counter {
    private int value;
    private boolean check;
    
    public Counter(int value, boolean check){
        this.value=value;
        this.check=check;
    }
    
    public Counter(int value){
        this.value=value;
        this.check=false;
    }
    
    public Counter(boolean check){
        this.value=0;
        this.check=check;
    }
    
    public Counter(){
        this.value=0;
        this.check=false;
    }
    
    public int value(){
        return this.value;
    }
    
    public void increase(){
        value++;
    }
    
    public void decrease(){
        if(!check)
            value--;
        else
            if(value!=0)
                value--;
    }
    
    public void increase(int i){
        if(i<0)
            return;
        value+=i;
    }
    
    public void decrease(int i){
        if(i<0)
            return;
        if(!check)
            value-=i;
        else
            if(value-i>0)
                value-=i;
            else
                value=0;
    }
    
    
    
    
}
