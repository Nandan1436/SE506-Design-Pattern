package factory_method;

public class Laptop extends Device{
	private String model;
	
	public Laptop(String model) {
		this.model = model;
	}
	
	public void showModelName() {
		System.out.println("Model is: "+model);
	}
	
	@Override
	public void powerOn() {
		System.out.println("Power on for laptop");
		
	}

	@Override
	public void powerOff() {
		System.out.println("Power on for laptop");
		
	}

}
