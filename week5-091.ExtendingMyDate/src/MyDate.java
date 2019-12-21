
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance(){
        if(month==12 && day==30){
        year++;
        month=1;
        day=1;
        }
        else if(day==30){
            month++;
            day=1;
        }
        else
            day++;
    }
    
    public void advance(int days){
        while(days>0){
           days--;
           advance();
        }
    }
    
    public MyDate afterNumberOfDays(int days){
        MyDate n = new MyDate(day,month,year);
        while(days>0){
            n.advance();
            days--;
        }
        return n;
    }

}
