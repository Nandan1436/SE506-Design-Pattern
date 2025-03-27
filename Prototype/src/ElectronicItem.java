public class ElectronicItem extends Item implements Prototype{
    private int capacity;
    private int batteryLife;

    public ElectronicItem(String name, double price, String category, int capacity, int batteryLife) {
        super(name, price, category);
        this.capacity = capacity;
        this.batteryLife = batteryLife;
    }

    public ElectronicItem(String name, double price, String category) {
        super(name, price, category);
    }

    @Override
    public Prototype clone() {
        return null;
    }
}
