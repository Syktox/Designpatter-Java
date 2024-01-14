package Visitor.Example_1;

public class VisitorDemo {
    public static void main(String[] args) {
        VisitorExample visitorExample = new PrintVisitor();
        Haus haus = new Haus(10, 30, 25);
        visitorExample.visit(haus);
    }
}
