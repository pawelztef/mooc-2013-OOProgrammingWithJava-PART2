package movingfigure;

import java.awt.*;

public class Box extends Figure {
    private int width, height;

    public Box(int xPos, int yPos, int width, int height) {
        super(xPos, yPos);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics graphic) {
        graphic.fillRect(getX(), getY(), width, height);
    }
}
