
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your name: ");
        String s = sc.nextLine();
        int i=0;
        
        while(i<s.length()){
        char c = s.charAt(i);
        System.out.println(i+1+". character: "+c);
        i++;
        }
    }
}
