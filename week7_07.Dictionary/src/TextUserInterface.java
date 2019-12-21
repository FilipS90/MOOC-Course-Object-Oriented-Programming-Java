
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
public class TextUserInterface {
    private Scanner sc;
    private Dictionary dict;
    
    public TextUserInterface(Scanner sc, Dictionary dict){
        this.sc=sc;
        this.dict=dict;
    }
    
    public void start(){
        System.out.println("Statements:");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quits the text user interface");
        System.out.println("");
        
        while(true){
        System.out.println("Statement: ");
        String q = sc.nextLine(), x="";
        if(q.equalsIgnoreCase("quit"))
            return;
        else if(q.equalsIgnoreCase("add")){
            System.out.println("In Finish: ");
            q=sc.nextLine();
            System.out.println("Translation: ");
            x=sc.nextLine();
            dict.add(q, x);
        }
        else if(q.equalsIgnoreCase("translate")){
            System.out.println("Give a word: ");
            q=sc.nextLine();
            if(dict.translate(q)==null){
                System.out.println("Unknown word!");
                continue;
            }
            System.out.println("Translation: "+dict.translate(q));
        } 
        else
            System.out.println("Unknown statement");
            }
            
    }
}
