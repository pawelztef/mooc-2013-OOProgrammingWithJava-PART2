import java.util.ArrayList;

public class Box implements ToBeStored {
    private ArrayList<ToBeStored> things;
    private double maximumWeight;

    public Box( double maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.things = new ArrayList<ToBeStored>();
    }

    public void add(ToBeStored thing) {
        if(this.weight() + thing.weight() <= this.maximumWeight) {
            things.add(thing);
        }
    }

    public double weight() {
        double weight = 0;
        for(ToBeStored tb : this.things) {
            weight += tb.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.things.size() + " things, total weight " + this.weight() + " kg";
    }

}
