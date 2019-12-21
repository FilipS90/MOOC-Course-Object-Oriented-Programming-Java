
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Type the radius: "+r);
        System.out.println("Circumference of the circle: "+Math.PI*2*r);
    }
}
