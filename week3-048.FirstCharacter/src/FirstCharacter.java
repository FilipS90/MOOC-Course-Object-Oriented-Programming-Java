import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String s = reader.nextLine();
        System.out.println("First character: "+firstCharacter(s));
    }
    
    public static char firstCharacter(String s){
        char c = s.charAt(0);
        return c;
    }
}
