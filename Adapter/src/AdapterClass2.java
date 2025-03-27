import java.util.List;

public class AdapterClass2 extends ModernPrinter implements Printer{
    public void printDocument(List<Character> document) {
        for(int i=0;i<document.size();i++){
            System.out.print(document.get(i));
        }
        System.out.println(" printed by modern printer");
    }

    @Override
    public void printDocument(String document) {
        System.out.println(document+" printer by legacy printer");
    }
}
