
public class Main {

    public static void main(String[] args) {
        // write test code here
    }
    
    public static boolean isAWeekDay(String s){
        if(s.matches("mon|tue|wed|thu|fri|sat|sun"))
            return true;
        return false;
    }
    
    public static boolean allVowels(String s){
        if(s.matches("[aeiouäö]*"))
            return true;
        return false;
    }
    
    public static boolean clockTime(String s){
        if(s.matches("([01][0-9]|2[0-3])(:[0-5][0-9]){2}"))
                return true;
        return false;
    }
}
