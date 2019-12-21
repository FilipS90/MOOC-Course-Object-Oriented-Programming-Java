
public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.value=0;
        this.upperLimit=upperLimit;
    }

    public void next() {
        if(value+1<=upperLimit)
            value++;
        else
            value=0;
    }
    
    @Override
    public String toString() {
        String s="";
        if(value<10 && value>=0){
            s="0"+value;
            return s;
        }
        s =""+value;
        return s;
    }
    
    public int getValue(){
        return value;
    }
    
    public void setValue(int v){
        if(v<0)
            return;
        if(v>upperLimit)
            return;
        this.value=v;
    }
}