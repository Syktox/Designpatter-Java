package Visitor.Example_1;

public class PrintVisitor implements VisitorExample {

    @Override
    public void visit(Haus haus) {
        System.out.println(" Height: " + haus.getHeight() + " Width: " + haus.getWidth() + " Length: " + haus.getLength());
    }
}
