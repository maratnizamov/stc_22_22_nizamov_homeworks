public class Main {
    public static void main(String[] args) {
        Ellipse ellipse = new Ellipse(1, 1, 5, 3);
        System.out.println("Radius of ellipse = " + ellipse.getRadius());
        System.out.println("Small Radius of ellipse = " + ellipse.getSmallRadius());
        System.out.println("Perimeter of ellipse = " + ellipse.perimeter());
        System.out.println("Area of ellipse = " + ellipse.area());
        System.out.println("Center of ellipse - x:" + ellipse.getX() + " y:" + ellipse.getY());
        ellipse.move(7, 7);
        System.out.println("New center of ellipse - x:" + ellipse.getX() + " y:" + ellipse.getY());
        System.out.println();
        Rectangle rectangle = new Rectangle(1, 1, 5, 15);
        System.out.println("Height of rectangle = " + rectangle.getHeight());
        System.out.println("Width of rectangle = " + rectangle.getWidth());
        System.out.println("Perimeter of rectangle = " + rectangle.perimeter());
        System.out.println("Area of rectangle = " + rectangle.area());
        System.out.println("Center of rectangle - x:" + rectangle.getX() + " y:" + rectangle.getY());
        rectangle.move(55, 77);
        System.out.println("New center of rectangle - x:" + rectangle.getX() + " y:" + rectangle.getY());
    }
}