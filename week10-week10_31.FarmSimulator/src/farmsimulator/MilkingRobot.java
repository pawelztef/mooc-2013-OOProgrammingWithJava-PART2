package farmsimulator;

public class MilkingRobot {
    private BulkTank bt;

    public MilkingRobot() {
    }

    public BulkTank getBulkTank() {
        return this.bt;
    }

    public void setBulkTank(BulkTank bt) {
        this.bt = bt;
    }

    public void milk(Milkable milkable) {
        if(this.bt == null) throw new IllegalStateException("The MilkingRobot hasn't been installed");
        this.bt.addToTank(milkable.milk());
    }
}
