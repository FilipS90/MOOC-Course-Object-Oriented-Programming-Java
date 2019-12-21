
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the points [0-60]: ");
        int s = sc.nextInt();
        
        if(s<=29)
            System.out.println("failed");
        else if(s>29 && s<=34)
            System.out.println("1");
        else if(s>34 && s<=39)
            System.out.println("2");
        else if(s>39 && s<=44)
            System.out.println("3");
        else if(s>44 && s<=49)
            System.out.println("4");
        else 
            System.out.println("5");

    }
}
