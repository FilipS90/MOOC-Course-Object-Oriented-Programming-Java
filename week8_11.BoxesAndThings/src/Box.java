
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filip
 */
public class Box implements ToBeStored {
    private ArrayList<ToBeStored> box = new ArrayList<ToBeStored>();
    private double max;
    
    public Box(double max){
        this.max=max;
    }
    
    public void add(ToBeStored o){
        double n=max;
        if(n-weight()>=o.weight())
            box.add(o);
    }
    
    @Override
    public double weight(){
        double q=0;
        for(ToBeStored t:box){
            q+=t.weight();
        }
        return q;
    }
    
    public String toString(){
        String s="Box: "+box.size()+" things, total weight "+weight()+" kg";
        return s;
    }
    
    
    
}
