
public class Accounts {

    public static void main(String[] args) {
        Account a = new Account("Matt's account",1000);
        Account b = new Account("My account",0);
        
        a.withdrawal(100);
        b.deposit(100);
        System.out.println(a.toString());
        System.out.println(b.toString());
    }

}
