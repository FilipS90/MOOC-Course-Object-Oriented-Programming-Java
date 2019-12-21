import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a word: ");
        String s = sc.nextLine();
        System.out.println("Length of the end part");
        int x = sc.nextInt();
        
        s=s.substring(s.length()-x);
               
        System.out.println("Result: "+s);
    }
}
