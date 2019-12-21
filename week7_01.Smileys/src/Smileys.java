
public class Smileys {

    public static void main(String[] args) {
        
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }
    
     private static void printWithSmileys(String s){
         if(s.length()%2==1)
             s+=" ";
         s=":) "+s+" :)";
         String line="";
         
         for(int i=0;i<s.length();i++){
             if(i%2==0)
                 line+=":";
             else
                 line+=")";
         }
         
         System.out.println(line);
         System.out.println(s);
         System.out.println(line);

     }

}
