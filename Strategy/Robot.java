public class Robot {
    private String name;
    private int position;
    private String nearbyObstacles;
    Behaviour behaviour;

    public Robot(String name, int position, String nearbyObstacles) {
        this.name = name;
        this.position = position;
        this.nearbyObstacles = nearbyObstacles;
    }

    public void setBehaviour(Behaviour behaviour){
        this.behaviour = behaviour;
    }

    public void updateContextInformation(int position, String nearbyObstacles){
        this.position = position;
        this.nearbyObstacles = nearbyObstacles;
    }

    public void exibitBehaviour(){
        if(behaviour!=null){
            behaviour.exibitBehaviour(name,position,nearbyObstacles);
        }
        else{
            System.out.println("Error exibiting behaviour");
        }
    }
}
