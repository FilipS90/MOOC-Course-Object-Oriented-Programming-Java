
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filip
 */
public class Person {
    private String name;
    private String number;
    
    public Person(String name, String number){
        this.name=name;
        this.number=number;
    }
    
    public String getName(){
        return name;
    }
    
    public String getNumber(){
        return number;
    }
    
    public void changeNumber(String newNumber){
        number = newNumber;
    }
    
    @Override
    public String toString(){
        String s =name+" number: "+number;
        return s;
    }
}
