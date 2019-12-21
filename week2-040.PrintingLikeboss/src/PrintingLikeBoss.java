public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while(amount>0){
            System.out.print("*");
            amount--;
       }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        while(amount>0){
            System.out.print(" ");
            amount--;
       }
    }

    public static void printTriangle(int size) {
        for(int i=1;i<=size;i++){
            printWhitespaces(size-i);
            printStars(i);
        }
    }

    public static void xmasTree(int height) {
        int stars = 1;
        for(int i=1;i<=height;i++){
            printWhitespaces(height-i);
            printStars(stars); 
            stars+=2;
        }
        
        for(int i=0;i<2;i++){
            printWhitespaces(stars/2-2);
            printStars(3);
        }    
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
