public class Main {
    public static void main(String[] args) {
        Robot robot1 = new Robot("robot1",0,"none");
        Robot robot2 = new Robot("robot2",4,"robots");
        Robot robot3 = new Robot("robot3",10,"objects");

        Behaviour normalBehaviour = new NormalBehaviour();
        Behaviour aggresiveBehaviour = new AggresiveBehaviour();
        Behaviour defensiveBehaviour = new DefensiveBehaviour();

        robot1.setBehaviour(normalBehaviour);
        robot2.setBehaviour(aggresiveBehaviour);
        robot3.setBehaviour(defensiveBehaviour);

        robot1.exibitBehaviour();
        robot2.exibitBehaviour();
        robot3.exibitBehaviour();

        robot1.updateContextInformation(1,"robot");
        robot1.setBehaviour(aggresiveBehaviour);
        robot1.exibitBehaviour();

        robot3.updateContextInformation(15,"none");
        robot3.setBehaviour(normalBehaviour);
        robot3.exibitBehaviour();

    }
}