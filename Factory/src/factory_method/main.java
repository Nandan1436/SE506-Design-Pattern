package factory_method;

public class main {
	public static void main(String[] args) {
		CreateDevice device1=new createSmartphone();
		Device phone=device1.createDevice("Galaxy S24");
		phone.powerOn();
		
		CreateDevice device2=new createTablet();
		Device tablet=device2.createDevice("IDK S24");
		tablet.powerOff();
		
		CreateDevice device3=new createLaptop();
		Device laptop=device3.createDevice("Asus VivoBook");
		((Laptop) laptop).showModelName();
		
	}
}
