import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        Random rand = new Random();
        this.numbers = new ArrayList<Integer>();
        int n = 0, x=0;
        
        while(n!=7){
            x=rand.nextInt(39)+1;
            if(!containsNumber(x)){
                this.numbers.add(x);
                n++;
            }
        }
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}
