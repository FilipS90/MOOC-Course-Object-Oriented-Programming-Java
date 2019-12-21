
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a word: ");
        String s = sc.nextLine();
        System.out.println("Length of the first part: ");
        int x = sc.nextInt();
        
       s = s.substring(0, x);
       
        System.out.println("Result: "+s);
        
        
    }
}
