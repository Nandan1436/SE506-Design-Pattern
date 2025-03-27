public class WhippedCream extends CoffeeDecorator{
    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String description() {
        return coffee.description()+", Whipped Cream";
    }
}
