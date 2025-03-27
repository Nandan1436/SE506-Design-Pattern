public class Item implements Prototype{
    private String name;
    private String category;
    private double price;

    public Item(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public Prototype clone() {
        return null;
    }
}
