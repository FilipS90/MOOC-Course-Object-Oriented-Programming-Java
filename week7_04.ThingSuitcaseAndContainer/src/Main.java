
public class Main {

    public static void main(String[] args) {
    
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
        
        
        
    }
    public static void addSuitcasesFullOfBricks(Container con) {
        for (int i=1; i<=100; i++){
            Thing t = new Thing("Brick", i);
            Suitcase s = new Suitcase(100);
            
            s.addThing(t);
            con.addSuitcase(s);
   
        }
    }
    
}
