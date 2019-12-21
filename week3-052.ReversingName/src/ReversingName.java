import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your name: ");
        String s = sc.nextLine();
        String a = "";
        
        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            String x = Character.toString(c);
            a+=x;
        }
        
        System.out.println("In reverse order: "+a);
    }
}
