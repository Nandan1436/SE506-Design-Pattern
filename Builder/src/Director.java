public class Director {
    public void constructEggSandwich(Builder builder){
        builder.setBreadType("Toasted");
        builder.setCheese(null);
        builder.setFriedEgg("Fried");
        builder.setSauce("Tomato sauce");
        builder.setGrilledChicken(null);
    }

    public void constructChickenSandwich(Builder builder){
        builder.setBreadType("Regular");
        builder.setCheese("Regular");
        builder.setFriedEgg(null);
        builder.setSauce(null);
        builder.setGrilledChicken("Grilled");
    }
}
