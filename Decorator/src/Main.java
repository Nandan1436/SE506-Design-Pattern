public class Main {
    public static void main(String[] args) {

        Coffee coffee1 = new BasicCoffee();
        System.out.println(coffee1.description());

        coffee1 = new Milk(coffee1);
        System.out.println(coffee1.description());

        coffee1 = new Sugar(coffee1);
        System.out.println(coffee1.description());

        coffee1 = new WhippedCream(coffee1);
        System.out.println(coffee1.description());
    }
}