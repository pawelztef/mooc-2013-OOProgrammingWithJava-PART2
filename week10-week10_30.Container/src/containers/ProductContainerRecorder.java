package containers;
public class ProductContainerRecorder extends ProductContainer {

    private ContainerHistory histData;

    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        super.addToTheContainer(initialVolume);
        histData = new ContainerHistory();
        histData.add(initialVolume);
    }

    public String history() {
        return histData.toString();
    }

    @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        histData.add(histData.getLast() + amount);
    }

    @Override
    public double takeFromTheContainer(double amount) {
        if(amount>histData.getLast())
            return histData.getLast();
        super.takeFromTheContainer(amount);
        double ret = histData.getLast() - amount;
        histData.add(ret);
        return ret;
    }

    public void printAnalysis() {
        System.out.print("Product: "+super.getName()+"\n"
                +"History: " + history() + "\n"
                + "Greatest product amount: " + histData.maxValue()+"\n"
                + "Smallest product amount: " + histData.minValue()+"\n"
                + "Average: " + histData.average()+"\n"
                + "Greatest change: " + histData.greatestFluctuation()+"\n"
                + "Variance: " + histData.variance()+"\n");
    }


}

