
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        String s;
        
        while(true){
            s = sc.nextLine();
            if(list.contains(s)){
                System.out.println("You gave the word"+s+"twice");
                break;
            }
            else
                list.add(s);
        }
        
    }
}
