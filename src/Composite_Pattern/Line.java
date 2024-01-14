package Composite_Pattern;

public class Line extends Figure{
    private final int start;
    private final int end;

    public Line(int start, int end) {
        super(start, end);
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public void draw() {
        System.out.println("Drawed a Line: Start: " + start + " End: " + end);
    }
}
