public class Sugar extends CoffeeDecorator{
    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String description() {
        return coffee.description()+", Sugar";
    }
}
