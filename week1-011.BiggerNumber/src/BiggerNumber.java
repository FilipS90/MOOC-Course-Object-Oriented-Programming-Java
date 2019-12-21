
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sol= Math.max(m, n);
        
        System.out.println("The bigger number of the two numbers given was: "+sol);
        
    }
}
