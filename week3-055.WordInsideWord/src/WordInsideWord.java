
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String s = sc.nextLine();
        System.out.println("Type the second word: ");
        String x = sc.nextLine();
        
        if(s.length()>x.length()){
            int a= s.indexOf(x);
            if(a==-1)
                System.out.println("The word "+x+" is not found in the word "+s);
            else
                System.out.println("The word '"+x+"' is found in the word '"+s);
        }
        else{
            int a= x.indexOf(s);
            if(a==-1)
                System.out.println("The word "+s+" is not found in the word "+x);
            else
                System.out.println("The word '"+s+"' is found in the word '"+x);
        }
            
        
    }
}
