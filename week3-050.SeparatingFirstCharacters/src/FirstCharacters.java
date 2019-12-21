import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your name: ");
        String s = sc.nextLine();
        if(s.length()>3){
            char c = s.charAt(0);
            char b = s.charAt(1);
            char a = s.charAt(2);
            
            System.out.println("1. character: "+c);
            System.out.println("2. character: "+b);
            System.out.println("3. character: "+a);
            
        }
    }
}
