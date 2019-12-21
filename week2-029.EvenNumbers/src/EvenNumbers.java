
public class EvenNumbers {

    public static void main(String[] args) {
        int n = 2;
        
        while(n<=100){
            if(n%2==0){
                System.out.println(n);
                n++;
            }
            else{
                n++;
                continue;
            }
        }
    }
}
