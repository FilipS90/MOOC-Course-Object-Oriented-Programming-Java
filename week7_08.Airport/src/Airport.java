
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
public class Airport {
    private ArrayList<Plane> planes = new ArrayList<Plane>();
    private Scanner sc = new Scanner(System.in);
    
    public Airport(){
    }
    
    public void addPlane(String id, int capacity){
        for(Plane p:planes){
            if(p.getId().equalsIgnoreCase(id)){
                System.out.println("The plane with that ID already exists.");
                return;
            }
        }
        Plane x = new Plane(id,capacity);
        planes.add(x);
    }
    
    public String printPlanes(){
        String s="";
        for(int i=0;i<planes.size();i++){
            s+=planes.get(i).getId()+" ("+planes.get(i).getCapacity()+" ppl)";
            if(i<planes.size()-1)
                s+="\n";
        }
        return s;
    }
    
    public void airportPanel(){
        System.out.println("Airport panel");
        System.out.println("--------------------\n");
        String q,id,dep,des;
        int n;
        
        while(true){        
        System.out.println("Choose operation:\n" +
        "[1] Add airplane\n" +
        "[2] Add flight\n" +
        "[x] Exit\n" +
        "> ");
        
        q = sc.next();
        if(q.equalsIgnoreCase("1")){
            System.out.println("Give plane ID: ");
            id=sc.next();
            System.out.println("Give plane capacity: ");
            n=sc.nextInt();
            addPlane(id,n);
        }
        else if(q.equalsIgnoreCase("2")){
                System.out.println("Give plane ID: ");
                id=sc.next();
                System.out.println("Give departure airport code:");
                dep = sc.next();
                System.out.println("Give destination airport code:");
                des = sc.next();
                
                for(Plane p:planes){
                    if(p.getId().equalsIgnoreCase(id))
                        p.addFlight(dep, des);
                }
        }
        else if(q.equalsIgnoreCase("x"))
            return;
        }
    }
    
    
    public void airportService(){
        System.out.println("Flight service");
        System.out.println("------------\n");
        String q="";
        
        while(true){
        System.out.println("");
        System.out.println("Choose operation:\n" +
        "[1] Print planes\n" +
        "[2] Print flights\n" +
        "[3] Print plane info\n" +
        "[x] Quit\n" +
        "> ");
        q=sc.next();
        
        if(q.equalsIgnoreCase("1"))
            System.out.println(printPlanes());
        else if(q.equalsIgnoreCase("2")){
            for(Plane p:planes){
                System.out.println(p.toString());
            }
        }
        else if(q.equalsIgnoreCase("3")){
            System.out.println("Give plane ID: ");
            q=sc.next();
            for(Plane p:planes){
                if(q.equalsIgnoreCase(p.getId()))
                    System.out.println(p.planeOnly());
            }
        }
        else if(q.equalsIgnoreCase("x"))
            return;
        }
    }
    
    public void run(){
        airportPanel();
        airportService();
    }
}
