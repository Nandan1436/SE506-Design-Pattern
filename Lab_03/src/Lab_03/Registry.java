package Lab_03;

import java.util.HashMap;

public class Registry {
	private HashMap<String,Printer>registry;
	private static Registry instance;
	private Registry(){}
	
	public static Registry getRegistry() {
		if(instance==null) {
			instance = new Registry();
			instance.registry=new HashMap<>();
		}
		return instance;
	}
	
	public Printer getPrinter(String name) {
		if(!registry.containsKey(name)) {
			createPrinter(name);
		}
		return registry.get(name);
	}
	
	public void createPrinter(String name) {
		Printer newPrinter=new Printer(name);
		registry.put(name, newPrinter);
	}
	
}
