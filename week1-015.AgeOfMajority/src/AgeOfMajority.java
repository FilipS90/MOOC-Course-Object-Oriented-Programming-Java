
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How old are you?");
        int n = sc.nextInt();
        
        if(n>=18)
            System.out.println("You have reached the age of majority!");
        else
            System.out.println("You have not reached the age of majority");
    }
}
