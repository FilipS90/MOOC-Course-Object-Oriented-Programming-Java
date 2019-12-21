
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filip
 */
public class VehicleRegister {
    private HashMap<RegistrationPlate, String> map = new HashMap<RegistrationPlate, String>();
    
    public VehicleRegister(){
        
    }
    
    public boolean add(RegistrationPlate plate, String owner){
        if(map.containsKey(plate))
            return false;
        else{
            map.put(plate, owner);
            return true;
        }
    }
        
    public String get(RegistrationPlate p){
        if(map.containsKey(p))
            return map.get(p);
        else
            return null;
    }
    
    public boolean delete(RegistrationPlate p){
        if(map.containsKey(p)){
            map.remove(p);
            return true;
        }
        else
            return false;
    }
    
    public void printRegistrationPlates(){
        for(RegistrationPlate p:map.keySet()){
            System.out.println(p.toString());
        }
    }
    
    public void printOwners(){
        ArrayList<String> buffer = new ArrayList<String>();
        String toAdd = "";
        
        for(RegistrationPlate i : map.keySet()){
            //System.out.println(this.db.get(i));
            toAdd = map.get(i);
            if(!buffer.contains(toAdd)){
                buffer.add(toAdd);
            }
        }
        
        for(String j : buffer){
            System.out.println(j);
        }
    
    }
}
