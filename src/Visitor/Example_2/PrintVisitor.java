package Visitor.Example_2;

public class PrintVisitor implements Visitor{
    @Override
    public void visit(Tier tier) {
        System.out.println("Name des Tiere: " + tier.getNamen());
    }
}
