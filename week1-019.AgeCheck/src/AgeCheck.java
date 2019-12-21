
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?");
        int n = sc.nextInt();
        
        if(n>=0 && n<=120)
            System.out.println("OK");
        else
            System.out.println("Impossible!");
    }
}
