import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        doSomething(sc);
    }
    
    public static void doSomething(Scanner sc){
        int x=0,j=0,d=0,t=0,c=0,p=0;
        ArrayList<Integer> bodovi = new ArrayList<Integer>();
        int n;
        
        while(true){
            n=sc.nextInt();
            if(n<-1 || n>60)
                continue;
            if(n==-1)
                break;
            bodovi.add(n);
        }
        
        for(int i:bodovi){
            if(i>=0 && i<=29)
                x++;
            else if(i>=30 && i<=34)
                j++;
            else if(i>=35 && i<=39)
                d++;
            else if(i>=40 && i<=44)
                t++;
            else if(i>=45 && i<=49)
                c++;
            else if(i>=50 && i<=60)
                p++;
        }
        System.out.println("Grade distribution:");
        
        String s="5: ";
        for(int i=1;i<=p;i++){
            s+="*";
        }
        
        s+="\n4: ";

        for(int i=1;i<=c;i++){
            s+="*";
        }
        
        s+="\n3: ";
        
        for(int i=1;i<=t;i++){
            s+="*";
        }
        
        s+="\n2: ";
        for(int i=1;i<=d;i++){
            s+="*";
        }
        
        s+="\n1: ";
        for(int i=1;i<=j;i++){
            s+="*";
        }
        
        s+="\n0: ";
        for(int i=1;i<=x;i++){
            s+="*";
        }
        
        System.out.println(s);
        
        int sum=p+c+t+d+j;
        
        if(x!=0)
            System.out.println("Acceptance percentage: "+(double)(sum*100)/(x+sum));
        else if(x==0)
            System.out.println("Acceptance percentage: "+100.0);
        else if(sum==0)
            System.out.println("Acceptance percentage: 0.0");
            
        
    }
}
