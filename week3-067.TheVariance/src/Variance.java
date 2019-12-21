import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for(int s:list)
            sum+=s;
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double av = (double)sum(list)/list.size();
        return av;
    }

    public static double variance(ArrayList<Integer> list) {
        double sum=0;
        double av=average(list);
        for(int s : list)
            sum+=(s-av)*(s-av);
        sum/=(list.size()-1);
        return sum;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
