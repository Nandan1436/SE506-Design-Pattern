public class SandwichBuilder implements Builder{
    private String breadType;
    private String grilledChicken;
    private String cheese;
    private String friedEgg;
    private String sauce;

    @Override
    public void setBreadType(String breadType) {
        this.breadType=breadType;
    }

    @Override
    public void setGrilledChicken(String grilledChicken) {
        this.grilledChicken=grilledChicken;
    }

    @Override
    public void setCheese(String cheese) {
        this.cheese=cheese;
    }

    @Override
    public void setFriedEgg(String friedEgg) {
        this.friedEgg=friedEgg;
    }

    @Override
    public void setSauce(String sauce) {
        this.sauce=sauce;
    }

    public Sandwich getResult(){
        return new Sandwich(breadType,grilledChicken,cheese,friedEgg,sauce);
    }
}
