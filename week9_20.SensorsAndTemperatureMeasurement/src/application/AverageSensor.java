/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Filip
 */
public class AverageSensor implements Sensor {
    private List<Sensor> lista = new ArrayList<Sensor>();
    private List<Integer> reads = new ArrayList<Integer>();
    
    @Override
    public boolean isOn() {
        for(Sensor s:lista){
            if(s.isOn()==false)
                return false;
        }
        return true;
    }

    @Override
    public void on() {
        for(Sensor s:lista){
            s.on();
        }
    }

    @Override
    public void off() {
        for(Sensor s:lista){
            s.off();
        }
    }

    @Override
    public int measure() {
        if(isOn()==false)
            throw new IllegalStateException();
        int n=0;
        for(Sensor s:lista){
            n+=s.measure();
        }
        reads.add(n/lista.size());
        return n/lista.size();
    }
    
    public void addSensor(Sensor additional){
        lista.add(additional);
        if(isOn())
            lista.get(lista.size()-1).on();
    }
    
     public List<Integer> readings(){
        return reads;
    }
    
}
