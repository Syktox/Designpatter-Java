package Visitor.Example_2;

public class VisitorDemo_Example2 {
    public static void main(String[] args) {
        Tier cat = new Tier("cat");
        Visitor visitor = new PrintVisitor();
        visitor.visit(cat);
    }
}
