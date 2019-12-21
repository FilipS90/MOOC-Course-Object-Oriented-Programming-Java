
import java.util.ArrayList;
import java.util.Collections;
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
public class UserInterface {
    private Scanner sc = new Scanner(System.in);
    private PhoneDatabase db;
    
    public UserInterface(PhoneDatabase db){
        this.db=db;
    }
    
    public void printMenu(){
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit\n");
    }
    
    private String input(){
        System.out.println("\ncommand: ");
        String s=sc.next();
        return s;
    }
    
    private void addNumber(){
        String s;
        Person p;
        System.out.println("whose number: ");
        s=sc.next();
        if(db.searchByName(s)!=null){
            p = db.searchByName(s);
        }
        else{
            p = new Person(s);
            db.addPerson(p);
        }
        System.out.println("number: ");
        p.addNumber(s=sc.next());
        System.out.println();
    }
    
    private void printNums(ArrayList<String> s){
        for(String x:s){
            System.out.println(" "+x);
        }
    }
    
    private void searchByName(){
        System.out.println("whose number: ");
        String R=sc.next();
        Person s = db.searchByName(R);
        if(s==null)
            System.out.println("  not found");
        else{
            printNums(s.getNumbers());
            }
        }
    
    private void getPersonByNum(){
        System.out.println("number: ");
        String q=sc.next();
        String p =" "+ db.searchByNumber(q);
        System.out.println(p);
    }
    
    private void addAddress(){
        System.out.println("whose address: ");
        String q=sc.next();
        Person x;
        if(db.searchByName(q)!=null)
            x=db.searchByName(q);
        else {
            x = new Person(q);
            db.addPerson(x);
        }
        System.out.println("street: ");
        String y = sc.next();
        System.out.println("city: ");
        String c = sc.next();
        Address o = new Address(y,c);
        x.setAddress(o);
    }
    
    private void getInfo(){
        String q;
        System.out.println("whose information");
        q=sc.next();
        Person s = db.searchByName(q);
        if(s==null){
            System.out.println("  not found");
            return;
        }
        if(s.getAddress()==null)
            System.out.println("  address unknown");
        else
            System.out.println(s.getAddress().getStreet()+" "+s.getAddress().getCity());
        if(s.getNumbers().isEmpty())
            System.out.println("  phone number not found");
        else
            printNums(s.getNumbers());
    }
    
    private void DeleteInfo(){
        System.out.println("whose information:");
        String q=sc.next();
        Person p = new Person(q);
        db.removePerson(p);
    }
    
    private void filteredSearch(){
        System.out.println("keyword (if empty, all listed): ");
        String p = sc.next();
        if(p.isEmpty()){
            for(Person x : db.getPeople()){
                System.out.println(x.toString());
                return;
            }
        }
        ArrayList<Person> x = db.searchContaining(p);
        Collections.sort(x);
            if(x.isEmpty()){
                System.out.println("not found");
            }
            else{
                for(Person l:x){
                    System.out.println(l.toString());
                }
            }
    }
    
    public void run(){
        printMenu();
        String q;
        q=input();
        
        while(!q.equals("x")){
            if(q.equals("1")){
                addNumber();
                q=input();
            }
            if(q.equals("2")){
                searchByName();
                q=input();
            }
            if(q.equals("3")){
                getPersonByNum();
                q=input();
            }
            if(q.equals("4")){
                addAddress();
                q=input();
            }
            if(q.equals("5")){
                getInfo();
                q=input();
            }
            if(q.equals("6")){
                DeleteInfo();
                q=input();
            }
            if(q.equals("7")){
                filteredSearch();
                q=input();
            }
        }
    }
}
