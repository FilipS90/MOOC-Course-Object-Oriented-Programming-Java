/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.domain;

/**
 *
 * @author Filip
 */
public class Film {
    private String name;
    
    public Film(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    
    @Override
    public boolean equals(Object o){
        if(o==null)
            return false;
        if(o.getClass()!=this.getClass())
            return false;
        
        Film p = (Film) o;
        
        return name.equals(p.getName());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }
    
    @Override
    public String toString(){
        String s = getName();
        return s;
    }

    
}
