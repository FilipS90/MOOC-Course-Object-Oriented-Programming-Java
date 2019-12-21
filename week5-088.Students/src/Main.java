
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> lista = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        String n ="",id="";
        
        while(true){
            System.out.println("Name:");
            n = sc.nextLine();
            if(n.equals(""))
                break;
            System.out.println("studentnumber: ");
            id = sc.nextLine();
            Student a = new Student(n,id);
            lista.add(a);
        }
        
        for(Student a : lista){
            System.out.println(a.toString());
        }
        
        System.out.println("Give search term: ");
        n = sc.nextLine();
        System.out.println("Result ");
        for(Student a:lista){
            if(a.getName().contains(n))
                System.out.println(a.toString());
        }
        
        
    }
}
