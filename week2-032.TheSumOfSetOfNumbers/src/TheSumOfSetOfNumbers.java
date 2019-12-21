
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what ?");
        int x = reader.nextInt();
        int p = 1;
        int sum=0;
        
        
        while(p<=x){
            sum+=p;
            p++;
        }
        
        System.out.println("Sum is "+sum);
        
    }
}
