import java.util.Random;

public class Dice {
    private Random rand = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides=numberOfSides;
    }

    public int roll() {
        int x = rand.nextInt(numberOfSides)+1;
        return x;
    }
}
