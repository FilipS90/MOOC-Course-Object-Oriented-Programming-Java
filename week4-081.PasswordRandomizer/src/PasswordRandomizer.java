import java.util.Random;

public class PasswordRandomizer {
    private String password;
    private Random rand = new Random();
    private int length;

    public PasswordRandomizer(int length) {
        this.length=length;
    }

    public String createPassword() {
        String s="";
        int x = length;
        while(x>0){
            char c = (char)((char)rand.nextInt(25)+98);
            x--;
            s+=Character.toString(c);
        }
        password=s;
        return password;
    }
}
