/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

/**
 *
 * @author Filip
 */
public class Person {
    private String name;
    private Education ed;
    
    public Person(String name, Education ed){
        this.name=name;
        this.ed=ed;
    }
    
    public Education getEducation(){
        return ed;
    }
    
    @Override
    public String toString(){
        String s=name+", "+ed;
        return s;
    }
    
    
}
