package application;

import java.util.Random;

public class Thermometer implements Sensor {

    private boolean state = false;

    @Override
    public boolean isOn() {
        return this.state;
    }

    @Override
    public void on() {
        this.state = true;

    }

    @Override
    public void off() {
        this.state = false;
    }

    @Override
    public int measure() {
        if (!this.isOn()) throw new IllegalStateException();
        return new Random().nextInt(30 + 1 + 30) - 30;
    }
}
