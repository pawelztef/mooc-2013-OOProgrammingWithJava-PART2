package dungeon;

public class Player extends Creature {
    public Player(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return "@ " + this.getX() + " " + this.getY();
    }
}
