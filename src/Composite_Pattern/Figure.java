package Composite_Pattern;

public abstract class Figure {
    int x;
    int y;

    Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract void draw();
}
