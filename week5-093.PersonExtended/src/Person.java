import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate date){
        this.name=name;
        this.birthday=date;
    }
    
    public Person(String name){
        this.name=name;
        int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        this.birthday=new MyDate(day,month,currentYear);
    }
    
    
    public int age() {
// calculate the age based on the birthday and the current day
        int currentDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        MyDate current = new MyDate(currentDay, currentMonth,currentYear);
        int age = current.differenceInYears(birthday);
        return age;
    }
    
    public boolean olderThan(Person c) {
        int person =birthday.getYear()*365+birthday.getDay()
                +((birthday.getMonth()-1)*30);
        int person2 = c.birthday.getYear()*365+birthday.getDay()
                +((birthday.getMonth()-1)*30);
        
        if(person>person2)
            return false;
        
        return true;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
    
}
