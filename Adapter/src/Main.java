import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LegacyPrinter printer1= new LegacyPrinter();
        printer1.printDocument("Java is difficult");

        //Object Adapter
        ModernPrinter printer2= new ModernPrinter();
        AdapterClass adapter = new AdapterClass(printer2);
        adapter.printDocument("Java is difficult");

        //Class Adapter
        AdapterClass2 adapter2= new AdapterClass2();

        adapter2.printDocument("Java is hard");
        List<Character>doc=new ArrayList<>();
        doc.add('J');
        doc.add('a');
        doc.add('v');
        doc.add('a');
        adapter2.printDocument(doc);

    }
}