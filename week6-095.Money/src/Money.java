
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money m){
        int e=euros+m.euros,c=cents+m.cents;
        if (c > 99) {
            e += c / 100;
            c %= 100;
        }
        Money n = new Money(e,c);
        return n;
    }
    
    public boolean less(Money m){
        if(euros>m.euros)
            return false;
        else if(euros==m.euros && cents > m.cents)
            return false;
        return true;
    }
    
    public Money minus(Money m){
        int e = euros-m.euros;
        if(e<0){
            Money n = new Money(0,0);
            return n;
        }
        int c = cents-m.cents;
        
        if(c<0){
            e--;
            c=100-(int)(Math.abs(cents-m.cents));
        }
        
        Money n = new Money(e,c);
        
        return n;    
        
    }

}
