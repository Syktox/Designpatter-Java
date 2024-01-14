package Visitor.Example_2;

public class Tier implements visitorAccept{
    private String namen;

    public Tier(String namen) {
        this.namen = namen;
    }

    public String getNamen() {
        return namen;
    }

    public void setNamen(String namen) {
        this.namen = namen;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
