public class Square extends Figure {
    protected int height;
    @Override
    public double perimeter() {
        return 4 * height;
    }
    @Override
    public double area() {
        return Math.pow(height, 2);
    }
    public Square(int x, int y, int height) {
        super(x, y);
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
}
