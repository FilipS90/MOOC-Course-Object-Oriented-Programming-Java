
import java.util.ArrayList;

public class AverageOfNumbers {

    
    public static int sum(ArrayList<Integer> list) {
        int sum=0;
        for(int s : list)
            sum+=s;
        return sum;
    }
    

    public static double average(ArrayList<Integer> list) {
        double av = (double)sum(list)/list.size();
        return av;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
