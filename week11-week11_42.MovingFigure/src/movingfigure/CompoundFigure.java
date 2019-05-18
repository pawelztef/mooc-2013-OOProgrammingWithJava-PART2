package movingfigure;

import java.awt.*;
import java.util.ArrayList;

public class CompoundFigure extends Figure {

    private ArrayList<Figure> list;

    public CompoundFigure() {
        super(0, 0);
        this.list = new ArrayList<Figure>();
    }

    public void add(Figure f) {
        list.add(f);
    }

    @Override
    public void draw(Graphics graphic) {
       for(Figure f : list) {
           f.draw(graphic);
       }
    }
    @Override
    public void move(int x, int y) {
        for(Figure f : list) {
            f.move(x, y);
        }
    }
}
