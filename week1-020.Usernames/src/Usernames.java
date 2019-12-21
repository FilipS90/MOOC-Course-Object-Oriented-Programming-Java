
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
     
        String user = sc.nextLine();
       
        String pass = sc.nextLine();
        
        if(user.equals("alex") && pass.equals("mightyducks"))
            System.out.println("You are now logged into the system!");
        else if(user.equals("emily") && pass.equals("cat"))
            System.out.println("You are now logged into the system!");
        else
            System.out.println("Your username or password was invalid!");

    }
}
