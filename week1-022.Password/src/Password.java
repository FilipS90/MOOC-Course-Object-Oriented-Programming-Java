
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        String s="  ";
        
        while(!s.equals(password)){
        System.out.println("Type the password: ");
        s = sc.nextLine();
        if(s.equals(password)){
            System.out.println("Right!");
            System.out.println("The secret is: jryy qbar!");
        }
        else
            System.out.println("Wrong!");
        }
    }
  
}
