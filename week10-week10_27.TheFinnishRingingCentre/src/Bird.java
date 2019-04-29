
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }

    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        Bird bird = (Bird)obj;
        if(this.latinName.equals(bird.latinName) && (this.ringingYear == bird.ringingYear)) return true;
        return false;
    }

    @Override
    public int hashCode() {
        if(this.latinName == null) return 7;
        return this.latinName.hashCode() + this.ringingYear;
    }
}


