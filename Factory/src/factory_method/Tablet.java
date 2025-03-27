package factory_method;

public class Tablet extends Device{
	private String model;
	
	public Tablet(String model) {
		this.model = model;
	}
	public void splitScreen() {
		System.out.println("Screen split");
	}

	@Override
	public void powerOn() {
		System.out.println("Power on for tablet");
		
	}

	@Override
	public void powerOff() {
		System.out.println("Power on for tablet");
		
	}

}
