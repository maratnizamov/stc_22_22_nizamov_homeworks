public abstract class Figure {
    protected int X;
    protected int Y;
    public abstract double perimeter();
    public abstract double area();
    public void move(int x, int y) {
        X = x;
        Y = y;
    }
    public Figure(int x, int y) {
        X = x;
        Y = y;
    }
    public int getX() {
        return X;
    }
    public int getY() {
        return Y;
    }
}