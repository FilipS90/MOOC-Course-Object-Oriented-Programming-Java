
public class Main {

    public static void main(String[] args) {
       PhoneDatabase db = new PhoneDatabase();
       UserInterface x = new UserInterface(db);
       x.run();
    }
}
