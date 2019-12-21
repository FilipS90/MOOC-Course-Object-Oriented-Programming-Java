import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String s = reader.nextLine();
        System.out.println("Last character: "+lastCharacter(s));
        
    }
    
    public static char lastCharacter(String s){
        char c = s.charAt(s.length()-1);
        return c;
    }
}
