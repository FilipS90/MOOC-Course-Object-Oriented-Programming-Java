
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
public class Person implements Comparable <Person> {
    private String name;
    private ArrayList<String> numbers = new ArrayList<String>();
    private Address address;
    
    public Person(String name){
        this.name=name;
    }
    
    public void setAddress(Address ad){
        address=ad;
    }
    
    public void addNumber(String num){
        numbers.add(num);
    }
    
    public String getName(){
        return name;
    }
    
    public ArrayList<String> getNumbers(){
        return numbers;
    }
    
    public boolean searchByNumber(String num){
        for(String s:numbers){
            if(num.equals(s))
                return true;
        }
        return false;
    }
    
    public Address getAddress(){
        return address;
    }
    
    @Override
    public String toString(){
        String s="  "+name;
        if(address==null)
            s+="\n  address unknown";
        else
            s+="\n  "+address.getStreet()+" "+address.getCity();
        if(numbers.isEmpty())
            s+="\n  phone number not found";
        else
            for(String x:numbers){
                s+="\n   "+x;
            }
        return s;
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.getName());
    }
}
