package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensorList;

    public AverageSensor() {
        this.sensorList = new ArrayList<Sensor>();
    }

    public void addSensor(Sensor sensor) {
        this.sensorList.add(sensor);
    }

    public List<Integer> readings() {
        List<Integer> readings = new ArrayList<Integer>();
        for(Sensor sensor : sensorList) {
            readings.add(sensor.measure());
        }

        return readings;
    }

    @Override
    public boolean isOn() {
        for(Sensor sensor : sensorList) {
            if (!sensor.isOn()) return false;
        }
        return true;
    }

    @Override
    public void on() {
        for(Sensor sensor : sensorList) {
            sensor.on();
        }
    }

    @Override
    public void off() {
        for(Sensor sensor : sensorList) {
            sensor.off();
        }
    }

    @Override
    public int measure() {
        double sum = 0, count = 0;
        for(Sensor sensor : sensorList) {
            if(!sensor.isOn()) throw new IllegalStateException();
            if(this.sensorList.isEmpty()) throw new IllegalStateException();
            sum += sensor.measure();
            count++;
        }
        return (int)(Math.floor(sum/count));
    }
}
