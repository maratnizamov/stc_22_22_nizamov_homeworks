public class Rectangle extends Square {
    protected int width;
    @Override
    public double perimeter() {
        return 2 * (height + width);
    }
    @Override
    public double area() {
        return height * width;
    }
    public Rectangle(int x, int y, int height, int width) {
        super(x, y, height);
        this.width = width;
    }
    public int getWidth() {
        return width;
    }
}
