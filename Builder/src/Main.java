import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        Director director = new Director();
        SandwichBuilder builder = new SandwichBuilder();
        Menu menu = new Menu();
        menu.printMenu();

        int choice = myObj.nextInt();
        Sandwich sandwich;
        if(choice==0){
            director.constructChickenSandwich(builder);
            sandwich = builder.getResult();
        }
        else {
            director.constructEggSandwich(builder);
            sandwich = builder.getResult();
        }
        System.out.println(sandwich);
    }
}