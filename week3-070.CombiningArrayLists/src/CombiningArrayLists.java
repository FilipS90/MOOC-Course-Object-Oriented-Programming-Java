
import java.util.ArrayList;
import java.util.Collections;

public class CombiningArrayLists {

    public static void main(String[] args) {

        // You can change the values while testing
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 4, 3);
        
        Collections.addAll(list2, 5, 10, 7);
        

        // Implement the following method and then remove the comment
        // combine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);


    }
    
    public static void combine(ArrayList<Integer> s,ArrayList<Integer> x){
        s.addAll(x);
         
    }

}
