
public class Main {
    public static void main(String[] args) {
        
        
    }
    
    public static int smallest(int[] array) {
    int n = Integer.MAX_VALUE;
    
    for(int i=0;i<array.length;i++){
        if(n>array[i])
            n=array[i];
    }
    return n;
}
    
    public static int indexOfTheSmallest(int[] array) {
    int n = Integer.MAX_VALUE, index=0;
    
    for(int i=0;i<array.length;i++){
        if(n>array[i]){
            n=array[i];
            index=i;
        }
    }
    return index;
}   
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
    int n = Integer.MAX_VALUE, o=0;
    
    for(int i=index;i<array.length;i++){
        if(n>array[i]){
            n=array[i];
            o=i;
        }
    }
    return o;
}
    
    public static void swap(int[] array, int index1, int index2){
        int n=array[index1];
        array[index1]=array[index2];
        array[index2]=n;
    }
    
    public static void sort(int[] array) {
        int index=0;
        for(int i=0;i<array.length;i++){
            index=indexOfTheSmallestStartingFrom(array,i);
            swap(array,i,index); 
            
            for(int x:array)
                System.out.println(x);
        }
}
  
    
}
