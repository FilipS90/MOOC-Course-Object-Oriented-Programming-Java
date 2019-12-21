/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Filip
 */
public class Employees {
    private ArrayList<Person> emps = new ArrayList<Person>();
    
    
    public Employees(){
        
    }
    
    public void add(Person p){
        emps.add(p);
    }
    
    public void add(List<Person> p){
        for(Person x:p)
            emps.add(x);
    }
    
    public void print(){
        Iterator<Person> iterator = emps.iterator();
        while(iterator.hasNext()){
            Person p = iterator.next();
            System.out.println(p.toString());
        }
    }
    
    public void print(Education ed){
        Iterator<Person> iterator = emps.iterator();
        while(iterator.hasNext()){
            Person p = iterator.next();
            if(p.getEducation().equals(ed))
            System.out.println(p.toString());
        }
    }
    
    public void fire(Education e){
        Iterator<Person> iterator = emps.iterator();
        while(iterator.hasNext()){
            Person p=iterator.next();
            if(p.getEducation().equals(e))
                iterator.remove();
        }
    }
}

