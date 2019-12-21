package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {

        this.name = name;
        if(weight<0)
            throw new IllegalArgumentException("The weight can't be negative");
        this.weight = weight;
    }
    
    @Override
    public boolean equals(Object t){
        if(t==null)
            return false;
        if(this.getClass()!=t.getClass())
            return false;
        Thing x = (Thing) t;
        
        return name.equals(x.getName());
    }

    @Override
    public int hashCode() {
        if (this.name == null) {
            return 0;
        }
        return this.name.hashCode();
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

}
