
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        LyyraCard peka = new LyyraCard(20);
        LyyraCard brian = new LyyraCard(30);
        peka.payGourmet();
        brian.payEconomical();
        System.out.println("Peka "+peka.toString());
        System.out.println("Brian "+brian.toString());
        peka.loadMoney(20);
        brian.payGourmet();
        System.out.println("Peka "+peka.toString());
        System.out.println("Brian "+brian.toString());
        peka.payEconomical();
        peka.payEconomical();
        brian.loadMoney(50);
        System.out.println("Peka "+peka.toString());
        System.out.println("Brian "+brian.toString());
        
        
    }
}
