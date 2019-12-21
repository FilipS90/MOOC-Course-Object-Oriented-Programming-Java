
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
public class PhoneDatabase {
    private ArrayList<Person> people = new ArrayList<Person>();
    
    
    public PhoneDatabase(){
    }
    
    public void addPerson(Person p){
        people.add(p);
    }
    
    public ArrayList<Person> getPeople(){
        return people;
    }
    
    public void removePerson(Person p){
        people.remove(searchByName(p.getName()));
    }
    
    public String searchByNumber(String number){
        for(Person p:people){
            if(p.searchByNumber(number))
                return p.getName();
        }
        String s;
        return s="not found";
    }
    
    public Person searchByName(String name){
        for(Person p:people){
            if(name.equalsIgnoreCase(p.getName()))
                return p;
        }
        return null;
    }
    
    public Address addressByName(String name){
        if(searchByName(name)!=null){
            return searchByName(name).getAddress();
        }
        return null;
    }
    
    public ArrayList<Person> searchContaining(String x){
        ArrayList<Person> matching = new ArrayList<Person>();
        for(Person p:people){
            if(p.getName().contains(x)){
                matching.add(p);
                continue;
            }
            if(p.getAddress()!=null){
                if(p.getAddress().getCity().contains(x) ||
                        p.getAddress().getStreet().contains(x))
                    matching.add(p);
            }
        }
        return matching;
    }
    
    
}
