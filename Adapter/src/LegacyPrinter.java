public class LegacyPrinter implements Printer{

    @Override
    public void printDocument(String document) {
        System.out.println(document+" printed by legacy printer");
    }
}
