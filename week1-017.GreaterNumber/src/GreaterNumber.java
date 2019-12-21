import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Type the first number: ");
        int s = sc.nextInt();
        System.out.println("Type the second number ");
        int n = sc.nextInt();
        
        if(s>n)
            System.out.println("Greater number "+s);
        else if(n>s)
            System.out.println("Greater number "+n);
        else
            System.out.println("The numbers are equal!");

    }
}
