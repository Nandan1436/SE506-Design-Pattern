public class ClothingItem extends Item implements Prototype{
    private String color;
    private int size;

    public ClothingItem(String name, double price, String category, String color, int size) {
        super(name, price, category);
        this.color = color;
        this.size = size;
    }

    public ClothingItem(String name, double price, String category) {
        super(name, price, category);
    }

    @Override
    public Prototype clone() {
        return null;
    }
}
