import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        String s;
        
        while(true){
            s = sc.nextLine();
            if(s.equals("")){
                break;
            }
            else
                list.add(s);
        }
        
        Collections.reverse(list);
        System.out.println("You typed the following words: ");
        for(String x : list)
            System.out.println(x);
    }
}
