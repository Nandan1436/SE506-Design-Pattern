public class Milk extends CoffeeDecorator{
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String description() {
        return coffee.description()+", Milk";
    }
}
