package farmsimulator;

public class BulkTank {
    private double capacity;
    private double volume;

    public BulkTank() {
        this.volume = 0;
        this.capacity = 2000;
    }

    public BulkTank(double capacity) {
        this.volume = 0;
        this.capacity = capacity;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getVolume() {
        return this.volume;
    }

    public double howMuchFreeSpace() {
        return capacity - volume;
    }

    public void addToTank(double amount) {
        // if(this.volume + amount > capacity ) {
        //       this.volume = capacity;
        //  } else {
        //       this.volume = this.volume + amount;
        //  }
        this.volume = amount + volume > capacity ? capacity : amount + volume;
    }

    public double getFromTank(double amount) {
        double h = this.volume - amount;
        if (h < 0) {
            this.volume = 0;
        } else {
            this.volume = h;
        }
        return this.volume;
    }

    @Override
    public String toString() {
        return Math.ceil(getVolume()) + "/" + Math.ceil(getCapacity());
    }
}
