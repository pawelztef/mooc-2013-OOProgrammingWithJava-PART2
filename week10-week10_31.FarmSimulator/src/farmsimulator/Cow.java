package farmsimulator;

import java.util.Random;

public class Cow implements Alive, Milkable {
    private String name;
    private double udder, udderVolume;
    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow() {
        this.name = NAMES[new Random().nextInt(NAMES.length)];
        this.udder = 15 + new Random().nextInt(26);
    }

    public Cow(String name) {
        this.udder = 15 + new Random().nextInt(26);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getCapacity() {
        return this.udder;
    }

    public double getAmount() { return this.udderVolume; }

    @Override
    public String toString() {
        return this.name + " " + Math.ceil(this.udderVolume) + "/" + Math.ceil(this.udder);
    }

    @Override
    public void liveHour() {
        double h = Math.round(0.7 + (2.0 - 0.7) * new Random().nextDouble());
        this.udderVolume = h+getAmount()<getCapacity() ? h+getAmount() : getCapacity();
    }

    @Override
    public double milk() {
        double h = this.udderVolume;
        this.udderVolume = 0;
        return h;
    }
}
