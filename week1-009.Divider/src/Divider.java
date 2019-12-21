
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double n = (double)sc.nextInt();
        double m = (double)sc.nextInt();
        double sum=n/m;
        
        System.out.println("Division: "+" "+n+" "+" / "+m+" = "+sum);
    }
}
