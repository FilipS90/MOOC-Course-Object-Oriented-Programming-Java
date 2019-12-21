/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Filip
 */
public class ContainerHistory {
    private ArrayList<Double> list = new ArrayList<Double>();
    
    public ContainerHistory(){
        
    }
    
    public void add(double situation){
        list.add(situation);
    }
    
    public void reset(){
        list.clear();
    }
    
    public double maxValue(){
        return Collections.max(list);
    }
    
    public double minValue(){
        return Collections.min(list);
    }
    
    public double average(){
        double d=0;
        for(Double x:list){
            d+=x;
        }
        return d/list.size();
    }
    
    public double sum(){
        double s=0;
        for(Double d:list){
            s+=d;
        }
        return s;
    }
    
    public double greatestFluctuation(){
        if(list.isEmpty() || list.size()==1)
            return 0;
        double x = Double.MIN_VALUE, temp=0, temp1=0;
        for(int i=0;i<list.size()-1;i++){
            temp=list.get(i);
            if(temp>list.get(i+1)){
                temp1=Math.abs(temp-list.get(i+1));
                if(temp1>x)
                    x=temp1;
            }
            if(temp<list.get(i+1)){
                temp1=Math.abs(list.get(i+1)-temp);
                if(temp1>x)
                      x=temp1;
            }
        }
        return x;
    }
    
    public double variance(){
        double v=0;
        if(list.isEmpty() || list.size()==1 || sum()/list.size()==list.get(0))
            return 0;
        for(Double d:list)
            v+=Math.pow(d-average(),2);

        return v/(list.size()-1);
    }
    
    @Override
    public String toString(){
        String s ="";
        return s=list.toString();
    }
    
    
}
