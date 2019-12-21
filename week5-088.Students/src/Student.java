/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filip
 */
public class Student {
    private String name;
    private String id;
    
    public Student(String name, String id){
        this.name=name;
        this.id=id;
    }
    
    public String getName(){
        return name;
    }
    
    public String getStudentNumber(){
        return id;
    }
    
    @Override
    public String toString(){
        String s=name+" ("+id+")";
        return s;
    }
}
