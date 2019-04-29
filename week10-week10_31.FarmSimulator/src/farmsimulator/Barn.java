package farmsimulator;

import java.util.Collection;

public class Barn {
    private BulkTank bt;
    private MilkingRobot mr;

    public Barn(BulkTank bt) {
        this.bt = bt;
    }

    public BulkTank getBulkTank() {
        return this.bt;
    }

    public void installMilkingRobot(MilkingRobot mr) {
        this.mr = mr;
        this.mr.setBulkTank(bt);
    }

    public void takeCareOf(Cow cow) {
        if(mr ==  null) throw new IllegalStateException();
        mr.milk((Milkable)cow);
    }
    public void takeCareOf(Collection<Cow> cows) {
        for(Cow cow : cows) {
            takeCareOf(cow);
        }
    }

    @Override
    public String toString() {
        return getBulkTank().toString();
    }
}
