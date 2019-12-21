import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String s = "";
        
        while(true){
        s=sc.nextLine();
        if(s.equals(""))
            break;
        else
            words.add(s);
        }
        
        System.out.println("You typed the following words: ");
        for(String x: words){
            System.out.println(x);
        }
    }
}
