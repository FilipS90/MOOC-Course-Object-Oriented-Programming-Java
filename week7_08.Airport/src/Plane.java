
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
public class Plane {
    private String id;
    private int capacity;
    private ArrayList<Flight> lista = new ArrayList<Flight>();
    
    public Plane(String id, int capacity){
        this.id=id;
        this.capacity=capacity;
    }
    
    public void addFlight(String d, String o){
        for(Flight f:lista){
            if(f.getDepart().equalsIgnoreCase(d) && f.getDest().equalsIgnoreCase(o)){
                System.out.println("That flight already exists for this plane.");
                return;
            }
        }
                Flight x = new Flight(d,o);
                lista.add(x);
    }
    
    public String getId(){
        return id;
    }
    
    public int getCapacity(){
        return capacity;
    }
    
    @Override
    public String toString(){
        String s="";
      if(lista!=null){
        for(Flight f:lista){
            s+=id+" ("+capacity+" ppl) "+f.toString()+"\n";
        }
      }
      
      return s;
    }
    
    public String planeOnly(){
        String s=id+" ("+capacity+" ppl)";
        return s;
    }
}
