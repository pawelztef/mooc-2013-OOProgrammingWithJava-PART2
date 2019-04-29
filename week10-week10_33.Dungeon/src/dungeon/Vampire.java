package dungeon;

public class Vampire extends Creature {
    public Vampire(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return "v " + this.getX() + " " + this.getY();
    }

}
