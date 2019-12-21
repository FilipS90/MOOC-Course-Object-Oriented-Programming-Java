
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    public void addMeal(String meal){
        if(!meals.contains(meal))
                meals.add(meal);
    }
    
    public void printMeals(){
        for(String s:meals)
            System.out.println(s);
    }
    
    public void clearMenu(){
        meals.clear();
    }
}
