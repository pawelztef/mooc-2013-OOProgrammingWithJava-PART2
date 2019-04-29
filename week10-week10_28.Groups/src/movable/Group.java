package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {
    private List<Movable> group;

    public Group(){
        this.group = new ArrayList<Movable>();
    }

    public void addToGroup(Movable movable) {
        this.group.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable mv : group) {
            mv.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String x = "";
        for(Movable mv : group) {
            x += mv.toString() + "\n";
        }
        return x;
    }
}
