
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment a){
        if(this.squareMeters>a.squareMeters)
            return true;
        else
            return false;
    }
    
    public int priceDifference(Apartment a){
        if(squareMeters*pricePerSquareMeter>a.squareMeters*a.pricePerSquareMeter)
            return squareMeters*pricePerSquareMeter-a.squareMeters*a.pricePerSquareMeter;
        else
            return a.squareMeters*a.pricePerSquareMeter-squareMeters*pricePerSquareMeter;
    }
    
    public boolean moreExpensiveThan(Apartment a){
    if(squareMeters*pricePerSquareMeter>a.squareMeters*a.pricePerSquareMeter)
        return true;
    return false;
}
}
