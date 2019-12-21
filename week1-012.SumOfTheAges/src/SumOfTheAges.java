
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String i = sc.next();
        int m = sc.nextInt();
        String o = sc.next();
        int n = sc.nextInt();
        int sum = m+n;
       
        
        System.out.println(i+" and "+o+" are :"+sum+" years old in total.");
    }
}
