public class Product {
    private final int id;
    private final String name;
    private double price;
    private int count;

    public Product(int id, String name, double price, int count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getCount() {
        return count;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setCount(int count) {
        this.count = count;
    }
    @Override
    public String toString() {
        return id + "|" + name + "|" + price + "|" + count;
    }
}
