
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author Filip
 */
public class Player implements Comparable<Player> {
    private String name;
    private int points;
    private ArrayList<Integer> jumps = new ArrayList<Integer>();
    private int lastJump;
    private Random rand = new Random();
    
    public Player(String name){
        this.name=name;
        this.points=0;
    }
    
    public int getPoints(){
        return points;
    }
    
    public String getName(){
        return name;
    }
    
    public void addPoints(int i){
        points+=i;
    }
    
    public void jump(){
        lastJump=rand.nextInt((120-60)+1)+60;
        jumps.add(lastJump);
    }
    
    public int getLastJump(){
        return lastJump;
    }
    
    @Override
    public String toString(){
        String s=name+" ("+points+" points)";
        return s;
    }
    
    public String printJumps(){
        String s="            jump lengths:";
        for(int i=0;i<jumps.size();i++){
            s+=" "+jumps.get(i)+" m";
            if(i!=jumps.size()-1)
                s+=",";
        }
        return s;
    }

    @Override
    public int compareTo(Player o) {
        int x = ((Player)o).getPoints();
        return points-x;
    }
    
    public void addPoints(int [] a){
        Arrays.sort(a);
        int judges=0;
        for(int i=1;i<a.length-1;i++){
            judges+=a[i];
        }
        points += lastJump+judges;
    }
    
    
    
}
