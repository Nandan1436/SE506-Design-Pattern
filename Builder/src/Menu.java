import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<String> menuList;

    Menu(){
        menuList=new ArrayList<>();
        menuList.add("Chicken Sandwich");
        menuList.add("Egg Sandwich");
    }

    public void printMenu(){
        System.out.println("Choose number: ");
        for(int i=0;i<menuList.size();i++){
            System.out.println(i+". "+menuList.get(i));
        }
    }

}
