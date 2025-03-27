package Lab_03;

public class MyMain {
	public static void main(String[] args) {
		Registry printerRegistry= Registry.getRegistry();
		Printer IITPrinter= printerRegistry.getPrinter("IIT");
		IITPrinter.printStr("Sample Print");
		
		Printer CSEPrinter=printerRegistry.getPrinter("CSE");
		CSEPrinter.printStr("One more Sample Print");
		Printer CSEPrinter2=printerRegistry.getPrinter("CSE");
		CSEPrinter2.printStr("Just One more Sample Print");
		
		Printer IITPrinter2 = printerRegistry.getPrinter("IIT");
		IITPrinter2.printStr("Another Sample Print");
	}

}
