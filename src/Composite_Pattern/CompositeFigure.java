package Composite_Pattern;

import java.util.ArrayList;

public class CompositeFigure extends Figure {
    ArrayList<Figure> list = new ArrayList<>();

    CompositeFigure(int x, int y) {
        super(x, y);
        list.add(new Line(20,30));
        list.add(new Rectangle(40,40, 50, 50));
        list.add(new Line(10,10));
    }


    @Override
    void draw() {
        for (Figure figure : list) {
            figure.draw();
        }
    }

    void addList(Figure f) {
        list.add(f);
    }

    void removeFigure() {
        list.remove(list.size() - 1);
    }
}
