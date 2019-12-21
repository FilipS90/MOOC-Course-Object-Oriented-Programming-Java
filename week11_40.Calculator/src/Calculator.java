/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filip
 */
public class Calculator {
    private int value=0;
    
    public Calculator(){
    }
    
    public void add(int v){
        value+=v;
    }
    
    public void subtract(int v){
        value-=v;
    }
    
    public void reset(){
        value=0;
    }
    
    public int getValue(){
        return value;
    }
    
}
