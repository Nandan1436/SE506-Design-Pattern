import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("idk","I am a noob");
        File file2 = new File("idc","hello World");
        File file3 = new File("food","Japanese, Chinese, Italian");
        File file4 = new File("issse","What a noob");

        Folder folder1 = new Folder("garbage");
        Folder folder2 = new Folder("foodList");
        Folder folder3 = new Folder("parent");

        folder2.addComponent(file3);
        folder1.addComponent(file1);
        folder1.addComponent(file2);
        folder3.addComponent(folder1);
        folder3.addComponent(folder2);
        folder2.addComponent(file4);

        String keyword="noob";
        String currPath="";
        List<String> path = new ArrayList<>();
        path=folder3.searchContent(keyword,currPath);
        if(!path.isEmpty()){
            System.out.println("Found keyword in: ");
            for(String p:path){
                System.out.println(p);
            }
        }
        else System.out.println("Keyword not found");
    }
}