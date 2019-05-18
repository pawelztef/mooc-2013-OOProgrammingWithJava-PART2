package movingfigure;

import java.awt.*;

public class Square extends Figure {

    private int sideLenght;

    public Square(int xPos, int yPos, int sideLenght) {
        super(xPos, yPos);
        this.sideLenght = sideLenght;
    }

    @Override
    public void draw(Graphics graphic) {
        graphic.fillRect(getX(), getY(), sideLenght, sideLenght);
    }
}
