import java.util.ArrayList;
import java.util.List;

public class AdapterClass implements Printer{
    private ModernPrinter modernPrinter;
    AdapterClass(ModernPrinter newPrinter){
        modernPrinter=newPrinter;
    }

    @Override
    public void printDocument(String document) {
        List<Character>doc=new ArrayList<>();
        for(int i=0;i<document.length();i++){
            doc.add(document.charAt(i));
        }
        modernPrinter.printDocument(doc);
        System.out.println(" printed by modern printer");
    }
}
