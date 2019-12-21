import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x=0,e=0,o=0,sum=0;
        
        do{
        System.out.println("Type numbers: ");
        int s = sc.nextInt();
        if(s>0){
            sum+=s;
            x++;
            if(s%2==0)
                e++;
            else
                o++;
        }
        else if(s==-1){
            System.out.println("Thank you and see you later!");
            break;
        }
        }while(true);
        
        double average=(double)sum/x;
        
        System.out.println("The sum is: "+sum);
        System.out.println("How many numbers "+x);
        System.out.println("Average: "+average);
        System.out.println("Even numbers "+e);
        System.out.println("Odd numbers "+o);
        
        
        
    }
}
