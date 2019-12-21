
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a year: ");
        int n = sc.nextInt();
        
        if(n%4!=0){
            System.out.println("This year is not a leap year.");
        }
        else if(n%400==0)
            System.out.println("This year is a leap year.");
        else if(n%100==0)
            System.out.println("This year is not a leap year.");
        else
            System.out.println("This year is a leap year.");
    }
}
