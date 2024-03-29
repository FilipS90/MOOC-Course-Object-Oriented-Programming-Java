
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }
    
    public String getName(){
        return name;
    }
    
    public int getRingingYear(){
        return ringingYear;
    }
    
    public String getLatinName(){
        return latinName;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
    
    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        Bird compared = (Bird) object;

        if (this.ringingYear != compared.getRingingYear()) {
            return false;
        }

        if (this.latinName == null || !this.latinName.equals(compared.getLatinName())) {
            return false;
        }

        return true;
    }
    
    @Override
    public int hashCode() {
        if (this.name == null) {
            return 0;
        }

        return this.ringingYear + this.latinName.hashCode();
    }
}


