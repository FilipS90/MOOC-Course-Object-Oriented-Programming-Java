import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics stats1 = new NumberStatistics();
        NumberStatistics stats2 = new NumberStatistics();
        Scanner sc = new Scanner(System.in);
        System.out.println("Type numbers");
        
        while(true){
            int x = sc.nextInt();
            if(x==-1)
                break;
            else if(x%2==0)
                stats1.addNumber(x);
            else if(x%2==1)
                stats2.addNumber(x);
                stats.addNumber(x);
        }   
            System.out.println("Sum: "+stats.sum());
            System.out.println("Sum of even "+stats1.sum());
            System.out.println("Sum of odd "+stats2.sum());

    }
}
