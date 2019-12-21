
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
public class Team {
    private String name;
    private ArrayList<Player> list = new ArrayList<Player>();
    private int maxSize;
        
        public Team(String name){
            this.name=name;
        }
        
    
    public String getName(){
        return name;
    }
    
    public void addPlayer(Player p){
        if(list.size()==maxSize && maxSize!=0)
            return;
        list.add(p);
    }
    
    public void printPlayers(){
        if(list==null)
            return;
        for(Player p:list){
            System.out.println(p.toString());
        }
    }
    
    public void setMaxSize(int i){
        maxSize=i;
    }
    
    public int size(){
        return list.size();
    }
    
    public int goals(){
        int x=0;
        for(Player p:list){
            x+=p.goals();
        }
        return x;
    }
}
