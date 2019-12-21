/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.ArrayList;

/**
 *
 * @author Filip
 */
public class Farm implements Alive {
    private String owner;
    private ArrayList<Cow> cows = new ArrayList<Cow>();
    private Barn barn;
    
    public Farm(String owner, Barn barn){
        this.owner=owner;
        this.barn=barn;
    }
    
    public void manageCows(){
        barn.takeCareOf(cows);
    }
    
    public void installMilkingRobot(MilkingRobot r){
        barn.installMilkingRobot(r);
    }
    
    public void addCow(Cow c){
        cows.add(c);
    }
    
    @Override
    public void liveHour() {
        for(Cow c:cows){
            c.liveHour();
        }
    }
    
    public String getOwner(){
        return owner;
    }
    @Override
    public String toString(){
        String s="Farm owner: "+getOwner()+"\nBarn bulk tank"+barn.toString()+
                "\nAnimals:\n        ";
        for(int i=0;i<cows.size();i++){
            s+=cows.get(i).toString();
            if(i<cows.size()-1)
                s+="\n";
        }
        return s;
    }
}
