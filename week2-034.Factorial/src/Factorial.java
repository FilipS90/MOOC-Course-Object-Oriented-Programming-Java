import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int s = reader.nextInt();
        int x = 1;
        int sum = 0;
        
        while(x<=s){
            if(x==1){
                sum=1;
                x++;
            }
            else{
                sum*=x;
                x++;
            }
        }
        
        System.out.println("Factorial is "+sum);
    }
}
