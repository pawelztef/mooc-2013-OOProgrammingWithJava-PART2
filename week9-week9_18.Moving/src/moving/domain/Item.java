package moving.domain;

public class Item implements Thing, Comparable<Item> {
    private int volume;
    private String name;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.volume + " dm^3)";
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public int compareTo(Item o) {
        return this.getVolume()- o.getVolume();
    }
}
