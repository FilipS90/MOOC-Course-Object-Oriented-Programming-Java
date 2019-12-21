/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.List;
import java.util.Random;

/**
 *
 * @author Filip
 */
public class Thermometer implements Sensor {
    private boolean status=false;
    private Random rand = new Random();
    
    @Override
    public boolean isOn() {
        return status;
    }

    @Override
    public void on() {
        status=true;
    }

    @Override
    public void off() {
        status=false;
    }

    @Override
    public int measure() {
        if(isOn()){
            int n = rand.nextInt(30+30)-30;
            return n;
        }
        else
            throw new IllegalStateException();
    }
    
}
