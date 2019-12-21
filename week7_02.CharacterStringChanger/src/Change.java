/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filip
 */
public class Change {
    private char first;
    private char second;
    
    public Change(char init,char change){
        this.first=init;
        this.second=change;
    }
    
    public String change(String s){
        String f = Character.toString(first);
        String g = Character.toString(second);
        String x = s.replaceAll(f, g);
        return x;
    }
    
}
