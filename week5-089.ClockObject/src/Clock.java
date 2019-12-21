public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hours, int minutes, int seconds) {
        this.hours = new BoundedCounter(23);
        this.hours.setValue(hours);
        this.minutes = new BoundedCounter(59);
        this.minutes.setValue(minutes);
        this.seconds = new BoundedCounter(59);
        this.seconds.setValue(seconds);
    }
    
    public void tick() {
        seconds.next();
        if(seconds.getValue()==0)
            minutes.next();
        if(minutes.getValue()==0 && seconds.getValue()==0)
            hours.next();
    }
    
    @Override
    public String toString() {
        String s=hours+":"+minutes+":"+seconds;
        return s;
    }
}
