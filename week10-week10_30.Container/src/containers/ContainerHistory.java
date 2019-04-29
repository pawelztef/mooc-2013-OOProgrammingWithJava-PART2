package containers;

import java.util.ArrayList;
import java.util.List;

public class ContainerHistory {

    private List<Double> records;

    public double getLast() {

        return records.get(records.size() - 1);
    }

    public double total() {
        double sum = 0;
        for (Double values : records) {
            sum += values;
        }
        return sum;
    }

    public ContainerHistory() {
        records = new ArrayList<Double>();
    }

    public void add(double situation) {
        records.add(situation);
    }

    public void reset() {
        records.removeAll(records);
    }

    public String toString() {
        return records.toString();

    }

    public double maxValue() {
        double max = Double.MIN_VALUE;
        for (Double values : records) {
            if (values > max) {
                max = values;
            }
        }
        return max;
    }

    public double minValue() {
        double min = Double.MAX_VALUE;
        for (Double values : records) {
            if (values < min) {
                min = values;
            }
        }
        return min;
    }

    public double average() {

        return total() / records.size();
    }

    public double greatestFluctuation() {
        if (records.size() == 0) {
            return 0;
        }
        double fluctation = 0;

        for (int i = 1; i < records.size(); ++i) {
            double d = Math.abs(records.get(i) - records.get(i - 1));
            if (d > fluctation) {
                fluctation = d;
            }

        }
        return fluctation;
    }

    public double variance() {
        double avg = average();
        double var = 0;
        for (double val : records) {
            var += (val - avg) * (val - avg);
        }
        return var / (records.size() - 1);
    }
}
