
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
    
    public NumberStatistics(){
        amountOfNumbers=0;
    }
    
    public void addNumber(int number){
        amountOfNumbers++;
        sum+=number;
    }
    
    public int amountOfNumbers(){
        return amountOfNumbers;
    }
    
    public int sum(){
        if(amountOfNumbers!=0)
            return sum;
        else
            return 0;
    }
    
    public double average(){
            if(sum!=0)
                return (double)sum()/amountOfNumbers;
            else
                return 0;
    }
    
    
}
