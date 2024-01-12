package Adapter_Wrapper.adapter_example;

public class AwesomDrawingApp {

    private final Shape s;

    AwesomDrawingApp(Shape s) {
        this.s = s;
        Window.open();
    }

    private void show() {
        s.draw();
    }

    public static void main(String[] args) {
        AwesomDrawingApp app = new AwesomDrawingApp(new Rectangle(100, 100, 30, 40));
        app.show();
    }
}

abstract class Shape {
    private final int x;
    private final int y;


    protected Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public abstract void draw();
}

class Circle extends Shape {
    private final int r;


    Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }


    @Override
    public void draw() {
        Window.drawCircle(getX(), getY(), r);
    }
}

class Rectangle extends Shape {
    private final int w, h;

    Rectangle(int x, int y, int w, int h) {
        super(x, y);
        this.w = w;
        this.h = h;
    }


    @Override
    public void draw() {
        Window.drawRectangle(getX(), getY(), w, h);
    }
}
