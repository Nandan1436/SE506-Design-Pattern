public class Sandwich {
    private String breadType;
    private String grilledChicken;
    private String cheese;
    private String friedEgg;
    private String sauce;

    public Sandwich(String breadType, String grilledChicken, String cheese, String friedEgg, String sauce) {
        this.breadType = breadType;
        this.grilledChicken = grilledChicken;
        this.cheese = cheese;
        this.friedEgg = friedEgg;
        this.sauce = sauce;
    }

    @Override
    public String toString() {
        return "Sandwich contains: \n"+"Bread Type: "+breadType+"\n"+"Chicken: "+(grilledChicken==null?"none":grilledChicken)+"\n"+"Cheese: "+(cheese==null?"none":cheese)+"\n"+"Egg: "+(friedEgg==null?"none":friedEgg)+"\n"+"Sauce: "+(sauce==null?"none":sauce);
    }
}
