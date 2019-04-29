package dungeon;

import java.util.Objects;

public abstract class Creature implements Movable {
    private int x, y;

    public Creature(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) { this.x = x; }

    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Creature creature = (Creature) o;
        return x == creature.x &&
                y == creature.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
