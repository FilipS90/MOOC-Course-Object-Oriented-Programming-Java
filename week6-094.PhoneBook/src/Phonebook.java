
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
public class Phonebook {
    private ArrayList<Person> lista = new ArrayList<Person>();
    
    public Phonebook(){
        
    }
    
    public String searchNumber(String name){
        String n="";
        for(Person p:lista){
            if(p.getName().contains(name))
                n+=p.getNumber();
        }
        if(n.equals(""))
            return n="number not known";
        return n;
    }
    
    public void add(String name, String number){
        Person x = new Person(name,number);
        lista.add(x);
    }
    
    public void printAll(){
        for(Person p:lista){
            System.out.println(p);
        }
    }
}
