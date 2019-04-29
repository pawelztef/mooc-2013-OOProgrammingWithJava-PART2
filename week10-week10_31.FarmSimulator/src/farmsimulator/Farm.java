package farmsimulator;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;

public class Farm implements Alive {
    private String name;
    private Barn barn;
    private Collection<Cow> cowsHord;

    public Farm(String name, Barn barn) {
        this.name = name;
        this.barn = barn;
        this.cowsHord = new ArrayList<Cow>();
    }

    public String getOwner() {
        return this.name;
    }

    public void addCow(Cow cow) {
        this.cowsHord.add(cow);
    }

    public void manageCows() {
        barn.takeCareOf(cowsHord);
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.barn.installMilkingRobot(milkingRobot);
    }

    @Override
    public void liveHour() {
        for (Cow cow : cowsHord) {
            cow.liveHour();
        }
    }

    @Override
    public String toString() {
        StringBuilder h = new StringBuilder();
        h.append("Farm owner: " + getOwner() + "/n"
                + "Barn bulk tank: " + barn.toString() + "/n"
                + "Animals: /n");
        for(Cow cow : cowsHord) {
            h.append("    " + cow + "/n");
        }
        return h.toString();
    }
}
