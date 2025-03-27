package factory_method;

public class Smartphone extends Device{
	private String model;
	public Smartphone(String model) {
		this.model = model;
	}
	public void makePhoneCall() {
		System.out.println("Calling Ismail");
	}
	
	@Override
	public void powerOn() {
		System.out.println("Power on for smartphone");
	}

	@Override
	public void powerOff() {
		System.out.println("Power off for smartphone");
		
	}
}
