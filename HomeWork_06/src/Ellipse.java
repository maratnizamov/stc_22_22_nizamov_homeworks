public class Ellipse extends Circle {
    protected int smallRadius;
    @Override
    public double perimeter() {
        return 2 * Math.PI * Math.sqrt((Math.pow(radius, 2) + Math.pow(smallRadius, 2)) / 2);
    }
    @Override
    public double area() {
        return Math.PI * radius * smallRadius;
    }
    public Ellipse(int x, int y, int radius, int smallRadius) {
        super(x, y, radius);
        this.smallRadius = smallRadius;
    }
    public int getSmallRadius() {
        return smallRadius;
    }
}
