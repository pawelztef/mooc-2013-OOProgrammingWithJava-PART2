package boxes;

import java.util.Collection;
import java.util.HashSet;

public class MaxWeightBox extends Box {
    private int maxWeight;
    private Collection<Thing> things;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new HashSet<Thing>();
    }

    public void add(Thing thing) {
        if(thing.getWeight()+currentWeight()<=this.maxWeight) {
            things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return things.contains(thing);
    }

    private int currentWeight() {
        int h = 0;
        for(Thing thing : things) {
            h += thing.getWeight();
        }
        return h;
    }
}
