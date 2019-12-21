
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First: ");
        int x = sc.nextInt();
        System.out.println("Second: ");
        int m = sc.nextInt();
        
        while(x<=m){
            System.out.println(x);
            x++;
        }
    }
}
