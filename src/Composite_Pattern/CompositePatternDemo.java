package Composite_Pattern;

public class CompositePatternDemo {
    public static void main(String[] args) {
        CompositeFigure drawing = new CompositeFigure(10,10);
        drawing.draw();
        drawing.addList(new Line(30,30));
        System.out.println("------");
        drawing.draw();
        System.out.println("------");
        drawing.removeFigure();
        drawing.draw();
    }
}
