import java.util.List;

public class ModernPrinter {
    void printDocument(List<Character>document){
        for(int i=0;i<document.size();i++){
            System.out.print(document.get(i));
        }
    }
}
