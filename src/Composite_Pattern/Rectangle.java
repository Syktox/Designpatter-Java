package Composite_Pattern;

public class Rectangle extends Figure{
    private final int w, h;

    Rectangle(int x, int y, int w, int h) {
        super(x, y);
        this.w = w;
        this.h = h;
    }


    @Override
    public void draw() {
        System.out.println("Drawed a Rectangle: x: " + x + " y: " + y + " w: " + w + " h: " + h);
    }
}
