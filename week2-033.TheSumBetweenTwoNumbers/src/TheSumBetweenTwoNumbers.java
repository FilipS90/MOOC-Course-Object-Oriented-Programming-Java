
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int x = reader.nextInt();
        System.out.println("Last: ");
        int p = reader.nextInt();
        int sum=0;
        
        
        while(x<=p){
            sum+=x;
            x++;
        }
        
        System.out.println("Sum is "+sum);
        
    }
}
