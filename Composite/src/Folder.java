import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent{
    private String name;
    private List<FileSystemComponent> components=new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component){
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component){
        components.remove(component);
    }

    @Override
    public List<String> searchContent(String keyword,String currPath) {
        System.out.println("Searching folder: "+name);
        currPath=currPath+"\\"+name;
        List<String>path = new ArrayList<>();
        for(FileSystemComponent component : components){
            List<String>temp=new ArrayList<>();
            temp=component.searchContent(keyword,currPath);
            if(temp!=null)path.add(temp.toString());
        }
        return path;
    }
}
