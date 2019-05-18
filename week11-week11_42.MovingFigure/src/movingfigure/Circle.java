package movingfigure;

import java.awt.*;

public class Circle extends Figure {
    private int diamenter;

    public Circle(int xPos, int yPos, int diamenter) {
        super(xPos, yPos);
        this.diamenter = diamenter;
    }

    @Override
    public void draw(Graphics graphic) {
        graphic.fillOval(getX(), getY(), this.diamenter, this.diamenter);
    }
}
