
import java.util.ArrayList;
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
public class Database {
    private ArrayList<Bird> lista = new ArrayList<Bird>();
    private Scanner sc = new Scanner(System.in);
    
    public Database(){
    }
    
    public void addBird(String name, String lName){
        Bird a = new Bird(name,lName);
        lista.add(a);
    }
    
    public void observe(String b){
        for(Bird f:lista){
            if(f.getName().equalsIgnoreCase(b))
                f.addObservation();
            else
                System.out.println("Is not a bird!");
        }
    }
    
    public void statistics(){
        for(Bird b:lista){
            System.out.println(b.toString());
        }
    }
    
    public void showOne(String name){
        for(Bird f:lista){
            if(f.getName().equalsIgnoreCase(name))
                System.out.println(f.toString());
        }
    }
    
    public void run(){
        String s="",name="",lName="";
        
        while(true){
            System.out.println("?");
            s=sc.nextLine();
            if(s.equalsIgnoreCase("Quit"))
                return;
            else if(s.equalsIgnoreCase("Add")){
                System.out.println("Name: ");
                name=sc.nextLine();
                System.out.println("Latin Name: ");
                lName=sc.nextLine();
                addBird(name,lName);
            }
            else if(s.equalsIgnoreCase("Show")){
                System.out.println("What?");
                name=sc.nextLine();
                showOne(name);
            }
            else if(s.equalsIgnoreCase("observation")){
                System.out.println("What is observed:?");
                name=sc.nextLine();
                observe(name);
            }
            else if(s.equalsIgnoreCase("statistics"))
                statistics();
        
        }
    }
    

}