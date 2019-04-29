package moving.logic;
import moving.domain.*;

import java.util.ArrayList;
import java.util.List;

public class Packer {
    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List <Box> packedThings = new ArrayList<Box>();
        boolean flag = true;
        for(Thing th : things) {
            Box box = new Box(this.boxesVolume);
            box.addThing(th);
            packedThings.add(box);
        }

        return packedThings;
    }
}
