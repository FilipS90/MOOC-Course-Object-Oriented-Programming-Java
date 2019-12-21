public class Reformatory {
    private int times;

    public int weight(Person person) {
        times++;
        int x = person.getWeight();
        return x;
    }
    
    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }
    
    public int totalWeightsMeasured(){
        return times;
    }

}
