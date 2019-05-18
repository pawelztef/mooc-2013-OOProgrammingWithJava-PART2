package movingfigure;


import java.awt.*;

public abstract class Figure {
    private int xPos, yPos;

    public Figure(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public int getX() { return xPos; }

    public int getY() { return yPos; }

    public void move(int x, int y) {
        this.xPos += x;
        this.yPos += y;
    }

    public abstract void draw(Graphics graphic);
}
