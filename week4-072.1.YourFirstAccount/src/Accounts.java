
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a = new Account("Fica",100);
        a.deposit(20);
        System.out.println(a.toString());
    }

}
