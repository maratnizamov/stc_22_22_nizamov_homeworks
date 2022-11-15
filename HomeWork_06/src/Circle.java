public class Circle extends Figure {
    protected int radius;
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
}
