/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filip
 */
public class Multiplier {
    private int i;
    
    public Multiplier(int i){
      this.i=i;
    }
    
    public int multiply(int x){
        x=x*i;
        return x;
    }
}
