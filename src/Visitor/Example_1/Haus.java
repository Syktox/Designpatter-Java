package Visitor.Example_1;

public class Haus implements visitor {
    private int length;
    private int height;
    private int width;

    public Haus(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void accept(VisitorExample visitor) {
        visitor.visit(this);
    }
}
