
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author Filip
 */
public class UserInterface {
    private ArrayList<Player> players = new ArrayList<Player>();
    private Judges judges = new Judges();
    private Scanner sc = new Scanner(System.in);
    
    public UserInterface(){
        
    }
    
    public void addPlayer(String name){
        Player x = new Player(name);
        players.add(x);
    }
    
    public void printPlayersAndPoints(){
        for(int i = 0;i<players.size();i++){
            System.out.println("  "+players.get(i).getName());
            System.out.println("    length: "+players.get(i).getLastJump());
            players.get(i).addPoints(judges.generatePoints());
            System.out.println("    judge votes: "+judges.toString());
        }
    }
    
    public void run(){
        startPhase();
        roundPhase();
        results();
    }
    
    
    public void startPhase(){
        String q = "";
        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time;"
                + " an empty string brings you to the jumping phase.");
        
        while(true){
            System.out.println("  Participant name: ");
            q=sc.nextLine();
            if(q.equals(""))
                break;
            addPlayer(q);
        }
        
        System.out.println("\nThe tournament begins!\n");
        System.out.println("Write \"jump\" to jump; otherwise you quit:");
        q = sc.next();
        if(!q.equalsIgnoreCase("jump"))
            System.exit(0);
    }
    
    public void roundPhase(){
        if(players.isEmpty()){
            System.out.println("No players were added.");
            System.exit(0);
        }
        String s="";
        int n=1;
        
        while(true){
            System.out.println("\nRound "+n);
            
            System.out.println("\nJumping order: ");

            for(int i=1;i<=players.size();i++){
                System.out.println("  "+i+". "+players.get(i-1).toString());
                players.get(i-1).jump();
            }

            System.out.println("\n Results of round "+n);
            printPlayersAndPoints();
            Collections.sort(players);
            n++;
            
            System.out.println("\nWrite \"jump\" to jump; otherwise you quit: ");
            s = sc.next();
            if(!s.equalsIgnoreCase("jump")){
                break;
            }
        }
        
    }
    
    public void results(){
        System.out.println("\nThanks!");
        System.out.println("Tournament results:");
        System.out.println("\n\nPosition    Name");
        Collections.reverse(players);
        
        for(int i=1;i<=players.size();i++){
            System.out.println(i+"           "+players.get(i-1).toString());
            System.out.println(players.get(i-1).printJumps());
        }
    }

}
