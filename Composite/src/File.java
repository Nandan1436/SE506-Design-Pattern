import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class File implements FileSystemComponent{
    private String name;
    private String content;

    public File(String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public List<String> searchContent(String keyword, String currPath) {
        System.out.println("Searching file: "+name);
        if(content.contains(keyword)){
            currPath=currPath+"\\"+name;
            //System.out.println(currPath);
            List<String>path = new ArrayList<>();
            path.add(currPath);
            return path;
        }
        return null;
    }
}
