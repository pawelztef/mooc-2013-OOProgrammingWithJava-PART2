package movingfigure;

import javax.swing.*;
import java.awt.*;

public class DrawingBoard extends JPanel {
    private Figure figure;

    public DrawingBoard(Figure figure) {
        this.figure = figure;
    }

    @Override
    protected void paintComponent(Graphics graphic) {
        super.paintComponent(graphic);
        figure.draw(graphic);
    }
}
